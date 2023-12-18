import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DigitsParade solver = new DigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DigitsParade {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] chars = new StringBuilder(in.next()).reverse().toString().toCharArray();
            long[][] dp = new long[chars.length][13];

            if (chars[0] == '?') {
                for (int i = 0; i <= 9; i++) {
                    dp[0][i] = 1;
                }
            } else {
                int i = Integer.parseInt(String.valueOf(chars[0]));
                dp[0][i] = 1;
            }

            int num = 1;
            for (int i = 1; i < chars.length; i++) {
                num *= 10;
                num %= 13;

                if (chars[i] == '?') {
                    for (int j = 0; j <= 9; j++) {
                        for (int k = 0; k < 13; k++) {
                            int index = (k + (j * num)) % 13;
                            dp[i][index] += dp[i - 1][k];
                            dp[i][index] %= MOD;
                        }
                    }
                } else {
                    int j = Integer.parseInt(String.valueOf(chars[i]));
                    for (int k = 0; k < 13; k++) {
                        int index = (k + j * num) % 13;
                        dp[i][index] += dp[i - 1][k];
                        dp[i][index] %= MOD;
                    }
                }
            }
            out.println(dp[chars.length - 1][5]);
        }

    }
}

