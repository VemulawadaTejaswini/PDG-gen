import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
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
        ModuloArithmetic ma = new ModuloArithmetic(Const.MOD99);
        int n = In.ni();
        int m = In.ni();
        int k = In.ni();
        long[] fac = ma.factorialArray(n);
        long[] pow = ma.powerArray(m - 1, n);
        long a = 0;
        for (int i = 0; i <= k; i++) {
            a += ma.prod(ma.comb(n - 1, i, fac), pow[n - i - 1]);
        }
        a = ma.mod(a);
        out.append(ma.mul(a, m));
    }
}



class LongSemiRing extends LongExtendedMagma {
    public LongSemiRing(final LongMonoid addition, final LongMonoid multiplication) {
        super(addition, multiplication, TypicalPropertySets.SEMI_RING);
        addition.requireProperties(EnumSet.of(Property.COMMUTATIVE));
    }

    public static LongSemiRing of(LongExtendedMagma m) {
        if (!m.additiveProps.containsAll(TypicalPropertySets.COMMUTATIVE_MONOID.getProperties())) {
            throw new ClassCastException("addition does not meet the conditions of commutative monoid.");
        }
        LongCommutativeMonoid add = new LongCommutativeMonoid(m::add, m.e0);
        LongMonoid mul = new LongMonoid(m::mul, m.e1);
        return new LongSemiRing(add, mul);
    }
}



class LongMonoid extends LongMagma implements LongUnital {
    public final long e;
    public LongMonoid(final LongBinaryOperator operator, final long e) {
        super(operator, TypicalPropertySets.MONOID);
        this.e = e;
    }

    @Override
    public long identityElement() {
        return e;
    }

    public static <M extends LongMagma & LongUnital> LongMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.MONOID);
        return new LongMonoid(m.operator, m.identityElement());
    }
}



/**
 * @author https://atcoder.jp/users/suisen
 */
final class ModuloArithmetic extends LongField {
    public final long MOD;
    public final LongAbelianGroup addition;
    public final LongAbelianGroup multiplication;

    /**
     * support modulo p arithmetic
     * 
     * @param p p s.t. p is a prime number.
     */
    public ModuloArithmetic(final long p) {
        super(
            new LongAbelianGroup((u, v) -> add(u, v, p), 0l, x -> -x),
            new LongAbelianGroup((u, v) -> mul(u, v, p), 1l, x -> inv(x, p)));
        this.addition = new LongAbelianGroup((u, v) -> add(u, v, p), 0l, x -> -x);
        this.multiplication = new LongAbelianGroup((u, v) -> mul(u, v, p), 1l, x -> inv(x, p));
        this.MOD = p;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a + b mod p.
     * 
     * @param a
     * @param b
     * @param mod
     * @return x s.t. 0 <= x < MOD /\ x = a + b mod p.
     */
    private static long add(final long a, final long b, final long mod) {
        final long s = a + b;
        return s < 0 ? s + mod : s >= mod ? s - mod : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a * b mod p.
     * 
     * @param a
     * @param b
     * @param mod
     * @return x s.t. 0 <= x < MOD /\ x = a * b mod p.
     */
    private static long mul(final long a, final long b, final long mod) {
        final long ret = (a * b) % mod;
        return ret < 0 ? ret + mod : ret;
    }

    /**
     * Calculate the value b s.t. a*b mod MOD = 1.
     * 
     * @param a
     * @return inverse of a
     */
    private static long inv(long a, final long mod) {
        long b = mod;
        long u = 1, v = 0;
        while (b >= 1) {
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a;
            a = b;
            b = tmp1;
            u -= t * v;
            final long tmp2 = u;
            u = v;
            v = tmp2;
        }
        u %= mod;
        return u < 0 ? u + mod : u;
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
    public long sum(final long... a) {
        long ret = 0;
        for (final long c : a)
            ret += c;
        return mod(ret);
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a - b mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ x = a - b mod p.
     */
    public long sub(final long a, final long b) {
        final long s = a - b;
        return s < 0 ? s + MOD : s >= MOD ? s - MOD : s;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     * 
     * @param a
     * @return x s.t. 0 <= x < MOD /\ x = a_1 * 1_2 * ... * a_k mod p.
     */
    public long prod(final long... a) {
        long ret = 1;
        for (final long c : a) {
            ret = (ret * c) % MOD;
        }
        return ret < 0 ? ret + MOD : ret;
    }

    /**
     * Calculate x s.t. 0 <= x < MOD /\ b * x = a mod p.
     * 
     * @param a
     * @param b
     * @return x s.t. 0 <= x < MOD /\ b * x = a mod p.
     */
    public long div(final long a, final long b) {
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
            final long t = a / b;
            a -= t * b;
            final long tmp1 = a;
            a = b;
            b = tmp1;
            u -= t * v;
            final long tmp2 = u;
            u = v;
            v = tmp2;
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
    public long perm(final long n, final long r) {
        if (n < r) {
            return 0;
        }
        long ret = 1;
        for (long i = n; i > n - r; i--) {
            ret = mul(ret, i);
        }
        return ret;
    }

    public long perm(final int n, final int r, final long[] fact) {
        return div(fact[n], fact[n - r]);
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
        r = Math.min(r, n - r);
        n %= MOD;
        long res = 1;
        for (long d = 1; d <= r; d++) {
            res = div(mul(res, n--), d);
        }
        return res;
    }

    public long comb(final int n, final int r, final long[] fact) {
        return div(fact[n], mul(fact[n - r], fact[r]));
    }

    /**
     * Calculate a^b (mod {@code MOD}) in O(log b) time.
     * 
     * @param a base
     * @param b index
     * @return a^b (mod {@code MOD})
     */
    public long pow(final long a, final long b) {
        if (b == 0 || a == 1) {
            return 1;
        }
        final long half = pow(a, b >> 1);
        if ((b & 1) == 0) {
            return mul(half, half);
        } else {
            return prod(half, half, a);
        }
    }

    /**
     * calculate x := log_a b mod MOD. (i.e. a^x = b mod MOD). if not exists, return
     * negative value.
     * 
     * @param a base
     * @param b exp
     * @return min of x s.t. a^x = b (mod MOD). if not exists, negative value.
     */
    public long log(final long a, final long b) {
        return log(a, b, getMapForLogarithm(a));
    }

    public long log(long a, long b, final HashMap<Long, Long> aMap) {
        a %= MOD;
        b %= MOD;
        final long sq = (long) (Math.sqrt(MOD) + 2);
        final long inv = pow(inv(a), sq);
        for (long p = 0, r = b; p <= sq; p++) {
            if (aMap.containsKey(r)) {
                final long res = p * sq + aMap.get(r);
                if (res > 0) {
                    return res;
                }
            }
            r = mul(r, inv);
        }
        return -1;
    }

    public HashMap<Long, Long> getMapForLogarithm(long a) {
        a %= MOD;
        final long sq = (long) (Math.sqrt(MOD) + 2);
        final HashMap<Long, Long> map = new HashMap<>();
        for (long i = 0, ar = 1; i < sq; i++) {
            map.putIfAbsent(ar, i);
            ar = mul(ar, a);
        }
        return map;
    }

    /**
     * build factorial array from 0 to n (closed)
     * 
     * @param n
     */
    public long[] factorialArray(final int n) {
        final long[] fact = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                fact[i] = 1;
            } else {
                fact[i] = mul(fact[i - 1], i);
            }
        }
        return fact;
    }

    public long[] inversiveFactrialArray(final long[] fact) {
        int n = fact.length - 1;
        final long[] ifact = new long[n + 1];
        ifact[n] = inv(fact[n]);
        for (int i = n - 1; i >= 0; i--) {
            ifact[i] = mul(ifact[i + 1], i + 1);
        }
        return ifact;
    }

    /**
     * build power array based on a from 0 to n (closed)
     * 
     * @param a base of power
     * @param n
     */
    public long[] powerArray(final long a, final int n) {
        if (a == 2) {
            return powerArray(n);
        } else {
            final long[] pow = new long[n + 1];
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    pow[i] = 1;
                } else {
                    pow[i] = mul(pow[i - 1], a);
                }
            }
            return pow;
        }
    }

    /**
     * build power array based on 2 from 0 to n (closed)
     * 
     * @param n
     */
    public long[] powerArray(final int n) {
        final long[] pow = new long[n + 1];
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
        return pow;
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

    public final long apply(final long left, final long right) {
        return operator.applyAsLong(left, right);
    }
}



abstract class LongExtendedMagma extends PropertyHolder {
    public final long e0;
    public final long e1;
    private final LongBinaryOperator addition;
    private final LongBinaryOperator multiplication;
    protected final EnumSet<Property> additiveProps;
    protected final EnumSet<Property> multiplicativeProps;

    public LongExtendedMagma(LongMonoid addition, LongMonoid multiplication, EnumSet<Property> properties) {
        super(properties);
        this.addition = addition.operator;
        this.multiplication = multiplication.operator;
        this.e0 = addition.identityElement();
        this.e1 = multiplication.identityElement();
        this.additiveProps = addition.getProperties();
        this.multiplicativeProps = multiplication.getProperties();
    }

    public LongExtendedMagma(LongMonoid addition, LongMonoid multiplication, TypicalPropertySets properties) {
        this(addition, multiplication, properties.getProperties());
    }

    public final long add(long t, long u) {
        return addition.applyAsLong(t, u);
    }

    public final long mul(long t, long u) {
        return multiplication.applyAsLong(t, u);
    }
}



class LongField extends LongRing {
    public LongField(final LongAbelianGroup addition, final LongMonoid multiplication) {
        super(addition, multiplication);
        multiplication.requireProperties(EnumSet.of(Property.COMMUTATIVE));
    }
}



class LongCommutativeMonoid extends LongMonoid {
    public LongCommutativeMonoid(final LongBinaryOperator operator, final long e) {
        super(operator, e);
        addProperties(Property.COMMUTATIVE);
    }

    public static <M extends LongMagma & LongUnital> LongCommutativeMonoid of(M m) {
        m.requireProperties(TypicalPropertySets.COMMUTATIVE_MONOID.getProperties());
        return new LongCommutativeMonoid(m.operator, m.identityElement());
    }
}


class LongRing extends LongSemiRing {
    private final LongUnaryOperator additiveInverse;

    public LongRing(final LongAbelianGroup addition, final LongMonoid multiplication) {
        super(addition, multiplication);
        this.additiveInverse = addition::inverse;
    }

    public final long additiveInverse(final long t) {
        return additiveInverse.applyAsLong(t);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
final class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(final IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(final int n) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni(final int n, final IntUnaryOperator f) {
        final int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(final int n, final int m) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(final int n, final int m, final IntUnaryOperator f) {
        final int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(final LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(final int n) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(final int n, final LongUnaryOperator f) {
        final long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(final int n, final int m) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(final int n, final int m, final LongUnaryOperator f) {
        final long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(final int n, final int m) {
        final char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(final DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(final int n) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(final int n, final DoubleUnaryOperator f) {
        final double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(final int n, final int m) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(final int n, final int m, final DoubleUnaryOperator f) {
        final double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(final int n) {
        final String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(final int h, final int w, final char trueCharacter) {
        final boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
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
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (final IOException e) {
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

    private static boolean isPrintableChar(final int c) {
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
        final StringBuilder sb = new StringBuilder();
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
        final long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

enum Property {
    ANNIHILATED_BY_ZERO,
    ASSOCIATIVE,
    CANCELLATIVE,
    COMMUTATIVE,
    DISTRIBUTIVE,
    IDEMPOTENT;
}


enum TypicalPropertySets {
    ABELIAN_GROUP(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.CANCELLATIVE,
        Property.COMMUTATIVE
    )),
    BOUNDED_SEMI_LATTICE(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.COMMUTATIVE,
        Property.IDEMPOTENT
    )),
    COMMUTATIVE_MONOID(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.COMMUTATIVE
    )),
    GROUP(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.CANCELLATIVE
    )),
    MONOID(EnumSet.of(
        Property.ASSOCIATIVE
    )),
    SEMI_GROUP(EnumSet.of(
        Property.ASSOCIATIVE
    )),
    SEMI_LATTICE(EnumSet.of(
        Property.ASSOCIATIVE,
        Property.IDEMPOTENT,
        Property.COMMUTATIVE
    )),
    SEMI_RING(EnumSet.of(
        Property.DISTRIBUTIVE,
        Property.ANNIHILATED_BY_ZERO
    )),
    RING(EnumSet.of(
        Property.DISTRIBUTIVE,
        Property.ANNIHILATED_BY_ZERO
    ));

    private final EnumSet<Property> properties;

    private TypicalPropertySets(EnumSet<Property> properties) {
        this.properties = properties;
    }

    public final EnumSet<Property> getProperties() {
        return properties.clone();
    }
}

interface LongInversible {
    public long inverse(long t);
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



class LongAbelianGroup extends LongGroup {
    public LongAbelianGroup(final LongBinaryOperator operator, final long e, final LongUnaryOperator inverse) {
        super(operator, e, inverse);
        addProperties(Property.COMMUTATIVE);
    }
}

interface LongUnital {
    public long identityElement();
}



class LongGroup extends LongMonoid implements LongInversible {
    private final LongUnaryOperator inverse;

    public LongGroup(final LongBinaryOperator operator, final long e, final LongUnaryOperator inverse) {
        super(operator, e);
        addProperties(Property.CANCELLATIVE);
        this.inverse = inverse;
    }

    @Override
    public long inverse(final long t) {
        return inverse.applyAsLong(t);
    }
}


abstract class PropertyHolder {
    private final EnumSet<Property> properties;

    public PropertyHolder(final EnumSet<Property> properties) {
        this.properties = properties;
    }

    public PropertyHolder(final TypicalPropertySets typicalSet) {
        this(typicalSet.getProperties());
    }

    public final EnumSet<Property> getProperties() {
        return properties;
    }

    public final void addProperties(final Property... props) {
        for (Property prop : props) {
            properties.add(prop);
        }
    }

    public final void addProperties(final EnumSet<Property> props) {
        for (Property prop : props) {
            properties.add(prop);
        }
    }

    public final void addProperties(final TypicalPropertySets props) {
        addProperties(props.getProperties());
    }

    public final boolean hasProperties(final Property... props) {
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasProperties(final EnumSet<Property> props) {
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasProperties(final TypicalPropertySets props) {
        return hasProperties(props.getProperties());
    }

    public final void requireProperties(final EnumSet<Property> props, final Property... ps) {
        final ArrayList<Property> unmet = new ArrayList<>();
        for (final Property prop : props) {
            if (!properties.contains(prop)) {
                unmet.add(prop);
            }
        }
        for (final Property prop : ps) {
            if (!properties.contains(prop)) {
                unmet.add(prop);
            }
        }
        if (unmet.size() > 0) {
            throw new UnsatisfiedRequiredPropertiesException(unmet);
        }
    }

    public final void requireProperties(final TypicalPropertySets props, final Property... ps) {
        requireProperties(props.getProperties(), ps);
    }

    private static final class UnsatisfiedRequiredPropertiesException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        private UnsatisfiedRequiredPropertiesException(final Collection<Property> props) {
            for (final Property prop : props) {
                System.err.println(prop.name() + "should be satisfied.");
            }
        }
    }
}
