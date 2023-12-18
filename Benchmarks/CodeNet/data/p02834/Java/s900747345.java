import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static int inf = 0xfffffff;

    void solve() {
        int n = in.nextInt();
        int u = in.nextInt() - 1; // 逃げる
        int v = in.nextInt() - 1; // 追う
        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        int[] du = dfs(edges, u);
        int[] dv = dfs(edges, v);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (edges.get(i).size() >= 2) {
                continue;
            }
            if (du[i] < dv[i]) {
                ans = Math.max(ans, dv[i] - 1);
            }
        }
        out.println(ans);
    }

    static int[] dfs(List<List<Integer>> edges, int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(start);
        int n = edges.size();
        int[] dist = new int[n];
        Arrays.fill(dist, inf);
        dist[start] = 0;
        while (!deque.isEmpty()) {
            int v = deque.pollLast();
            for (Integer u : edges.get(v)) {
                if (dist[u] == inf) {
                    dist[u] = dist[v] + 1;
                    deque.addFirst(u);
                }
            }
        }
        return dist;
    }

    public static void main(String[]$) {
        try {
            new Main().solve();
            out.flush();
        } catch (Throwable t) {
            out.flush();
            t.printStackTrace();
        }
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
    private static PrintWriter out = new PrintWriter(System.out);

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
    }

    void flush() {
        out.flush();
    }
}
