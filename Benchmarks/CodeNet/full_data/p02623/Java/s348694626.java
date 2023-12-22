import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTsundoku solver = new CTsundoku();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTsundoku {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n + 1];
            long[] b = new long[m + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = in.nextLong();
                a[i] += a[i - 1];
            }
            for (int i = 1; i <= m; i++) {
                b[i] = in.nextLong();
                b[i] += b[i - 1];
            }

            // out.println(Arrays.toString(a));
            // out.println(Arrays.toString(b));

            int max = -1;
            for (int i = 0; i <= n; i++) {
                // i 冊読んでいるとする
                if (a[i] > k) break;
                int ng = -1;
                int ok = b.length;
                while (Math.abs(ok - ng) > 1) {
                    int mid = (ok + ng) / 2;
                    if (a[i] + b[mid] > k) {
                        ok = mid;
                    } else {
                        ng = mid;
                    }
                }
                // out.println(i + " " + ng);
                max = Math.max(max, i + ng);
            }

            out.println(max);

        }

    }
}

