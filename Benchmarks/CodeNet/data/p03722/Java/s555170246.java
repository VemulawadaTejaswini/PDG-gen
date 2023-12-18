import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        Graph g = new Graph(in);
        long[] d = g.BellmanFord(0);
        out.println(d == null ? "inf" : -d[g.V - 1]);
    }
}

class Graph {
    private static final int INF = Integer.MAX_VALUE / 2;

    int V;
    int E;

    int[][] edge;
    ArrayList<int[]>[] T;
    int[][] d;

    Graph(MyReader in) {
        V = in.i();
        E = in.i();
        edge = new int[E][];
        T = new ArrayList[V];
        d = new int[V][V];

        Arrays.setAll(T, i -> new ArrayList<>());
        for (int i = 0; i < V; i++) {
            Arrays.fill(d[i], INF);
        }

        for (int i = 0; i < E; i++) {
            int u = in.i() - 1;
            int v = in.i() - 1;
            int w = in.i();
            edge[i] = new int[]{u, v, w};
            d[u][v] = d[v][u] = w;
            T[u].add(new int[]{v, w});
            T[v].add(new int[]{u, w});
        }
    }

    int[] dijkstra(int s) {
        int[] d = new int[V];
        Arrays.fill(d, INF);
        d[s] = 0;

        PriorityQueue<Integer> A = new PriorityQueue<>((x, y) -> d[x] - d[y]);
        A.add(s);

        while (!A.isEmpty()) {
            int v = A.poll();
            for(int[] edge : T[v]){
                int u = edge[0];
                int w = edge[1];
                if(d[u] == INF){
                    d[u] = d[v] + w;
                    A.add(u);
                } else if(d[u] - d[v] > w){
                    d[u] = d[v] + w;
                }
            }
        }
        return d;
    }

    int[][] WarshallFloyd() {
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    int t = d[i][k] + d[k][j];
                    if (t < d[i][j]) {
                        d[i][j] = t;
                    }
                }
            }

        }
        return d;
    }

    long[] BellmanFord(int s) {
        long[] d = new long[V];
        Arrays.fill(d, 1L << 41);
        d[s] = 0;

        for (int i = 1; i < V; i++) {
            for (int j = 0; j < E; j++) {
                int u = edge[j][0];
                int v = edge[j][1];
                long w = -edge[j][2];
                if (d[u] + w < d[v]) {
                    d[v] = d[u] + w;
                }
            }
        }

        for (int i = 0; i < E; i++) {
            int u = edge[i][0];
            int v = edge[i][1];
            long w = -edge[i][2];
            if (d[u] + w < d[v]) {
                d = null;
                break;
            }
        }

        return d;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
