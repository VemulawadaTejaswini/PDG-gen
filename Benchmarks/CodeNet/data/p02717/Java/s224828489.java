import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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

    int[] p, b;
    int n, m, y, z;
    void solve() {
        n = in.nextInt();
        m = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        StringBuilder c = new StringBuilder();
        p = new int[m];
        for (int i = 0; i < m; i++) {
            c.append(in.next());
            p[i] = in.nextInt();
        }
        String d = c.toString();
        b = new int[n];
        String s = in.next();
        for (int i = 0; i < n; i++) {
            b[i] = d.indexOf(s.charAt(i));
        }
        int[][] dp1 = new int[n + 1][1 << m];
        int[][] dp2 = new int[1 << m][m + 1];
        int[] last = new int[m];
        Arrays.fill(last, -1);
        Arrays.fill(dp1[0], -iinf);
        for (int i = 0; i < 1 << m; i++) {
            Arrays.fill(dp2[i], -iinf);
        }
        dp1[0][0] = 0;
        dp2[0][m] = 0;
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp1[i + 1], -iinf);
            for (int j = 0; j < 1 << m; j++) {
                int f = j | (1 << b[i]);
                for (int k = 0; k <= m; k++) {
                    if (k != b[i]) {
                        dp1[i + 1][f] = Math.max(dp1[i + 1][f], dp2[j][k] + p[b[i]]);
                    }
                }
                if (last[b[i]] != -1 && j == f) {
                    dp1[i + 1][f] = Math.max(dp1[i + 1][f], dp1[last[b[i]]][j] + p[b[i]] + y);
                }
            }
            for (int j = 0; j < 1 << m; j++) {
                dp2[j][b[i]] = Math.max(dp2[j][b[i]], dp1[i + 1][j]);
            }
            last[b[i]] = i + 1;
        }
        int ans = 0;
        for (int i = 0; i < 1 << m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == (1 << m) - 1) {
                    ans = Math.max(ans, dp2[i][j] + z);
                } else {
                    ans = Math.max(ans, dp2[i][j]);
                }
            }
        }
        out.println(ans);
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
