import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
        BRGBBalls solver = new BRGBBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class BRGBBalls {
        private static final int MOD = 998244353;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), n3 = n * 3;
            ModMath mod = new ModMath(MOD);
            Factorial fact = mod.getFactorial(n3 + 1);
            char[] s = in.string()
                    .replace('R', (char) 0)
                    .replace('G', (char) 1)
                    .replace('B', (char) 2).toCharArray();
            // Det
            BRGBBalls.Type[] types = new BRGBBalls.Type[n3];
            int[] stc = new int[n3];
            {
                int lcnt = 0, lcol = 0;
                int[] endreq = new int[3];
                for (int i = 0; i < n3; i++) {
                    if (endreq[s[i]] > 0) {
                        types[i] = BRGBBalls.Type.END;
                        endreq[s[i]]--;
                    } else if (lcnt == 0 || lcol == s[i]) {
                        types[i] = BRGBBalls.Type.START;
                        lcol = s[i];
                        lcnt++;
                    } else {
                        stc[i] = lcol;
                        types[i] = BRGBBalls.Type.MID;
                        lcnt--;
                        endreq[3 - (s[i] + lcol)]++;
                    }
                }
            }
            //System.out.println(Arrays.toString(types));

            // Start
            long ans = 1;
            {
                int[] count = new int[3];
                for (int i = 0; i < n3; i++) {
                    if (types[i] == BRGBBalls.Type.END) continue;
                    if (types[i] == BRGBBalls.Type.START) count[s[i]]++;
                    else {
                        ans *= count[stc[i]]--;
                        ans %= MOD;
                    }
                }
            }

            // End
            {
                int[] count = new int[3];
                for (int i = n3 - 1; i >= 0; i--) {
                    if (types[i] == BRGBBalls.Type.START) continue;
                    if (types[i] == BRGBBalls.Type.END) count[s[i]]++;
                    else {
                        ans *= count[3 - (s[i] + stc[i])]--;
                        ans %= MOD;
                    }
                }
            }

            out.ans(ans * fact.fact(n) % MOD).ln();
        }

        enum Type {
            START,
            MID,
            END,
            ;
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

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
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

        public Factorial getFactorial(int n) {
            return new Factorial(this, n);
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

    }

    static class Factorial {
        private final ModMath mod;
        private final long[] natural;
        private final long[] reverse;

        public Factorial(ModMath mod, int max) {
            this.mod = mod;
            this.natural = new long[max];
            this.reverse = new long[max];
            natural[0] = 1;
            for (int i = 1; i < max; i++) {
                natural[i] = mod.mod(natural[i - 1] * i);
            }
            reverse[max - 1] = mod.inv(natural[max - 1]);
            for (int i = max - 1; i > 0; i--) {
                reverse[i - 1] = mod.mod(reverse[i] * i);
            }
        }

        public long fact(long x) {
            return natural[(int) x];
        }

        public String toString() {
            return "Factorial{" +
                    "natural=" + Arrays.toString(natural) +
                    ", reverse=" + Arrays.toString(reverse) +
                    '}';
        }

    }

    static interface Verified {
    }
}

