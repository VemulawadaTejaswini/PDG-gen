import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0xfffffffffffffffL;
    static final int iinf = 0xfffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    int n;
    void solve() {
        n = in.nextInt();
        int[] s = in.nextIntArray(n);
        int[] t = in.nextIntArray(n);
        BigInteger[] u = new BigInteger[n];
        BigInteger[] v = new BigInteger[n];
        res = new int[n][n];
        selected = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            u[i] = new BigInteger(in.next());
        }
        for (int i = 0; i < n; i++) {
            v[i] = new BigInteger(in.next());
        }
        long[][][] ans = new long[2][n][n];
        for (int i = 0; i < 64; i++) {
            int[] uu = new int[n];
            int[] vv = new int[n];
            for (int j = 0; j < n; j++) {
                uu[j] = s[j] * 2 + (u[j].testBit(i) ? 1 : 0);
                vv[j] = t[j] * 2 + (v[j].testBit(i) ? 1 : 0);
            }
            int[][] res = f(uu, vv);
            if (res == null) {
                out.println(-1);
                return;
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i < 32) {
                        ans[0][j][k] |= (long)(res[j][k]) << i;
                    } else {
                        ans[1][j][k] |= (long)(res[j][k]) << (i - 32);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.println(BigInteger.valueOf(ans[1][i][j]).shiftLeft(32).or(BigInteger.valueOf(ans[0][i][j])).toString());
            }
        }
    }

    int[][] res;
    boolean[][] selected;
    String[] op = {"1つ以上0", "すべて1", "すべて0", "1つ以上1"};
    int[][] f(int[] s, int[] t) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = 0;
                selected[i][j] = false;
            }
        }
        boolean[] reqs = new boolean[n];
        boolean[] reqt = new boolean[n];
        Arrays.fill(reqs, true);
        Arrays.fill(reqt, true);
        for (int i = 0; i < n; i++) {
            if (s[i] == 1) {
                reqs[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(i, j, 1)) {
                        return null;
                    }
                }
            }
            if (s[i] == 2) {
                reqs[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(i, j, 0)) {
                        return null;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                reqt[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(j, i, 1)) {
                        return null;
                    }
                }
            }
            if (t[i] == 2) {
                reqt[i] = false;
                for (int j = 0; j < n; j++) {
                    if (set(j, i, 0)) {
                        return null;
                    }
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (!reqs[j]) {
                    continue;
                }
                boolean ok = false;
                int count = 0;
                int kk = -1;
                for (int k = 0; k < n; k++) {
                    if (!selected[j][k]) {
                        kk = k;
                        count++;
                    } else if (res[j][k] == (s[j] == 0 ? 0 : 1)) {
                        ok = true;
                    }
                }
                if (ok) {
                    continue;
                }
                if (count == 0) {
                    return null;
                } else if (count == 1) {
                    reqs[j] = false;
                    set(j, kk, s[j] == 0 ? 0 : 1);
                }
            }
            for (int j = 0; j < n; j++) {
                if (!reqt[j]) {
                    continue;
                }
                boolean ok = false;
                int count = 0;
                int kk = -1;
                for (int k = 0; k < n; k++) {
                    if (!selected[k][j]) {
                        count++;
                        kk = k;
                    } else if (res[k][j] == (t[j] == 0 ? 0 : 1)) {
                        ok = true;
                    }
                }
                if (ok) {
                    continue;
                }
                if (count == 0) {
                    return null;
                } else if (count == 1) {
                    reqt[j] = false;
                    set(kk, j, t[j] == 0 ? 0 : 1);
                }
            }
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            x = 0;
            for (int j = 0; j < n; j++) {
                if (reqs[i] && reqt[j]) {
                    res[i][j] = (x + y) % 2;
                }
                if (reqt[j]) {
                    x++;
                }
            }
            if (reqs[i]) {
                y++;
            }
        }
        return res;
    }

    boolean set(int i, int j, int x) {
        if (selected[i][j] && res[i][j] != x) {
            return true;
        }
        res[i][j] = x;
        selected[i][j] = true;
        return false;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedInputStream reader = new BufferedInputStream(System.in);
    private byte[] buffer = new byte[0x10000];
    private int i = 0;
    private int length = 0;

    private int read() {
        if (length == -1) {
            throw new RuntimeException();
        }
        if (i == length) {
            i = 0;
            try {
                length = reader.read(buffer);
            } catch (IOException ignored) {
            }
            if (length == -1) {
                return -1;
            }
        }
        return buffer[i++];
    }

    String next() {
        StringBuilder builder = new StringBuilder();
        int b = read();
        while (b < '!' || '~' < b) {
            b = read();
        }
        while ('!' <= b && b <= '~') {
            builder.appendCodePoint(b);
            b = read();
        }
        return builder.toString();
    }

    int nextInt() {
        return (int)nextLong();
    }

    long nextLong() {
        int b = read();
        while (b < '!' || '~' < b) {
            b = read();
        }
        boolean sign = false;
        if (b == '-') {
            sign = true;
            b = read();
        }
        long n = 0;
        while ('0' <= b && b <= '9') {
            n = n * 10 + (b - '0');
            b = read();
        }
        return sign ? -n : n;
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
