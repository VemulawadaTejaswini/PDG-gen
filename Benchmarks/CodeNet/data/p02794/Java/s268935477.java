import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/B2";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int[][] packed = in.nextPackedIntArrays(2, n - 1);
        int[] a = packed[0];
        int[] b = packed[1];
        BinaryIndexedTree binaryIndexedTree;
        Graph<SimpleEdge> g = Graph.createUndirectionalTree(a, b);


    }

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

}

class SimpleEdge implements Edge {
    private final int to;

    public SimpleEdge(int to) {
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


class Graph<E extends Edge> {
    private final int n;
    private final List<E>[] g;

    public static <E extends Edge> Graph<E> create(int n) {
        ArrayList<E>[] l = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            l[i] = new ArrayList<>();
        }
        return new Graph<>(n, l);
    }

    public Graph(int n, List<E>[] g) {
        this.n = n;
        this.g = g;
    }

    public static Graph<SimpleEdge> createDirectionalTree(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("len(a) != len(b)");
        }
        int n = a.length + 1;
        Graph<SimpleEdge> g = create(n);
        for (int i = 0; i < n - 1; i++) {
            g.addDirectionalEdge(a[i], new SimpleEdge(b[i]));
        }
        return g;
    }

    public static Graph<SimpleEdge> createUndirectionalTree(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("len(a) != len(b)");
        }
        int n = a.length + 1;
        Graph<SimpleEdge> g = create(n);
        for (int i = 0; i < n - 1; i++) {
            g.addDirectionalEdge(a[i], new SimpleEdge(b[i]));
            g.addDirectionalEdge(b[i], new SimpleEdge(a[i]));
        }
        return g;
    }

    public void addDirectionalEdge(int u, E e) {
        g[u].add(e);
    }

    public Iterable<E> edges(int u) {
        return g[u];
    }

    public int edgeNum(int u) {
        return g[u].size();
    }

    public int size() {
        return n;
    }

    /**
     *
     * @param start
     * @return The cost of node v is:
     * <ul>
     *     <li>-(1L << 62) if a node is under negative loop</li>
     *     <li>(1L << 62) if there is no edge to v</li>
     *     <li>otherwise minimum cost from node u to a node</li>
     * </ul>
     */
    public long[] bellmanford(int start) {
        final long INF = 1L << 62;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int u = 0; u < n; u++) {
                for (Edge e : edges(u)) {
                    dist[e.to()] = Math.min(dist[e.to()], dist[u] + e.cost());
                }
            }
        }

        long[] res = Arrays.copyOf(dist, dist.length);
        for (int u = 0; u < n; u++) {
            for (Edge e : edges(u)) {
                int v = e.to();
                if (dist[u] + e.cost() < dist[v]) {
                    res[v] = -INF;
                }
            }
        }
        return res;
    }

    /**
     *
     * @param start
     * @return For each v, true if a node v can be arrived from start node, otherwise false.
     */
    public boolean[] canArrive(int start) {
        boolean[] res = new boolean[size()];
        canArriveInternal(start, res);
        return res;
    }

    private void canArriveInternal(int u, boolean[] visited) {
        visited[u] = true;
        for (Edge e : edges(u)) {
            if (visited[e.to()]) {
                continue;
            }
            canArriveInternal(e.to(), visited);
        }
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

public interface EdgeGenerator<E extends Edge> {
    E generate(int to, E originalEdge);
}

public interface Edge {
    int to();

    long cost();
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

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
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

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
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

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}

class BinaryIndexedTree {
    final int n;
    final long[] a;

    private BinaryIndexedTree(int size, long[] a) {
        this.n = size;
        this.a = a;
    }

    public static BinaryIndexedTree create(int n) {
        int size = Integer.highestOneBit(n) << 1;
        return new BinaryIndexedTree(size, new long[size+1]);
    }

    public void add(int x, long w) {
        for (int i = x; i <= n; i += i & -i) {
            a[i] += w;
        }
    }

    public long sum(int x) {
        long res = 0;
        for (int i = x; i > 0; i -= i & -i) {
            res += a[i];
        }
        return res;
    }
}
