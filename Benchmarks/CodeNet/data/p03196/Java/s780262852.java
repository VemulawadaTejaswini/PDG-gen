import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static long N;
    static long P;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextLong();
        P = sc.nextLong();

        System.out.println(solve());
    }

    static long solve() {
        int[] primes = getSqrtPrimes(P);
        Map<Long, Integer> map = countFactors(P, primes);

        long ret = 1;
        for (Long p : map.keySet()) {
            int cnt = map.get(p);
            int q = (int)(cnt / N);
            for (int i = 0; i < q; i++) {
                ret *= p;
            }
        }
        return ret;
    }

    static Map<Long, Integer> countFactors(long n, int[] primes) {
        Map<Long, Integer> cnts = new HashMap<>();
        int i = 0;
        for (int p : primes) {
            int cnt = 0;
            while( n % p == 0 ) {
                cnt++;
                n /= p;
            }
            if( cnt != 0 ) {
                cnts.put((long)p, cnt);
            }
        }
        if( n != 1 ) {
            cnts.put(n, 1);
        }
        return cnts;
    }

    static boolean[] sieveEratos(int n) {
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        int root = (int)Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if( primes[i] ) {
                for (int d = 2; d*i <= n; d++) {
                    primes[i*d] = false;
                }
            }
        }
        return primes;
    }

    static int[] getSqrtPrimes(long n) {
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

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
