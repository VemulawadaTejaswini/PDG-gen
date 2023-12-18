import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    int n;
    List<List<Integer>> edges;
    void solve() {
        n = in.nextInt();
        edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        sort();
        int m = in.nextInt();
        Set<Integer>[] req = new Set[m];
        int[] u = new int[m];
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            u[i] = in.nextInt() - 1;
            v[i] = in.nextInt() - 1;
            Set<Integer> set = new HashSet<>();
            dfs(u[i], u[i], v[i], set::add);
            req[i] = set;
        }
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        long[][] dp = new long[n + 1][1 << m];
        dp[0][0] = 1;
        int index = 0;
        boolean[] visited = new boolean[n];
        visited[0] = true;
        while (!deque.isEmpty()) {
            Integer a = deque.poll();
            for (Integer b : edges.get(a)) {
                if (visited[b]) {
                    continue;
                }
                visited[b] = true;
                deque.add(b);
                int i = a;
                int j = b;
                int mask = 0;
                for (int k = 0; k < m; k++) {
                    if (req[k].contains(i) && req[k].contains(j)) {
                        mask |= 1 << k;
                    }
                }
                for (int flags = 0; flags < 1 << m; flags++) {
                    dp[index + 1][flags | mask] += dp[index][flags];
                    dp[index + 1][flags] += dp[index][flags];
                }
                index++;
            }
        }
        out.println(dp[n - 1][(1 << m) - 1]);
    }

    int[] ids;
    void sort() {
        ids = new int[n];
        boolean[] visited = new boolean[n];
        int id = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        visited[0] = true;
        while (!deque.isEmpty()) {
            int v = deque.poll();
            ids[v] = id++;
            for (int u : edges.get(v)) {
                if (!visited[u]) {
                    visited[u] = true;
                    deque.add(u);
                }
            }
        }
    }

    boolean dfs(int parent, int node, int goal, IntConsumer action) {
        if (node == goal) {
            action.accept(node);
            return true;
        }
        boolean result = false;
        for (int u : edges.get(node)) {
            if (u != parent) {
                result |= dfs(node, u, goal, action);
            }
        }
        if (result) {
            action.accept(node);
            return true;
        }
        return false;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
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
