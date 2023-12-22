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
        HackerEarthRangeMinimumQuery solver = new HackerEarthRangeMinimumQuery();
        solver.solve(1, in, out);
        out.close();
    }

    static class HackerEarthRangeMinimumQuery {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[4 * n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            build(0, 0, n - 1, a, b);
            while (q-- != 0) {
                String s = in.next();
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;

                if (s.equals("q")) {
                    out.printf("%d\n", query(0, 0, n - 1, l, r, b));
                } else {
                    update(0, 0, n - 1, l, r + 1, a, b);
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

                b[n] = Math.min(b[2 * n + 1], b[2 * n + 2]);
            }
        }

        private void update(int n, int s, int e, int idx, int val, int[] a, int[] b) {
            if (s == e) {
                a[idx] = val;
                b[n] = val;
            } else {
                int m = (s + e) / 2;
                if (s <= idx && idx <= m) {
                    update(2 * n + 1, s, m, idx, val, a, b);
                } else {
                    update(2 * n + 2, m + 1, e, idx, val, a, b);
                }

                b[n] = Math.min(b[2 * n + 1], b[2 * n + 2]);
            }
        }

        private int query(int n, int s, int e, int l, int r, int[] b) {
            if (r < s || e < l) {
                return Integer.MAX_VALUE;
            } else if (l <= s && e <= r) {
                return b[n];
            } else {
                int m = (s + e) / 2;
                int ml = query(2 * n + 1, s, m, l, r, b);
                int mr = query(2 * n + 2, m + 1, e, l, r, b);

                return Math.min(ml, mr);
            }
        }

    }
}


