import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0xfffffffffffffffL;
    static final int iinf = 0xfffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    List<List<Edge>> edges;
    long[][] time;
    long[] ans;
    PriorityQueue<Pair> queue;
    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            int a = in.nextInt();
            int b = in.nextInt();
            edges.get(u).add(new Edge(v, a, b));
            edges.get(v).add(new Edge(u, a, b));
        }
        int[] c = new int[n];
        long[] d = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
            d[i] = in.nextInt();
        }
        time = new long[n][300];
        ans = new long[n];
        if (s >= 300) {
            long[] t = new long[n];
            for (int i = 1; i < n; i++) {
                t[i] = inf;
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingLong(i -> t[i]));
            queue.add(0);
            while (!queue.isEmpty()) {
                Integer p = queue.poll();
                for (Edge edge : edges.get(p)) {
                    if (t[edge.to] > t[p] + edge.dist) {
                        t[edge.to] = t[p] + edge.dist;
                        queue.add(edge.to);
                    }
                }
            }
            for (int i = 1; i < n; i++) {
                out.println(t[i]);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 300; j++) {
                time[i][j] = inf;
            }
        }
        time[0][s] = 0;
        queue = new PriorityQueue<>(Comparator.comparingLong(pair -> time[pair.v][pair.money]));
        queue.add(new Pair(0, s));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (pair.money + c[pair.v] < 300) {
                update(pair.v, pair.money + c[pair.v], time[pair.v][pair.money] + d[pair.v]);
            }
            for (Edge edge : edges.get(pair.v)) {
                if (pair.money - edge.cost >= 0) {
                    update(edge.to, pair.money - edge.cost, time[pair.v][pair.money] + edge.dist);
                }
            }
        }
        for (int i = 1; i < n; i++) {
            long ans = inf;
            for (int j = 0; j < 300; j++) {
                ans = Math.min(ans, time[i][j]);
            }
            out.println(ans);
        }
    }

    void update(int v, int money, long t) {
        if (time[v][money] > t) {
            time[v][money] = t;
            queue.add(new Pair(v, money));
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Pair {
    int v;
    int money;

    Pair(int v, int money) {
        this.v = v;
        this.money = money;
    }
}

class Edge {
    int to;
    int cost, dist;

    Edge(int to, int cost, int dist) {
        this.to = to;
        this.cost = cost;
        this.dist = dist;
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
