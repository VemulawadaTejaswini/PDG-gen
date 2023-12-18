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
    static final long mod = 1000000007;

    void solve() {
        int n = in.nextInt();
        char[] s = in.nextCharArray();
        List<BitRAQ> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dp.add(new BitRAQ(n + 1));
        }
        dp.get(0).set(0, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (s[i - 1] == '>') {
                    dp.get(i).add(0, j + 1, dp.get(i - 1).get(j));
                } else {
                    dp.get(i).add(j + 1, i + 1, dp.get(i - 1).get(j));
                }
            }
        }
        out.println(dp.get(n - 1).getSum(0, n + 1));
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class BitRAQ {
    private int n;
    private long[] bit1;
    private long[] bit2;

    BitRAQ(int n) {
        this.n = n;
        this.bit1 = new long[n];
        this.bit2 = new long[n];
    }

    BitRAQ(long[] a) {
        this(a.length);
        for (int i = 0; i < n; i++) {
            add(i, a[i]);
        }
    }

    private void add(long[] table, int i, long x) {
        for (i++; i <= n; i += i & -i) {
            table[i - 1] = (table[i - 1] + x) % Main.mod;
        }
    }

    private long getSum(long[] table, int i) {
        long sum = 0;
        for (; i > 0; i -= i & -i) {
            sum = (sum + table[i - 1]) % Main.mod;
        }
        return sum;
    }

    private long getSum(int i) {
        return (getSum(bit1, i) + getSum(bit2, i) * i % Main.mod) % Main.mod;
    }

    void add(int i, long x) {
        add(i, i + 1, x);
    }

    void add(int l, int r, long x) {
        add(bit1, l, -l * x);
        add(bit1, r, r * x);
        add(bit2, l, x);
        add(bit2, r, -x);
    }

    void set(int i, long x) {
        add(i, (x + Main.mod - get(i)) % Main.mod);
    }

    long get(int i) {
        return (getSum(i + 1) + Main.mod - getSum(i)) % Main.mod;
    }

    long getSum(int l, int r) {
        return l >= r ? 0 : (getSum(r) + Main.mod - getSum(l)) % Main.mod;
    }

    long[] getAll() {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = get(i);
        }
        return res;
    }

    @Override
    public String toString() {
        return Arrays.toString(getAll());
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
