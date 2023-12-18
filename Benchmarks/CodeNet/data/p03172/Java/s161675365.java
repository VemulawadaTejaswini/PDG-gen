import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        public final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            long[][] dp = new long[n + 1][k + 1];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                long syakSum = 0;
                for (int j = 0; j < a[i]; j++) {
                    syakSum = add(syakSum, dp[i][j]);
                    dp[i + 1][j] = syakSum;
                }
                for (int j = a[i]; j <= k; j++) {
                    syakSum = add(syakSum, dp[i][j]);
                    // 尺取り
                    dp[i + 1][j] = syakSum;
                    syakSum = sub(syakSum, dp[i][j - a[i]]);
                }
            }

            out.println(dp[n][k]);
        }

        long add(long a, long b) {
            return (a + b) % MOD;
        }

        long sub(long a, long b) {
            return (a - b + MOD) % MOD;
        }

    }
}

