import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            char bk = ' ';
            int cnt = 1;
            for (int i = 0; i < s.length(); i++) {
                if (3 <= cnt) break;

                if (bk == s.charAt(i)) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                bk = s.charAt(i);
            }

            System.out.println(3 <= cnt ? "Yes" : "No");
        }
    }
}
