import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static int ans = Integer.MAX_VALUE;
    static int[][] d;
    static int[] r;

    public static void main(String[] args) {
        int N = in.i();
        Graph graph = new Graph(N, in);
        long ans = graph.WarshallFloyd();
        out.println(ans);
    }
}

class Graph {
    private static final int INF = Integer.MAX_VALUE / 2;

    int V;
    int[][] d;

    Graph(int N, MyReader in) {
        this.V = N;
        d = new int[V][V];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                d[i][j] = in.i();
            }
        }
    }

    long WarshallFloyd() {
        int[][] l = new int[V][V];
        Arrays.setAll(l, i -> d[i].clone());
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                if (i == k) continue;
                for (int j = 0; j < V; j++) {
                    if (j == k) continue;
                    int t = d[i][k] + d[k][j];
                    if (t < d[i][j]) {
                        return -1;
                    } else if (t == d[i][j]) {
                        l[i][j] = 0;
                    }
                }
            }
        }

        long len = 0;
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                len += l[i][j];
            }
        }
        return len;
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
