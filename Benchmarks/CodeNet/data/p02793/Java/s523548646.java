import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);

        Map<Long, Integer> maxFactorization = new HashMap<>();
        for (int i : a) {
            PrimeFact pf = new PrimeFact(i);
            for (Map.Entry<Long, Integer> entry : pf.factorization.entrySet()) {
                long div = entry.getKey();
                int num = entry.getValue();
                if (!maxFactorization.containsKey(div)) {
                    maxFactorization.put(div, num);
                } else {
                    maxFactorization.put(div, Math.max(maxFactorization.get(div), num));
                }
            }
        }

        ModCalculator calc = new ModCalculator(MOD);
        long target = 1;

        for (Map.Entry<Long, Integer> entry : maxFactorization.entrySet()) {
            long div = entry.getKey();
            for (int i = 0; i < entry.getValue(); i++) {
                target = calc.multiply(target, div);
            }
        }
        // out.println(target);

        long ans = 0;
        for (int i : a) {
            long toAdd = calc.multiply(target, calc.inverse(i));
            ans = calc.add(ans, toAdd);
        }
        out.println(ans);
    }


    static class ModCalculator {
        private final long mod;

        // factorial in mod
        // factMod[1] = 1, factMod[2] = 2, ...
        private List<Long> factorial;
        // inverse factorial in mod
        private List<Long> inverseFactorial;

        ModCalculator(long mod) {
            this.mod = mod;
            factorial = new ArrayList<>();
            inverseFactorial = new ArrayList<>();
            factorial.add(1L);
            inverseFactorial.add(1L);
        }

        private void populate(long n) {
            // i == next index
            for (int i = factorial.size(); i <= n; i++) {
                factorial.add(
                        multiply(factorial.get(i - 1), i)
                );
                inverseFactorial.add(
                        multiply(inverseFactorial.get(i - 1), inverse(i))
                );
            }
        }

        // a + b (mod m)
        long add(long a, long b) {
            return (a + b) % mod;
        }

        // a * b (mod m)
        long multiply(long a, long b) {
            return a * b % mod;
        }

        // x^-1 (mod m)
        long inverse(long x) {
            return power(x, mod - 2);
        }

        // x^n (mod m)
        long power(long x, long n) {
            long ans = 1;
            while (n != 0) {
                if ((n & 1) == 1L) ans = multiply(ans, x);
                x = multiply(x, x);
                n = n >> 1;
            }
            return ans;
        }

        /**
         * Calculates factorial value in mod.
         */
        long factorial(int n) {
            populate(n);
            return factorial.get(n);
        }

        /**
         * Calculates combination value in mod.
         * <br>a.k.a
         * <br>aCb
         * <br> = n! / (n - r)! r!
         */
        long combination(int n, int r) {
            if (n == 0 && r == 0) return 1;
            if (n < r || n < 0) return 0;

            populate(n);
            return multiply(factorial.get(n), multiply(inverseFactorial.get(n - r), inverseFactorial.get(r)));
        }

        /**
         * Calculates permutation value in mod.
         * <br>a.k.a
         * <br>aPb
         * <br> = n! / (n - r)!
         */
        long permutation(int n, int r) {
            if (n == 0 && r == 0) return 0;
            if (n < r || n < 0) return 0;

            populate(n);
            return multiply(factorial.get(n), inverseFactorial.get(n - r));
        }
    }

    static class PrimeFact {
        private final long orig;
        private Map<Long, Integer> factorization;

        PrimeFact(long num) {
            orig = num;
            factorization = factorize(num);
        }

        PrimeFact(int num) {
            orig = num;
            factorization = factorize(num);
        }

        /**
         * Returns a list of divisors, including.
         * @return List of divisors.
         */
        public List<Long> divisors() {
            return getDivisors(this.factorization);
        }

        /**
         * Checks if the internal factorization map contains only one value,
         * and it is num itself & corresponding power equals 1.
         * @return {@code true} if prime.
         */
        boolean isPrime() {
            return this.factorization.size() == 1
                    && this.factorization.entrySet().stream().findFirst().get().getValue() == 1;
        }

        /**
         * Returns a factorization map inside.
         */
        public Map<Long, Integer> getFactorization() {
            return factorization;
        }
    }

    private static Map<Long, Integer> factorize(final long num) {
        Map<Long, Integer> fact;

        if (num == 1L) return new HashMap<>();

        long sqrt = (long) Math.floor(Math.sqrt(num));
        if (sqrt > primes.getLast()) {
            generatePrimes(sqrt);
        }

        for (long p : primes) {
            if (p > sqrt) break;
            if (num % p == 0) {
                fact = factorize(num / p);
                if (fact.containsKey(p)) fact.put(p, fact.get(p) + 1);
                else fact.put(p, 1);
                return fact;
            }
        }

        // given num is a prime number
        fact = new HashMap<>();
        fact.put(num, 1);
        return fact;
    }

    private static LinkedList<Long> primes;

    static {
        primes = new LinkedList<>();
        primes.add(2L);
    }

    /**
     * Generates primes and stores it into static `primes` field.
     * Stops if the last generated prime is larger than the given `min`.
     * @param min Minimum number. Usually sqrt of the number that we want to factorize.
     */
    private static void generatePrimes(long min) {
        long p = primes.getLast() + 1;
        while (true) {
            if (isPrime(p)) {
                primes.add(p);
                if (p > min) {
                    return;
                }
            }
            p++;
        }
    }

    /**
     * Checks if the number is a prime using the current `primes` cache.
     * Stops when the next prime is larger than floor(sqrt(num)).
     * @param num Number to check.
     * @return {@code true} if num is prime.
     */
    private static boolean isPrime(long num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (long p : primes) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

    // ------------------------
    // Get Divisors List
    // ------------------------

    /**
     * Returns a list of divisors, including 1 and number itself.
     * @param fact Factorization map.
     * @return List of divisors.
     */
    private static List<Long> getDivisors(Map<Long, Integer> fact) {
        List<Long> ret = new ArrayList<>();
        if (fact.isEmpty()) {
            ret.add(1L);
            return ret;
        }

        for (Map.Entry<Long, Integer> e : fact.entrySet()) {
            Map<Long, Integer> copy = clone(fact);
            copy.remove(e.getKey());
            List<Long> divs = getDivisors(copy);
            for (long div : divs) {
                for (int i = 0; i <= e.getValue(); i++) {
                    ret.add(div * (long) Math.pow(e.getKey(), i));
                }
            }
            break;
        }
        return ret;
    }

    /**
     * Clones map h into a new HashMap.
     * @param m Map to clone.
     * @return Cloned map.
     */
    private static Map<Long, Integer> clone(Map<Long, Integer> m) {
        Map<Long, Integer> ret = new HashMap<>();
        for (Map.Entry<Long, Integer> e : m.entrySet()) {
            ret.put(e.getKey(), e.getValue());
        }
        return ret;
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
