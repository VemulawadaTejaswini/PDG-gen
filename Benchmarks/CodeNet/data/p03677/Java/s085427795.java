import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import static java.lang.Math.max;
import static java.util.Arrays.sort;
import static java.util.Objects.isNull;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int m = fsc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fsc.nextInt() - 1;
        }
        LazySegmentTree t = new LazySegmentTree(new long[m], Monoid.ADD, Monoid.ADD, Long::sum, (laz, l) -> laz * l);
        for (int i = 1; i < n; i++) {
            int to = a[i];
            int fr = a[i - 1];
            if (fr < to) {
                t.applyForSegment(fr + 2, to + 1, 1);
                t.applyForSegment(to + 1, to + 2, -(to - fr - 1));
            } else {
                t.applyForSegment(fr + 2, m, 1);
                t.applyForSegment(0, 1, m - fr - 1);
                t.applyForSegment(1, to + 1, 1);
                t.applyForSegment(to + 1, to + 2, -(to + m - fr - 1));
            }
        }
        long max = 0;
        for (int x = 0; x < m; x++) {
            max = max(max, t.query(0, x + 1));
        }
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                sum += a[i] - a[i - 1];
            } else {
                sum += a[i] + m - a[i - 1];
            }
        }
        System.out.println(sum - max);
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
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}



class Range{
    public static final int MAX = +Const.IINF;
    public static final int MIN = -Const.IINF;
    private static final int E_LEFT = MAX;
    private static final int E_RIGHT = MAX;
    private static final int W_LEFT = MIN;
    private static final int W_RIGHT = MAX;
    public static final Range EMPTY = new Range(E_LEFT, E_RIGHT);
    public static final Range WHOLE = new Range(W_LEFT, W_RIGHT);


    public int left;
    public int right;

    public Range(int left, int right){
        if(left >= right){
            this.left = E_LEFT;
            this.right = E_RIGHT;
        } else{
            this.left = left;
            this.right = right;
        }
    }
    public boolean crosses(Range r){
        return this.left < r.right && r.left < this.right;
    }
    public boolean contains(Range r){
        if(this.isEmpty()) return false;
        if(r.isEmpty()) return true;
        return this.left <= r.left && r.right <= this.right;
    }
    public Range leftHalf(){
        if(this.isEmpty()) return EMPTY;
        return new Range(left, (left + right) >> 1);
    }
    public Range rightHalf(){
        if(this.isEmpty()) return EMPTY;
        return new Range((left + right) >> 1, right);
    }
    public int length(){
        return right - left;
    }
    public Range intersection(Range r){
        if(!this.crosses(r)) return EMPTY;
        return new Range(Math.max(this.left, r.left), Math.min(this.right, r.right));
    }
    public ArrayList<Range> union(Range r){
        ArrayList<Range> union = new ArrayList<>();
        if(this.isEmpty()){
            union.add(r); 
        } else if(r.isEmpty()){
            union.add(this);
        } else if(this.crosses(r)){
            union.add(new Range(Math.min(this.left, r.left), Math.max(this.right, r.right)));
        } else {
            if(this.left < r.left){
                union.add(this);
                union.add(r);
            } else{
                union.add(r);
                union.add(this);
            }
        }
        return union;
    }
    public boolean isEmpty(){
        return this.equals(EMPTY);
    }
    public boolean nonEmpty(){
        return !this.isEmpty();
    }

    public static boolean crosses(Range r1, Range r2){
        return r1.crosses(r2);
    }
    public static Range leftHalf(Range r){
        return r.leftHalf();
    }
    public static Range rightHalf(Range r){
        return r.rightHalf();
    }
    public static int length(Range r){
        return r.length();
    }
    public static Range interSection(Range... rs){
        Range ret = WHOLE;
        for(Range r: rs) ret = ret.intersection(r);
        return ret;
    }
    public static ArrayList<Range> union(Range... rs){
        sort(rs, (u, v) -> Integer.compare(u.left, v.left));
        ArrayList<Range> union = new ArrayList<>();
        Range now = null;
        for(Range r: rs){
            if(r.isEmpty()) break;
            if(isNull(now)){
                now = r;
            } else{
                if(r.left <= now.right){
                    now.right = r.right;
                } else{
                    union.add(now);
                    now = r;
                }
            }
        }
        if(!isNull(now) && !now.equals(EMPTY)) union.add(now);
        if(union.isEmpty()) union.add(EMPTY);
        return union;
    }
    public static boolean isEmpty(Range r){
        return r.isEmpty();
    }
    public static boolean nonEmpty(Range r){
        return r.nonEmpty();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        } else if(!(o instanceof Range)) {
            return false;
        } else {
            Range r = (Range) o;
            return this.left == r.left && this.right == r.right; 
        }
    }
    @Override
    public int hashCode(){
        return Objects.hash(left, right);
    }
    @Override
    public String toString(){
        return "["+left+", "+right+")";
    }
}


class LazySegmentTree {
    private long[] tree;
    private long[] lazy;
    private final long e;
    private final long lazyIdElm;
    private final BinaryOperator<Long> operator;
    private final BinaryOperator<Long> lazyOperator;
    private final BinaryOperator<Long> appFunc;
    private final BiFunction<Long, Integer, Long> mergeLazy;
    private final int size;
    private final int leafs;
    private final int height;
    private final int baseOfLeaf;

    public LazySegmentTree(long[] t, Monoid<Long> monoid, Monoid<Long> lazyMonoid, BinaryOperator<Long> appFunc, BiFunction<Long, Integer, Long> mergeLazy) {
        int n = t.length;
        this.operator = monoid.operator;
        this.e = monoid.e;
        this.lazyOperator = lazyMonoid.operator;
        this.lazyIdElm = lazyMonoid.e;
        this.appFunc = appFunc;
        this.mergeLazy = mergeLazy;
        this.height = MathUtil.minimumExponent(n);
        this.leafs = 1 << this.height;
        this.baseOfLeaf = this.leafs - 1;
        this.size = 2 * this.leafs - 1;
        this.lazy = new long[this.size];
        Arrays.fill(this.lazy, this.lazyIdElm);
        this.tree = new long[this.size];
        for (int i = this.size - 1; i >= 0; i--) {
            if (i >= this.baseOfLeaf + n) {
                this.tree[i] = this.e;
            } else if (isLeaf(i)) {
                this.tree[i] = t[i - this.baseOfLeaf];
            } else {
                this.tree[i] = this.operator.apply(this.tree[left(i)], this.tree[right(i)]);
            }
        }
    }

    public void applyForSegment(int l, int r, long v) {
        applyForSegment(new Range(l, r), 0, new Range(0, leafs), v);
    }

    private void applyForSegment(Range queryRange, int k, Range treeRange, long v) {
        evaluate(k, treeRange);
        if (queryRange.crosses(treeRange)) {
            if (queryRange.contains(treeRange)) {
                lazy[k] = lazyOperator.apply(lazy[k], v);
                evaluate(k, treeRange);
            } else {
                int left = left(k);
                int right = right(k);
                applyForSegment(queryRange, left, treeRange.leftHalf(), v);
                applyForSegment(queryRange, right, treeRange.rightHalf(), v);
                tree[k] = operator.apply(tree[left], tree[right]);
            }
        }
    }

    public void applyForPoint(int i, long v) {
        tree[baseOfLeaf + i] = appFunc.apply(tree[baseOfLeaf + i], mergeLazy.apply(v, 1));
    }

    public long query(int l, int r) {
        return query(new Range(l, r), 0, new Range(0, leafs));
    }

    private long query(Range queryRange, int k, Range treeRange) {
        evaluate(k, treeRange);
        if (!queryRange.crosses(treeRange)) {
            return e;
        } else if (queryRange.contains(treeRange)) {
            return tree[k];
        } else {
            long left = query(queryRange, left(k), treeRange.leftHalf());
            long right = query(queryRange, right(k), treeRange.rightHalf());
            return operator.apply(left, right);
        }
    }

    private void evaluate(int k, Range r) {
        if (lazy[k] != lazyIdElm) {
            if (!isLeaf(k)) {
                lazy[left(k)] = lazyOperator.apply(lazy[left(k)], lazy[k]);
                lazy[right(k)] = lazyOperator.apply(lazy[right(k)], lazy[k]);
            }
            tree[k] = appFunc.apply(tree[k], mergeLazy.apply(lazy[k], r.length()));
            lazy[k] = lazyIdElm;
        }
    }

    private boolean isLeaf(int i) {
        return i >= baseOfLeaf;
    }

    private int left(int k) {
        return 2 * k + 1;
    }

    private int right(int k) {
        return 2 * k + 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int h = 0; h <= height; h++) {
            for (int i = (1 << h) - 1; i < (1 << (h + 1)) - 1; i++) {
                sb.append(tree[i]).append(" ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}


class Monoid<T> {
    public static final Monoid<Long> ADD = new Monoid<>( 0l, (u, v) -> u + v);
    public static final Monoid<Long> MAX = new Monoid<>(-Const.LINF, (u, v) -> u >= v ? u : v);
    public static final Monoid<Long> MIN = new Monoid<>( Const.LINF, (u, v) -> u <= v ? u : v);
    public static final Monoid<Long> RW  = new Monoid<>( Const.LINF, (u, v) -> v);
    public static final Monoid<Long> AND = new Monoid<>(-1l, (u, v) -> u & v);
    public static final Monoid<Long> OR  = new Monoid<>( 0l, (u, v) -> u | v);
    public static final Monoid<Long> XOR = new Monoid<>( 0l, (u, v) -> u ^ v);
    public static final Monoid<Long> GCD = new Monoid<>( 0l, (u, v) -> MathUtil.gcd(u, v));
    public static final Monoid<Long> ADD_MOD = new Monoid<>( 0l, (u, v) -> {
        long sum = u + v;
        if (sum < 0) {
            sum += Const.MOD;
        } else if (sum >= Const.MOD) {
            sum -= Const.MOD;
        } 
        return sum;
    });
    public static final Monoid<Long> MUL_MOD = new Monoid<>( 1l, (u, v) -> (u * v) % Const.MOD);
    
    public T e;
    public BinaryOperator<T> operator;

    public Monoid(T e, BinaryOperator<T> operator) {
        this.e = e;
        this.operator = operator;
    }
}


class MathUtil{
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

    public static int minimumExponent(long n) {
        return 63 - Long.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }

    public static int minimumExponent(int n) {
        return 31 - Integer.numberOfLeadingZeros(n) + (isPowerOfTwo(n) ? 0 : 1);
    }
    
    public static int minimumExponent(long n, int base) {
        if (base == 2) {
            return minimumExponent(n);
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
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;
    public static long MOD = MOD7;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;

    public static void setMod(long mod) {
        MOD = mod;
    }
}
