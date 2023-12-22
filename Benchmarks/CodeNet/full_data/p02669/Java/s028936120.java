import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    long a, b, c, d;
    void solve() {
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            a = in.nextLong();
            b = in.nextLong();
            c = in.nextLong();
            d = in.nextLong();
            memo = new HashMap<>();
            out.println(f(n));
        }
    }

    Map<Long, Long> memo;

    long f(long n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long res = inf;
        if (n > n / 2) {
            res = Math.min(res, f(n / 2) + n % 2 * d + a);
        }
        if (n > n / 3) {
            res = Math.min(res, f(n / 3) + n % 3 * d + b);
        }
        if (n > n / 5) {
            res = Math.min(res, f(n / 5) + n % 5 * d + c);
        }
        if (n != (n + 1) / 2) {
            res = Math.min(res, f((n + 1) / 2) + (2 - n % 2) * d + a);
        }
        if (n != (n + 2) / 3) {
            res = Math.min(res, f((n + 2) / 3) + (3 - n % 3) * d + b);
        }
        if (n != (n + 4) / 5) {
            res = Math.min(res, f((n + 4) / 5) + (5 - n % 5) * d + c);
        }
        if (n == 0 || res / n >= d) {
            res = Math.min(res, n * d);
        }
        memo.put(n, res);
        return res;
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
