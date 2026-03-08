
package com.hasbicell.ppob;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nominal, admin;
    Button btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nominal = findViewById(R.id.nominal);
        admin = findViewById(R.id.admin);
        btn = findViewById(R.id.printBtn);

        btn.setOnClickListener(v -> {

            int n = Integer.parseInt(nominal.getText().toString());
            int a = Integer.parseInt(admin.getText().toString());
            int total = n + a;

            String struk =
                    "HASBI CELL\n" +
                    "====================\n" +
                    "Nominal : " + n + "\n" +
                    "Admin   : " + a + "\n" +
                    "Total   : " + total;

            Toast.makeText(this, struk, Toast.LENGTH_LONG).show();
        });
    }
}
