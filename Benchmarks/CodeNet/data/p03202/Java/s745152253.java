import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.TreeSet;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
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
        long[] a = In.nl(n);
        Compress cmp = new Compress(a, true);
        int[] c = cmp.compress;
        IntLazySegmentTree t = new IntLazySegmentTree(n + 1, IntAlgebraicStructures.ADD, IntAlgebraicStructures.RW, (u, v) -> v, (v, l) -> v * l);
        int l = 0, r = n;
        while (r - l > 1) {
            int x = (l + r) >> 1;
            for (int i = 0, k = 0; i < n; i++) {
                int ll = -1, rr = c[i];
                while (rr - ll > 1) {
                    int mm = (ll + rr) >> 1;
                    if (t.query(mm, c[i]) == (c[i] - mm) * x) rr = mm;
                    else ll = mm;
                }
                if (rr == 0) {
                    l = x;
                    break;
                }
                int ch = t.query(ll, rr);
                t.apply(ll, rr, ch + 1);
                t.apply(rr, c[i], 1);
                if (k <= c[i] - 1) {
                    t.apply(k, c[i] - 1, 1);
                } else {
                    t.apply(c[i], k, 0);
                }
                k = c[i];
            }
            if (l != x) r = x;
            t.reset();
        }
        out.append(r);
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns long array.
 */
final class LongArrayGenerator {
    private LongArrayGenerator(){}
    public static long[] filled(final int n, final long init) {
        final long[] ret = new long[n];
        Arrays.fill(ret, init);
        return ret;
    }
    public static long[][] filled(final int n, final int m, final long init) {
        final long[][] ret = new long[n][m];
        for (int i = 0; i < n; i++) Arrays.fill(ret[i], init);
        return ret;
    }
    public static long[] generate(final int n, final LongSupplier f) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> f.getAsLong());
        return a;
    }
    public static long[][] generate(final int n, final int m, final LongSupplier f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = generate(m, f);
        return a;
    }
    public static long[] indexToLong(final int n, final IntToLongFunction f) {
        final long[] a = new long[n];
        Arrays.setAll(a, f);
        return a;
    }
    public static long[][] indexToLong(final int n, final int m, final IntToLongBiFunction f) {
        final long[][] a = new long[n][m];
        for (int i = 0; i < n; i++) a[i] = indexToLong(m, f.curry(i));
        return a;
    }
    public static long[] toArray(final Collection<? extends Number> collection) {
        final int n = collection.size();
        final long[] ret = new long[n];
        final Object[] coll = collection.toArray();
        for (int i = 0; i < n; i++) ret[i] = ((Number) coll[i]).longValue();
        return ret;
    }
    public static long[] unique(final long[] a) {
        final HashSet<Long> set = new HashSet<>();
        for (final long e : a) set.add(e);
        final int m = set.size();
        final long[] b = new long[m];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                b[index++] = a[i];
                set.remove(a[i]);
            }
        }
        return b;
    }
    public static long[][] transpose(final long[][] a) {
        final int n = a.length;
        final int m = a[0].length;
        final long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) for (int i = 0; i < n; i++) ret[j][i] = a[i][j];
        return ret;
    }
    public static long[] map(final long[] a, final LongUnaryOperator f) {
        final long[] b = new long[a.length];
        Arrays.setAll(b, i -> f.applyAsLong(a[i]));
        return b;
    }
    public static long[] filter(final long[] a, final LongPredicate p) {
        final LongArrayList ret = new LongArrayList();
        for (final long e : a) ret.addIf(e, p);
        return ret.toArray();
    }
    public static long[] accumulateFromHead(final long[] a, final LongBinaryOperator op, final long e) {
        final int n = a.length;
        final long[] ret = new long[n + 1];
        ret[0] = e;
        for (int i = 0; i < n; i++) ret[i + 1] = op.applyAsLong(ret[i], a[i]);
        return ret;
    }
    public static long[] accumulateFromTail(final long[] a, final LongBinaryOperator op, final long e) {
        final int n = a.length;
        final long[] ret = new long[n + 1];
        ret[n] = e;
        for (int i = n - 1; i >= 0; i--) ret[i] = op.applyAsLong(ret[i + 1], a[i]);
        return ret;
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * 1. DESTRUCTIVE methods for long arrays.
 * 2. methods that receives arrays and return some results (except for long arrays).
 */
final class LongArrays {
    private LongArrays(){}
    public static void swap(final long[] a, final int u, final int v) {
        final long tmp = a[u]; a[u] = a[v]; a[v] = tmp;
    }
    public static void reverse(final long[] a, final int begin, final int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) swap(a, i, begin + end - i - 1);
    }
    public static void reverse(final long[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final long[] a) {Arrays.sort(a); reverse(a);}
    public static long reduce(final long[] a, final LongBinaryOperator op) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsLong(ret, a[i]);
        return ret;
    }
    public static void map(final long[] a, final LongUnaryOperator op) {Arrays.setAll(a, i -> op.applyAsLong(a[i]));}
    public static int filter(final long[] src, final long[] dst, final LongPredicate p) {
        int idx = 0;
        for (final long e : src) if (p.test(e)) dst[idx++] = e;
        return idx;
    }
    public static int filterIndex(final long[] dst, final int beginIndex, final int endIndex, final LongPredicate p) {
        int idx = 0;
        for (int i = beginIndex; i < endIndex; i++) if (p.test(i)) dst[idx++] = i;
        return idx;
    }
    public static int filterIndex(final long dst[], final int endIndex, final LongPredicate p) {
        return filterIndex(dst, 0, endIndex, p);
    }
    public static void accumulate(final long[] a, final LongBinaryOperator op) {
        for (int i = 1; i < a.length; i++) a[i] = op.applyAsLong(a[i - 1], a[i]);
    }
    public static void accumulate(final long[] a) {
        for (int i = 1; i < a.length; i++) a[i] += a[i - 1];
    }
    public static void permute(long[] a, int[] p) {
        int n = p.length;
        boolean[] settled = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; !settled[j]; j = p[j]) {
                if (p[j] == i) {
                    settled[j] = true;
                    break;
                }
                swap(a, j, p[j]);
                settled[j] = true;
            }
        }
    }
    public static int compare(final long[] a, final long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) return -1;
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return a.length < b.length ? 1 : 0;
    }
    public static boolean equals(final long[] a, final long[] b) {return compare(a, b) == 0;}
    public static String join(final long[] a, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
    public static String joinWithPrefixAndSuffix(final long[] a, final IntFunction<String> idxToPre, final IntFunction<String> idxToSuf, final String sep) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(idxToPre.apply(i)).append(a[i]).append(idxToSuf.apply(i));
            if (i < a.length - 1) sb.append(sep);
        }
        return sb.toString();
    }
}



class IntAlgebraicStructures {
    private IntAlgebraicStructures(){}
    public static final IntAbelianGroup ADD = new IntAbelianGroup(Integer::sum, 0, e -> -e);
    public static final IntAbelianGroup XOR = new IntAbelianGroup((u, v) -> u ^ v, 0, x -> x);
    public static final IntBoundedSemiLattice MAX = new IntBoundedSemiLattice(Integer::max, -Const.IINF);
    public static final IntBoundedSemiLattice MIN = new IntBoundedSemiLattice(Integer::min, Const.IINF);
    public static final IntBoundedSemiLattice AND = new IntBoundedSemiLattice((u, v) -> u & v, 0xffff_ffff);
    public static final IntBoundedSemiLattice OR = new IntBoundedSemiLattice((u, v) -> u | v, 0);
    public static final IntBoundedSemiLattice GCD = new IntBoundedSemiLattice((u, v) -> (int) MathUtil.gcd(u, v), 0);
    public static final IntCommutativeMonoid MUL = new IntCommutativeMonoid((u, v) -> u * v, 1);
    public static final Rewrite RW = new Rewrite((u, v) -> v, -Const.IINF - 1);
    public static final IntField ADD_MUL = new IntField(ADD, MUL);
    public static final IntField XOR_AND = new IntField(XOR, AND);
    private static final class Rewrite extends IntMonoid {
        public Rewrite(final IntBinaryOperator operator, final int e) {
            super(operator, e);
            addProperties(Property.IDEMPOTENT);
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

interface IntInversible {int inverse(int t);}

enum Property {ANNIHILATED_BY_ZERO, ASSOCIATIVE, CANCELLATIVE, COMMUTATIVE, DISTRIBUTIVE, IDEMPOTENT;}


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

interface IntUnital {int identityElement();}


class IntRing extends IntSemiRing {
    private final IntUnaryOperator additiveInverse;
    public IntRing(final IntAbelianGroup addition, final IntMonoid multiplication) {
        super(addition, multiplication);
        this.additiveInverse = addition::inverse;
    }
    public final int additiveInverse(final int t) {return additiveInverse.applyAsInt(t);}
}



class IntMonoid extends IntMagma implements IntUnital {
    public final int e;
    public IntMonoid(final IntBinaryOperator operator, final int e) {
        super(operator, TypicalPropertySets.MONOID);
        this.e = e;
    }
    @Override
    public int identityElement() {return e;}
    public static <M extends IntMagma & IntUnital> IntMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.MONOID);
        return new IntMonoid(m.operator, m.identityElement());
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
@FunctionalInterface
interface IntToLongBiFunction {
    public long apply(int x, int y);
    public default IntToLongFunction curry(final int x) {return y -> apply(x, y);}
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class MathUtil{
    private static final long UNDER32_MASK = 0xffff_ffffl;
    private MathUtil(){}
    /**
     * Enumarate primes equal to or less than n.
     * @param n
     * @return {@code ArrayList} that holds primes.
     */
    public static ArrayList<Integer> eratosthenes(final int n) {
        final int[] div = eratosthenesDivisors(n);
        final ArrayList<Integer> result = new ArrayList<>();
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
    public static HashMap<Long, Integer> primeFactorization(long n) {
        final HashMap<Long, Integer> primes = new HashMap<>();
        for (long p = 2; p * p <= n; p++) {
            int q = 0;
            while (n % p == 0) {n /= p; q++;}
            if (q > 0) primes.put(p, q);
        }
        if (n > 1) primes.put(n, 1);
        return primes;
    }
    public static TreeSet<Long> divisors(final long n) {
        final TreeSet<Long> divisors = new TreeSet<>();
        for (long i = 1; i * i <= n; i++) if (n % i == 0) {divisors.add(i); divisors.add(n / i);}
        return divisors;
    }
    private static HashMap<Long, Integer> lcmMap(final HashMap<Long, Integer> amap, final HashMap<Long, Integer> bmap) {
        if (amap.size() < bmap.size()) return lcmMap(bmap, amap);
        final HashMap<Long, Integer> lcm = amap;
        for (final Map.Entry<Long, Integer> e : bmap.entrySet()) {
            final long prime = e.getKey();
            if (lcm.containsKey(prime)) lcm.put(prime, Math.max(lcm.get(prime), e.getValue()));
            else lcm.put(prime, e.getValue());
        }
        return lcm;
    }
    private static HashMap<Long, Integer> lcmMap(final HashMap<Long, Integer> amap, final long b) {
        final HashMap<Long, Integer> bmap = primeFactorization(b);
        return lcmMap(amap, bmap);
    }
    public static HashMap<Long, Integer> lcmMap(final long... a) {
        HashMap<Long, Integer> amap = new HashMap<>();
        for (final long c : a) amap = lcmMap(amap, c);
        return amap;
    }
    /**
     * calculate lcm(a, b) fast. (NOT considering overflow.)
     */
    public static long lcm(final long a, final long b) {return (a / gcd(a, b)) * b;}
    /**
     * Caluculate the GCD of (a, b)/
     * @param a first value
     * @param b second value
     * @return GCD(a, b)
     */
    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        if (a == 0) return b;
        long r = a % b;
        while (r != 0) {a = b; b = r; r = a % b;}
        return b;
    }
    public static long gcd(final long... a) {
        long gcd = 0; for (final long c : a) gcd = gcd(gcd, c);
        return gcd;
    }
    /**
     * Return one of the solutions to {@code ax+by=gcd(a, b)}.
     * 
     * @return {@code x}, {@code y}, {@code gcd(a, b)}.
     * @param a a of ax+by=gcd(a, b).
     * @param b b of ax+by=gcd(a, b).
     */
    public static long[] extGCD(final long a, final long b) {
        final long[] ret = new long[3];
        final long[] xy = new long[2];
        ret[2] = extGCD(a, b, xy);
        ret[0] = xy[0]; ret[1] = xy[1];
        return ret;
    }
    private static long extGCD(final long a, final long b, final long[] xy) {
        if (b == 0) {xy[0] = 1; xy[1] = 0; return a;}
        long tmp = xy[0]; xy[0] = xy[1]; xy[1] = tmp;
        final long d = extGCD(b, a % b, xy);
        tmp = xy[0]; xy[0] = xy[1]; xy[1] = tmp;
        xy[1] -= a / b * xy[0];
        return d;
    }
    /**
     * caluculate a ^ b NOT considering overflow. so if you want to calculate a ^ b
     * (mod p), use ModUtil.pow(a, b).
     * @param a base
     * @param b exponent
     * @return a ^ b
     */
    public static long pow(final int a, long b) {
        long ret = 1l;
        for (long c = 1, ac = a; b > 0; ac *= ac, c <<= 1) if ((-b & b) == c) {ret *= ac; b &= ~(-b & b);}
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
        long res = 1; for (long d = 1; d <= r; d++) {res *= n--; res /= d;}
        return res;
    }
    public static long ceilSqrt(final long n) {
        long l = -1, r = n;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m >= n) r = m;
            else l = m;
        }
        return r;
    }
    public static long floorSqrt(final long n) {
        long l = 0, r = n + 1;
        while (r - l > 1) {
            final long m = (r + l) >> 1;
            if (m * m > n) r = m;
            else l = m;
        }
        return l;
    }
    public static long int2ToLong(final int upper, final int lower) {return ((long) upper << Integer.SIZE) | lower;}
    public static int upper32(final long l) {return (int) (l >>> Integer.SIZE);}
    public static int lower32(final long l) {return (int) (l & UNDER32_MASK);}
}



class IntBoundedSemiLattice extends IntMonoid {
    public IntBoundedSemiLattice(final IntBinaryOperator operator, final int e) {
        super(operator, e);
        addProperties(Property.IDEMPOTENT, Property.COMMUTATIVE);
    }
    public static <M extends IntMagma & IntUnital> IntBoundedSemiLattice of(M m) {
        m.requireProperties(TypicalPropertySets.BOUNDED_SEMI_LATTICE.getProperties());
        return new IntBoundedSemiLattice(m.operator, m.identityElement());
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntLazySegmentTree extends IntSegmentTree {
    private final int[] laz;
    private final IntMonoid lazMonoid;
    private final IntBinaryOperator operator;
    private final IntBinaryOperator lazMerger;
    public IntLazySegmentTree(final int[] t, final IntMonoid monoid, final IntMonoid lazMonoid, final IntBinaryOperator operator, final IntBinaryOperator lazMerger) {this(t, t.length, monoid, lazMonoid, operator, lazMerger);}
    public IntLazySegmentTree(final int n, final IntMonoid monoid, final IntMonoid lazMonoid, final IntBinaryOperator operator, final IntBinaryOperator lazMerger) {this(new int[0], n, monoid, lazMonoid, operator, lazMerger);}
    private IntLazySegmentTree(final int[] t, final int n, final IntMonoid monoid, final IntMonoid lazMonoid, final IntBinaryOperator operator, final IntBinaryOperator lazMerger) {
        super(t, n, monoid);
        this.lazMonoid = lazMonoid;
        this.operator = operator;
        this.lazMerger = lazMerger;
        this.laz = new int[this.treeSize];
        Arrays.fill(this.laz, this.lazMonoid.e);
    }
    public void apply(final int l, final int r, final int v) {apply(l, r, 0, 0, leafs, v);}
    private void apply(final int ql, final int qr, final int k, final int tl, final int tr, final int v) {
        evaluate(k, tr - tl);
        if (Range.crosses(ql, qr, tl, tr)) {
            if (Range.contains(ql, qr, tl, tr)) {
                laz[k] = lazMonoid.apply(laz[k], v);
                evaluate(k, tr - tl);
            } else {
                apply(ql, qr, 2 * k + 1, tl, (tl + tr) >> 1, v);
                apply(ql, qr, 2 * k + 2, (tl + tr) >> 1, tr, v);
                tree[k] = monoid.apply(tree[2 * k + 1], tree[2 * k + 2]);
            }
        }
    }
    @Override
    public void apply(final int i, final IntUnaryOperator fun) {tree[leafBias + i] = fun.applyAsInt(tree[leafBias + i]);}
    @Override
    public void update(final int i, final int v) {apply(i, x -> v);}
    @Override
    public int query(final int l, final int r) {return query(l, r, 0, 0, leafs);}
    @Override
    protected int query(final int ql, final int qr, final int k, final int tl, final int tr) {
        evaluate(k, tr - tl); return super.query(ql, qr, k, tl, tr);
    }
    private void evaluate(final int k, final int w) {
        if (laz[k] != lazMonoid.e) {
            if (w > 1) {
                laz[2 * k + 1] = lazMonoid.apply(laz[2 * k + 1], laz[k]);
                laz[2 * k + 2] = lazMonoid.apply(laz[2 * k + 2], laz[k]);
            }
            tree[k] = operator.applyAsInt(tree[k], lazMerger.applyAsInt(laz[k], w));
            laz[k] = lazMonoid.e;
        }
    }
    public void reset() {
        for (int i = 0; i < treeSize; i++) {
            tree[i] = monoid.e;
            laz[i] = lazMonoid.e;
        }
    }
}



class IntGroup extends IntMonoid implements IntInversible {
    private final IntUnaryOperator inverse;
    public IntGroup(final IntBinaryOperator operator, final int e, final IntUnaryOperator inverse) {
        super(operator, e);
        addProperties(Property.CANCELLATIVE);
        this.inverse = inverse;
    }
    @Override
    public int inverse(final int t) {return inverse.applyAsInt(t);}
}



abstract class IntExtendedMagma extends PropertyHolder {
    public final int e0, e1;
    private final IntBinaryOperator addition, multiplication;
    protected final EnumSet<Property> additiveProps, multiplicativeProps;
    public IntExtendedMagma(IntMonoid addition, IntMonoid multiplication, EnumSet<Property> properties) {
        super(properties);
        this.addition = addition.operator;
        this.multiplication = multiplication.operator;
        this.e0 = addition.identityElement();
        this.e1 = multiplication.identityElement();
        this.additiveProps = addition.getProperties();
        this.multiplicativeProps = multiplication.getProperties();
    }
    public IntExtendedMagma(IntMonoid addition, IntMonoid multiplication, TypicalPropertySets properties) {
        this(addition, multiplication, properties.getProperties());
    }
    public final int add(int t, int u) {return addition.applyAsInt(t, u);}
    public final int mul(int t, int u) {return multiplication.applyAsInt(t, u);}
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class LongArrayList implements Iterable<Long> {
    private long[] a;
    private int tail = 0;
    private static final int DEFAULT_SIZE = 64;
    public LongArrayList(final int capacity) {this.a = new long[Math.max(1, capacity)];}
    public LongArrayList() {this(DEFAULT_SIZE);}
    public void add(final long v) {
        if (tail == a.length) grow();
        a[tail++] = v;
    }
    public long removeLast() {return a[tail--];}
    public long get(final int i) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        return a[i];
    }
    public void set(final int i, final long v) {
        if (i >= a.length) throw new IndexOutOfBoundsException("Index " + i + " out of bounds for length " + size());
        a[i] = v;
    }
    private void grow() {
        final long[] b = new long[a.length << 1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
    }
    public int size() {return tail;}
    public void reverse(final int begin, final int end) {LongArrays.reverse(a, begin, end);}
    public void reverse() {LongArrays.reverse(a, 0, tail);}
    public long[] toArray() {
        final long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public boolean addIf(final long v, final LongPredicate p) {
        if (p.test(v)) {add(v); return true;}
        return false;
    }
    public PrimitiveIterator.OfLong iterator() {return new LongArrayListIterator();}
    private class LongArrayListIterator implements PrimitiveIterator.OfLong {
        private int i = 0;
        public boolean hasNext() {return i < tail;}
        public long nextLong() {return a[i++];}
    }
}



abstract class IntMagma extends PropertyHolder {
    protected final IntBinaryOperator operator;
    public IntMagma(final IntBinaryOperator operator, final EnumSet<Property> properties) {
        super(properties);
        this.operator = operator;
    }
    public IntMagma(final IntBinaryOperator operator, final TypicalPropertySets properties) {
        super(properties);
        this.operator = operator;
    }
    public final int apply(final int left, final int right) {return operator.applyAsInt(left, right);}
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



class IntSemiRing extends IntExtendedMagma {
    public IntSemiRing(final IntMonoid addition, final IntMonoid multiplication) {
        super(addition, multiplication, TypicalPropertySets.SEMI_RING);
        addition.requireProperties(EnumSet.of(Property.COMMUTATIVE));
    }
    public static IntSemiRing of(IntExtendedMagma m) {
        if (!m.additiveProps.containsAll(TypicalPropertySets.COMMUTATIVE_MONOID.getProperties())) {
            throw new ClassCastException("addition does not meet the conditions of commutative monoid.");
        }
        IntCommutativeMonoid add = new IntCommutativeMonoid(m::add, m.e0);
        IntMonoid mul = new IntMonoid(m::mul, m.e1);
        return new IntSemiRing(add, mul);
    }
}



class IntAbelianGroup extends IntGroup {
    public IntAbelianGroup(final IntBinaryOperator operator, final int e, final IntUnaryOperator inverse) {
        super(operator, e, inverse);
        addProperties(Property.COMMUTATIVE);
    }
}



class IntCommutativeMonoid extends IntMonoid {
    public IntCommutativeMonoid(final IntBinaryOperator operator, final int e) {
        super(operator, e);
        addProperties(Property.COMMUTATIVE);
    }
    public static <M extends IntMagma & IntUnital> IntCommutativeMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.COMMUTATIVE_MONOID.getProperties());
        return new IntCommutativeMonoid(m.operator, m.identityElement());
    }
}


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
final class Compress {
    public int n;
    public int[] compress;
    public long[] sorted;
    public boolean oneIndexed;
    public Compress(final long[] a, final boolean oneIndexed) {
        this.n = a.length;
        this.compress = new int[n];
        this.oneIndexed = oneIndexed;
        build(a);
    }
    private void build(final long[] a) {
        this.sorted = LongArrayGenerator.unique(a);
        Arrays.sort(this.sorted);
        final int size = this.sorted.length;
        for (int i = 0; i < n; i++) {
            int l = 0, r = size;
            while (r - l > 1) {
                final int m = l + (r - l) / 2;
                if (this.sorted[m] <= a[i]) {
                    l = m;
                } else {
                    r = m;
                }
            }
            this.compress[i] = this.oneIndexed ? l + 1 : l;
        }
    }
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



/**
 * @author https://atcoder.jp/users/suisen
 */
class IntSegmentTree {
    final int[] tree;
    final IntMonoid monoid;
    final int treeSize;
    final int leafs;
    final int leafBias;
    final int height;
    public IntSegmentTree(final int[] t, final IntMonoid monoid) {this(t, t.length, monoid);}
    public IntSegmentTree(final int n, final IntMonoid monoid) {this(new int[0], n, monoid);}
    IntSegmentTree(final int[] t, final int n, final IntMonoid monoid) {
        this.monoid = monoid;
        this.height = Ints.ceilExponent(n);
        this.leafs = 1 << this.height;
        this.leafBias = this.leafs - 1;
        this.treeSize = 2 * this.leafs - 1;
        this.tree = new int[this.treeSize];
        for (int i = 0; i < leafs; i++) tree[leafBias + i] = i < t.length ? t[i] : monoid.e;
        for (int i = leafBias - 1; i >= 0; i--) tree[i] = monoid.apply(tree[2 * i + 1], tree[2 * i + 2]);
    }
    public void apply(int i, final IntUnaryOperator fun) {
        i += this.leafBias;
        tree[i] = fun.applyAsInt(tree[i]);
        while (i > 0) {
            i = (i - 1) >> 1;
            tree[i] = monoid.apply(tree[2 * i + 1], tree[2 * i + 2]);
        }
    }
    public void update(final int i, final int v) {apply(i, x -> v);}
    public int query(final int l, final int r) {return query(l, r, 0, 0, leafs);}
    int query(final int ql, final int qr, final int k, final int tl, final int tr) {
        if (Range.crosses(ql, qr, tl, tr)) {
            if (Range.contains(ql, qr, tl, tr)) {
                return tree[k];
            } else {
                final int lv = query(ql, qr, 2 * k + 1, tl, (tl + tr) >> 1);
                final int rv = query(ql, qr, 2 * k + 2, (tl + tr) >> 1, tr);
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



class IntField extends IntRing {
    public IntField(final IntAbelianGroup addition, final IntMonoid multiplication) {
        super(addition, multiplication);
        multiplication.requireProperties(EnumSet.of(Property.COMMUTATIVE));
    }
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
