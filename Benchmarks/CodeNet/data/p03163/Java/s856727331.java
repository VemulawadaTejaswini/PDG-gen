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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();
            int[] weights = new int[n];
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = in.nextInt();
                values[i] = in.nextInt();
            }
            long[][] dp = new long[n + 1][w + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= w; j++) {
                    if (i == 0 || j == 0)
                        dp[i][j] = 0;
                    else if (weights[i - 1] <= j) {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                    } else
                        dp[i][j] = dp[i - 1][j];
                }
            }
            out.println(dp[n][w]);
        }

    }
}

