import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextInt();

            int dp[] = new int[n + 5];
            dp[0] = 0;
            dp[1] = Math.abs(a[0] - a[1]);
            if (n > 2) {
                dp[2] = Math.min(dp[0] + Math.abs(a[0] - a[2]), dp[1] + Math.abs(a[1] - a[2]));
                for (int i = 3; i < n; i++) {
                    dp[i] = Math.min(dp[i - 1] + Math.abs(a[i - 1] - a[i]), dp[i - 2] + Math.abs(a[i - 2] - a[i]));
                }
            }

            out.println(dp[n - 1]);
        }

    }
}

