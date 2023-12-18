import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int val = 700;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'o') {
                    val += 100;
                }
            }

            System.out.println(val);
        }
    }
}
