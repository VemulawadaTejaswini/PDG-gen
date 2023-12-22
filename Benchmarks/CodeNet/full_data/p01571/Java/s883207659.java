import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        AizuAdhocTranslation solver = new AizuAdhocTranslation();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuAdhocTranslation {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            Set<String> text = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String[] ws = in.nextLine().trim().split(" ");
                for (String w : ws) {
                    text.add(w);
                }
            }

            Set<String> dict = new HashSet<>();
            for (int i = 0; i < m; i++) {
                dict.add(in.next());
            }

            long s = 0L;
            for (String w : text) {
                long d = Long.MAX_VALUE;
                for (String dw : dict) {
                    long dd = editDistance(dw, w);
                    if (dd < d) {
                        d = dd;
                    }
                }

                s += d;
            }

            out.printf("%d\n", s);
        }

        private int editDistance(final String x, final String y) {
            int n = x.length();
            int m = y.length();

            int[][] dp = new int[n + 1][m + 1];
            for (int i = 0; i < n + 1; i++) {
                dp[i][0] = i;
            }

            for (int j = 0; j < m + 1; j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < m + 1; j++) {
                    int ins = dp[i][j - 1] + 1;
                    int del = dp[i - 1][j] + 1;
                    int match = dp[i - 1][j - 1];
                    int mismatch = dp[i - 1][j - 1] + 1;

                    if (x.charAt(i - 1) == y.charAt(j - 1)) {
                        dp[i][j] = Math.min(Math.min(ins, del), match);
                    } else {
                        dp[i][j] = Math.min(Math.min(ins, del), mismatch);
                    }
                }
            }

            return dp[n][m];
        }

    }
}


