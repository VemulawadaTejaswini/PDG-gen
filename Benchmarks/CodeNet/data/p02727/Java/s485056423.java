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
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int x = in.nextInt();
        int y = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(new Pair(in.nextLong(), 0));
        }
        for (int i = 0; i < b; i++) {
            list.add(new Pair(in.nextLong(), 1));
        }
        for (int i = 0; i < c; i++) {
            list.add(new Pair(in.nextLong(), 2));
        }
        list.sort(Comparator.comparing(pair -> -pair.c));
        int cx = 0, cy = 0;
        long ans = 0;
        long ca = 0;
        int cc = 0;
        for (Pair pair : list) {
            if (pair.type == 0) {
                if (cx < x) {
                    cx++;
                    ans += pair.c;
                }
            } else if (pair.type == 1) {
                if (cy < y) {
                    cy++;
                    ans += pair.c;
                }
            } else {
                cc++;
                ca += pair.c;
            }
            if (cx + cy + cc == x + y) {
                out.println(ans + ca);
                return;
            }
        }

//        long[] p = new long[a + 1];
//        long[] q = new long[b + 1];
//        long[] r = new long[c + 1];
//        for (int i = 1; i <= a; i++) {
//            p[i] = p[i - 1] + in.nextLong();
//        }
//        for (int i = 1; i <= b; i++) {
//            q[i] = q[i - 1] + in.nextLong();
//        }
//        for (int i = 1; i <= c; i++) {
//            r[i] = r[i - 1] + in.nextLong();
//        }
    }

    static class Pair {
        long c;
        int type;

        public Pair(long c, int type) {
            this.c = c;
            this.type = type;
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
