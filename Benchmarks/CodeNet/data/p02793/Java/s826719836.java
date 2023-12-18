import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        // LCMなだけの問題
        // デカいので素数を数える羽目になる
        // この手のだらだらとしてしまうのだけどどうしょうもないのかな…
        Eratos sieve = new Eratos(1_000_100);
        Map<Integer, Integer> lcmCnts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long[][] factors = sieve.enumFactorCounts(A[i]);

            for (long[] pc : factors) {
                int p = (int)pc[0];
                int c = (int)pc[1];

                int update = Math.max(lcmCnts.getOrDefault(p, 0), c);
                lcmCnts.put(p, update);
            }
        }

        int lcm = 1;
        for (Map.Entry<Integer, Integer> entry : lcmCnts.entrySet()) {
            int p = entry.getKey();
            int cnt = entry.getValue();
            lcm = mul(lcm, pow(p, cnt));
        }

        // debug(lcm);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int b = div(lcm, A[i]);
            ans = add(ans, b);
        }
        return ans;
    }

    static class Eratos {

        static boolean[] mkSieve(int n) {
            boolean[] sieve = new boolean[n+1];
            Arrays.fill(sieve, true);
            sieve[0] = false;
            sieve[1] = false;

            for (int i = 2; i <= n; i++) {
                if( sieve[i] ) {
                    for (int d = 2; d*i <= n; d++) {
                        sieve[i*d] = false;
                    }
                }
            }
            return sieve;
        }

        static int[] mkSqrtPrimes(long n) {
            long root_L = (long)Math.sqrt(n);
            if( root_L > 10_000_000 ) throw new IllegalArgumentException("too big : " + n);
            int root = (int)root_L;
            boolean[] sieve = new boolean[root+1];
            Arrays.fill(sieve, true);
            sieve[0] = false;
            sieve[1] = false;

            for (int i = 2; i <= root; i++) {
                if( sieve[i] ) {
                    for (int d = 2; d*i <= root; d++) {
                        sieve[i*d] = false;
                    }
                }
            }

            int cnt = 0;
            for (boolean prime : sieve) {
                if( prime ) cnt++;
            }
            int[] primes = new int[cnt];
            int idx = 0;
            for (int num = 2; num < sieve.length; num++) {
                if( sieve[num] ) {
                    primes[idx++] = num;
                }
            }
            return primes;
        }

        static int factorSize(long n) {
            // 6: 2 * 3 * 5 * 7 * 11 * 13 = 30030
            // 7: 2 * 3 * 5 * 7 * 11 * 13 * 17 = 510510
            // 8: 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19 = 9699690
            // 9: 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19 * 23 = 223_092_870
            // 10: 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19 * 23 * 29 = 6_469_693_230
            // 11: 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19 * 23 * 29 * 31 = 200_560_490_130
            if( n <= 2*3*5*7*11*13 ) {
                return 6;
            } else if( n <= 2*3*5*7*11*13*17 ) {
                return 7;
            } else if( n <= 2L*3*5*7*11*13*17*19 ) {
                return 8;
            } else if( n <= 2L*3*5*7*11*13*17*19*23 ) {
                return 9;
            } else if( n <= 2L*3*5*7*11*13*17*19*23*29 ) {
                return 10;
            } else if( n <= 2L*3*5*7*11*13*17*19*23*29*31 ) {
                return 11;
            } else {
                return 12;
            }
        }

        long n;
        int[] sqrtPrimes;
        int factorSize;

        // cache
        long[] factors;
        long[][] factorCnts;

        Eratos(long n) {
            this.n = n;
            this.sqrtPrimes = mkSqrtPrimes(n);
            this.factorSize = factorSize(n);
            this.factors = new long[this.factorSize];
            this.factorCnts = new long[this.factorSize][2];
        }

        long[] enumUniqFactors(long n) {
            Arrays.fill(factors, 0);
            int i = 0;
            for (int p : sqrtPrimes) {
                if( n % p == 0 ) {
                    factors[i++] = p;
                    n /= p;
                    while( n % p == 0 ) {
                        n /= p;
                    }
                }
            }
            if( n != 1 ) {
                factors[i++] = n;
            }
            return Arrays.copyOf(factors, i);
        }

        long[][] enumFactorCounts(long n) {
            for (long[] fc : factorCnts) {
                fc[0] = 0;
                fc[1] = 0;
            }
            int i = 0;
            for (int p : sqrtPrimes) {
                if( n < p ) break;

                int cnt = 0;
                while( n % p == 0 ) {
                    n/=p;
                    cnt++;
                }
                if( cnt > 0 ) {
                    factorCnts[i][0] = p;
                    factorCnts[i][1] = cnt;
                    i++;
                }
            }
            if( n != 1 ) {
                factorCnts[i][0] = n;
                factorCnts[i][1] = 1;
                i++;
            }
            return Arrays.copyOf(factorCnts, i);
        }

        Map<Long, Integer> mapFactorCounts(long n) {
            long[][] arr = enumFactorCounts(n);
            Map<Long, Integer> map = new HashMap<>();
            for (long[] fc : arr) {
                map.put(fc[0], (int)fc[1]);
            }
            return map;
        }
    }

    static int MOD = 1_000_000_007;

    static int pow(int base, long exp) {
        if( exp == 0 ) return 1;

        int ans = 1;
        base %= MOD;
        while( exp > 0 ) {
            if( (exp & 1) == 1 ) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if( c < 0 ) c += MOD;
        return c;
    }

    static int div(int a, int b) {
        return mul(a, pow(b, MOD-2));
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) c %= MOD;
        return c;
    }

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) c %= MOD;
        return (int)c;
    }

    static class FermatCombination {
        private final int size;
        private final int[] factorial; // n -> factorial(n)
        private final int[] inverse;   // n -> inverse(factorial(n))

        FermatCombination(int size) {
            this.size = size;
            factorial = new int[size + 1];
            inverse = new int[size + 1];

            init();
        }

        private void init() {
            factorial[0] = 1;
            factorial[1] = 1;
            inverse[0] = 1;
            inverse[1] = 1;
            for (int i = 2; i <= size; i++) {
                factorial[i] = mul(factorial[i-1], i);
                inverse[i] = pow(factorial[i], MOD - 2);
            }
        }

        int comb(int n, int k) {
            if( n > size ) throw new RuntimeException("wtf : size=" + size + " n=" + n);
            return mul(mul(factorial[n], inverse[k]), inverse[n - k]);
        }

        // 重複組み合わせ
        // k種類からn個選ぶ場合の数
        int hcomb(int k, int n) {
            return comb(k+n-1, n);
        }

        int group(int n, int g, int k) {
            // C(n, g) * C(n-g, g)... / k!
            // n! / (n-gk)! / g! ^ k / k!
            int ret = factorial[n];             // n!
            ret = mul(ret, inverse[n - g*k]);   // 1 / (n-gk)!
            ret = mul(ret, pow(inverse[g], k)); // 1 / (g! ^ k)
            ret = mul(ret, inverse[k]);         // 1 / k!
            return ret;
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
