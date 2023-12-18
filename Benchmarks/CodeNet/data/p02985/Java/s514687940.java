import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
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
        EVirusTree2 solver = new EVirusTree2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EVirusTree2 {
        private static final int MOD = (int) 1e9 + 7;
        private static final ModMath MM = new ModMath();
        private static final Factorial FA = MM.getFactorial(100_001);

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), k = in.ints();
            EVirusTree2.Node[] nodes = new EVirusTree2.Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new EVirusTree2.Node(i);
            }
            for (int i = 1; i < n; i++) {
                int a = in.ints() - 1, b = in.ints() - 1;
                nodes[a].adj.add(nodes[b]);
                nodes[b].adj.add(nodes[a]);
            }
            nodes[0].treenize(null);
            out.ans(nodes[0].calcRoot(k));
        }

        static class Node {
            int index;
            final List<EVirusTree2.Node> adj = new ArrayList<>();

            Node(int index) {
                this.index = index;
            }

            void treenize(EVirusTree2.Node par) {
                adj.remove(par);
                for (EVirusTree2.Node child : adj) child.treenize(this);
            }

            int childLen() {
                return adj.size();
            }

            long calcRoot(int k) {
                long ans = k;
                ans *= FA.npr(k - 1, childLen());
                ans %= MOD;
                for (EVirusTree2.Node child : adj) {
                    ans *= child.calc(k);
                    ans %= MOD;
                }
                return ans;
            }

            long calc(int k) {
                long ans = 1;
                ans *= FA.npr(k - 2, childLen());
                ans %= MOD;
                for (EVirusTree2.Node child : adj) {
                    ans *= child.calc(k);
                    ans %= MOD;
                }
                return ans;
            }

        }

    }

    static interface Verified {
    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
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

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
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

        public long factinv(long x) {
            return reverse[(int) x];
        }

        public long npr(long n, long r) {
            return n < r ? 0 : mod.mod(fact(n) * factinv(n - r));
        }

        public long ncr(long n, long r) {
            return mod.mod(npr(n, r) * factinv(r));
        }

        public String toString() {
            return "Factorial{" +
                    "natural=" + Arrays.toString(natural) +
                    ", reverse=" + Arrays.toString(reverse) +
                    '}';
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
}

