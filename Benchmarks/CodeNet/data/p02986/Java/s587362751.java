import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F1";

    FastScanner in;
    PrintWriter out;

    class Edge {
        final int b;
        final int c;
        final long d;

        public Edge(int b, int c, long d) {
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }

    List<Edge>[] g;
    int[] depth;
    long[] dist;
    int[][] parent;

    Map<Integer, Pair>[] map;

    public void solve() {
        int n = in.nextInt();
        int q = in.nextInt();
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt() - 1, b = in.nextInt() - 1;
            int c = in.nextInt() - 1, d = in.nextInt();
            g[a].add(new Edge(b, c, d));
            g[b].add(new Edge(a, c, d));
        }
        int[] x = new int[q];
        long[] y = new long[q];
        int[] u = new int[q];
        int[] v = new int[q];
        for (int i = 0; i < q; i++) {
            x[i] = in.nextInt() - 1;
            y[i] = in.nextInt();
            u[i] = in.nextInt() - 1;
            v[i] = in.nextInt() - 1;
        }

        depth = new int[n];
        dist = new long[n];
        parent = new int[19][n];
        dfs(0, 0, 0, 0);
        for (int i = 0; i < parent.length - 1; i++) {
            for (int j = 0; j < n; j++) {
                parent[i+1][j] = parent[i][parent[i][j]];
            }
        }

        map = new HashMap[n];
        for (int i = 0; i < n; i++) {
            map[i] = new HashMap<>();
        }
        for (int i = 0; i < q; i++) {
            map[u[i]].put(x[i], null);
            map[v[i]].put(x[i], null);
            map[lca(u[i], v[i])].put(x[i], null);
        }
        dfs2(0, -1, new long[n], new int[n]);

        for (int i = 0; i < q; i++) {
            long res = dist[u[i]] + dist[v[i]] - 2 * dist[lca(u[i], v[i])];
            final Pair uu = map[u[i]].get(x[i]);
            final Pair vv = map[v[i]].get(x[i]);
            final Pair lca = map[lca(u[i], v[i])].get(x[i]);
            res -= (uu.dep + vv.dep - 2 * lca.dep);
            res += (uu.cnt + vv.cnt - 2 * lca.cnt) * y[i];
            if (res < 0) {
                throw new RuntimeException();
            }
            out.println(res);
        }
        out.close();
    }

    int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }
        for (int i = parent.length - 1; i >= 0; i--) {
            if (depth[u] - depth[v] >= (1L << i)) {
                u = parent[i][u];
            }
        }
        for (int i = parent.length - 1; i >= 1; i--) {
            if (parent[i][u] != parent[i][v]) {
                u = parent[i][u];
                v = parent[i][v];
            }
        }
        return u != v ? parent[0][u] : u;
    }

    private void dfs(int u, int par, int dep, long distance) {
        dist[u] = distance;
        depth[u] = dep;
        for (Edge e : g[u]) {
            if (e.b == par) continue;
            parent[0][e.b] = u;
            dfs(e.b, u, dep + 1, distance + e.d);
        }
    }

    private void dfs2(int u, int par, long[] depsByColor, int[] countsByColor) {
        for (int color : map[u].keySet()) {
            map[u].put(color, new Pair(depsByColor[color], countsByColor[color]));
        }
        for (Edge e : g[u]) {
            if (e.b == par) continue;
            depsByColor[e.c] += e.d;
            countsByColor[e.c]++;
            dfs2(e.b, u, depsByColor, countsByColor);
            depsByColor[e.c] -= e.d;
            countsByColor[e.c]--;
        }
    }

    class Pair {
        final long dep;
        final int cnt;

        public Pair(long dep, int cnt) {
            this.dep = dep;
            this.cnt = cnt;
        }
    }

    /* MOD_CALCULATION */
    static int MOD = 1_000_000_007;
    static long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    static long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long MULT(long a, long b) {
        return ((a % MOD) * (b % MOD)) % MOD;
    }

    static long POW(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    static long DIV(long a, long b) {
        return MULT(a, POW(b, MOD - 2));
    }
    /* end */

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

    class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
            // stream = new FileInputStream(new File("dec.in"));

        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}
