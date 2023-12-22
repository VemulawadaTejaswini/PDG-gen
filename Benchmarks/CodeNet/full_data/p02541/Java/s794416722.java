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
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static long mod = 1000000007;

    void solve(boolean naive) {
        long n = in.nextLong();
        if (n % 2 == 0) {
            n *= 2;
        }
        if (n == 1) {
            out.println(1);
            return;
        }
        if (n == 2) {
            out.println(3);
            return;
        }
        long ans = n - 1;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n) {
                    long j = n / i;
                    ans = Math.min(ans, f(j, n));
                }
                ans = Math.min(ans, f(i, n));
            }
        }
        out.println(ans);
    }

    long f(long m, long n) {
        if (gcd(m, n / m) != 1) {
            return inf;
        }
        long a = n / m;
        long b = m;
        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }
        if (a == 1) {
            return inf;
        }
        LongPair pair = extgcd(-a, b);
        if (pair.first * -a + pair.second * b != 1) {
            long temp = a;
            a = b;
            b = temp;
            pair = new LongPair(pair.second, pair.first);
        }
        return pair.first * a;
    }

    long gcd(long a, long b) {
        return 0 < b ? gcd(b, a % b) : a;
    }

    LongPair extgcd(long a, long b) {
        long x0 = 1;
        long x1 = 0;
        long y0 = 0;
        long y1 = 1;
        while (b != 0) {
            long q = a / b;
            long r = a % b;
            long x2 = x0 - q * x1;
            long y2 = y0 - q * y1;
            a = b;
            b = r;
            x0 = x1;
            x1 = x2;
            y0 = y1;
            y1 = y2;
        }
        return new LongPair(x0, y0);
    }

    public static void main(String[] args) {
        new Main().solve(args.length == 1 && args[0].equals("naive"));
        out.flush();
    }
}

class LongPair implements Comparable<LongPair> {
    long first;
    long second;

    LongPair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LongPair)) {
            return false;
        }
        LongPair that = (LongPair)o;
        return first == that.first && second == that.second;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(first) * 31 + Long.hashCode(second);
    }

    @Override
    public int compareTo(LongPair o) {
        return first == o.first ? Long.compare(second, o.second) : Long.compare(first, o.first);
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", first, second);
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

    double nextDouble() {
        return Double.parseDouble(next());
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
