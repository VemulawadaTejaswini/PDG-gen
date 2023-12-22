import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static long mod = 1000000007;

    void solve() {
        int n = in.nextInt();
        int[] p = in.nextIntArray(n * 3);
        for (int i = 0; i < n * 3; i++) {
            p[i]--;
        }
        int[][] dp = new int[n][n];
        int base = 0;
        int max = 0;
        int[] xMax = new int[n];
        int[] yMax = new int[n];
        for (int i = 0; i < n; i++) {
            xMax[i] = -iinf;
            yMax[i] = -iinf;
            for (int j = 0; j < n; j++) {
                dp[i][j] = -iinf;
            }
        }
        dp[p[0]][p[1]] = 0;
        dp[p[1]][p[0]] = 0;
        xMax[p[0]] = 0;
        yMax[p[0]] = 0;
        xMax[p[1]] = 0;
        yMax[p[1]] = 0;
        for (int i = 0; i < n - 1; i++) {
            if (p[i * 3 + 2] == p[i * 3 + 3] && p[i * 3 + 3] == p[i * 3 + 4]) {
                base++;
                continue;
            }
            Map<IntPair, Integer> changes = new HashMap<>();
            int oldMax = max;
            int[] oldXMax = Arrays.copyOf(xMax, n);
            int[] oldYMax = Arrays.copyOf(yMax, n);
            for (int j = 0; j < 3; j++) {
                int a = p[i * 3 + 2 + (0 + j) % 3];
                int b = p[i * 3 + 2 + (1 + j) % 3];
                int c = p[i * 3 + 2 + (2 + j) % 3];
                changes.merge(new IntPair(a, b), Math.max(dp[a][b], oldMax), Integer::max);
                if (a == b) {
                    for (int k = 0; k < n; k++) {
                        int v = Math.max(Math.max(dp[k][c], dp[c][k]), Math.max(dp[a][k], dp[k][a]) + 1;
                        changes.merge(new IntPair(k, c), v, Integer::max);
                        changes.merge(new IntPair(c, k), v, Integer::max);
                        max = Math.max(max, v);
                        xMax[k] = Math.max(xMax[k], v);
                        xMax[c] = Math.max(xMax[c], v);
                        yMax[k] = Math.max(xMax[k], v);
                        yMax[c] = Math.max(xMax[c], v);
                    }
                }
                int v = Math.max(Math.max(dp[a][b], dp[b][a]), dp[c][c] + 1);
                changes.merge(new IntPair(a, b), v, Integer::max);
                changes.merge(new IntPair(b, a), v, Integer::max);
                max = Math.max(max, v);
                xMax[a] = Math.max(xMax[a], v);
                xMax[b] = Math.max(xMax[b], v);
                yMax[a] = Math.max(yMax[a], v);
                yMax[b] = Math.max(yMax[b], v);
                for (int k = 0; k < n; k++) {
                    v = Math.max(oldXMax[k], oldYMax[k]);
                    changes.merge(new IntPair(k, a), v, Integer::max);
                    changes.merge(new IntPair(a, k), v, Integer::max);
                    xMax[k] = Math.max(xMax[k], v);
                    xMax[a] = Math.max(xMax[a], v);
                    yMax[k] = Math.max(yMax[k], v);
                    yMax[a] = Math.max(yMax[a], v);
                }
            }
            for (Map.Entry<IntPair, Integer> entry : changes.entrySet()) {
                dp[entry.getKey().first][entry.getKey().second] = entry.getValue();
            }
        }
        dp[p[n * 3 - 1]][p[n * 3 - 1]]++;
        out.println(base + Math.max(dp[p[n * 3 - 1]][p[n * 3 - 1]], max));
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class IntPair implements Comparable<IntPair> {
    int first;
    int second;

    IntPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntPair)) {
            return false;
        }
        IntPair that = (IntPair)o;
        return first == that.first && second == that.second;
    }

    @Override
    public int hashCode() {
        return first * 31 + second;
    }

    @Override
    public int compareTo(IntPair o) {
        return first == o.first ? Integer.compare(second, o.second) : Integer.compare(first, o.first);
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", first, second);
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

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
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

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
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

    void println(char[] s) {
        out.println(String.valueOf(s));
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
