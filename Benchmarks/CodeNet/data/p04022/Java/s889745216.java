import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

import lib.util.collections.IntArrayList;

import static java.lang.Math.max;



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
        int[] div = eratosthenesDivisors(100000);
        IntArrayList prm = eratosthenes(100000, div);
        int n = In.ni();
        long[] s = In.nl(n);
        int[] rh = new int[n];
        int[] h = new int[n];
        boolean cb = false;
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> rhm = new HashMap<>();
        HashSet<Long> rm = new HashSet<>();
        for (int i = 0; i < n; i++) {
            HashMap<Long, Integer> m = primeFactorization(s[i], prm);
            for (Entry<Long, Integer> e : m.entrySet()) {
                long k = e.getKey();
                int v = e.getValue() % 3;
                if (v == 0) rm.add(k);
                else m.put(k, v == 1 ? 1 : -1);
            }
            for (long k : rm) m.remove(k);
            rm.clear();
            h[i] = m.hashCode();
            if (m.size() > 0) hm.put(h[i], hm.getOrDefault(h[i], 0) + 1);
            else cb = true;
            for (Entry<Long, Integer> e : m.entrySet()) m.put(e.getKey(), -e.getValue());
            rh[i] = m.hashCode();
            if (m.size() > 0) rhm.put(rh[i], rhm.getOrDefault(rh[i], 0) + 1);
        }
        int a = 0;
        int b = 0;
        for (Entry<Integer, Integer> e : rhm.entrySet()) {
            int rhash = e.getKey();
            int rnum = e.getValue();
            if (hm.containsKey(rhash)) {
                a += max(rnum, hm.get(rhash));
            } else {
                b += rnum;
            }
        }
        out.append(a / 2 + b + (cb ? 1 : 0));
    }

    /**
     * Enumarate primes equal to or less than n.
     * @param n
     * @return {@code ArrayList} that holds primes.
     */
    public static IntArrayList eratosthenes(final int n, final int[] div) {
        final IntArrayList result = new IntArrayList();
        for (int i = 2; i <= n; i++) if (div[i] == i) result.add(i);
        return result;
    }
    /**
     * execute eratosthenes's prime-enumerate algorithm. a[i] holds the greatest
     * divisor of i. if a[i] = i, i is a prime number. This arrary enables you to
     * prime-factorize in O(log n) time.
     * @param n
     * @return divisor array.
     */
    public static int[] eratosthenesDivisors(final int n) {
        final int[] divisors = new int[n + 1];
        if (n <= 0) return null;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) divisors[i] = i;
            else divisors[i] = 2;
        }
        for (int i = 3; i <= n; i += 2) {
            if (divisors[i] == i) for (long j = (long) i * i; j <= n; j += i << 1) divisors[(int) j] = i;
        }
        return divisors;
    }

    /**
     * Caluculate prime-factorization in O(sqrt(n)) time.
     * @param n
     * @return {@code HashMap} of {prime: index}
     */
    public static HashMap<Long, Integer> primeFactorization(long n, IntArrayList prm) {
        final HashMap<Long, Integer> primes = new HashMap<>();
        for (int p : prm) {
            int q = 0;
            while (n % p == 0) {n /= p; q++;}
            if (q > 0) primes.put((long) p, q);
        }
        if (n > 1) primes.put(n, 1);
        return primes;
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
