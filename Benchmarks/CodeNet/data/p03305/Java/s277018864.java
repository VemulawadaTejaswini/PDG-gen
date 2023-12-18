import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Scanner;
import java.util.Queue;
import java.util.Comparator;
import java.util.ArrayList;

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
            int n = in.nextInt(), m = in.nextInt(), s = in.nextInt() - 1, t = in.nextInt() - 1;

            List<List<DSavingSnuuk.Pair>> neig = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                neig.add(new ArrayList<>());
            }


            for (int i = 0; i < m; i++) {
                int x = in.nextInt(), y = in.nextInt();
                int a = in.nextInt(), b = in.nextInt();
                neig.get(x - 1).add(new DSavingSnuuk.Pair(y - 1, a, b));
                neig.get(y - 1).add(new DSavingSnuuk.Pair(x - 1, a, b));
            }
            long[] jpy = new long[n], snk = new long[n];
            d(neig, s, jpy, 0);
            d(neig, t, snk, 1);
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

        private static void d(List<List<DSavingSnuuk.Pair>> d, int s, long[] dist, int ci) {
            boolean[] f = new boolean[dist.length];
            for (int i = 0; i < f.length; i++) {
                dist[i] = Long.MAX_VALUE;
                f[i] = false;
            }
            dist[s] = 0;
            Queue<Integer> todo = new PriorityQueue<>(Comparator.comparing(i -> -dist[i]));
            todo.add(s);
            while (!todo.isEmpty()) {
                int m = todo.remove();
                if (f[m]) {
                    continue;
                }
                f[m] = true;
                for (DSavingSnuuk.Pair p : d.get(m)) {
                    if (p == null) {
                        break;
                    }
                    int t = p.n;
                    long nd = dist[m] + p.c[ci];
                    if (dist[t] > nd) {
                        dist[t] = nd;
                        todo.add(t);
                    }
                }
            }
        }

        private static class Pair {
            int n;
            int[] c = new int[2];

            private Pair(int n, int c1, int c2) {
                this.n = n;
                this.c[0] = c1;
                this.c[1] = c2;
            }

        }

    }
}

