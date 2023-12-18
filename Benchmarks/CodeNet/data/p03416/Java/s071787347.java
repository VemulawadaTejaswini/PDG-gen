import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int a = Integer.parseInt(sl[0]);
            int b = Integer.parseInt(sl[1]);

            int num = 0;
            for (int i = a; i <= b; i++) {
                if (isPalindromeNumber(String.valueOf(i))) num++;
            }

            System.out.println(num);
        }
    }

    static boolean isPalindromeNumber(String s) {
        boolean flg = true;

        if (s.charAt(0) != s.charAt(4)) flg = false;
        if (s.charAt(1) != s.charAt(3)) flg = false;

        return flg;
    }
}
