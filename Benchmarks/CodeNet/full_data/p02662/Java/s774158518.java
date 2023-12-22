import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 998244353;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        int s = in.nextInt();
        int[] a = in.nextIntArray(n);
        long[][] dp = new long[n + 1][s + 1];
        long div2 = Combination.inv(2);
        for (int i = 0; i < n; i++) {
            dp[i][0] = Combination.pow(2, n);
            for (int j = 0; j < s; j++) {
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % mod;
                if (j + a[i] <= s) {
                    dp[i + 1][j + a[i]] = (dp[i + 1][j + a[i]] + dp[i][j] * div2) % mod;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = (ans + dp[i][s]) % mod;
        }
        out.println(ans);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Combination {
    private static List<Long> fact = new ArrayList<>();
    private static List<Long> invFact = new ArrayList<>();

    private static void build(int n) {
        if (fact.isEmpty()) {
            fact.add(1L);
            invFact.add(1L);
        }
        for (int i = fact.size(); i <= n; i++) {
            fact.add(fact.get(i - 1) * i % Main.mod);
            invFact.add(pow(fact.get(i), Main.mod - 2));
        }
    }

    private static void rangeCheck(long n, long r) {
        if (n < r) {
            throw new IllegalArgumentException("n < r");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (r < 0) {
            throw new IllegalArgumentException("r < 0");
        }
    }

    static long fact(int n) {
        build(n);
        return fact.get(n);
    }

    static long invFact(int n) {
        build(n);
        return invFact.get(n);
    }

    static long comb(int n, int r) {
        rangeCheck(n, r);
        return fact(n) * invFact(r) % Main.mod * invFact(n - r) % Main.mod;
    }

    static long comb(long n, long r) {
        rangeCheck(n, r);
        if (n < 1000000) {
            return comb((int)n, (int)r);
        }
        r = Math.min(r, n - r);
        long x = 1, y = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % Main.mod;
            y = y * i % Main.mod;
        }
        return x * inv(y) % Main.mod;
    }

    static long perm(int n, int r) {
        rangeCheck(n, r);
        return fact(n) * invFact(n - r) % Main.mod;
    }

    static long perm(long n, long r) {
        rangeCheck(n, r);
        if (n < 1000000) {
            return perm((int)n, (int)r);
        }
        long x = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % Main.mod;
        }
        return x;
    }

    static long homo(int n, int r) {
        return r == 0 ? 1 : comb(n + r - 1, r);
    }

    static long homo(long n, long r) {
        return r == 0 ? 1 : comb(n + r - 1, r);
    }

    static long inv(long a) {
        return pow(a, Main.mod - 2);
    }

    static long pow(long a, long b) {
        long x = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                x = x * a % Main.mod;
                b--;
            } else {
                a = a * a % Main.mod;
                b /= 2;
            }
        }
        return x;
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
