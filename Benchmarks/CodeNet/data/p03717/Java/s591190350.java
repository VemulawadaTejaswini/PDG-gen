import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        int mod = 1_000_000_007;
        int n = Math.max(3, In.ni());
        int m = In.ni();
        int[] rlx = new int[m];
        int b1 = MathUtil.ceilExponent(n + 1);
        int b2 = b1 << 1;
        int mask1 = (1 << b1) - 1;
        int mask2 = (1 << b2) - 1;
        for (int i = 0; i < m; i++) {
            rlx[i] = (In.ni() << b1) | (In.ni() << b2) | In.ni();
        }
        Arrays.sort(rlx);
        int[] ft = new int[n + 1];
        Arrays.fill(ft, -1);
        int bm = MathUtil.ceilExponent(m);
        int mask = (1 << bm) - 1;
        for (int i = 0; i < m; i++) {
            int r = rlx[i] >> b2;
            if (i == 0 || r != rlx[i - 1] >> b2) {
                ft[r] = 0;
                ft[r] |= i;
            }
            if (i == m - 1 || r != rlx[i + 1] >> b2) {
                ft[r] |= i << bm;
            }
        }
        int n1 = n + 1;
        int n2 = n1 * n1;
        int n3 = n1 * n2;
        int[] dp = new int[n3];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int ijk = i * n2 + j * n1 + k;
                    if (dp[ijk] == 0) {
                        continue;
                    }
                    int r = Math.max(Math.max(i, j), k);
                    for (int q = 0; q < 3; q++) {
                        int ii = q == 0 ? r + 1 : i;
                        int jj = q == 1 ? r + 1 : j;
                        int kk = q == 2 ? r + 1 : k;
                        int ijk2 = ii * n2 + jj * n1 + kk;
                        if ((ii == jj & ii != 0) | (jj == kk & jj != 0) | (kk == ii & kk != 0)) {
                            continue;
                        }
                        if (ft[r + 1] < 0) {
                            dp[ijk2] += dp[ijk];
                            if (dp[ijk2] >= mod) {
                                dp[ijk2] -= mod;
                            }
                        } else {
                            boolean ok = true;
                            int fr = ft[r + 1] & mask;
                            int to = ft[r + 1] >> bm;
                            for (int p = fr; p <= to; p++) {
                                int l = (rlx[p] & mask2) >> b1;
                                int x = rlx[p] & mask1;
                                boolean ib = ii >= l;
                                boolean jb = jj >= l;
                                boolean kb = kk >= l;
                                boolean and = ib & jb & kb;
                                boolean xor = ib ^ jb ^ kb;
                                ok &= (x == 1 & !and & xor) | (x == 2 & !xor) | (x == 3 & and);
                                if (!ok) {
                                    break;
                                }
                            }
                            if (ok) {
                                dp[ijk2] += dp[ijk];
                                if (dp[ijk2] >= mod) {
                                    dp[ijk2] -= mod;
                                }
                            }
                        }
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
                ans += dp[n * n2 + i * n1 + j];
                ans += dp[j * n2 + n * n1 + i];
                ans += dp[i * n2 + j * n1 + n];
            }
        }
        System.out.println(ans % mod);
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
