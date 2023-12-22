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
        Peaks solver = new Peaks();
        solver.solve(1, in, out);
        out.close();
    }

    static class Peaks {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] h = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                h[i] = in.nextInt();
            }

            long[][] loads = new long[n + 1][n + 1];

            for (int i = 1; i <= m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();

                loads[a][b] = h[b];
                loads[b][a] = h[a];
            }

            boolean[] result = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                long max_cost = 0;
                int max_pos = 0;
                for (int j = 1; j <= n; j++) {
                    if (max_cost < loads[i][j]) {
                        max_cost = loads[i][j];
                        max_pos = j;
                    }
                }
                if (max_cost == 0) {
                    result[i] = true;
                    continue;
                }
                if (h[max_pos] > h[i]) {
                    result[max_pos] = true;
                } else if (h[max_pos] < h[i]) {
                    result[i] = true;
                }

            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (result[i]) {
                    count++;
                }
            }
            out.append(String.valueOf(count));
        }

    }
}

