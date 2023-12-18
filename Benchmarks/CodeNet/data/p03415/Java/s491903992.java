import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String c1 = reader.readLine();
            final String c2 = reader.readLine();
            final String c3 = reader.readLine();

            String ans = "";
            Formatter fm = new Formatter();
            fm.format(ans + "%c", c1.charAt(0));
            fm.format(ans + "%c", c2.charAt(1));
            fm.format(ans + "%c", c3.charAt(2));

            System.out.println(fm);
        }
    }
}
