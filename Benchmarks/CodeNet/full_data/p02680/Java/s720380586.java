import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.TreeSet;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) throws Exception {
        Field f = System.out.getClass().getDeclaredField("autoFlush");
        f.setAccessible(true);
        f.set(System.out, false);
        execute(System.in, System.out);
    }

    public static void execute(InputStream in, OutputStream out) {
        ExtendedScanner s = new ExtendedScanner(in);
        Out o = new Out(out);
        solve(s, o);
        o.flush();
        o.close();
    }

    public static void solve(ExtendedScanner sc, Out out) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        XL[] xLines = new XL[m];
        YL[] yLines = new YL[n];
        long[] allX = new long[2 * n + m + 1];
        long[] allY = new long[n + 2 * m + 1];
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < n; i++) {
            int xl = sc.nextInt();
            int xr = sc.nextInt();
            int y = sc.nextInt();
            yLines[i] = new YL(xl, xr, y);
            allX[idx1++] = xl;
            allX[idx1++] = xr;
            allY[idx2++] = y;
        }
        for (int j = 0; j < m; j++) {
            int x = sc.nextInt();
            int yl = sc.nextInt();
            int yr = sc.nextInt();
            xLines[j] = new XL(yl, yr, x);
            allY[idx2++] = yl;
            allY[idx2++] = yr;
            allX[idx1++] = x;
        }
        Compress cmpX = new Compress(allX, false);
        Compress cmpY = new Compress(allY, false);
        allX = null;
        allY = null;
        HashMap<Long, Integer> mapX = cmpX.toIndexMap();
        HashMap<Long, Integer> mapY = cmpY.toIndexMap();
        int c = cmpX.m;
        int r = cmpY.m;
        int w = 2 * c + 1;
        int h = 2 * r + 1;
        BitSet[] closed = new BitSet[h];
        for (int i = 0; i < h; i++) closed[i] = new BitSet(w);
        for (int i = 0; i < n; i++) {
            int idxXl = mapX.get(yLines[i].xl);
            int idxXr = mapX.get(yLines[i].xr);
            int idxY = mapY.get(yLines[i].y);
            int gyi = 2 * idxY + 1;
            int gxli = 2 * idxXl + 1;
            int gxri = 2 * idxXr + 1;
            for (int j = gxli; j <= gxri; j++) {
                closed[gyi].set(j);
            }
            // System.out.println(GridUtil.toString(closed));
        }
        for (int j = 0; j < m; j++) {
            int idxYl = mapY.get(xLines[j].yl);
            int idxYr = mapY.get(xLines[j].yr);
            int idxX = mapX.get(xLines[j].x);
            int gxi = 2 * idxX + 1;
            int gyli = 2 * idxYl + 1;
            int gyri = 2 * idxYr + 1;
            for (int i = gyli; i <= gyri; i++) {
                closed[i].set(gxi);
            }
            // System.out.println(GridUtil.toString(closed));
        }
        long ans = 0;
        int sy = 2 * mapY.get(0l) + 1;
        int sx = 2 * mapX.get(0l) + 1;
        boolean[][] visited = new boolean[h][w];
        visited[sy][sx] = true;
        LongDeque dq = new LongDeque(h * w);
        dq.addLast(MathUtil.int2ToLong(sy, sx));
        while (dq.size() > 0) {
            long u = dq.removeFirst();
            int uy = MathUtil.upper32(u);
            int ux = MathUtil.lower32(u);
            for (int d = 0; d < 4; d++) {
                int vy = uy + GridUtil.dy4[d];
                int vx = ux + GridUtil.dx4[d];
                if (vy == 0 || vy == h - 1 || vx == 0 || vx == w - 1) {
                    out.writeln("INF");
                    return;
                }
                if (!closed[vy].get(vx) && !visited[vy][vx]) {
                    if (((vy | vx) & 1) == 0) {
                        int idxYl = (vy - 1) >> 1;
                        int idxYr = idxYl + 1;
                        int idxXl = (vx - 1) >> 1;
                        int idxXr = idxXl + 1;
                        long yw = cmpY.indexToLong(idxYr) - cmpY.indexToLong(idxYl);
                        long xw = cmpX.indexToLong(idxXr) - cmpX.indexToLong(idxXl);
                        ans += xw * yw;
                    }
                    long v = MathUtil.int2ToLong(vy, vx);
                    dq.addLast(v);
                    visited[vy][vx] = true;
                }
            }
        }
        out.writeln(ans);
        return;
    }

    static class XL {
        final long yl, yr, x;
        XL(long yl, long yr, long x) {
            this.yl = yl;
            this.yr = yr;
            this.x = x;
        }
    }

    static class YL {
        final long xl, xr, y;
        YL(long xl, long xr, long y) {
            this.xl = xl;
            this.xr = xr;
            this.y = y;
        }
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class IntLongPair {
    public int fst;
    public long snd;
    public IntLongPair(final int fst, final long snd) {this.fst = fst; this.snd = snd;}
    @Override @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IntLongPair)) return false;
        final IntLongPair p = (IntLongPair) o;
        return this.fst == p.fst && this.snd == p.snd;
    }
    @Override
    public int hashCode() {return Objects.hash(this.fst, this.snd);}
    @Override
    public String toString() {return "(" + this.fst + ", " + this.snd + ")";}
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
    public static void reverse(final long[] a, int begin, int end) {
        while (end - begin > 1) swap(a, begin++, --end);
    }
    public static void reverse(final long[] a) {reverse(a, 0, a.length);}
    public static void sortDescending(final long[] a) {Arrays.sort(a); reverse(a);}
    public static long fold(final long[] a, final LongBinaryOperator op) {
        long ret = a[0]; for (int i = 1; i < a.length; i++) ret = op.applyAsLong(ret, a[i]);
        return ret;
    }
    public static long sum(final long[] a) {return fold(a, Long::sum);}
    public static long max(final long[] a) {return fold(a, Long::max);}
    public static long min(final long[] a) {return fold(a, Long::min);}
    public static IntLongPair maxWithIndex(final long[] a) {
        long max = max(a); return new IntLongPair(find(a, max), max);
    }
    public static IntLongPair minWithIndex(final long[] a) {
        long min = min(a); return new IntLongPair(find(a, min), min);
    }
    public static int find(final long[] a, final long v) {
        for (int i = 0; i < a.length; i++) if (a[i] == v) return i;
        return -1;
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
    public static int lowerBound(long[] sorted, long key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] < key) l = m;
            else r = m;
        }
        return r;
    }
    public static int upperBound(long[] sorted, long key) {
        int n = sorted.length;
        int l = -1, r = n;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (sorted[m] <= key) l = m;
            else r = m;
        }
        return r;
    }
    public static int countRange(long[] sorted, long fromKey, long toKey) {
        return lowerBound(sorted, toKey) - lowerBound(sorted, fromKey);
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


/**
 * @author https://atcoder.jp/users/suisen
 */
final class ExtendedScanner extends BasicScanner {
    public ExtendedScanner(InputStream in) {super(in);}
    public int[] ints(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> nextInt());
        return a;
    }
    public int[] ints(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, $ -> f.applyAsInt(nextInt()));
        return a;
    }
    public int[][] ints(final int n, final int m) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m));
        return a;
    }
    public int[][] ints(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][];
        Arrays.setAll(a, $ -> ints(m, f));
        return a;
    }
    public long[] longs(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> nextLong());
        return a;
    }
    public long[] longs(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, $ -> f.applyAsLong(nextLong()));
        return a;
    }
    public long[][] longs(final int n, final int m) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m));
        return a;
    }
    public long[][] longs(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][];
        Arrays.setAll(a, $ -> longs(m, f));
        return a;
    }
    public char[][] charArrays(final int n) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars());
        return c;
    }
    public char[][] charArrays(final int n, final int m) {
        final char[][] c = new char[n][];
        Arrays.setAll(c, $ -> nextChars(m));
        return c;
    }
    public double[] doubles(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, $ -> nextDouble());
        return a;
    }
    public double[][] doubles(final int n, final int m) {
        final double[][] a = new double[n][];
        Arrays.setAll(a, $ -> doubles(m));
        return a;
    }
    public String[] strings(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next());
        return s;
    }
    public String[] strings(final int n, final int m) {
        final String[] s = new String[n];
        Arrays.setAll(s, $ -> next(m));
        return s;
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
     * Caluculate the GCD of (a, b)
     * @param a first value
     * @param b second value
     * @return GCD(a, b)
     */
    public static long gcd(long a, long b) {
        return positiveGCD(Math.abs(a), Math.abs(b));
    }
    private static long positiveGCD(long a, long b) {
        if (a < b) return positiveGCD(b, a);
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

    public static BigInteger chineseRemainderTheorem(long[] mod, long[] remainder) {
        int n = mod.length;
        long[] t = new long[n];
        t[0] = remainder[0];
        for (int i = 1; i < n; i++) {
            long c = remainder[i];
            long m = mod[i];
            for (int j = 0; j < i; j++) {
                c -= t[j];
                c *= inv(mod[j], m);
                c %= m;
                if (c < 0) c += m;
            }
            t[i] = c;
        }
        BigInteger res = BigInteger.valueOf(t[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            res.multiply(BigInteger.valueOf(mod[i])).add(BigInteger.valueOf(t[i]));
        }
        return res;
    }

    public static long inv(long a, final long mod) {
        long b = mod;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            final long tmp2 = u; u = v; v = tmp2;
        }
        u %= mod;
        return u < 0 ? u + mod : u;
    }
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
    public long removeLast() {return a[--tail];}
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
    public void clear() {tail = 0;}
    public void reverse(final int begin, final int end) {LongArrays.reverse(a, begin, end);}
    public void reverse() {LongArrays.reverse(a, 0, tail);}
    public long[] toArray() {
        final long[] ret = new long[tail];
        System.arraycopy(a, 0, ret, 0, tail);
        return ret;
    }
    public void sort() {Arrays.sort(a, 0, tail);}
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


/**
 * @author https://atcoder.jp/users/suisen
 */
class BasicScanner {
    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public BasicScanner(InputStream in) {this.in = in;}
    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {buflen = in.read(buf);}
        catch (final IOException e) {e.printStackTrace();}
        return buflen > 0;
    }
    private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
    public boolean hasNext() {
        while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
        return hasNextByte();
    }
    private StringBuilder nextSequence() {
        if (!hasNext()) throw new NoSuchElementException();
        final StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
        return sb;
    }
    public char nextChar() {
        return (char) readByte();
    }
    public String next() {
        return nextSequence().toString();
    }
    public String next(int len) {
        return new String(nextChars(len));
    }
    public char[] nextChars() {
        final StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
        if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {minus = true; b = readByte();}
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') n = n * 10 + b - '0';
            else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {return Math.toIntExact(nextLong());}
    public double nextDouble() {return Double.parseDouble(next());}
}


class GridUtil {
    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx4 = {1, 0, -1, 0};
    public static final int[] dy4 = {0, 1, 0, -1};
    private GridUtil() {}
    public static boolean[][] build(char[][] g, char passable) {
        final int H = g   .length;
        final int W = g[0].length;
        final boolean[][] G = new boolean[H][W];
        for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) {
            G[i][j] = g[i][j] == passable;
        }
        return G;
    }
    public static boolean in(int r, int c, int h, int w) {
        return 0 <= r && r < h && 0 <= c && c < w;
    }
    public static boolean out(int r, int c, int h, int w) {
        return !in(r, c, h, w);
    }
    public static int[][] distance4(boolean[][] g, int sr, int sc) {
        final int H = g   .length;
        final int W = g[0].length;
        final int[][] d = new int[H][W];
        for (int i = 0; i < H; i++) Arrays.fill(d[i], -1);
        d[sr][sc] = 0;
        final int[] q = new int[H * W];
        int k = 0;
        q[k++] = sr * W + sc;
        while (k > 0) {
            int rc = q[--k];
            int r = rc / W, c = rc % W;
            for (int dr = 0; dr < 4; dr++) {
                int nr = r + dy4[dr], nc = c + dx4[dr];
                if (out(nr, nc, H, W) || d[nr][nc] >= 0) continue;
                d[nr][nc] = d[r][c] + 1;
                q[k++] = nr * W + nc;
            }
        }
        return d;
    }
    public static int[][] distance8(boolean[][] g, int sr, int sc) {
        final int H = g   .length;
        final int W = g[0].length;
        final int[][] d = new int[H][W];
        for (int i = 0; i < H; i++) Arrays.fill(d[i], -1);
        d[sr][sc] = 0;
        final int[] q = new int[H * W];
        int h = 0, t = 0;
        q[t++] = sr * W + sc;
        while (t > h) {
            int rc = q[h++];
            int r = rc / W, c = rc % W;
            for (int dr = 0; dr < 8; dr++) {
                int nr = r + dy8[dr], nc = c + dx8[dr];
                if (out(nr, nc, H, W) || d[nr][nc] >= 0) continue;
                d[nr][nc] = d[r][c] + 1;
                q[t++] = nr * W + nc;
            }
        }
        return d;
    }
    public static String toString(boolean[][] g) {
        StringBuilder sb = new StringBuilder();
        for (boolean[] gi : g) {
            for (boolean b : gi) {
                sb.append(b ? '#' : '.');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class Out {
    private final OutputStream out;
    private byte[] buf = new byte[1024];
    private int ptr = 0;
    private static final int AUTO_FLUSH_THRETHOLD = 1 << 17;

    public Out(OutputStream out) {
        this.out = out;
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (IOException e) {e.printStackTrace();}
    }

    public void close() {
        try {out.close();} catch (IOException e) {e.printStackTrace();}
    }

    public Out writeln() {return write('\n');}
    public Out writeln(Object o) {return write(o).write('\n');}
    public Out writeln(String s) {return write(s).write('\n');}
    public Out writeln(char[] c) {return write(c).write('\n');}
    public Out writeln(char   c) {return write(c).write('\n');}
    public Out writeln(byte   b) {return write(b).write('\n');}
    public Out writeln(int    x) {return write(x).write('\n');}
    public Out writeln(long   x) {return write(x).write('\n');}
    public Out writeln(double d) {return write(d).write('\n');}

    public Out writeSpace() {return write(' ');}
    
    public Out write(Object o) {
        return write(o.toString());
    }

    public Out write(String s) {
        try {
            Field strValueField = s.getClass().getDeclaredField("value");
            strValueField.setAccessible(true);
            byte[] b = (byte[]) strValueField.get(s);
            int l = s.length();
            if (l > AUTO_FLUSH_THRETHOLD) {
                flush();
                int i = 0;
                while (i + AUTO_FLUSH_THRETHOLD < l) {
                    out.write(b, i, AUTO_FLUSH_THRETHOLD);
                    out.flush();
                    i += AUTO_FLUSH_THRETHOLD;
                }
                ensureCapacity(l - i);
                System.arraycopy(b, i, buf, 0, l - i);
                ptr = l - i;
            } else {
                ensureCapacity(ptr + l);
                System.arraycopy(b, 0, buf, ptr, l);
                ptr += l;
            }
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    public Out write(char[] c) {
        int l = c.length;
        if (l > AUTO_FLUSH_THRETHOLD) {
            flush();
            ensureCapacity(AUTO_FLUSH_THRETHOLD);
            int i = 0;
            while (i + AUTO_FLUSH_THRETHOLD < l) {
                for (int j = 0; j < AUTO_FLUSH_THRETHOLD; j++) {
                    buf[ptr++] = (byte) c[i + j];
                }
                flush();
                i += AUTO_FLUSH_THRETHOLD;
            }
            for (; i < l; i++) {
                buf[ptr++] = (byte) c[i];
            }
        } else {
            ensureCapacity(ptr + l);
            for (char ch : c) buf[ptr++] = (byte) ch;
        }
        return this;
    }

    public Out write(char c) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = (byte) c;
        return this;
    }

    public Out write(byte b) {
        ensureCapacity(ptr + 1);
        buf[ptr++] = b;
        return this;
    }

    public Out write(int x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(long x) {
        if (x == 0) {
            ensureCapacity(ptr + 1);
            buf[ptr++] = '0';
            return this;
        }
        int d = stringSize(x);
        ensureCapacity(ptr + d);
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr + d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        ptr += d;
        return this;
    }

    public Out write(double d) {
        return write(Double.toString(d));
    }

    private void ensureCapacity(int cap) {
        if (cap > AUTO_FLUSH_THRETHOLD) {
            flush();
        }
        if (cap >= buf.length) {
            int newLength = buf.length;
            while (newLength < cap) newLength <<= 1;
            byte[] newBuf = new byte[newLength];
            System.arraycopy(buf, 0, newBuf, 0, buf.length);
            buf = newBuf;
        }
    }
    private static int stringSize(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
    private static int stringSize(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }
}

final class Infty {
    public static final long   LONG   = 1l << 59;
    public static final int    INT    = 1  << 30;
    public static final double DOUBLE = 1e150;
    private Infty(){}
}



/**
 * @author https://atcoder.jp/users/suisen
 * 
 * (NON-DESTRUCTIVE) methods that returns long array.
 */
final class LongArrayFactory {
    private LongArrayFactory() {}
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
 */
final class Compress {
    public int n;
    public int m;
    public int[] compress;
    public long[] sorted;
    public boolean oneIndexed;
    public Compress(final long[] a, final boolean oneIndexed) {
        this.n = a.length;
        this.compress = new int[n];
        this.oneIndexed = oneIndexed;
        build(a);
        this.m = sorted.length;
    }
    private void build(final long[] a) {
        this.sorted = LongArrayFactory.unique(a);
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
    public HashMap<Long, Integer> toIndexMap() {
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) map.put(sorted[i], i);
        return map;
    }
    public long indexToLong(int i) {
        return sorted[i];
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 * 
 * Implementation of deque for primitive long type, using Ring Buffer.
 */
final class LongDeque implements Iterable<Long> {
    static final int DEFAULT_CAPACITY = 1 << 6;
    long[] buf;
    int len = 1;
    int mask;
    int head = 0;
    int tail = 0;
    public LongDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                String.format("Capacity %d is negative.", capacity)
            );
        }
        while (this.len < capacity) {
            this.len <<= 1;
        }
        this.mask = this.len - 1;
        this.buf = new long[len];
    }
    public LongDeque() {
        this(DEFAULT_CAPACITY);
    }
    public long getLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[(tail - 1) & mask];
    }
    public long getFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head];
    }
    public long get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(
                String.format("Index %d out of bounds for length %d.", index, size())
            );
        }
        return buf[(head + index) & mask];
    }
    public void addLast(long v) {
        if (size() == len) grow();
        buf[tail++ & mask] = v;
    }
    public void addFirst(long v) {
        if (size() == len) grow();
        buf[--head & mask] = v;
    }
    public long removeLast() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[--tail & mask];
    }
    public long removeFirst() {
        if (size() == 0) throw new NoSuchElementException();
        return buf[head++ & mask];
    }
    public OptionalLong pollLast() {
        if (size() == 0) return OptionalLong.empty();
        return OptionalLong.of(removeLast());
    }
    public OptionalLong pollFirst() {
        if (size() == 0) return OptionalLong.empty();
        return OptionalLong.of(removeFirst());
    }
    public int size() {
        return tail - head;
    }
    public boolean isEmpty() {
        return size() == 0;
    }
    public void clear() {
        head = tail = 0;
    }
    public long[] toArray() {
        long[] ret = new long[size()];
        PrimitiveIterator.OfLong it = iterator();
        Arrays.setAll(ret, i -> it.nextLong());
        return ret;
    }
    private void grow() {
        long[] newBuf = new long[len << 1];
        head &= mask;
        tail &= mask;
        int len1 = len - head;
        int len2 = head;
        System.arraycopy(buf, head, newBuf, 0, len1);
        System.arraycopy(buf, 0, newBuf, len1, len2);
        this.head = 0;
        this.tail = this.len;
        this.len <<= 1;
        this.mask = this.len - 1;
        this.buf = newBuf;
    }
    public PrimitiveIterator.OfLong iterator() {
        return new PrimitiveIterator.OfLong(){
            int it = head;
            public boolean hasNext() {return it < tail;}
            public long nextLong() {return buf[it++ & mask];}
        };
    }
    public PrimitiveIterator.OfLong descendingIterator() {
        return new PrimitiveIterator.OfLong(){
            int it = tail;
            public boolean hasNext() {return it > head;}
            public long nextLong() {return buf[--it & mask];}
        };
    }

    /***************************** DEBUG *********************************/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        PrimitiveIterator.OfLong it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) sb.append(',');
        }
        sb.append(']');
        return sb.toString();
    }
}
