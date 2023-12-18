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
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        long n = in.nextInt();
        long g1 = in.nextInt();
        long s1 = in.nextInt();
        long b1 = in.nextInt();
        long g2 = in.nextInt();
        long s2 = in.nextInt();
        long b2 = in.nextInt();
        List<Pair> first = new ArrayList<>();
        List<Pair> second = new ArrayList<>();
        if (g1 > g2) {
            second.add(new Pair(g2, g1));
        } else {
            first.add(new Pair(g1, g2));
        }
        if (s1 > s2) {
            second.add(new Pair(s2, s1));
        } else {
            first.add(new Pair(s1, s2));
        }
        if (b1 > b2) {
            second.add(new Pair(b2, b1));
        } else {
            first.add(new Pair(b1, b2));
        }
        if (first.size() == 0) {
            n = f(n, second.get(0), second.get(1), second.get(2));
        } else if (first.size() == 1) {
            n = f(n, first.get(0));
            n = f(n, second.get(0), second.get(1));
        } else if (first.size() == 2) {
            n = f(n, first.get(0), first.get(1));
            n = f(n, second.get(0));
        } else {
            n = f(n, first.get(0), first.get(1), first.get(2));
        }
        out.println(n);
    }

    long f(long n, Pair op) {
        return n % op.a + n / op.a * op.b;
    }

    long f(long n, Pair op1, Pair op2) {
        long max = 0;
        for (long i = 0; i <= n / op1.a; i++) {
            long score = i * op1.b;
            long rem = n - i * op1.a;
            score += f(rem, op2);
            max = Math.max(max, score);
        }
        return max;
    }

    long f(long n, Pair op1, Pair op2, Pair op3) {
        long max = 0;
        for (long i = 0; i <= n / op1.a; i++) {
            long score = i * op1.b;
            long rem = n - i * op1.a;
            score += f(rem, op2, op3);
            max = Math.max(max, score);
        }
        return max;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Pair {
    long a, b;

    public Pair(long a, long b) {
        this.a = a;
        this.b = b;
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
