import java.io.*;
import java.util.*;


public class Main {
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N = in.i();
        Graph graph = new Graph(N, N - 1);
        LinkedList<Integer> list = new LinkedList<>();
        int[] color = new int[N + 1];
        for (int i = 1; i < color.length; i++) {
            color[i] = -1;
        }

        list.add(1);
        color[1] = 0;
        while (!list.isEmpty()) {
            int v = list.pop();
            int c = color[v];
            for (int[] a : graph.edge[v]) {
                int u = a[0];
                int w = a[1];
                if (color[u] == -1) {
                    color[u] = (w & 1) ^ c;
                    list.add(u);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            out.println(color[i]);
        }
        out.flush();
    }

    static class Graph {
        final int V;
        final int E;

        ArrayList<int[]>[] edge;

        Graph(int v, int e) {
            V = v;
            E = e;
            edge = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                edge[i] = new ArrayList<>();
            }
            load();
        }

        void load() {
            for (int i = 0; i < E; i++) {
                int u = in.i();
                int v = in.i();
                int w = in.i();
                edge[u].add(new int[]{v, w});
                edge[v].add(new int[]{u, w});
            }
        }

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
