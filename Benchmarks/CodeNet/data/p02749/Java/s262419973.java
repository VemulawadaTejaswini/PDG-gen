import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    int m1, m2;
    List<List<Integer>> edges;
    int[] ans;
    void solve() {
        int n = in.nextInt();
        edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges.get(a).add(b);
            edges.get(b).add(a);
        }
        Point v1 = dfs(0, 0);
        Point u1 = dfs(v1.y, v1.y);
        if (u1.x <= 2) {
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = i + 1;
            }
            out.println(ans);
            return;
        }
        Point count = dfs2(0, 0, true);
        m1 = (n + 2) / 3;
        m2 = (n + 1) / 3;
        int a = Math.min(count.x, count.y);
        int b = Math.max(count.x, count.y);
        if (b > (n + 2) / 3 + n / 3) {
            out.println(-1);
        } else {
            ans = new int[n];
            Deque<State> deque = new ArrayDeque<>();
            deque.addLast(new State(0, 0, count.x >= count.y));
            int c1 = 0, c2 = 0;
            while (!deque.isEmpty()) {
                State p = deque.poll();
                if (p.dist) {
                    if (c1 == m1) {
                        ans[p.node] = 3;
                    } else {
                        ans[p.node] = 1;
                        c1++;
                    }
                } else {
                    if (c2 == m2) {
                        ans[p.node] = 3;
                    } else {
                        ans[p.node] = 2;
                        c2++;
                    }
                }
                for (Integer v : edges.get(p.node)) {
                    if (v != p.parent) {
                        deque.addLast(new State(v, p.node, !p.dist));
                    }
                }
            }
            int a1 = 0, a2 = 0, a3 = 0;
            for (int i = 0; i < n; i++) {
                if (ans[i] == 1) {
                    ans[i] = a1 * 3 + ans[i];
                    a1++;
                } else if (ans[i] == 2) {
                    ans[i] = a2 * 3 + ans[i];
                    a2++;
                } else {
                    ans[i] = a3 * 3 + ans[i];
                    a3++;
                }
            }
            out.println(ans);
        }
    }

    static class State {
        int node, parent;
        boolean dist;

        public State(int node, int parent, boolean dist) {
            this.node = node;
            this.parent = parent;
            this.dist = dist;
        }
    }

    Point dfs(int node, int parent) {
        Point result = new Point(0, node);
        for (Integer v : edges.get(node)) {
            if (v != parent) {
                Point r = dfs(v, node);
                if (r.x + 1 > result.x) {
                    result.x = r.x + 1;
                    result.y = r.y;
                }
            }
        }
        return result;
    }

    Point dfs2(int node, int parent, boolean dist) {
        Point result = new Point();
        if (dist) {
            result.x++;
        } else {
            result.y++;
        }
        for (Integer v : edges.get(node)) {
            if (v != parent) {
                Point r = dfs2(v, node, !dist);
                result.x += r.x;
                result.y += r.y;
            }
        }
        return result;
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
