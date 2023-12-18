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
        TaskL solver = new TaskL();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskL {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();
            long[][][] dp = new long[n + 1][n + 1][2];
            long[] sum = new long[n + 1];
            sum[0] = 0;
            for (int i = 0; i < n; i++)
                sum[i + 1] = sum[i] + arr[i];
            for (int j = 0; j < n; j++) {
                for (int i = j; i >= 0; i--) {
                    for (int k = 1; k >= 0; k--) {
                        if (k == 0)
                            dp[i][j][k] = sum[j + 1] - sum[i] - dp[i][j][1 - k];
                        else if (i == j) {
                            dp[i][j][k] = arr[i];
                        } else {
                            dp[i][j][k] = Math.max(dp[i + 1][j][1 - k] + arr[i], dp[i][j - 1][1 - k] + arr[j]);
                        }
                        //System.out.println(i + " " + j + " " + k + " " + dp[i][j][k]);
                    }
                }
            }
            out.println(2 * dp[0][n - 1][1] - sum[n]);
        }

    }
}

