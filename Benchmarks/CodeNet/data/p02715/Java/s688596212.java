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
    static final long mod = 1000000007;
    static final long inf = 0xfffffffffffffffL;
    static final int iinf = 0xfffffff;

    Combination combination = new Combination();
    void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[k + 1];
        for (int i = k; i > 0; i--) {
            a[i] = combination.pow(k / i, n);
            for (int j = 2; j * i <= k; j++) {
                a[i] = (a[i] + mod - a[i * j]) % mod;
            }
        }
        long ans = 0;
        for (int i = 1; i <= k; i++) {
            ans = (ans + a[i] * i % mod) % mod;
        }
        out.println(ans);
    }

    static class Combination {
        private List<Long> fact = new ArrayList<>();
        private List<Long> invFact = new ArrayList<>();

        private void build(int n) {
            if (fact.isEmpty()) {
                fact.add(1L);
                invFact.add(1L);
            }
            for (int i = fact.size(); i <= n; i++) {
                fact.add(fact.get(i - 1) * i % mod);
                invFact.add(pow(fact.get(i), mod - 2));
            }
        }

        private void rangeCheck(long n, long r) {
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

        long fact(int n) {
            build(n);
            return fact.get(n);
        }

        long invFact(int n) {
            build(n);
            return invFact.get(n);
        }

        long comb(int n, int r) {
            rangeCheck(n, r);
            return fact(n) * invFact(r) % mod * invFact(n - r) % mod;
        }

        long comb(long n, long r) {
            rangeCheck(n, r);
            r = Math.min(r, n - r);
            long x = 1, y = 1;
            for (long i = 1; i <= r; i++) {
                x = x * (n - r + i) % mod;
                y = y * i % mod;
            }
            return x * inv(y) % mod;
        }

        long perm(int n, int r) {
            rangeCheck(n, r);
            return fact(n) * invFact(n - r) % mod;
        }

        long perm(long n, long r) {
            rangeCheck(n, r);
            long x = 1;
            for (long i = 1; i <= r; i++) {
                x = x * (n - r + i) % mod;
            }
            return x;
        }

        long homo(int n, int r) {
            rangeCheck(n, r);
            return r == 0 ? 1 : comb(n + r - 1, r);
        }

        long homo(long n, long r) {
            rangeCheck(n, r);
            return r == 0 ? 1 : comb(n + r - 1, r);
        }

        long inv(long a) {
            return pow(a, mod - 2);
        }

        long pow(long a, long b) {
            long x = 1;
            while (b > 0) {
                if (b % 2 == 1) {
                    x = x * a % mod;
                    b--;
                } else {
                    a = a * a % mod;
                    b /= 2;
                }
            }
            return x;
        }
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
