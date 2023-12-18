import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGarbageCollector solver = new BGarbageCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGarbageCollector {
        private static int n;
        private static long e;
        private static long[] x;
        private static long[] dp;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            e = in.nextLong();
            x = new long[n];
            dp = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextLong();
            }
            out.println(calc(n - 1));
            // System.out.println(Arrays.toString(dp));
        }

        private static long calc(int i) {
            if (i < 0) {
                return 0;
            } else if (dp[i] > 0) {
                return dp[i];
            }
            long ereq = e * 2 + 5 * x[i];
            int amount = 1;
            long ans = ereq + calc(i - 1);
            // System.out.println("#" + i + ": " + ans);

            for (int j = i; j > 0; j--) {
                ereq -= conveyEnergyRequired(amount, x[j - 1]);
                ereq += conveyEnergyRequired(amount + 1, x[j - 1]);
                ereq += e;
                ans = Math.min(ans, ereq + calc(j - 2));
                amount++;
                // System.out.println("#" + i + ": " + ans);
            }
            return dp[i] = ans;
        }

        private static long conveyEnergyRequired(int amount, long distance) {
            return distance * (amount + 1) * (amount + 1);
        }

    }
}

