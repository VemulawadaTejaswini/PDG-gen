import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String s = reader.readLine();

            final String[] sl = s.split(" ");
            int A = Integer.parseInt(sl[0]);
            int B = Integer.parseInt(sl[1]);

            s = reader.readLine();

            boolean flg = false;

            if (s.length() == A + B + 1) {
                flg = true;
                for (int i = 0; i < A + B + 1; i++) {
                    if (A == i) {
                        if (s.charAt(i) == '-') {
                            continue;
                        } else {
                            flg = false;
                            break;
                        }
                    }

                    if (s.charAt(i) < '0' || '9' < s.charAt(i)) {
                        flg = false;
                        break;
                    }
                }
            }
            System.out.println(flg ? "Yes" : "No");
        }
    }
}
