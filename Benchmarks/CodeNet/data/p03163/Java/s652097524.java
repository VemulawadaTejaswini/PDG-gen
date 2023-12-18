import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKnapsack1 solver = new DKnapsack1();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKnapsack1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int W = in.nextInt();

            int[] w = new int[n + 1];
            int[] v = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                w[i] = in.nextInt();
                v[i] = in.nextInt();
            }

            long[][] dp = new long[n + 1][W + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= W; j++) {
                    if (j < w[i]) {
                        dp[i][j] = dp[i - 1][j];
                        continue;
                    }
                    dp[i][j] = Math.max(dp[i - 1][j], v[i] + dp[i - 1][j - w[i]]);
                }
            }

            out.println(dp[n][W]);
        }

    }
}

