import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.min;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int m = In.ni();
        long k = In.nl();
        long[] a = In.nl(n);
        long[] b = In.nl(m);
        long[] sa = CumulativeSum.build(a);
        long[] sb = CumulativeSum.build(b);
        int l = 0, r = n + m + 1;
        while (r - l > 1) {
            int x = (l + r) >> 1;
            boolean ok = false;
            for (int i = 0; i <= min(x, n); i++) {
                int j = x - i;
                if (j > m) continue;
                if (sa[i] + sb[j] <= k) {
                    ok |= true;
                    break;
                }
            }
            if (ok) l = x;
            else r = x;
        }
        out.append(l);
    }
}

/**
 * @author https://atcoder.jp/users/suisen
 */
final class CumulativeSum {
    /**
     * s[i] is the sum of {a[x] | 0 <= x < i}.
     * @param a
     * @return cumulative sum array of a.
     */
    public static int[] build(final int[] a) {
        final int n = a.length;
        final int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++) s[i] = s[i - 1] + a[i - 1];
        return s;
    }
    /**
     * s[i][j] is the sum of {a[x][y] | 0 <= x < i and 0 <= y < j}.
     * @param a
     * @return
     */
    public static int[][] build(final int[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int[][] s = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) {
            s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        }
        return s;
    }
    public static int[][][] build(final int[][][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int l = a[0][0].length;
        final int[][][] s = new int[n + 1][m + 1][l + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) for (int k = 1; k <= l; k++) {
            s[i][j][k] = a[i - 1][j - 1][k - 1] + s[i - 1][j][k] + s[i][j - 1][k] + s[i][j][k - 1]
                - s[i - 1][j - 1][k] - s[i][j - 1][k - 1] - s[i - 1][j][k - 1] + s[i - 1][j - 1][k - 1];
        }
        return s;
    }
    /**
     * s[i] is the sum of {a[x] | 0 <= x < i}.
     * @param a
     * @return cumulative sum array of a.
     */
    public static long[] build(final long[] a) {
        final int n = a.length;
        final long[] s = new long[n + 1];
        for (int i = 1; i <= n; i++) s[i] = s[i - 1] + a[i - 1];
        return s;
    }
    /**
     * s[i][j] is the sum of {a[x][y] | 0 <= x < i and 0 <= y < j}.
     * @param a
     * @return
     */
    public static long[][] build(final long[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final long[][] s = new long[n + 1][m + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) {
            s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        }
        return s;
    }

    public static long[][][] build(final long[][][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final int l = a[0][0].length;
        final long[][][] s = new long[n + 1][m + 1][l + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= m; j++) for (int k = 1; k <= l; k++) {
            s[i][j][k] = a[i - 1][j - 1][k - 1] + s[i - 1][j][k] + s[i][j - 1][k] + s[i][j][k - 1]
                - s[i - 1][j - 1][k] - s[i][j - 1][k - 1] - s[i - 1][j][k - 1] + s[i - 1][j - 1][k - 1];
        }
        return s;
    }
    public static int sum(final int[] s, final int l, final int r) {return s[r] - s[l];}
    public static long sum(final long[] s, final int l, final int r) {return s[r] - s[l];}
    public static int sum(final int[][] s, final int y1, final int x1, final int y2, final int x2) {
        return s[y2][x2] - s[y1][x2] - s[y2][x1] + s[y1][x1];
    }
    public static long sum(final long[][] s, final int y1, final int x1, final int y2, final int x2) {
        return s[y2][x2] - s[y1][x2] - s[y2][x1] + s[y1][x1];
    }
    public static int sum(final int[][][] s, final int i1, final int j1, final int k1, final int i2, final int j2,
            final int k2) {
        final int p0 = s[i2][j2][k2];
        final int n1 = s[i1][j2][k2] + s[i2][j1][k2] + s[i2][j2][k1];
        final int p2 = s[i1][j1][k2] + s[i2][j1][k1] + s[i1][j2][k1];
        final int n3 = s[i1][j1][k1];
        return p0 - n1 + p2 - n3;
    }
    public static long sum(final long[][][] s, final int i1, final int j1, final int k1, final int i2, final int j2,
            final int k2) {
        final long p0 = s[i2][j2][k2];
        final long n1 = s[i1][j2][k2] + s[i2][j1][k2] + s[i2][j2][k1];
        final long p2 = s[i1][j1][k2] + s[i2][j1][k1] + s[i1][j2][k1];
        final long n3 = s[i1][j1][k1];
        return p0 - n1 + p2 - n3;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();
    public static int ni() {return fsc.nextInt();}
    public static int[] ni(final int n) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextInt();
        return a;
    }
    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsInt(fsc.nextInt());
        return a;
    }
    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m);
        return a;
    }
    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) a[i] = ni(m, f);
        return a;
    }
    public static long nl() {return fsc.nextLong();}
    public static long[] nl(final int n) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextLong();
        return a;
    }
    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = f.applyAsLong(fsc.nextLong());
        return a;
    }
    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m);
        return a;
    }
    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = nl(m, f);
        return a;
    }
    public static char[] nc() {return fsc.next().toCharArray();}
    public static char[][] nc(final int n) {
        final char[][] c = new char[n][];
        for (int i = 0; i < n; i++) c[i] = nc();
        return c;
    }
    public static double nd() {return fsc.nextDouble();}
    public static double[] nd(final int n) {
        final double[] a = new double[n];
        for (int i = 0; i < n; i++) a[i] = fsc.nextDouble();
        return a;
    }
    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        for (int i = 0; i < n; i++) a[i] = nd(m);
        return a;
    }
    public static String ns() {return fsc.next();}
    public static String[] ns(final int n) {
        final String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = fsc.next();
        return s;
    }
    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) grid[i][j] = s[j] == trueCharacter;
        }
        return grid;
    }
}


final class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buffer);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buffer[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buffer[ptr] && buffer[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        for (; ; b = readByte()) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}
