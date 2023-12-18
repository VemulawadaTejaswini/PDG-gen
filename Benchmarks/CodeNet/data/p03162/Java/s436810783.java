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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] dp = new int[n][3];
            int[][] a = new int[n][3];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            dp[0][0] = a[0][0];
            dp[0][1] = a[0][1];
            dp[0][2] = a[0][2];

            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + a[i][0];
                dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + a[i][1];
                dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + a[i][2];

            }

            out.println(Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
        }

    }
}

