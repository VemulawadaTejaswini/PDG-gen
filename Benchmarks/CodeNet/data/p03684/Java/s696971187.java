import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DBuilt solver = new DBuilt();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBuilt {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            DBuilt.P[] p = new DBuilt.P[n];

            for (int i = 0; i < n; i++) {
                int x = in.nextInt(), y = in.nextInt();
                p[i] = new DBuilt.P(x, y, i);
            }

            DBuilt.P[] x = new DBuilt.P[n];
            DBuilt.P[] y = new DBuilt.P[n];
            System.arraycopy(p, 0, x, 0, n);
            System.arraycopy(p, 0, y, 0, n);

            Arrays.sort(x, Comparator.comparingInt(i -> i.x));
            Arrays.sort(y, Comparator.comparingInt(i -> i.y));

            ArrayList<DBuilt.E> edges = new ArrayList<>();

            for (int i = 0; i + 1 < n; i++) {
                int u = x[i].i;
                int v = x[i + 1].i;
                edges.add(new DBuilt.E(u, v, d(x[i], x[i + 1])));
            }
            for (int i = 0; i + 1 < n; i++) {
                int u = y[i].i;
                int v = y[i + 1].i;
                edges.add(new DBuilt.E(u, v, d(y[i], y[i + 1])));
            }

            edges.sort(Comparator.comparingInt(i -> i.w));

            UnionFind uf = new UnionFind(n);
            long answer = 0;

            for (DBuilt.E e : edges) {
                int i = e.u, j = e.v;
                if (uf.rep(i) != uf.rep(j)) {
                    answer += e.w;
                    uf.union(i, j);
                }
            }

            out.println(answer);
        }

        private static int d(DBuilt.P u, DBuilt.P v) {
            return Math.min(Math.abs(u.x - v.x), Math.abs(u.y - v.y));
        }

        static class P {
            final int x;
            final int y;
            final int i;

            P(int x, int y, int i) {
                this.x = x;
                this.y = y;
                this.i = i;
            }

        }

        static class E {
            final int u;
            final int v;
            final int w;

            E(int u, int v, int w) {
                this.u = u;
                this.v = v;
                this.w = w;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class UnionFind {
        private int[] __rep;
        private int[] __size;

        public UnionFind(int n) {
            __rep = new int[n];
            __size = new int[n];
            for (int i = 0; i < n; i++) {
                __rep[i] = i;
                __size[i] = 1;
            }
        }

        public int rep(int x) {
            if (__rep[x] == x) {
                return x;
            }

            int r = rep(__rep[x]);
            __rep[x] = r;
            return r;
        }

        public int size(int x) {
            return __size[rep(x)];
        }

        public void union(int x, int y) {
            x = rep(x);
            y = rep(y);

            if (x == y) {
                return;
            }

            if (size(x) < size(y)) {
                int t = x;
                x = y;
                y = t;
            }

            // now size(x) >= size(y)

            __rep[y] = x;
            __size[x] += __size[y];
        }

    }
}

