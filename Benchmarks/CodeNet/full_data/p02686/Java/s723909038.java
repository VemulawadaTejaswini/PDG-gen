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

    void solve() {
        int n = in.nextInt();
        P[] a = new P[n];
        List<P> pos = new ArrayList<>();
        List<P> neg = new ArrayList<>();
        int allv = 0;
        for (int i = 0; i < n; i++) {
            a[i] = new P();
            String s = in.next();
            for (char ch : s.toCharArray()) {
                if (ch == ')') {
                    a[i].v--;
                    a[i].m = Math.min(a[i].m, a[i].v);
                } else {
                    a[i].v++;
                }
            }
            allv += a[i].v;
            if (a[i].v >= 0) {
                pos.add(a[i]);
            } else {
                int tm = a[i].m;
                int tv = a[i].v;
                a[i].m = tm - tv;
                a[i].v = -tv;
                neg.add(a[i]);
            }
        }
        if (allv != 0) {
            out.println("No");
            return;
        }
        if (f(pos) && f(neg)) {
            out.println("Yes");
        }
    }

    boolean f(List<P> list) {
        list.sort(Comparator.comparingInt(p -> -p.m));
        int y = 0;
        for (P p : list) {
            if (y + p.m >= 0) {
                y += p.v;
            } else {
                out.println("No");
                return false;
            }
        }
        return true;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class P {
    int v;
    int m;

    @Override
    public String toString() {
        return "P{" + "v=" + v + ", m=" + m + '}';
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
