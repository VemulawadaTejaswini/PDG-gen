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
        CommonSubsequence solver = new CommonSubsequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class CommonSubsequence {
        public static int MOD = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] s = new int[n];
            int[] t = new int[m];

            long[][] sum = new long[n + 1][m + 1];

            for (int i = 0; i < n; i++) {
                s[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                t[i] = in.nextInt();
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    if (i == 0 || j == 0) {
                        sum[i][j] = 1;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (s[i] == t[j]) {
                        sum[i + 1][j + 1] = sum[i][j + 1] + sum[i + 1][j];
                        sum[i + 1][j + 1] %= MOD;
                    } else {
                        sum[i + 1][j + 1] = sum[i][j + 1] + sum[i + 1][j];
                        sum[i + 1][j + 1] %= MOD;
                        sum[i + 1][j + 1] = modSub(sum[i + 1][j + 1], sum[i][j], MOD);

                    }
                }
            }

            out.println((sum[n][m]) % MOD);

        }

        static long modSub(long x, long n, long mod) {
            long v = x - n;
            if (v < 0) {
                v += mod;
            }
            return v % mod;
        }

    }
}

