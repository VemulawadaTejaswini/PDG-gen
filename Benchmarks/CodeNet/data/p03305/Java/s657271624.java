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
        DSavingSnuuk solver = new DSavingSnuuk();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSavingSnuuk {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), s = in.nextInt(), t = in.nextInt();
            int[] u = new int[m], v = new int[m], a = new int[m], b = new int[m];
            for (int i = 0; i < m; i++) {
                u[i] = in.nextInt();
                v[i] = in.nextInt();
                a[i] = in.nextInt();
                b[i] = in.nextInt();
            }
            long[] jpy = new long[n], snk = new long[n];
            d(u, v, a, s - 1, jpy);
            d(u, v, b, t - 1, snk);
            //out.println(Arrays.toString(jpy));
            //out.println(Arrays.toString(snk));
            long min = Long.MAX_VALUE;
            long[] ans = new long[n];
            for (int i = n - 1; i >= 0; i--) {
                min = Math.min(min, jpy[i] + snk[i]);
                ans[i] = min;
            }
            for (long oneofans : ans) {
                out.println(1000000000000000L - oneofans);
            }
        }

        private static void d(int[] u, int[] v, int[] c, int s, long[] dist) {
            boolean[] f = new boolean[dist.length];
            for (int i = 0; i < f.length; i++) {
                dist[i] = Long.MAX_VALUE;
                f[i] = false;
            }
            dist[s] = 0;
            while (true) {
                int m = m(dist, f);
                if (m < 0) {
                    return;
                }
                f[m] = true;
                for (int i = 0; i < u.length; i++) {
                    if (u[i] - 1 == m) {
                        int t = v[i] - 1;
                        long nd = dist[m] + c[i];
                        dist[t] = Math.min(dist[t], nd);
                    }
                }
                for (int i = 0; i < u.length; i++) {
                    if (v[i] - 1 == m) {
                        int t = u[i] - 1;
                        long nd = dist[m] + c[i];
                        dist[t] = Math.min(dist[t], nd);
                    }
                }
            }
        }

        private static int m(long[] dist, boolean[] f) {
            int d = -1;
            for (int i = 0; i < dist.length; i++) {
                if (!f[i]) {
                    if (d < 0 || dist[i] < dist[d]) {
                        d = i;
                    }
                }
            }
            return d;
        }

    }
}

