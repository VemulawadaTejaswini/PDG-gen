import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static long dp;
        static long mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            dp = new long[N + 1][5][5][5][5];

            if (N == 3) {
                out.println(61);
                return;
            }

            long ans = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            ans += dp(N, i, j, k, l);
                        }
                    }
                }
            }
            out.println(ans % mod);
        }

        private long dp(int n, int i, int j, int k, int l) {
            if (isTarget(i, j, k, l)) {
                return 0;
            }
            if (n == 4) return 1;

            if (dp[n][i][j][k][l] != 0) {
                return dp[n][i][j][k][l];
            }

            long tmp = 0;
            for (int m = 0; m < 4; m++) {
                tmp += dp(n - 1, m, i, j, k);
            }

            tmp %= mod;

            return dp[n][i][j][k][l] = tmp;
        }

        private boolean isTarget(int i, int j, int k, int l) {
            if (i == 0 && j == 1 && k == 2) return true;
            if (i == 1 && j == 0 && k == 2) return true;
            if (i == 0 && j == 2 && k == 1) return true;
            if (i == 0 && k == 1 && l == 2) return true;
            if (i == 0 && j == 1 && l == 2) return true;
            if (j == 0 && k == 1 && l == 2) return true;
            if (j == 1 && k == 0 && l == 2) return true;
            if (j == 0 && k == 2 && l == 1) return true;
            return false;
        }

    }
}

