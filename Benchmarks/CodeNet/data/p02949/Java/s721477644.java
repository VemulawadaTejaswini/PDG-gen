import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;


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

        public <E extends Edge> Graph<E> generateNewGraph(Graph<E> graph, EdgeGenerator<E> edgeGenerator) {
            final Graph<E> newGraph = Graph.create(sccSize);
            final UnionFindTree uft = new UnionFindTree(sccSize);
            for (int u = 0; u < graph.size(); u++) {
                for (E e : graph.edges(u)) {
                    int from = order[u];
                    int to = order[e.to()];
                    if (!uft.same(from, to)) {
                        newGraph.addDirectionalEdge(from, edgeGenerator.generate(to, e));
                    }
                }
            }
            return newGraph;
        }
    }
}

interface EdgeGenerator<E extends Edge> {
    E generate(int to, E originalEdge);
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

interface Edge {
    int to();

    long cost();
}

class UnionFindTree {
    int[] parent;
    int[] size;

    public UnionFindTree(int n) {
        parent = new int[n];
        size = new int[n];
        init();
    }

    public void init() {
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public void unite(int x, int y) {
        int xx = find(x), yy = find(y);
        if (xx == yy) return;
        parent[xx] = yy;
        size[yy] += size[xx];
    }

    public int getSize(int x) {
        return size[find(x)];
    }

    public int getSize(int x, int y) {
        int xx = find(x), yy = find(y);
        if (xx == yy)
            return size[xx];
        else
            return size[xx] + size[yy];
    }

    public String toString() {
        String res = "";
        res += Arrays.toString(parent) + "\n";
        res += Arrays.toString(size);
        return res;
    }
}

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F3";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int p = in.nextInt();

        Graph<EdgeImpl> graph = Graph.create(n);
        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            int c = in.nextInt();
            graph.addDirectionalEdge(a, new EdgeImpl(b, c));
        }

        TopologicalSort<EdgeImpl> topologicalSort = new TopologicalSort<>(graph);
        int[] nodes = topologicalSort.doit();
        int[] priorities = new int[n];
        for (int i = 0; i < n; i++) {
            priorities[nodes[i]] = i;
        }

        final long INF = 1L << 60;
        long[] res = new long[n];
        Arrays.fill(res, -INF);
        res[0] = 0;

        boolean[] used = new boolean[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingLong(i -> priorities[i]));
        pq.add(0);

        while (!pq.isEmpty()) {
            int u = pq.poll();
            if (used[u]) continue;
            used[u] = true;

            for (Edge e : graph.edges(u)) {
                if (used[e.to()]) {
                    continue;
                }
                if (res[u] + e.cost() - p > res[e.to()]) {
                    res[e.to()] = res[u] + e.cost() - p;
                    pq.add(e.to());
                }
            }
        }

        boolean[] visited = new boolean[n];
        boolean[] canArrive = new boolean[n];
        for (int i = 0; i < n; i++) {
            canArrive[i] = canArrive(i, graph, visited);
        }
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited, false);
            visited[i] = true;
            if (res[i] == -INF) {
                continue;
            }
            for (Edge e : graph.edges(i)) {
                if (res[i] + e.cost() - p > res[e.to()] && canArrive[i]) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        System.out.println(Math.max(res[n - 1], 0));
    }

    private boolean canArrive(int u, Graph<? extends Edge> graph, boolean[] visited) {
        if (u == graph.size() - 1) {
            return true;
        }
        visited[u] = true;
        for (Edge e : graph.edges(u)) {
            if (visited[e.to()]) {
                continue;
            }
            if (canArrive(e.to(), graph, visited)) {
                return true;
            }
        }
        return false;
    }

    /* MOD_CALCULATION */
    static long MOD = 1000000007L;
    static long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    static long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    static long MULT(long a, long b) {
        return (a * b) % MOD;
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
