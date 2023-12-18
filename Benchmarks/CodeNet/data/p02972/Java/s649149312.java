import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/C1";

    FastScanner in;
    PrintWriter out;

    ArrayList<Integer>[] g;

    public void solve() {
        int n = in.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }

        int[] box = new int[n+1];
        List<Integer> res = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            int s = 0;
            for (int j = i; j <= n; j += i) {
                s += box[j];
            }
            box[i] = (s + a[i]) % 2;
            if (box[i] == 1) res.add(i);
        }
        out.println(res.size());
        for (int i = res.size() - 1; i >= 0; i--) {
            out.println(res.get(i));
        }
        out.close();
    }

    class Graph<E extends Edge> {
        private final int n;
        private final List<E>[] g;

        public Graph(int n) {
            this(n, new ArrayList[n]);
        }

        public Graph(int n, List<E>[] g) {
            this.n = n;
            this.g = g;
        }

        public void addDirectionalEdge(int u, E e) {
            g[u].add(e);
        }

        public Iterable<E> edges(int u) {
            return g[u];
        }

        public int size() {
            return n;
        }

        public long[] bellmanford(int start) {
            long[] dist = new long[n];
            Arrays.fill(dist, 1L << 62);
            dist[start] = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int u = 0; u < n; u++) {
                    for (Edge e : edges(u)) {
                        dist[e.to()] = Math.min(dist[e.to()], dist[u] + e.cost());
                    }
                }
            }
            return dist;
        }
    }

    class StrongConnectedComponents<E extends Edge> {
        private final Graph<E> graph;

        public StrongConnectedComponents(Graph<E> graph) {
            this.graph = graph;
        }

        public SCCResult doit() {
            int n = graph.size();
            int[] order = new TopologicalSort<>(graph).doit();
            boolean[] visited = new boolean[n];
            int sccSize = 0;
            for (int u = n - 1; u >= 0; u--) {
                if (!visited[u]) {
                    dfs(u, order, visited, ++sccSize);
                }
            }
            return new SCCResult(order, sccSize);
        }

        private void dfs(int u, int[] order, boolean[] visited, int id) {
            visited[u] = true;
            order[u] = id;
            for (Edge e : graph.edges(u)) {
                if (!visited[e.to()]) {
                    dfs(e.to(), order, visited, id);
                }
            }
        }

        class SCCResult {
            final int[] order;
            final int sccSize;

            public SCCResult(int[] order, int sccSize) {
                this.order = order;
                this.sccSize = sccSize;
            }
        }
    }

    class TopologicalSort<E extends Edge> {
        private final Graph<E> graph;

        public TopologicalSort(Graph<E> graph) {
            this.graph = graph;
        }

        int index;
        boolean[] visited;

        public int[] doit() {
            final int n = graph.size();
            visited = new boolean[n];
            index = n - 1;

            int[] result = new int[n];
            for (int u = 0; u < n; u++) {
                if (!visited[u]) {
                    dfs(u, result);
                }
            }
            if (index != -1) {
                throw new RuntimeException();
            }
            return result;
        }

        private void dfs(int u, int[] result) {
            visited[u] = true;
            for (Edge e : graph.edges(u)) {
                if (!visited[e.to()]) {
                    dfs(e.to(), result);
                }
            }
            result[index--] = u;
        }
    }

    class EdgeImpl implements Edge {
        private final int to;
        private final long cost;

        public EdgeImpl(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int to() {
            return to;
        }

        @Override
        public long cost() {
            return cost;
        }
    }


    class IntEdge implements Edge {
        private final int to;

        public IntEdge(int to) {
            this.to = to;
        }

        @Override
        public int to() {
            return to;
        }

        @Override
        public long cost() {
            return 1;
        }
    }

    interface Edge {
        int to();
        long cost();
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
