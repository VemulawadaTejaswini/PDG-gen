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

    List<List<Integer>> edges;
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
        Point count = dfs2(0, 0, true);
        int min = Math.min(count.x, count.y);
        int[] ans = new int[n];
        Deque<State> deque = new ArrayDeque<>();
        deque.addLast(new State(0, 0, true));
        int c1 = 1, c2 = 2, c3 = 3;
        while (!deque.isEmpty()) {
            State p = deque.poll();
            if (min <= n / 3) {
                if (p.dist == count.x <= count.y) {
                    ans[p.node] = c3;
                    c3 += 3;
                } else {
                    if (c2 > n && c1 > n) {
                        ans[p.node] = c3;
                        c3 += 3;
                    } else if (c1 > n) {
                        ans[p.node] = c2;
                        c2 += 3;
                    } else {
                        ans[p.node] = c1;
                        c1 += 3;
                    }
                }
            } else {
                if (p.dist == count.x <= count.y) {
                    if (c1 > n) {
                        ans[p.node] = c3;
                        c3 += 3;
                    } else {
                        ans[p.node] = c1;
                        c1 += 3;
                    }
                } else {
                    if (c2 > n) {
                        ans[p.node] = c3;
                        c3 += 3;
                    } else {
                        ans[p.node] = c2;
                        c2 += 3;
                    }
                }
            }
            for (Integer v : edges.get(p.node)) {
                if (v != p.parent) {
                    deque.addLast(new State(v, p.node, !p.dist));
                }
            }
        }
        out.println(ans);
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
