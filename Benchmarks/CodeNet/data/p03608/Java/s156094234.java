import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static int ans = Integer.MAX_VALUE;
    static int[][] d;
    static int[] r;

    public static void main(String[] args) {
        int V = in.i();
        int E = in.i();
        int R = in.i();
        r = in.ii(R);
        Graph graph = new Graph(V, E, in);
        d = graph.WarshallFloyd();
        permutation(0, R, new boolean[R], new int[R]);
        out.println(ans);
    }

    static void check(int[] arr) {
        int t = 0;
        for (int i = 1; i < arr.length; i++) {
            int u = arr[i - 1];
            int v = arr[i];
            t += d[u][v];
        }
        ans = Math.min(ans, t);
    }

    static void permutation (int i, int n, boolean[] used, int[] arr) {
        if (i == n) {
            check(arr);
        } else {
            for (int j = 0; j < n; j++) {
                if (!used[j]) {
                    used[j] = true;
                    arr[i] = r[j] - 1;
                    permutation(i + 1, n, used, arr);
                    used[j] = false;
                }
            }
        }
    }
}

class Graph {
    private static final int INF = Integer.MAX_VALUE;

    int V;
    int E;

    ArrayList<int[]>[] T; // 連結関数
    int[][] d; // ワ―シャル用

    Graph(int V, int E, MyReader in) {
        this.V = V;
        this.E = E;
        T = new ArrayList[V];
        d = new int[V][V];

        Arrays.setAll(T, i -> new ArrayList<>());
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                d[i][j] = INF / 2;
            }
        }

        for (int i = 0; i < E; i++) {
            int u = in.i() - 1;
            int v = in.i() - 1;
            int w = in.i();
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
                tail = read(cbuf, 0, cbuf.length);
            } catch (IOException e) {}
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
                if (c != ' ' && c != '\n' && c != '\r') {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        void skip() {
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    back();
                    break;
                }
            }
        }

        char[] s(final int N) {
            skip();
            char[] s = new char[N];
            for (int i = 0; i < s.length; i++) {
                s[i] = next();
            }
            return s;
        }

        String s() {
            try {
                return readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
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
