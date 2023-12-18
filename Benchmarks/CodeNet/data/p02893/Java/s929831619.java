import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
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
        CDivisionByTwoWithSomething solver = new CDivisionByTwoWithSomething();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivisionByTwoWithSomething {
        private static final int MOD = 998244353;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            String xStr = in.string();
            BigInteger act = new BigInteger(xStr, 2);
            char[] x = xStr.toCharArray();
            ModMath mod = new ModMath(MOD);
            long xmod = 0;
            for (int i = 0; i < n; i++) {
                xmod *= 2;
                if (x[i] == '1') xmod++;
                xmod %= MOD;
            }
            long base = 2 * n * (xmod + 1L) % MOD;

            int[] convered = new int[n + 1];
            for (int bits = 1; bits < n; bits++) {
                if (n % bits != 0) continue;
                int num = n / bits;
                if (num % 2 == 0) continue;

                boolean ok = true;


                StringBuilder most = new StringBuilder();
                for (int i = 0; i < num; i++) {
                    for (int j = 0; j < bits; j++) {
                        if (i % 2 == 0) most.append(x[j]);
                        else most.append(x[j] == '0' ? '1' : '0');
                    }
                }
                BigInteger best = new BigInteger(most.toString(), 2);

                long variety = 0;
                for (int i = 0; i < bits; i++) {
                    variety *= 2;
                    if (x[i] == '1') variety++;
                    variety %= MOD;
                }


                if (act.compareTo(best) >= 0) variety++;
                variety -= convered[bits];

                //System.out.println("Variety for bits=" + bits + " was " + variety + " : " + ok);


                long costDiff = (2L * bits + MOD - 2L * n) % MOD;
                base += variety * costDiff % MOD;
                base %= MOD;

                for (int i = bits * 2; i <= n; i += bits) convered[i] += variety;
            }
            out.ans(base).ln();
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
}

