import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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

            boolean[] result = new boolean[n + 1];
            Arrays.fill(result, true);

            for (int i = 1; i <= m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();

                if (h[a] < h[b]) {
                    result[a] = false;
                } else if (h[a] > h[b]) {
                    result[b] = false;
                } else {
                    result[a] = false;
                    result[b] = false;
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

