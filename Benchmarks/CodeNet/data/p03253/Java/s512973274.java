import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        System.out.println(solve());
    }

    static long solve() {
        int[] primes = getSqrtPrimes(M);
        Map<Integer, Integer> factorCounts = countFactors(M, primes);
        FermatCombination fc = new FermatCombination(N+100, MOD); // factor数くらい余計に要求される

        // N個の箱に何色かのボール(ボールは色毎に何個かある)を入れる組み合わせの数
        // => 色毎のボールのN個の箱に入れる をかけ合わせる
        long ret = 1;
        for (int factorSize : factorCounts.values()) {
            // N個の箱にfactorSize個のfactorを振り分ける <=> N種類から重複を許してfactorSize個選ぶ場合の数
            ret = ret * fc.hcomb(N, factorSize) % MOD;
        }
        return ret;
    }

    static int[] getSqrtPrimes(int n) {
        boolean[] sieve = sieveEratos( (int)Math.sqrt(n) );
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

    static boolean[] sieveEratos(int n) {
        int root = (int)Math.sqrt(n);

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i <= root; i++) {
            if( primes[i] ) {
                for (int d = 2; d*i <= n; d++) {
                    primes[i*d] = false;
                }
            }
        }
        return primes;
    }

    static Map<Integer, Integer> countFactors(int n, int[] P) {
        Map<Integer, Integer> cnts = new HashMap<>();
        int i = 0;
        for (int p : P) {
            int cnt = 0;
            while( n % p == 0 ) {
                cnt++;
                n /= p;
            }
            if( cnt != 0 ) {
                cnts.put(p, cnt);
            }
        }
        if( n != 1 ) {
            cnts.put(n, 1);
        }
        return cnts;
    }

    static class FermatCombination {

        private final int size;
        private final int mod;
        private final int[] factorial; // n -> factorial(n)
        private final int[] inverse;   // n -> inverse(factorial(n))

        FermatCombination(int size, int mod) {
            this.mod = mod;
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
                inverse[i] = pow(factorial[i], mod - 2);
            }
        }

        private int pow(int base, int exp) {
            if( exp == 0 ) return 1;

            int ans = 1;
            base %= mod;
            while( exp > 0 ) {
                if( (exp & 1) == 1 ) {
                    ans = mul(ans, base);
                }

                base = mul(base, base);
                exp = exp >> 1;
            }
            return ans;
        }

        private int mul(int a, int b) {
            return (int)((long)a * b % mod);
        }

        int comb(int n, int k) {
            if( n > size ) throw new RuntimeException("wtf : size=" + size + " n=" + n);
            return mul(mul(factorial[n], inverse[k]), inverse[n - k]);
        }

        // 重複組み合わせ
        // n種類から重複を許してr個選ぶ場合の数 (nHr)
        int hcomb(int n, int r) {
            return comb(n+r-1, r);
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
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
