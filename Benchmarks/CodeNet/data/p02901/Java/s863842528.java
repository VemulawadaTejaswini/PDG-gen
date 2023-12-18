import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        GetEverything solver = new GetEverything();
        solver.solve(1, in, out);
        out.close();
    }

    static class GetEverything {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] a = new long[m];
            int[] cc = new int[m];

            for (int i = 0; i < m; i++) {
                a[i] = in.nextLong();
                int b = in.nextInt();
                int c = 0;
                for (int j = 0; j < b; j++) {
                    c += (1 << in.nextInt() - 1);
                }
                cc[i] = c;
            }

            // dp[鍵mまでつかった][箱の状態] = 最小コスト
            long[][] dp = new long[m + 1][(1 << n) + 1];
            for (int i = 0; i <= m; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }

            dp[0][0] = 0;
            // 使う鍵
            for (int i = 0; i < m; i++) {
                // 箱の状態
                for (int j = 0; j < (1 << n); j++) {
                    // 鍵を使わない
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);

                    // 鍵を使った箱の状態
                    int status = j | cc[i];
                    dp[i + 1][status] = Math.min(dp[i + 1][status], dp[i][j] + a[i]);
                }
            }


            if (dp[m][(1 << n) - 1] == Integer.MAX_VALUE) {
                out.println(-1);
                return;
            }
            out.println(dp[m][(1 << n) - 1]);
        }

    }
}

