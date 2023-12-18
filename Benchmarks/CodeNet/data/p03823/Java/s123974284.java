import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
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

    public static void solve(StringBuilder out) {
        int n = In.ni();
        long a = In.nl();
        long b = In.nl();
        long[] s = In.nl(n);
        LongRangeAffineModSum at = new LongRangeAffineModSum(n, Const.MOD7);
        LongRangeAffineModSum bt = new LongRangeAffineModSum(n, Const.MOD7);
        at.update(n - 1, n, 1);
        bt.update(n - 1, n, 1);
        for (int i = 1, j = 0, k = 0; i < n; i++) {
            while (s[j] + a <= s[i]) j++;
            while (s[k] + b <= s[i]) k++;
            long av = at.query(n - k - 1, n);
            long bv = bt.query(n - j - 1, n);
            bt.update(n - i - 1, n - i, av);
            at.update(n - i - 1, n - i, bv);
            if (i > 0 && s[i - 1] + a > s[i]) at.update(n - i, n, 0);
            if (i > 0 && s[i - 1] + b > s[i]) bt.update(n - i, n, 0);
        }
        out.append(at.query(0, n) + bt.query(0, n));
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
class LongSegmentTree {
    final long[] tree;
    final LongMonoid monoid;
    final int treeSize;
    final int leafs;
    final int leafBias;
    final int height;
    public LongSegmentTree(final long[] t, final LongMonoid monoid) {this(t, t.length, monoid);}
    public LongSegmentTree(final int n, final LongMonoid monoid) {this(new long[0], n, monoid);}
    LongSegmentTree(final long[] t, final int n, final LongMonoid monoid) {
        this.monoid = monoid;
        this.height = Ints.ceilExponent(n);
        this.leafs = 1 << this.height;
        this.leafBias = this.leafs - 1;
        this.treeSize = 2 * this.leafs - 1;
        this.tree = new long[this.treeSize];
        build(t);
    }
    private final void build(final long[] t) {
        for (int i = 0; i < leafs; i++) tree[leafBias + i] = i < t.length ? t[i] : monoid.e;
        for (int i = leafBias - 1; i >= 0; i--) tree[i] = monoid.apply(tree[2 * i + 1], tree[2 * i + 2]);
    }
    public void apply(int i, final LongUnaryOperator func) {
        i += this.leafBias;
        tree[i] = func.applyAsLong(tree[i]);
        while (i > 0) {
            i = (i - 1) >> 1;
            tree[i] = monoid.apply(tree[2 * i + 1], tree[2 * i + 2]);
        }
    }
    public void update(final int i, final long v) {apply(i, $ -> v);}
    public long query(final int l, final int r) {return query(l, r, 0, 0, leafs);}
    long query(final int ql, final int qr, final int k, final int tl, final int tr) {
        if (Range.crosses(ql, qr, tl, tr)) {
            if (Range.contains(ql, qr, tl, tr)) {
                return tree[k];
            } else {
                final long lv = query(ql, qr, 2 * k + 1, tl, (tl + tr) >> 1);
                final long rv = query(ql, qr, 2 * k + 2, (tl + tr) >> 1, tr);
                return monoid.apply(lv, rv);
            }
        }
        return monoid.e;
    }
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int h = 0; h <= this.height; h++) {
            for (int i = (1 << h) - 1; i < (1 << (h + 1)) - 1; i++) {
                sb.append(this.tree[i] == monoid.e ? "e" : this.tree[i]).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}



class LongMonoid extends LongMagma implements LongUnital {
    public final long e;
    public LongMonoid(final LongBinaryOperator operator, final long e) {
        super(operator, TypicalPropertySets.MONOID);
        this.e = e;
    }
    @Override
    public long identityElement() {return e;}
    public static <M extends LongMagma & LongUnital> LongMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.MONOID);
        return new LongMonoid(m.operator, m.identityElement());
    }
}



abstract class LongMagma extends PropertyHolder {
    protected final LongBinaryOperator operator;
    public LongMagma(final LongBinaryOperator operator, final EnumSet<Property> properties) {
        super(properties);
        this.operator = operator;
    }
    public LongMagma(final LongBinaryOperator operator, final TypicalPropertySets properties) {
        super(properties);
        this.operator = operator;
    }
    public final long apply(final long left, final long right) {return operator.applyAsLong(left, right);}
}



final class LongRangeAffineModSum {
    private final long[] tree;
    private final int leafs;
    private final long mod;
    private final long[] a;
    private final long[] b;
    private static final long ae = 1;
    private static final long be = 0;
    public LongRangeAffineModSum(final long[] t, final long mod) {this(t, t.length, mod);}
    public LongRangeAffineModSum(final int n, final long mod) {this(new long[0], n, mod);}
    private LongRangeAffineModSum(final long[] t, final int n, final long mod) {
        this.leafs = 1 << Ints.ceilExponent(n);
        final int treeSize = 2 * this.leafs - 1;
        this.tree = new long[treeSize];
        this.mod = mod;
        this.a = new long[treeSize];
        this.b = new long[treeSize];
        Arrays.fill(this.a, ae);
        Arrays.fill(this.b, be);
    }
    public void affine(final int l, final int r, final long s, final long t) {set(l, r, k -> {a[k] = s; b[k] = t;});}
    public void add(final int l, final int r, final long t) {affine(l, r, ae, t);}
    public void mul(final int l, final int r, final long s) {affine(l, r, s, be);}
    public void update(final int l, final int r, final long v) {affine(l, r, 0, v);}
    public long query(final int l, final int r) {return query(l, r, 0, 0, leafs);}
    protected long query(final int ql, final int qr, final int k, final int tl, final int tr) {
        evaluate(k, tr - tl);
        if (Range.crosses(ql, qr, tl, tr)) {
            if (Range.contains(ql, qr, tl, tr)) {
                return tree[k];
            } else {
                final long lv = query(ql, qr, 2 * k + 1, tl, (tl + tr) >> 1);
                final long rv = query(ql, qr, 2 * k + 2, (tl + tr) >> 1, tr);
                final long lrv = lv + rv; 
                return lrv >= mod ? lrv - mod : lrv;
            }
        }
        return 0;
    }
    private void set(final int l, final int r, final IntConsumer setter) {set(l, r, 0, 0, leafs, setter);}
    private void set(final int ql, final int qr, final int k, final int tl, final int tr, final IntConsumer setter) {
        evaluate(k, tr - tl);
        if (Range.crosses(ql, qr, tl, tr)) {
            if (Range.contains(ql, qr, tl, tr)) {
                setter.accept(k);
                evaluate(k, tr - tl);
            } else {
                final int l = (k << 1) + 1, r = (k << 1) + 2;
                set(ql, qr, l, tl, (tl + tr) >> 1, setter);
                set(ql, qr, r, (tl + tr) >> 1, tr, setter);
                tree[k] = tree[l] + tree[r];
                if (tree[k] >= mod) tree[k] -= mod;
            }
        }
    }
    private void evaluate(final int k, final int w) {
        final long ak = a[k], bk = b[k];
        if (ak != ae || bk != be) {
            if (w > 1) {
                final int l = (k << 1) + 1, r = (k << 1) + 2;
                a[l] = (a[l] * ak) % mod;
                a[r] = (a[r] * ak) % mod;
                b[l] = (ak * b[l] + bk) % mod;
                b[r] = (ak * b[r] + bk) % mod;
            }
            tree[k] = (ak * tree[k] + bk * w) % mod;
            a[k] = ae; b[k] = be;
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Ints {
    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private Ints(){}
    public static int max(final int... a) {
        int ret = Integer.MIN_VALUE; for (final int e : a) ret = Math.max(ret, e);
        return ret;
    }
    public static int min(final int... a) {
        int ret = Integer.MAX_VALUE; for (final int e : a) ret = Math.min(ret, e);
        return ret;
    }
    public static int reduce(final IntBinaryOperator func, final int... a) {
        int ret = a[0]; for (int i = 1; i < a.length; i++) ret = func.applyAsInt(ret, a[i]);
        return ret;
    }
    public static boolean isPowerOfTwo(final int n) {return n != 0 && (-n & n) == n;}
    public static int ceilExponent(final int n) {return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);}
    public static int floorExponent(final int n) {return 31 - Integer.numberOfLeadingZeros(n) + (n == 0 ? 1 : 0);}
    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static int cld(final int a, final int b) {
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
    public static int fld(final int a, final int b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        if (a > 0 && b <= 0) return (a - b - 1) / b;
        return a / b;
    }
    public static String join(final String sep, final int... a) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1)  sb.append(sep);
        }
        return sb.toString();
    }
    public static String toBinaryString(int n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.SIZE; i++, n >>= 1) {
            sb.append(n & 1);
            if ((i & 3) == 3) sb.append('_');
        }
        return sb.reverse().toString();
    }
    public static String toHexString(int n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0, t = Integer.SIZE >> 2; i < t; i++, n >>= 4) {
            sb.append(hex[n & 0xf]);
            if ((i & 3) == 3) sb.append('_');
        }
        return sb.reverse().toString();
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

enum Property {ANNIHILATED_BY_ZERO, ASSOCIATIVE, CANCELLATIVE, COMMUTATIVE, DISTRIBUTIVE, IDEMPOTENT;}


enum TypicalPropertySets {
    ABELIAN_GROUP(EnumSet.of(Property.ASSOCIATIVE, Property.CANCELLATIVE, Property.COMMUTATIVE)),
    BOUNDED_SEMI_LATTICE(EnumSet.of(Property.ASSOCIATIVE, Property.COMMUTATIVE, Property.IDEMPOTENT)),
    COMMUTATIVE_MONOID(EnumSet.of(Property.ASSOCIATIVE, Property.COMMUTATIVE)),
    GROUP(EnumSet.of(Property.ASSOCIATIVE, Property.CANCELLATIVE)),
    MONOID(EnumSet.of(Property.ASSOCIATIVE)),
    SEMI_GROUP(EnumSet.of(Property.ASSOCIATIVE)),
    SEMI_LATTICE(EnumSet.of(Property.ASSOCIATIVE, Property.IDEMPOTENT, Property.COMMUTATIVE)),
    SEMI_RING(EnumSet.of(Property.DISTRIBUTIVE, Property.ANNIHILATED_BY_ZERO)),
    RING(EnumSet.of(Property.DISTRIBUTIVE, Property.ANNIHILATED_BY_ZERO));
    private final EnumSet<Property> properties;
    private TypicalPropertySets(EnumSet<Property> properties) {this.properties = properties;}
    public final EnumSet<Property> getProperties() {return properties.clone();}
}

/**
 * @author https://atcoder.jp/users/suisen
 */
class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = Long.MAX_VALUE >> 2;
    public static final int IINF = Integer.MAX_VALUE >> 1;
    public static final double DINF = 1e150;

    public static final double SDELTA = 1e-12;
    public static final double DELTA = 1e-9;
    public static final double LDELTA = 1e-6;

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};

    private Const(){}
}

interface LongUnital {long identityElement();}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class Range {
    private static final Range EMPTY = new Range(0, 0);
    public long l, r;
    public Range(final long l, final long r) {
        if (r <= l) {this.l = 0; this.r = 0;}
        else {this.l = l; this.r = r;}
    }
    public long length() {return r - l;}
    public boolean contains(final long v) {return in(l, v, r);}
    public boolean contains(final Range r) {return contains(this.l, this.r, r.l, r.r);}
    public boolean crosses(final Range r) {return crosses(this.l, this.r, r.l, r.r);}
    public Range crossRange(final Range r) {
        if (crosses(r)) return new Range(Math.max(this.l, r.l), Math.min(this.r, r.r));
        return EMPTY;
    }
    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range} and unite them.
     * including some {@code Iterator.remove()}, requires being LinkedList.
     * @param list   LinkedList.
     * @param sorted if the list is already sorted.
     */
    public static void unionRange(final LinkedList<Range> list, final boolean sorted) {
        if (!sorted) Collections.sort(list, (r1, r2) -> Long.compare(r1.l, r2.l));
        final Iterator<Range> iter = list.iterator();
        if (iter.hasNext()) {
            Range now = iter.next();
            while (iter.hasNext()) {
                final Range r = iter.next();
                if (now.crosses(r)) {
                    now.r = Math.max(now.r, r.r);
                    iter.remove();
                } else now = r;
            }
        }
    }
    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range} and unite them.
     * including some {@code Iterator.remove()}, requires being LinkedList.
     * @param list (unsorted) LinkedList.
     */
    public static void unionRange(final LinkedList<Range> list) {unionRange(list, false);}
    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range}, unite them,
     * and calculate the sum of length. including some {@code Iterator.remove()},
     * requires being LinkedList.
     * @param list   LinkedList.
     * @param sorted if the list is already sorted.
     * @return sum of length of Ranges.
     */
    public static long lengthSum(final LinkedList<Range> list, final boolean sorted) {
        unionRange(list, sorted);
        long ret = 0;
        for (final Range r : list) ret += r.length();
        return ret;
    }
    /**
     * this is a DESTRUCTIVE method. receive a list of {@code Range}, unite them,
     * and calculate the sum of length. including some {@code Iterator.remove()},
     * requires being LinkedList.
     * @param list (unsorted) LinkedList.
     * @return sum of length of Ranges.
     */
    public static long lengthSum(final LinkedList<Range> list) {return lengthSum(list, false);}
    /**
     * judge value is in [l, r).
     * @param l     closed.
     * @param value evaluated value.
     * @param r     open.
     * @return value is in [l, r)
     */
    public static boolean in(final long l, final long value, final long r) {return l <= value && value < r;}
    /**
     * judge value is out of [l, r). (i.e. value is in (-infty, l) or [r, infty))
     * @param l     closed.
     * @param value evaluated value.
     * @param r     open.
     * @return value is out of [l, r) (i.e. value is in (-infty, l) or [r, infty))
     */
    public static boolean outOf(final long l, final long value, final long r) {return !in(l, value, r);}
    public static boolean crosses(final long l1, final long r1, final long l2, final long r2) {return l1 < r2 && l2 < r1;}
    public static boolean contains(final long l1, final long r1, final long l2, final long r2) {return l1 <= l2 && r2 <= r1;}
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Range)) return false;
        final Range r = (Range) o;
        return this.l == r.l && this.r == r.r;
    }
    @Override
    public int hashCode() {return Objects.hash(l, r);}
    @Override
    public String toString() {return "[" + l + ", " + r + ")";}
}


abstract class PropertyHolder {
    private final EnumSet<Property> properties;
    public PropertyHolder(final EnumSet<Property> properties) {this.properties = properties;}
    public PropertyHolder(final TypicalPropertySets typicalSet) {this(typicalSet.getProperties());}
    public final EnumSet<Property> getProperties() {return properties;}
    public final void addProperties(final Property... props) {for (Property prop : props) properties.add(prop);}
    public final void addProperties(final EnumSet<Property> props) {for (Property prop : props) properties.add(prop);}
    public final void addProperties(final TypicalPropertySets props) {addProperties(props.getProperties());}
    public final boolean hasProperties(final Property... props) {
        for (final Property prop : props) if (!properties.contains(prop)) return false;
        return true;
    }
    public final boolean hasProperties(final EnumSet<Property> props) {
        for (final Property prop : props) if (!properties.contains(prop)) return false;
        return true;
    }
    public final boolean hasProperties(final TypicalPropertySets props) {return hasProperties(props.getProperties());}
    public final void requireProperties(final EnumSet<Property> props, final Property... ps) {
        final ArrayList<Property> unmet = new ArrayList<>();
        for (final Property prop : props) if (!properties.contains(prop)) unmet.add(prop);
        for (final Property prop : ps) if (!properties.contains(prop)) unmet.add(prop);
        if (unmet.size() > 0) throw new UnsatisfiedRequiredPropertiesException(unmet);
    }
    public final void requireProperties(final TypicalPropertySets props, final Property... ps) {
        requireProperties(props.getProperties(), ps);
    }
    private static final class UnsatisfiedRequiredPropertiesException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        private UnsatisfiedRequiredPropertiesException(final Collection<Property> props) {
            for (final Property prop : props) System.err.println(prop.name() + "should be satisfied.");
        }
    }
}
