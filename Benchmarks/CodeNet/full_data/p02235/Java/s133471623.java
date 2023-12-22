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
        LongestCommonSubsequence solver = new LongestCommonSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class LongestCommonSubsequence {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            while (n-- != 0) {
                final String x = in.next();
                final String y = in.next();

                out.printf("%d\n", lcs(x, y));
            }
        }

        private int lcs(final String a, final String b) {
            final int alen = a.length();
            final int blen = b.length();

            int[][] dp = new int[alen + 1][blen + 1];

            for (int i = 1; i < alen + 1; i++) {
                for (int j = 1; j < blen + 1; j++) {
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }

            return dp[alen][blen];
        }

    }
}


