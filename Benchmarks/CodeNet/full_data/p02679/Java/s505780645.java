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

    void solve() {
        int n = in.nextInt();
        long[] pow = new long[n + 1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow[i] = pow[i - 1] * 2 % mod;
        }
        Map<Pair, Integer> neg = new HashMap<>();
        Map<Pair, Integer> pos = new HashMap<>();
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            long b = in.nextLong();
            long gcd = gcd(Math.abs(a), Math.abs(b));
            a /= gcd;
            b /= gcd;
            if (a < 0 == b < 0) {
                pos.merge(new Pair(Math.abs(a), Math.abs(b)), 1, Integer::sum);
            } else {
                neg.merge(new Pair(Math.abs(b), Math.abs(a)), 1, Integer::sum);
            }
        }
        long ans = 1;
        for (Map.Entry<Pair, Integer> entry : neg.entrySet()) {
            if (pos.containsKey(entry.getKey())) {
                int a = pos.get(entry.getKey());
                int b = entry.getValue();
                ans = ans * (((pow[a] + pow[b]) % mod + mod - 1) % mod) % mod;
            } else {
                int a = entry.getValue();
                ans = ans * pow[a] % mod;
            }
        }
        for (Map.Entry<Pair, Integer> entry : pos.entrySet()) {
            if (!neg.containsKey(entry.getKey())) {
                int a = entry.getValue();
                ans = ans * pow[a] % mod;
            }
        }
        out.println((ans + mod - 1) % mod);
    }

    long gcd(long a, long b) {
        return 0 < b ? gcd(b, a % b) : a;
    }

    long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Pair {
    long a;
    long b;

    public Pair(long a, long b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair pair = (Pair)o;

        if (a != pair.a) {
            return false;
        }
        return b == pair.b;
    }

    @Override
    public int hashCode() {
        int result = (int)(a ^ (a >>> 32));
        result = 31 * result + (int)(b ^ (b >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Pair{" + "a=" + a + ", b=" + b + '}';
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
