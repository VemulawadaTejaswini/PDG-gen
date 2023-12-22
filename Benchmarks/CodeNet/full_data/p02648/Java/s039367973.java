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
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    int n;
    long[] value;
    int[] weight;
    void solve() {
        n = in.nextInt();
        value = new long[n];
        weight = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = in.nextInt();
            weight[i] = in.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            memo2.add(new TreeMap<>());
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int node = in.nextInt();
            int l = in.nextInt();
            out.println(f(new IntPair(node, l)));
        }
    }

    Map<IntPair, Long> memo1 = new HashMap<>();
    List<TreeMap<Integer, Integer>> memo2 = new ArrayList<>();
    long f(IntPair state) {
        int node = state.first;
        int l = state.second;
        if (memo1.containsKey(state)) {
            return memo1.get(state);
        }
        Map.Entry<Integer, Integer> entry = memo2.get(node).higherEntry(l);
        if (entry != null && entry.getValue() <= l) {
            long res = memo1.get(new IntPair(node, entry.getKey()));
            memo1.put(new IntPair(node, l), res);
            memo2.get(node).put(l, entry.getValue());
            return res;
        }
        if (node == 1) {
            long res = weight[node - 1] <= l ? value[node - 1] : 0;
            memo1.put(new IntPair(node, l), res);
            memo2.get(node).put(l, weight[node - 1] <= l ? weight[node - 1] : 0);
            return res;
        }
        long res = 0;
        int realUse = -1;
        if (weight[node - 1] <= l) {
            IntPair next = new IntPair(node / 2, l - weight[node - 1]);
            long r = f(next) + value[node - 1];
            if (res <= r) {
                res = r;
                realUse = memo2.get(node / 2).get(l - weight[node - 1]) + weight[node - 1];
            }
        }
        IntPair next = new IntPair(node / 2, l);
        long r = f(next);
        if (res <= r) {
            res = r;
            realUse = memo2.get(node / 2).get(l);
        }
        memo1.put(new IntPair(node, l), res);
        memo2.get(node).put(l, realUse);
        return res;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class IntPair {
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
        int result = first;
        result = 31 * result + second;
        return result;
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
