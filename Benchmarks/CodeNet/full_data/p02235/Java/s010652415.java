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
        AizuLCS solver = new AizuLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuLCS {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int tt = in.nextInt();

            while (tt-- != 0) {
                final String x = in.next();
                final String y = in.next();

                out.printf("%d\n", lcs(x, y));
            }
        }

        private int lcs(final String a, final String b) {
            int n = a.length();
            int m = b.length();

            int[][] dp = new int[n + 1][m + 1];
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    int insertion = dp[i][j - 1];
                    int deletion = dp[i - 1][j];
                    int match = dp[i - 1][j - 1] + 1;

                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        dp[i][j] = match;
                    } else {
                        dp[i][j] = Math.max(insertion, deletion);
                    }
                }
            }

            return dp[n][m];
        }

    }
}


