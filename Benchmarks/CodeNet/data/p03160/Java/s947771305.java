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

            int[] dp = new int[n];
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            dp[0] = 0;
            dp[1] = Math.abs(a[0] - a[1]);
            for (int i = 2; i < n; i++) {
                dp[i] = Math.min(dp[i - 1] + Math.abs(a[i] - a[i - 1]), dp[i - 2] + Math.abs(a[i] - a[i - 2]));
            }

            out.println(dp[n - 1]);
        }

    }
}

