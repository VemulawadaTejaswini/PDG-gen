import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.OptionalInt;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        CLCMs solver = new CLCMs();
        solver.solve(1, in, out);
        out.close();
    }

    static class CLCMs {
        private static final int MOD = 998244353;
        private static final ModMath MM = new ModMath(MOD);

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            int[] a = in.ints(n);
            int max = IntMath.max(a) + 1;
            int[] count = new int[max];
            for (int num : a) count[num]++;

            long[] coefficients = new long[max];
            Arrays.fill(coefficients, MOD - 1);
            coefficients[1] = 1;
            for (int i = 2; i < max; i++) {
                coefficients[i] += MM.inv(i);
                coefficients[i] %= MOD;
                for (int j = i * 2; j < max; j += i) {
                    coefficients[j] += MOD - coefficients[i];
                }
            }
            //System.out.println(coefficients[12]);

            long ans = 0;
            for (int i = 1; i < max; i++) {
                long tmp = 0, sum = 0;
                for (int j = i; j < max; j += i) {
                    long delta = count[j] * j % MOD;
                    sum += tmp * delta % MOD;
                    sum += (count[j] - 1L) * count[j] / 2 % MOD * j % MOD;
                    sum %= MOD;
                    tmp += delta;
                    tmp %= MOD;
                }
                ans += coefficients[i] * sum % MOD;
                ans %= MOD;
            }
            out.ans(ans).ln();
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod, boolean unsafe) {
        /*if (!unsafe && !IntMath.isPrime(mod)) {
            throw new RuntimeException("This class is designed for primes!");
        }*/
            this.mod = mod;
        }

        public ModMath(long mod) {
            this(mod, false);
        }

        public ModMath() {
            this(DEFAULT_MOD, true);
        }

        public long inv(long x) {
            return pow(x, mod - 2);
            //return mod(LongEuclidSolver.solve(x, mod).x);
        }

        public long pow(long x, long y) {
            y %= (mod - 1);
            if (y < 0) {
                return pow(inv(x), -y);
            } else if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                long z = pow(x, y / 2);
                return (z * z) % mod;
            } else {
                return (x % mod) * pow(x, y - 1) % mod;
            }
        }

    }

    static final class IntMath {
        private IntMath() {
        }

        public static int max(int... v) {
            return Arrays.stream(v).max().orElseThrow(NoSuchElementException::new);
        }

    }

    static interface Verified {
    }
}

