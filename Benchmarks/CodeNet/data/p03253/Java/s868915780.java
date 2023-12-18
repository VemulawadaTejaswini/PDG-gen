import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DFactorization solver = new DFactorization();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFactorization {
        int _sieve_size;
        boolean[] bs;
        List<Integer> primes = new ArrayList<Integer>();
        private int mod;
        private long[] factorial;

        void sieve(int upperbound) {
            _sieve_size = upperbound + 1;
            bs = new boolean[_sieve_size];
            Arrays.fill(bs, true);
            bs[0] = bs[1] = false;
            for (long i = 2; i < _sieve_size; i++)
                if (bs[(int) i]) {
                    for (long j = i * i; j < _sieve_size; j += i) bs[(int) j] = false;
                    primes.add((int) i);
                }
        }

        HashMap<Integer, Integer> primeFactors(long N) {
            HashMap<Integer, Integer> factors = new HashMap<>();
            int PF_idx = 0;
            long PF = primes.get(PF_idx);
            while (N != 1 && (PF * PF <= N)) {
                while (N % PF == 0) {
                    N /= PF;
                    factors.merge((int) PF, 1, (oldValue, newValue) -> oldValue + 1);
                }
                PF = primes.get(++PF_idx);
            }
            if (N != 1) factors.merge((int) N, 1, (oldValue, newValue) -> oldValue + 1);
            return factors;
        }

        long modinv(long n) {
            int pow = mod - 2;
            long base = n, ans = 1;
            while (pow > 0) {
                if ((pow & 1) > 0) {
                    ans *= base;
                    ans %= mod;
                }
                base *= base;
                base %= mod;
                pow >>= 1;
            }
            return ans;
        }

        long comb(int n, int k) {
            return factorial[n] * modinv(factorial[k]) % mod * modinv(factorial[n - k]) % mod;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();
            mod = (int) 1e9 + 7;
            factorial = new long[(int) (1e5 + 40)];
            factorial[0] = factorial[1] = 1;
            for (int i = 2; i < (int) 1e5 + 40; ++i) {
                factorial[i] = factorial[i - 1] * i;
                factorial[i] %= mod;
            }
            sieve((int) 1e5);
            HashMap<Integer, Integer> pfcount = primeFactors(m);

            long ans = 1;
            for (int count : pfcount.values()) {
                ans *= comb(count + n - 1, n - 1);
                ans %= mod;
            }

            out.println(ans);
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

