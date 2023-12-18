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

        initFact(1_000_010, MOD);

        long target = 1;

        for (Map.Entry<Long, Integer> entry : maxFactorization.entrySet()) {
            long div = entry.getKey();
            for (int i = 0; i < entry.getValue(); i++) {
                target *= div;
                target %= MOD;
            }
        }
        // out.println(target);

        long ans = 0;
        for (int i : a) {
            long inv = modInv(i, MOD);
            long toAdd = target * inv;
            toAdd %= MOD;
            ans += toAdd;
            ans %= MOD;
        }
        out.println(ans);
    }

    // -----------
    // Modulo operations
    // -----------

    // factorial in mod
    // factMod[1] = 1, factMod[2] = 2, ...
    private static long[] factMod;
    // inverse factorial in mod
    private static long[] iFactMod;

    private static void initFact(long n, long mod) {
        factMod = new long[(int)n+1];
        iFactMod = new long[(int)n+1];
        factMod[0] = 1;
        iFactMod[0] = 1;
        for (int i = 0; i < n; i++) {
            factMod[i+1] = factMod[i] * ((long) (i+1)) % mod;
            iFactMod[i+1] = iFactMod[i] * modInv(i+1, mod) % mod;
        }
    }

    // x^-1 (mod m)
    private static long modInv(long x, long mod) {
        return modPow(x, mod-2, mod);
    }

    // x^n (mod m)
    private static long modPow(long x, long n, long mod) {
        long ans = 1;
        while (n != 0) {
            if ((n & 1) == 1L) ans = ans * x % mod;
            x = x * x % mod;
            n = n >> 1;
        }
        return ans;
    }

    // aCb (mod m)
    // must call initFact() first.
    private static long combinationMod(int a, int b, long mod) {
        if(a == 0 && b == 0) return 1;
        if(a < b || a < 0) return 0;
        long tmp = iFactMod[a-b]* iFactMod[b] % mod;
        return tmp * factMod[a] % mod;
    }

    public static class PrimeFact {
        private final Long orig;
        private LinkedHashMap<Long, Integer> factorization;

        public PrimeFact(long num) {
            orig = num;
            factorization = factorize(num);
        }

        public PrimeFact(int num) {
            orig = (long) num;
            factorization = factorize(num);
        }

        public List<Long> divisors() {
            return getDivisors(this.factorization);
        }

        public boolean isPrime() {
            return this.factorization.size() == 1;
        }
    }

    private static LinkedHashMap<Long, Integer> factorize(long num) {

        LinkedHashMap<Long, Integer> fact;

        if (num == 1L) return new LinkedHashMap<>();

        long sqrt = (long) Math.floor(Math.sqrt(num));

        for (long p : getPrimes(sqrt)) {
            if (num % p == 0) {
                fact = factorize(num/p);
                if (fact.containsKey(p)) fact.put(p, fact.get(p) + 1);
                else fact.put(p, 1);
                return fact;
            }
        }

        fact = new LinkedHashMap<>();
        fact.put(num, 1);
        return fact;
    }

    private static LinkedList<Long> primes;

    static {
        primes = new LinkedList<>();
        primes.add(2L);
    }

    public static boolean testPrime(long num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (long p : getPrimes(sqrt)) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

    public static List<Long> getPrimes(long min) {

        if (primes.getLast() < min)
            genPrime(min);

        int index = 0;
        for (long p : primes) {
            if (p > min) break;
            index++;
        }

        return primes.subList(0, index);
    }

    private static void genPrime(long min) {
        for (long biggestKnown = primes.getLast() + 1; biggestKnown <= min; biggestKnown++) {
            if (isPrime(biggestKnown)) primes.add(biggestKnown);
        }
    }

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

    public static List<Long> getDivisors(HashMap<Long, Integer> fact) {
        List<Long> ret = new ArrayList<>();
        if (fact.isEmpty()) {
            ret.add(1L);
            return ret;
        }

        for (Map.Entry<Long, Integer> e : fact.entrySet()) {
            HashMap<Long, Integer> copy = clone(fact);
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

    private static HashMap<Long, Integer> clone(HashMap<Long, Integer> h) {
        HashMap<Long, Integer> ret = new HashMap<>();
        for (Map.Entry<Long, Integer> e : h.entrySet()) {
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
