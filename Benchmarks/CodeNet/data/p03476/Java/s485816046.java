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
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D2017LikeNumber solver = new D2017LikeNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class D2017LikeNumber {
        static final int MAX = 100_000;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Primes primes = new Primes(MAX);

            long[] odds = new long[MAX + 1];
            for (int i = 1; i <= MAX; i++) {
                odds[i] = odds[i - 1];
                if (i % 2 == 1 && primes.isPrime(i) && primes.isPrime((i + 1) / 2)) {
                    odds[i]++;
                }
            }

            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int l = in.nextInt(), r = in.nextInt();
                out.println(odds[r] - odds[l - 1]);
            }
        }

    }

    static class Primes {
        public final BitSet isPrime;
        public final int[] primes;

        public Primes(int N) {
            if (N <= 1) {
                isPrime = new BitSet();
                primes = new int[0];
                return;
            }
            isPrime = new BitSet(N);
            isPrime.set(2, N + 1);
            for (int p = isPrime.nextSetBit(0); p * p <= N; p = isPrime.nextSetBit(p + 1)) {
                for (int composite = p * 2; composite <= N; composite += p) {
                    isPrime.clear(composite);
                }
            }

            primes = new int[isPrime.cardinality()];
            int p = isPrime.nextSetBit(0);
            for (int i = 0; i < primes.length; i++) {
                primes[i] = p;
                p = isPrime.nextSetBit(p + 1);
            }
        }

        public boolean isPrime(int p) {
            return isPrime.get(p);
        }

    }

    static class InputReader {
        public BufferedReader reader;
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

    }
}

