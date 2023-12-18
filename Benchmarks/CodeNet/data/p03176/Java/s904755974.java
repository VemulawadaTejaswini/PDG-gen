import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        solve(out);
        out.outln();
        out.flush();
        out.close();
    }

    public static void solve(Out out) {
        int n = In.ni();
        int[] h = In.ni(n);
        h = ArrayUtil.map(i -> i - 1, h);
        long[] a = In.nl(n);
        SegmentTree t = new SegmentTree(n, new Monoid<Long>(0l, Long::max));
        for (int i = 0; i < n; i++) {
            long max = t.query(0, h[i]);
            t.update(h[i], max + a[i]);
        }
        out.append(t.query(0, n));
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


class Range implements Comparable<Range> {
    private static final Range EMPTY = new Range(0, 0);

    public long l;
    public long r;

    public Range(long l, long r) {
        if (r <= l) {
            this.l = 0;
            this.r = 0;
        } else {
            this.l = l;
            this.r = Math.max(l, r);
        }
    }

    public Range(long r) {
        this(0, r);
    }

    public long length() {
        return r - l;
    }

    public boolean contains(long v) {
        return in(l, v, r);
    }

    public boolean contains(Range r) {
        return contains(this.l, this.r, r.l, r.r);
    }

    public boolean crosses(Range r) {
        return crosses(this.l, this.r, r.l, r.r);
    }

    public Range crossRange(Range r) {
        if (crosses(r)) {
            return new Range(Math.max(this.l, r.l), Math.min(this.r, r.r));
        } else {
            return EMPTY;
        }
    }
    
    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range} and unite them.
     * including some {@code Iterator.remove()}, requires being LinkedList.
     * @param list LinkedList.
     * @param sorted if the list is already sorted.
     */
    public static void unionRange(LinkedList<Range> list, boolean sorted) {
        if (!sorted) {
            Collections.sort(list);
        }
        Iterator<Range> iter = list.iterator();
        if (iter.hasNext()) {
            Range now = iter.next();
            while (iter.hasNext()) {
                Range r = iter.next();
                if (now.crosses(r)) {
                    now.r = Math.max(now.r, r.r);
                    iter.remove();
                } else {
                    now = r;
                }
            }
        }
    }

    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range} and unite them.
     * including some {@code Iterator.remove()}, requires being LinkedList.
     * @param list (unsorted) LinkedList.
     */
    public static void unionRange(LinkedList<Range> list) {
        unionRange(list, false);
    }

    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range}, unite them, and calculate the sum of length.
     * including some {@code Iterator.remove()}, requires being LinkedList.
     * @param list LinkedList.
     * @param sorted if the list is already sorted.
     * @return sum of length of Ranges.
     */
    public static long lengthSum(LinkedList<Range> list, boolean sorted) {
        unionRange(list, sorted);
        long ret = 0;
        for (Range r : list) {
            ret += r.length();
        }
        return ret;
    }

    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range}, unite them, and calculate the sum of length.
     * including some {@code Iterator.remove()}, requires being LinkedList.
     * @param list (unsorted) LinkedList.
     * @return sum of length of Ranges.
     */
    public static long lengthSum(LinkedList<Range> list) {
        return lengthSum(list, false);
    }

    /**
     * judge value is in [l, r).
     * @param l closed.
     * @param value evaluated value.
     * @param r open.
     * @return value is in [l, r)
     */
    public static boolean in(long l, long value, long r) {
        return l <= value && value < r;
    }

    /**
     * judge value is out of [l, r). (i.e. value is in (-infty, l) or [r, infty))
     * @param l closed.
     * @param value evaluated value.
     * @param r open.
     * @return value is out of [l, r) (i.e. value is in (-infty, l) or [r, infty))
     */
    public static boolean outOf(long l, long value, long r) {
        return !in(l, value, r);
    }

    public static boolean crosses(long l1, long r1, long l2, long r2) {
        return l1 < r2 && l2 < r1;
    }

    public static boolean contains(long l1, long r1, long l2, long r2) {
        return l1 <= l2 && r2 <= r1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Range)) {
            return false;
        } else {
            Range r = (Range) o;
            return this.l == r.l && this.r == r.r;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(l, r);
    }

    @Override
    public String toString() {
        return "[" + l + ", " + r + ")";
    }

    @Override
    public int compareTo(Range r) {
        return Long.compare(this.l, r.l);
    }
}


class Monoid<T> {
    public static final Monoid<Long> ADD = new Monoid<>( 0l, Long::sum);
    public static final Monoid<Long> MAX = new Monoid<>(-Const.LINF, Long::max);
    public static final Monoid<Long> MIN = new Monoid<>( Const.LINF, Long::min);
    public static final Monoid<Long> RW  = new Monoid<>( Const.LINF, (u, v) -> v);
    public static final Monoid<Long> AND = new Monoid<>(-1l, (u, v) -> u & v);
    public static final Monoid<Long> OR  = new Monoid<>( 0l, (u, v) -> u | v);
    public static final Monoid<Long> XOR = new Monoid<>( 0l, (u, v) -> u ^ v);
    public static final Monoid<Long> GCD = new Monoid<>( 0l, MathUtil::gcd);
    
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


class SegmentTree {
    protected long[] tree;
    protected Monoid<Long> monoid;
    protected int treeSize;
    protected int leafs;
    protected int leafBias;
    protected int height;

    public SegmentTree(long[] t, Monoid<Long> monoid) {
        this(t, t.length, monoid);
    }

    public SegmentTree(int n, Monoid<Long> monoid) {
        this(new long[0], n, monoid);
    }

    protected SegmentTree(long[] t, int n, Monoid<Long> monoid) {
        this.monoid = monoid;
        init(n);
        build(t);
    }

    private void init(int n) {
        this.height = MathUtil.ceilExponent(n);
        this.leafs = 1 << this.height;
        this.leafBias = this.leafs - 1;
        this.treeSize = 2 * this.leafs - 1;
        this.tree = new long[this.treeSize];
    }

    private void build(long[] t) {
        for (int i = 0; i < this.leafs; i++) {
            this.tree[this.leafBias + i] = i < t.length ? t[i] : this.monoid.e;
        }
        for (int i = this.leafBias - 1; i >= 0; i--) {
            this.tree[i] = this.monoid.apply(this.tree[2 * i + 1], this.tree[2 * i + 2]);
        }
    }

    public <E> void apply(int i, BiFunction<Long, E, Long> func, E v) {
        i += this.leafBias;
        tree[i] = func.apply(tree[i], v);
        while (i > 0) {
            i = (i - 1) >> 1;
            tree[i] = monoid.apply(tree[2 * i + 1], tree[2 * i + 2]);
        }
    }

    public void update(int i, long v) {
        apply(i, (x, y) -> y, v);
    }

    public long query(int l, int r) {
        return query(l, r, 0, 0, leafs);
    }

    protected long query(int ql, int qr, int k, int tl, int tr) {
        if (Range.crosses(ql, qr, tl, tr)) {
            if (Range.contains(ql, qr, tl, tr)) {
                return tree[k];
            } else {
                long lv = query(ql, qr, 2 * k + 1, tl, (tl + tr) >> 1);
                long rv = query(ql, qr, 2 * k + 2, (tl + tr) >> 1, tr);
                return monoid.apply(lv, rv);
            }
        } else {
            return monoid.e;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int h = 0; h <= this.height; h++) {
            for (int i = (1 << h) - 1; i < (1 << (h + 1)) - 1; i++) {
                sb.append(this.tree[i] == monoid.e ? "e" : this.tree[i]).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}


class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
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

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd());
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
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

    public static boolean[][] inputGrid(int h, int w, char truechar) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == truechar;
            }
        }
        return grid;
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
        return a * b / gcd(a, b);
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
        ReferenceLong x = new ReferenceLong();
        ReferenceLong y = new ReferenceLong();
        long[] ret = new long[3];
        ret[2] = extGCD(a, b, x, y);
        ret[0] = x.v;
        ret[1] = y.v;
        return ret;
    }
    private static long extGCD(long a, long b, ReferenceLong x, ReferenceLong y) {
        if (b == 0) {
            x.v = 1;
            y.v = 0;
            return a;
        }
        long d = extGCD(b, a % b, y, x);
        y.v -= a / b * x.v;
        return d;
    }
    private static class ReferenceLong {
        long v = 0;
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

    public static int fllorExponent(int n) {
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
    public static long pow(int a, int b) {
        if (b == 0) return 1;
        long half = pow(a, b >> 1);
        return half * half * ((b & 1) != 0 ? a : 1);
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
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;
    public static final double DINF = 1e150;

    public static final double DELTA = 0.000_000_000_1;
    public static final double LDELTA = 0.000_001;

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


class ArrayUtil {
    public static int[] compress(long[] a) {
        int n = a.length;
        HashSet<Long> set = new HashSet<>();
        for (long e : a) {
            set.add(e);
        }
        ArrayList<Long> sorted = new ArrayList<>(set);
        int size = sorted.size();
        Collections.sort(sorted);
        int[] compress = new int[n];
        for (int i = 0; i < n; i++) {
            int l = 0, r = size;
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sorted.get(m) <= a[i]) {
                    l = m;
                } else {
                    r = m;
                }
            }
            compress[i] = l + 1;
        }
        return compress;
    }

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
     * permutation
     */

    public static int[] nextPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] > ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] > ret[i - 1]) {
                        pass = mid;
                    } else {
                        fail = mid;
                    }
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    public static int[] predPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] < ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] < ret[i - 1]) {
                        pass = mid;
                    } else {
                        fail = mid;
                    }
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    /**
     * 
     */

    public static int[] map(UnaryOperator<Integer> op, int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.apply(a[i]);
        }
        return b;
    }

    public static long[] map(UnaryOperator<Long> op, long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.apply(a[i]);
        }
        return b;
    }

    public static <T> T[] map(UnaryOperator<T> op, T[] a) {
        @SuppressWarnings("unchecked")
        T[] b = (T[]) new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.apply(a[i]);
        }
        return b;
    }

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

    /**
     * initialize methods
     */

    public static int[] filledArray(int init, int n) {
        int[] ret = new int[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static int[][] filledArray(int init, int n, int m) {
        int[][] ret = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }

    public static long[] filledArray(long init, int n) {
        long[] ret = new long[n];
        Arrays.fill(ret, init);
        return ret;
    }

    public static long[][] filledArray(long init, int n, int m) {
        long[][] ret = new long[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(ret[i], init);
        }
        return ret;
    }
}
