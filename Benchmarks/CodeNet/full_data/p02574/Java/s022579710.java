import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.BitSet;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECoprime solver = new ECoprime();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoprime {
        private static final String PAIRWISE = "pairwise coprime";
        private static final String SETWISE = "setwise coprime";
        private static final String NEITHER = "not coprime";
        LinearSieve ls = new LinearSieve(MAX);
        private static final int MAX = 1_000_000;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.readIntArray(n);

            IntCounter count = new IntCounter(MAX + 1);
            for (int v : a) {
                while (v != 1) {
                    int d = ls.leastPrimeDivisor[v];
                    while (ls.leastPrimeDivisor[v] == d)
                        v /= d;
                    count.incr(d);
                }
            }

            String answer = PAIRWISE;
            for (int i = 0; i <= MAX; i++) {
                if (count.get(i) > 1) {
                    answer = SETWISE;
                }
            }

            int gcd = NumberTheory.gcd(a);
            if (gcd != 1) {
                answer = NEITHER;
            }

            out.println(answer);
        }

    }

    static class IntCounter {
        final int[] freq;
        int distinct = 0;

        public IntCounter(int n) {
            freq = new int[n];
        }

        public IntCounter(int[] array) {
            int n = Util.max(array) + 1;
            freq = new int[n];
            for (int x : array) {
                incr(x);
            }
        }

        public void incr(int key) {
            if (freq[key] == 0)
                distinct++;
            freq[key]++;
        }

        public int get(int key) {
            return freq[key];
        }

    }

    static class NumberTheory {
        public static int gcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            int c;
            while (a != 0) {
                c = a;
                a = b % a;
                b = c;
            }
            return b;
        }

        public static int gcd(int... a) {
            int result = 0;
            for (int x : a) {
                result = gcd(result, x);
            }
            return result;
        }

    }

    static class Util {
        public static int max(int... x) {
            int max = Integer.MIN_VALUE;
            for (int i : x) {
                max = Math.max(i, max);
            }
            return max;
        }

        private Util() {
        }

    }

    static class InputReader {
        public final BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readIntArray(int n) {
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = nextInt();
            }
            return x;
        }

    }

    static class LinearSieve {
        public final BitSet isComposite;
        public final int[] leastPrimeDivisor;
        public final int[] primes;

        public LinearSieve(int n) {
            double estimate;
            if (n < 10000) {
                estimate = n + 1;
            } else {
                estimate = ((double) n) / Math.log(n);
                estimate *= 1.1;
            }
            int[] primes = new int[(int) estimate];
            leastPrimeDivisor = new int[n + 1];
            int size = 0;

            if (n <= 1) {
                isComposite = new BitSet();
            } else {
                isComposite = new BitSet(n + 1);

                for (int i = 2; i <= n; i++) {
                    if (!isComposite.get(i)) {
                        if (size >= primes.length)
                            primes = resize(primes);
                        primes[size++] = i;
                        leastPrimeDivisor[i] = i;
                    }

                    for (int j = 0; j < size; j++) {
                        int p = primes[j];
                        if (i * p > n)
                            break;
                        isComposite.set(i * p);
                        leastPrimeDivisor[i * p] = p;
                        if (i % p == 0)
                            break;
                    }
                }
            }

            this.primes = new int[size];
            System.arraycopy(primes, 0, this.primes, 0, size);
        }

        private static int[] resize(int[] primes) {
            int newSize = 1 + ((primes.length * 11) / 10);
            int[] newPrimes = new int[newSize];
            System.arraycopy(primes, 0, newPrimes, 0, primes.length);
            return newPrimes;
        }

    }
}

