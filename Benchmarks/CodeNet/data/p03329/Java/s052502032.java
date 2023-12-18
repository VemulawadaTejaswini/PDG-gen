import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] dp = new int[100005];
            int n = in.nextInt();
            dp[0] = 0;
            for (int i = 1; i <= n; ++i) {
                dp[i] = dp[i - 1] + 1;
                for (int j = 6; j <= i; j *= 6) {
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);
                }
                for (int j = 9; j <= i; j *= 9) {
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);
                }
            }
            out.print(dp[n]);
        }

    }
}

