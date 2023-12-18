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
    static long mod = 1000000007;

    void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        int sh = in.nextInt();
        int sw = in.nextInt();
        int th = sh * 2 - 1;
        int tw = sw * 2 - 1;
        int[][] ans = new int[h][w];
        Set<IntPair> set = new HashSet<>();
        for (int i = sw - 1; i - sw + 1 < w; i += tw) {
            for (int j = sh - 1; j - sh + 1 < h; j += th) {
                set.add(new IntPair(Math.min(i, w - 1), Math.min(j, h - 1)));
            }
        }
        long sum = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (set.contains(new IntPair(j, i))) {
                    ans[i][j] = -(999999999 / (sh * sw - 1) * (sh * sw - 1) + 1);
                } else {
                    ans[i][j] = 999999999 / (sh * sw - 1);
                }
                sum += ans[i][j];
            }
        }
        if (sum <= 0) {
            out.println("No");
        } else {
            out.println("Yes");
            for (int i = 0; i < h; i++) {
                out.println(ans[i]);
            }
        }
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
