import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static final int INF = Integer.MAX_VALUE / 2;
    static int V = 10;
    static int[][] c = new int[V][];

    public static void main(String[] args) {
        int H = in.i();
        int W = in.i();
        Arrays.setAll(c, i -> in.ii(V));

        int[] cnt = new int[V];
        for (int i = 0, N = H * W; i < N; i++) {
            int a = in.i();
            if (a > -1) {
                cnt[a]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < V; i++) {
            ans += dijkstra(i) * cnt[i];
        }

        out.println(ans);
    }

    static int dijkstra(int s) {
        boolean[] used = new boolean[V];
        int[] d = new int[V];
        Arrays.fill(d, INF);
        d[s] = 0;

        PriorityQueue<Integer> A = new PriorityQueue<>((x, y) -> d[x] - d[y]);
        A.add(s);

        while (!A.isEmpty()) {
            int u = A.poll();
            if (u == 1) break;
            if (used[u]) continue;

            used[u] = true;

            for (int v = 0; v < V; v++) {
                int w = c[u][v];
                if(d[v] == INF || d[v] - d[u] > w){
                    d[v] = d[u] + w;
                    A.add(v);
                }
            }
        }

        return d[1];
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
