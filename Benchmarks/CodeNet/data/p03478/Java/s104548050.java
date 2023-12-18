import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String[] sl = s.split(" ");
            int N = Integer.parseInt(sl[0]);
            int A = Integer.parseInt(sl[1]);
            int B = Integer.parseInt(sl[2]);

            int sm = 0;

            for (int i = 1; i <= N; i++) {
                if (check(String.valueOf(i), A, B)) sm += i;
            }


            System.out.println(sm);
        }
    }
    static boolean check(String s, int a, int b) {
        boolean flg = false;

        int sm = 0;

        for (int i = 0; i < s.length(); i++) {
            sm += Character.getNumericValue(s.charAt(i));
        }

        if (a <= sm && sm <= b) flg = true;
        return flg;
    }
}
