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
        ABC107_C solver = new ABC107_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC107_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long[] map = new long[n];
            long ans = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLong();
            }

            for (int i = 0; i <= n - k; i++) {
                long cost = 0;
                if (map[i] <= 0 && map[i + k - 1] <= 0) {
                    cost = Math.abs(map[i]);
                    ans = Math.min(ans, cost);
                    continue;
                }

                if (0 <= map[i] && 0 <= map[i + k - 1]) {
                    cost = Math.abs(map[i + k - 1]);
                    ans = Math.min(ans, cost);
                    continue;
                }

                if (map[i] <= 0 && 0 <= map[i + k - 1]) {
                    cost = Math.abs(Math.max(map[i], map[i + k - 1])) + (Math.abs(Math.min(map[i], map[i + k - 1]) * 2));
                    ans = Math.min(ans, cost);
                    continue;
                }


            }

            out.print(ans);
        }

    }
}

