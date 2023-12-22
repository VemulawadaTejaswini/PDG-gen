import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static HashMap<Long, Long> memo = new HashMap<>();

    public static void solve(StringBuilder out) {
        int t = In.ni();
        while (t --> 0) {
            memo.clear();
            long n = In.nl();
            long a = In.nl();
            long b = In.nl();
            long c = In.nl();
            long d = In.nl();
            out.append(min(n, a, b, c, d, 0)).append('\n');
        }
    }

    public static long min(long n, long a, long b, long c, long d, long cost) {
        if (n == 0) return cost;
        if (n == 1) return cost + d;
        if (memo.containsKey(n)) return cost + memo.get(n);
        long res;
        try {
            res = Math.addExact(cost, Math.multiplyExact(n, d));
        } catch (ArithmeticException e) {
            res = cost + (a + d) * 60;
        }

        if (n % 2 == 0) res = Math.min(
            res,
            min(n / 2, a, b, c, d, cost + a));
        else res = Longs.min(
            res, 
            min((n + 1) / 2, a, b, c, d, cost + a + d), 
            min((n - 1) / 2, a, b, c, d, cost + a + d));

        if (n % 3 == 0) res = Math.min(
            res, 
            min(n / 3, a, b, c, d, cost + b));
        else if (n % 3 == 1) res = Longs.min(
            res, 
            min((n + 2) / 3, a, b, c, d, cost + b + 2 * d), 
            min((n - 1) / 3, a, b, c, d, cost + b + d));
        else res = Longs.min(
            res, 
            min((n + 1) / 3, a, b, c, d, cost + b + d), 
            min((n - 2) / 3, a, b, c, d, cost + b + 2 * d));

        if (n % 5 == 0) res = Math.min(
            res, 
            min(n / 5, a, b, c, d, cost + c));
        else if (n % 5 == 1) res = Longs.min(
            res, 
            min((n + 4) / 5, a, b, c, d, cost + 4 * d + c), 
            min((n - 1) / 5, a, b, c, d, cost + d + c));
        else if (n % 5 == 2) res = Longs.min(
            res, 
            min((n + 3) / 5, a, b, c, d, cost + 3 * d + c),
            min((n - 2) / 5, a, b, c, d, cost + 2 * d + c));
        else if (n % 5 == 3) res = Longs.min(
            res, 
            min((n + 2) / 5, a, b, c, d, cost + 2 * d + c),
            min((n - 3) / 5, a, b, c, d, cost + 3 * d + c));
        else res = Longs.min(
            res, 
            min((n + 1) / 5, a, b, c, d, cost + d + c),
            min((n - 4) / 5, a, b, c, d, cost + 4 * d + c));
        
        memo.put(n, res - cost);
        return res;
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


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Longs {
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private Longs(){}
    public static long max(final long... a) {
        long ret = Long.MIN_VALUE; for (final long e : a) ret = Math.max(ret, e);
        return ret;
    }
    public static long min(final long... a) {
        long ret = Long.MAX_VALUE; for (final long e : a) ret = Math.min(ret, e);
        return ret;
    }
    public static long reduce(final LongBinaryOperator func, final long... a) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = func.applyAsLong(ret, a[i]);
        return ret;
    }
    public static boolean isPowerOfTwo(final long n) {return n != 0 && (-n & n) == n;}
    public static int ceilExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);}
    public static int floorExponent(final long n) {return 63 - Long.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);}
    public static int ceilExponent(final long n, final int base) {
        if (base == 2) return ceilExponent(n);
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            final long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) break;
            m = r;
        }
        return i;
    }
    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static long cld(final long a, final long b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        if (a < 0 && b < 0) return (a + b + 1) / b;
        return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static long fld(final long a, final long b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        if (a > 0 && b <= 0) return (a - b - 1) / b;
        return a / b;
    }
    public static String join(final String sep, final long... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String toBinaryString(long n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Long.SIZE; i++, n >>= 1) {
            sb.append(n & 1);
            if ((i & 3) == 3) sb.append('_');
        }
        return sb.reverse().toString();
    }
    public static String toHexString(long n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0, t = Long.SIZE >> 2; i < t; i++, n >>= 4) {
            sb.append(hex[(int) n & 0xf]);
            if ((i & 3) == 3) sb.append('_');
        }
        return sb.reverse().toString();
    }
}
