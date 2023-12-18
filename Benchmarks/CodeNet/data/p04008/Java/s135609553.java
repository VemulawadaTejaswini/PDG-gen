import java.io.*;
import java.util.LinkedList;

public class Main {

    final static boolean DEBUG = false;

    final void solve() throws Exception {
        int n = nextInt();
        int k = nextInt();
        int[] parent = new int[n];

        for (int i = 0; i < n; ++i) {
            parent[i] = nextInt() - 1;
        }

        LinkedList<Integer>[] to = new LinkedList[n];
        for (int i = 0; i < n; ++i) {
            to[i] = new LinkedList<>();
        }
        for (int i = 1; i < n; ++i) {
            to[parent[i]].add(i);
        }

        int[] depth = new int[n];
        LinkedList<Integer> que = new LinkedList<>();

        que.add(0);
        for (; !que.isEmpty(); ) {
            int v = que.removeFirst();
            for (int u : to[v]) {
                if (u == 0) {
                    continue;
                }
                depth[u] = depth[v] + 1;
                que.add(u);
            }
        }
        int max = 0;
        for (int i = 0; i < n; ++i) {
            max = Math.max(max, depth[i]);
        }

        int result = 0;

        if (max <= k) {
            boolean good = true;

            if (parent[0] != 0) {
                for (int i = 1; i < n; ++i) {
                    if ((k - depth[i]) % (1 + depth[parent[0]]) != 0) {
                        good = false;
                        break;
                    }
                }
            }

            if (!good) {
                ++result;
            }
        } else {
            int[] up = new int[n];
            for (int i = 0; i < n; ++i) {
                if (to[i].isEmpty()) {
                    que.add(i);
                }
            }

            ++result;
            for (; !que.isEmpty(); ) {
                int v = que.removeFirst();
                int u = parent[v];
                if (v == 0) {
                    break;
                }
                if (up[v] == k - 1) {
                    if (v > 0 && parent[v] != 0) {
                        ++result;
                    }
                } else {
                    up[u] = Math.max(up[u], 1 + up[v]);
                }
                to[u].removeFirst();
                if (to[u].isEmpty()) {
                    que.add(u);
                }
            }
        }

        print(result);
        println();
    }

    final static BufferedReader in;
    final static PrintWriter out;

    static final boolean isWhiteSpace(final int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == -1;
    }

    static final int read() throws Exception {
        return in.read();
    }

    static final int nextInt() throws Exception {
        int result = 0;
        boolean negative = false;
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        if (c == '-') {
            negative = true;
            c = read();
        }
        while (!isWhiteSpace(c)) {
            result = result * 10 + (c - '0');
            c = read();
        }
        return negative ? -result : result;
    }

    static final long nextLong() throws Exception {
        long result = 0;
        boolean negative = false;
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        if (c == '-') {
            negative = true;
            c = read();
        }
        while (!isWhiteSpace(c)) {
            result = result * 10 + (c - '0');
            c = read();
        }
        return negative ? -result : result;
    }

    static final StringBuilder tmpString = new StringBuilder(1 << 20);

    static final String nextString() throws Exception {
        tmpString.setLength(0);
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        while (!isWhiteSpace(c)) {
            tmpString.append((char) c);
            c = read();
        }
        return tmpString.toString();
    }

    static final char nextChar() throws Exception {
        int c = read();
        while (isWhiteSpace(c)) {
            c = read();
        }
        while (!isWhiteSpace(c)) {
            return (char) c;
        }
        return (char) 0;
    }

    static final String readLine() throws Exception {
        return in.readLine();
    }

    static final void print(final int i) {
        out.print(i);
    }

    static final void print(final long l) {
        out.print(l);
    }

    static final void print(final String s) {
        out.print(s);
    }

    static final void println() {
        out.println();
    }

    static {
        try {
            if (DEBUG) {
                String fileName = Main.class.getSimpleName();
                in = new BufferedReader(new FileReader(fileName + ".in"));
                out = new PrintWriter(new BufferedWriter(new FileWriter(fileName + ".out")));
            } else {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solve();
        out.close();
    }
}
