import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

class Main {
    static In in = new In();
    static Out out = new Out();
    static long mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();
        char[] c = in.next().toCharArray();
        int a1 = solve(a, b, c);
        int a2 = solve(a, c, b);
        int a3 = solve(b, a, c);
        int a4 = solve(b, c, a);
        int a5 = solve(c, a, b);
        int a6 = solve(c, b, a);
        out.println(Math.min(Math.min(Math.min(Math.min(Math.min(a1, a2), a3), a4), a5), a6));
    }

    int solve(char[] a, char[] b, char[] c) {
        boolean[] ab = new boolean[4040];
        boolean[] bc = new boolean[4040];
        boolean[] ac = new boolean[4040];
        int an = a.length, bn = b.length, cn = c.length;
        Arrays.fill(ab, true);
        Arrays.fill(bc, true);
        Arrays.fill(ac, true);
        for (int i = 0; i < 4040; i++) {
            for (int j = 0; j < Math.max(Math.max(an, bn), cn); j++) {
                ab[i] &= check(i + j, j, a, b);
                bc[i] &= check(i + j, j, b, c);
                ac[i] &= check(i + j, j, a, c);
            }
        }
        int result = 0xfffffff;
        for (int i = 0; i < 4040; i++) {
            for (int j = 0; i + j < 4040; j++) {
                if (ab[i] && bc[j] && ac[i + j]) {
                    result = Math.min(result, Math.max(Math.max(an, i + bn), i + j + cn));
                }
            }
        }
        return result;
    }

    boolean check(int i, int j, char[] a, char[] b) {
        return a.length <= i || b.length <= j || a[i] == b[j] || a[i] == '?' || b[j] == '?';
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
