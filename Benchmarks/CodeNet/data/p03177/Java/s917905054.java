import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static ModuloArithmetic ma = new ModuloArithmetic(Const.MOD7);
    public static void main(String[] args) {
        Out out = new Out();
        solve(out);
        out.outln();
        out.flush();
        out.close();
    }

    public static void solve(Out out) {
        int n = In.ni();
        long k = In.nl();
        long[][] a = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = In.ni();
            }
        }
        a = pow(n, a, k);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += MathUtil.fold((u, v) -> u + v, 0, a[i]);
        }
        out.append(ma.mod(ans));
    }

    public static long[][] mul(int n, long[][] a, long[][] b) {
        long[][] ret = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    ret[i][j] += ma.mul(a[i][k], b[k][j]);
                    if (ret[i][j] >= ma.MOD) {
                        ret[i][j] -= ma.MOD;
                    }
                }
            }
        }
        return ret;
    }
 
    public static long[][] pow(int n, long[][] a, long b) {
        if (b == 1) {
            return a;
        }
        long[][] half = pow(n, a, b >> 1);
        long[][] hh = mul(n, half, half);
        return (b & 1) != 0 ? mul(n, a, hh) : hh;
    }
}


class Monoid<T> {
    public T e;
    private BinaryOperator<T> operator;

    public Monoid(T e, BinaryOperator<T> operator) {
        this.e = e;
        this.operator = operator;
    }

    public Monoid(BinaryOperator<T> operator) {
        this.e = null;
        this.operator = (u, v) -> {
            if (u == null) {
                return v;
            } else if (v == null) {
                return u;
            } else {
                return operator.apply(u, v);
            }
        };
    }

    public T apply(T t, T u) {
        return operator.apply(t, u);
    }
}


class ModuloArithmetic extends Field<Long> {
    public final long MOD;
    private long[] fact;
    private long[] pow;

    /**
     * support modulo p arithmetic
     * 
     * @param p p s.t. p is a prime number.
     */
    public ModuloArithmetic(long p) {
        super(
            new AbelianGroup<>(
                0l, 
                (u, v) -> {
                    long ret = u + v;
                    return ret < 0 ? ret + p : ret >= p ? ret - p : ret;
                }, 
                x -> -x
            ), 
            new AbelianGroup<>(
                1l, 
                (u, v) -> {
                    long ret = (u * v) % p;
                    return ret < 0 ? ret + p : ret;
                }, 
                x -> {
                    long b = p;
                    long u = 1, v = 0;
                    while (b >= 1) {
                        long t = x / b;
                        x -= t * b;
                        long tmp1 = x; x = b; b = tmp1;
                        u -= t * v;
                        long tmp2 = u; u = v; v = tmp2;
                    }
                    u %= p;
                    return u < 0 ? u + p : u;
                }
            )
        );
        this.MOD = p;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a mod p.
     * 
     * @param a
     * @return x s.t. 0 <= x < MOD /\ x = a mod p.
     */
    public long mod(long a) {
        a %= MOD;
        return a < 0 ? a + MOD : a;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 + 1_2 + ... + a_k mod p.
     * 
     * @param a
     * @return x s.t. 0 <= x < MOD /\ x = a_1 + 1_2 + ... + a_k mod p.
     */
    public long sum(long... a) {
        long ret = 0;
        for (long c : a) ret += c;
        return mod(ret);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    public long add(long a, long b) {
        long s = a + b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public long sub(long a, long b) {
        long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     * 
     * @param a
     * @return x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     */
    public long prod(long... a) {
        long ret = 1;
        for (long c : a) {
            ret = (ret * c) % MOD;
        }
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    public long mul(long a, long b) {
        return mod(a * b);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public long div(long a, long b) {
        return mul(a, inv(b));
    }

    /**
     * Calculate the value b s.t. a*b mod MOD = 1.
     * 
     * @param a
     * @return inverse of a
     */
    public long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            long tmp2 = u; u = v; v = tmp2;
        }
        return mod(u);
    }

    /**
     * Calculate the permutation nPr.
     * 
     * @param n
     * @param r
     * @return nPr
     */
    public long perm(long n, long r) {
        if (n < r) {
            return 0;
        }
        if (fact != null && n <= fact.length) {
            return div(fact[(int) n], fact[(int) (n - r)]);
        }
        long ret = 1;
        for (long i = n; i > n - r; i--) {
            ret = mul(ret, i);
        }
        return ret;
    }

    /**
     * Calculate the combination nCr.
     * 
     * @param n
     * @param r
     * @return nCr
     */
    public long comb(long n, long r) {
        if (n < r) {
            return 0;
        }
        if (fact != null && n <= fact.length) {
            return div(fact[(int) n], mul(fact[(int) (n - r)], fact[(int) r]));
        }
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++) {
            res = div(mul(res, n--), d);
        }
        return res;
    }
    
    /**
     * call this method after building factorial array.
     * 
     * @param n
     * @return n! mod p
     */
    public long fact(int n) {
        return fact[n];
    }

    /**
     * call this nethod after building power array.
     * 
     * @param n
     * @return (base)^n
     */
    public long pow(int n) {
        return pow[n];
    }

    /**
     * Calculate a^b (mod {@code MOD}) in O(log b) time.
     * 
     * @param a base
     * @param b index
     * @return a^b (mod {@code MOD})
     */
    public long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long half = pow(a, b >> 1);
        if ((a & 1) == 0) {
            return mul(half, half);
        } else {
            return prod(half, half, a);
        }
    }

    /**
     * build factorial array from 0 to n (closed)
     * 
     * @param n
     */
    public void buildFactorial(int n) {
        this.fact = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                fact[i] = 1;
            } else {
                fact[i] = mul(fact[i - 1], i);
            }
        }
    }

    /**
     * build power array based on a from 0 to n (closed)
     * 
     * @param a base of power
     * @param n
     */
    public void buildPower(long a, int n) {
        if (a == 2) {
            buildPower(n);
        } else {
            this.pow = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    pow[i] = 1;
                } else {
                    pow[i] = mul(pow[i - 1], a);
                }
            }
        }
    }

    /**
     * build power array based on 2 from 0 to n (closed)
     * 
     * @param n
     */
    public void buildPower(int n) {
        this.pow = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                pow[i] = 1;
            } else {
                pow[i] = pow[i - 1] << 1;
                if (pow[i] >= MOD) {
                    pow[i] -= MOD;
                }
            }
        }
    }
}

class Field<T> extends Ring<T>{
    private AbelianGroup<T> multiplication;

    public Field(AbelianGroup<T> addition, AbelianGroup<T> multiplication) {
        super(addition, multiplication);
        this.multiplication = multiplication;
    }

    public T multiplicativeInverse(T t) {
        return multiplication.inverse(t);
    }
}


class Group<T> extends Monoid<T> {
    private UnaryOperator<T> inv;

    public Group(T e, BinaryOperator<T> operator, UnaryOperator<T> inv) {
        super(e, operator);
        this.inv = inv;
    }

    public T inverse(T t) {
        return inv.apply(t);
    }
}


class ArrayUtil {

    private ArrayUtil(){}

    /**
     * destructive methods
     */

    public static void swap(int[] a, int u, int v) {
        int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void swap(long[] a, int u, int v) {
        long tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void swap(char[] a, int u, int v) {
        char tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static void reverse(int[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(int[] a) {
        reverse(a, 0, a.length);
    }

    public static void reverse(long[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }

    public static void reverse(char[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(char[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static void revSort(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static void sort(int[][] a, int sortIndex) {
        Arrays.sort(a, (u, v) -> u[sortIndex] - v[sortIndex]);
    }

    public static void sort(int[][] a) {
        sort(a, 0);
    }

    public static void sort(long[][] a, int sortIndex) {
        Arrays.sort(a, (u, v) -> Long.compare(u[sortIndex], v[sortIndex]));
    }

    public static void sort(long[][] a) {
        sort(a, 0);
    }

    public static void revSort(int[][] a, int sortIndex) {
        Arrays.sort(a, (u, v) -> v[sortIndex] - u[sortIndex]);
    }

    public static void revSort(int[][] a) {
        revSort(a, 0);
    }

    public static void revSort(long[][] a, int sortIndex) {
        Arrays.sort(a, (u, v) -> Long.compare(v[sortIndex], u[sortIndex]));
    }

    public static void revSort(long[][] a) {
        revSort(a, 0);
    }

    /**
     * transform
     */

    public static int[][] transpose(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static long[][] transpose(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    public static char[][] transpose(char[][] a) {
        int n = a.length;
        int m = a[0].length;
        char[][] ret = new char[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    /**
     * comparation
     */

    public static int compare(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int compare(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(int[] a, int[] b) {
        return compare(a, b) == 0;
    }

    public static boolean equals(long[] a, long[] b) {
        return compare(a, b) == 0;
    }
}


class Out {
    private StringBuilder sb = new StringBuilder();
    private PrintWriter w = new PrintWriter(System.out);

    public Out() {
    }

    public void append(int v) {
        sb.append(v);
    }

    public void append(long v) {
        sb.append(v);
    }

    public void append(char c) {
        sb.append(c);
    }

    public void append(double v) {
        sb.append(v);
    }

    public void append(char[] c) {
        sb.append(c);
    }

    public void append(String s) {
        sb.append(s);
    }

    public void append(Object e) {
        sb.append(e);
    }

    public void append(int[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(long[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(char[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(double[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(char[][] c, String sep) {
        for (int i = 0; i < c.length; i++) {
            append(c[i]);
            if (i < c.length - 1) {
                append(sep);
            }
        }
    }

    public void append(String[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(Object[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void out() {
        w.print(sb);
        clearBuilder();
    }

    public void outln() {
        w.println(sb);
        clearBuilder();
    }

    public void print(int v) {
        w.print(v);
    }

    public void print(long v) {
        w.print(v);
    }

    public void print(char c) {
        w.print(c);
    }

    public void print(double v) {
        w.print(v);
    }

    public void print(String s) {
        w.print(s);
    }

    public void print(Object e) {
        w.print(e);
    }

    public void print(String sep, int... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, long... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, char... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, double... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, String... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, Object... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void println() {
        w.println();
    }

    public void println(int v) {
        w.println(v);
    }

    public void println(long v) {
        w.println(v);
    }

    public void println(double v) {
        w.println(v);
    }

    public void println(char c) {
        w.println(c);
    }

    public void println(String s) {
        w.println(s);
    }

    public void println(Object e) {
        w.println(e);
    }

    public void println(String sep, int... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, long... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, double... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, char... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, String... a) {
        print(sep, a);
        println();
    }

    // public void println(String sep, Object... a) {
    //     print(sep, a);
    //     println();
    // }

    public void flush() {
        w.flush();
    }

    public void close() {
        w.close();
    }

    public void clearBuilder() {
        sb = new StringBuilder();
    }

    public void reverse() {
        sb.reverse();
    }

    public void delete(int start, int end) {
        sb.delete(start, end);
    }

    public void delete(int length) {
        sb.delete(sb.length() - length, sb.length());
    }

    public int length() {
        return sb.length();
    }
}


class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni (int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(int n, int m, IntUnaryOperator f) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(int n, LongUnaryOperator f) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(int n, int m, LongUnaryOperator f) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(int n, int m) {
        char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(int n, DoubleUnaryOperator f) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(int n, int m, DoubleUnaryOperator f) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(int n) {
        String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(int h, int w, char trueCharacter) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
        }
        return grid;
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}



class MathUtil{

    private MathUtil(){}
    
    /**
     * Enumarate primes equal to or less than n.
     * @param n
     * @return {@code ArrayList} that holds primes.
     */
    public static ArrayList<Integer> eratosthenes(int n) {
        int[] div = eratosthenesDivisors(n);
        ArrayList<Integer> result = new ArrayList<>();
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
    public static int[] eratosthenesDivisors(int n) {
        int[] divisors = new int[n + 1];
        if (n <= 0) return null;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) divisors[i] = i;
            else divisors[i] = 2;
        }
        for (int i = 3; i <= n; i += 2) {
            if (divisors[i] == i) {
                for (long j = (long) i * i; j <= n; j += i << 1) {
                    divisors[(int) j] = i;
                }
            }
        }
        return divisors;
    }

    /**
     * Caluculate prime-factorization in O(sqrt(n)) time.
     * @param n
     * @return {@code HashMap} of {prime: index}
     */
    public static HashMap<Long, Integer> primeFactorization(long n) {
        HashMap<Long, Integer> primes = new HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {
                n /= p;
                q++;
            }
            if (q > 0) primes.put(p, q);
        }
        if (n > 1) primes.put(n, 1);
        return primes;
    }

    public static TreeSet<Long> divisors(long n) {
        TreeSet<Long> divisors = new TreeSet<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        return divisors;
    }

    private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, HashMap<Long, Integer> bmap) {
        if (amap.size() < bmap.size()) return lcm(bmap, amap);
        HashMap<Long, Integer> lcm = amap;
        for (Map.Entry<Long, Integer> e : bmap.entrySet()) {
            long prime = e.getKey();
            if (lcm.containsKey(prime)) lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
            else lcm.put(prime, e.getValue());
        }
        return lcm;
    }
    private static HashMap<Long, Integer> lcm(HashMap<Long, Integer> amap, long b) {
        HashMap<Long, Integer> bmap = primeFactorization(b);
        return lcm(amap, bmap);
    }
    public static HashMap<Long, Integer> lcm(long... a) {
        HashMap<Long, Integer> amap = new HashMap<>();
        for (long c : a) amap = lcm(amap, c);
        return amap;
    }

    /**
     * calculate lcm(a, b) fast. (NOT considering overflow.)
     */
    public static long unsafeLCM(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    /**
     * Caluculate the GCD of (a, b)/
     * 
     * @param a first value
     * @param b second value
     * @return GCD(a, b)
     */
    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        if (a == 0) return b;
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public static long gcd(long... a){
        long gcd = 0;
        for (long c : a) gcd = gcd(gcd, c);
        return gcd;
    }

    /**
     * Return one of the solutions to {@code ax+by=gcd(a, b)}.
     * @return {@code x}, {@code y}, {@code gcd(a, b)}.
     * @param a a of ax+by=gcd(a, b).
     * @param b b of ax+by=gcd(a, b). class ReferenceLong is a reference type of long.
     */
    public static long[] extGCD(long a, long b) {
        long[] ret = new long[3];
        long[] xy = new long[2];
        ret[2] = extGCD(a, b, xy);
        ret[0] = xy[0];
        ret[1] = xy[1];
        return ret;
    }

    private static long extGCD(long a, long b, long[] xy) {
        if (b == 0) {
            xy[0] = 1;
            xy[1] = 0;
            return a;
        }
        ArrayUtil.swap(xy, 0, 1);
        long d = extGCD(b, a % b, xy);
        xy[1] -= a / b * xy[0];
        return d;
    }

    public static boolean isPowerOfTwo(long n) {
        return (-n & n) == n;
    }

    public static int ceilExponent(long n) {
        return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int floorExponent(long n) {
        return 63 - Long.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);
    }

    public static int ceilExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int floorExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);
    }
    
    public static int ceilExponent(long n, int base) {
        if (base == 2) {
            return ceilExponent(n);
        }
        int i = 0;
        long m = 1;
        while (m < n) {
            i++;
            long r = m * base;
            if ((m | base) >> 31 != 0 && r / base != m) {
                break;
            }
            m = r;
        }
        return i;
    }
    
    /**
     * caluculate a ^ b NOT considering overflow.
     * so if you want to calculate a ^ b (mod p), use ModUtil.pow(a, b).
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(int a, long b) {
        long ret = 1l;
        for (long c = 1, ac = a; b > 0; ac *= ac, c <<= 1) {
            if ((-b & b) == c) {
                ret *= ac;
                b &= ~(-b & b);
            }
        }
        return ret;
    }

    /**
     * Caluculate the combination nCr NOT considering overflow.
     * 
     * @param n left
     * @param r right
     * @return nCr
     */
    public static long comb(long n, long r) {
        if (n < r) return 0;
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++, n--) res *= n / d;
        return res;
    }

    public static int min(int... a) {
        int ret = Const.IINF;
        for (int c : a) ret = Math.min(ret, c);
        return ret;
    }

    public static long min(long... a) {
        long ret = Const.LINF;
        for (long c : a) ret = Math.min(ret, c);
        return ret;
    }

    public static int max(int... a) {
        int ret = -Const.IINF;
        for (int c : a) ret = Math.max(ret, c);
        return ret;
    }

    public static long max(long... a) {
        long ret = -Const.LINF;
        for (long c : a) ret = Math.max(ret, c);
        return ret;
    }

    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static int cld(int a, int b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        else if (a < 0 && b < 0) return (a + b + 1) / b;
        else return a / b;
    }

    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static long cld(long a, long b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        else if (a < 0 && b < 0) return (a + b + 1) / b;
        else return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static int fld(int a, int b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        else if (a > 0 && b <= 0) return (a - b - 1) / b;
        else return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static long fld(long a, long b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        else if (a > 0 && b <= 0) return (a - b - 1) / b;
        else return a / b;
    }

    public static int fold(IntBinaryOperator func, int e, int... a) {
        int ret = e;
        for (int c : a) ret = func.applyAsInt(ret, c);
        return ret;
    }

    public static long fold(LongBinaryOperator func, long a, long... b) {
        long ret = a;
        for (long c : b) ret = func.applyAsLong(ret, c);
        return ret;
    }

    public static int asSignedInt(long l) {
        return Integer.parseUnsignedInt(Long.toString(l));
    }

    public static long asUnsignedInt(int i) {
        return Long.valueOf(Integer.toBinaryString(i), 2);
    }
}


class AbelianGroup<T> extends Group<T>{
    public AbelianGroup(T e, BinaryOperator<T> operator, UnaryOperator<T> inv) {
        super(e, operator, inv);
    }
}

class SemiRing<T> {
    public T e0;
    public T e1;

    private Monoid<T> addition;
    private Monoid<T> muliplication;

    public SemiRing(Monoid<T> addition, Monoid<T> multiplication) {
        this.addition = addition;
        this.muliplication = multiplication;
        this.e0 = addition.e;
        this.e1 = multiplication.e;
    }

    public T add(T t, T u) {
        return addition.apply(t, u);
    }

    public T mul(T t, T u) {
        return muliplication.apply(t, u);
    }
}

class Ring<T> extends SemiRing<T>{
    private AbelianGroup<T> addition;

    public Ring(AbelianGroup<T> addition, Monoid<T> multiplication) {
        super(addition, multiplication);
        this.addition = addition;
    }

    public T additiveInverse(T t) {
        return addition.inverse(t);
    }
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    private Const(){}
}
