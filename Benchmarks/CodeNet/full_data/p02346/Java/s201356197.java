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
        AizuRangeSumQuery solver = new AizuRangeSumQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuRangeSumQuery {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();

            int[] a = new int[n];
            int[] b = new int[2 * n + n];

            build(0, 0, n - 1, a, b);

            while (q-- != 0) {
                int o = in.nextInt();
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;

                if (o == 0) {
                    update(0, 0, n - 1, l, r + 1, a, b);
                } else {
                    out.printf("%d\n", query(0, 0, n - 1, l, r, b));
                }
            }
        }

        private void build(int n, int s, int e, int[] a, int[] b) {
            if (s == e) {
                b[n] = a[s];
            } else {
                int m = (s + e) / 2;
                build(2 * n + 1, s, m, a, b);
                build(2 * n + 2, m + 1, e, a, b);

                b[n] = b[2 * n + 1] + b[2 * n + 2];
            }
        }

        private void update(int n, int s, int e, int idx, int val, int[] a, int[] b) {
            if (s == e) {
                a[idx] += val;
                b[n] += val;
            } else {
                int m = (s + e) / 2;
                if (s <= idx && idx <= m) {
                    update(2 * n + 1, s, m, idx, val, a, b);
                } else {
                    update(2 * n + 2, m + 1, e, idx, val, a, b);
                }

                b[n] = b[2 * n + 1] + b[2 * n + 2];
            }
        }

        private long query(int n, int s, int e, int l, int r, int[] b) {
            if (r < s || e < l) {
                return 0;
            } else if (l <= s && e <= r) {
                return b[n];
            } else {
                int m = (s + e) / 2;
                long s1 = query(2 * n + 1, s, m, l, r, b);
                long s2 = query(2 * n + 2, m + 1, e, l, r, b);

                return s1 + s2;
            }
        }

    }
}


