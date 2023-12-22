import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.print(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        int q = In.ni();
        L lst = new L(n, IntAlgebraicStructures.ADD, IntAlgebraicStructures.RW, (u, v) -> v, (v, l) -> v * l);
        while (q --> 0) {
            int k = In.ni();
            int s = In.ni();
            int t = In.ni() + 1;
            if (k == 0) {
                int x = In.ni();
                lst.apply(s, t, x);
            } else {
                out.append(lst.query(s, t)).append('\n');
            }
        }
    }
}

class L {
    private final int[] dat, laz;
    private final int n;
    private final IntMonoid monoid, lazMonoid;
    private final int e0, e1;
    private final IntBinaryOperator op;
    private final IntBinaryOperator lazMerger;
    public L(int n, IntMonoid monoid, IntMonoid lazMonoid, IntBinaryOperator op, IntBinaryOperator lazMerger) {
        this.monoid = monoid;
        this.lazMonoid = lazMonoid;
        this.e0 = monoid.e;
        this.e1 = lazMonoid.e;
        this.op = op;
        this.lazMerger = lazMerger;
        int nn = 1; while (nn < n) nn <<= 1;
        this.n = nn;
        this.dat = new int[this.n << 1];
        this.laz = new int[this.n << 1];
        Arrays.fill(dat, e0);
        Arrays.fill(laz, e1);
    }
    public void build(int[] a) {
        System.arraycopy(a, 0, dat, n, a.length);
        for (int i = n - 1; i > 0; i--) dat[i] = monoid.apply(dat[(i << 1) | 0], dat[(i << 1) | 1]);
    }
    private final int[] st = new int[64];
    private int tl = 0;
    public void apply(int l, int r, int v) {
        int m = enumerateUpdatingSegments(l, r);
        propagate();
        l += n; r += n;
        int w = 1;
        for (; l < r; l >>= 1, r >>= 1, w <<= 1) {
            int merged = lazMerger.applyAsInt(v, w);
            if ((l & 1) != 0) {
                dat[l] = op.applyAsInt(dat[l], merged);
                laz[l] = v;
                l++;
            }
            if ((r & 1) != 0) {
                r--;
                dat[r] = op.applyAsInt(dat[r], merged);
                laz[r] = v;
            }
        }
        for (int si = 0; si < m; si++) {
            int k = st[si];
            dat[k] = monoid.apply(dat[(k << 1) | 0], dat[(k << 1) | 1]);
        }
    }
    public int query(int l, int r) {
        enumerateUpdatingSegments(l, r);
        propagate();
        l += n; r += n;
        int resL = e0, resR = e0;
        for (; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) != 0) resL = monoid.apply(resL, dat[l++]);
            if ((r & 1) != 0) resR = monoid.apply(dat[--r], resR);
        }
        return monoid.apply(resL, resR);
    }
    int enumerateUpdatingSegments(int l, int r) {
        if (l >= r) return 0;
        int kl = l + n, kr = r + n;
        int i = (kl / (kl & -kl)) >> 1, j = (kr / (kr & -kr)) >> 1;
        for (; kl < kr; kl >>= 1, kr >>= 1) {
            if (kr <= j) st[tl++] = kr;
            if (kl <= i) st[tl++] = kl;
        }
        for (; kl > 0; kl >>= 1) st[tl++] = kl;
        return tl;
    }
    void propagate() {
        while (tl > 0) {
            int k = st[--tl];
            int lk = laz[k];
            if (lk == e1) continue;
            laz[(k << 1) | 0] = lazMonoid.apply(laz[(k << 1) | 0], lk);
            laz[(k << 1) | 1] = lazMonoid.apply(laz[(k << 1) | 1], lk);
            int w = (n / Integer.highestOneBit(k)) >> 1;
            int merged = lazMerger.applyAsInt(lk, w);
            dat[(k << 1) | 0] = op.applyAsInt(dat[(k << 1) | 0], merged);
            dat[(k << 1) | 1] = op.applyAsInt(dat[(k << 1) | 1], merged);
            laz[k] = e1;
        }
    }
    public void reset() {
        Arrays.fill(dat, e0);
        Arrays.fill(laz, e1);
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

interface IntInversible {int inverse(int t);}



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



class IntField extends IntRing {
    public IntField(final IntAbelianGroup addition, final IntMonoid multiplication) {
        super(addition, multiplication);
        multiplication.requireProperties(EnumSet.of(Property.COMMUTATIVE));
    }
}

interface IntUnital {int identityElement();}


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

