import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
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
        BExtension solver = new BExtension();
        solver.solve(1, in, out);
        out.close();
    }

    static class BExtension {
        private static final int MOD = 998244353;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int a1 = in.ints(), b1 = in.ints(), a2 = in.ints(), b2 = in.ints();
            int ad = a2 - a1, bd = b2 - b1;
            if (ad == 0 || bd == 0) {
                out.ans(1).ln();
                return;
            }
            long[][][] dp = new long[2][a2 + 1][b2 + 1];
            dp[0][a1][b1] = 1;
            for (int i = a1 + 1; i <= a2; i++) dp[0][i][b1] = dp[0][i - 1][b1] * b1 % MOD;
            for (int i = b1 + 1; i <= b2; i++) {
                dp[0][a1][i] = dp[0][a1][i - 1] * (a1 - 1) % MOD;
                dp[1][a1][i] += dp[0][a1][i - 1];
                dp[1][a1][i] += dp[1][a1][i - 1] * a1;
                dp[1][a1][i] %= MOD;
            }

            for (int i = a1 + 1; i <= a2; i++) {
                for (int j = b1 + 1; j <= b2; j++) {
                    dp[1][i][j] += dp[0][i][j - 1];
                    dp[1][i][j] += dp[1][i][j - 1] * i % MOD;
                    dp[1][i][j] %= MOD;


                    //dp[0][i][j] += dp[0][i][j - 1] * (i - 1) % MOD;
                    dp[0][i][j] += dp[0][i - 1][j] * j % MOD;
                    dp[0][i][j] += dp[1][i - 1][j] * j % MOD;
                    dp[0][i][j] %= MOD;
                }
            }
            long ans = (dp[0][a2][b2] + dp[1][a2][b2]) % MOD;
            out.ans(ans).ln();
            //Arrays.stream(dp[0]).map(Arrays::toString).forEach(System.out::println);
            //Arrays.stream(dp[1]).map(Arrays::toString).forEach(System.out::println);

        /*
        long inv2 = new ModMath(MOD).inv(2);

        dp[0][a1][b1] = 1;
        for (int i = a1 + 1; i <= a2; i++) {
            dp[0][i][b1] = dp[0][i - 1][b1] * (b1 - 1) % MOD;
            dp[1][i][b1] = (dp[1][i - 1][b1] + dp[0][i - 1][b1]) % MOD;
        }
        for (int i = b1 + 1; i <= b2; i++) {
            dp[0][a1][i] = dp[0][a1][i - 1] * (a1 - 1) % MOD;
            dp[2][a1][i] = (dp[2][a1][i - 1] + dp[0][a1][i - 1]) % MOD;
        }


        for (int i = a1 + 1; i <= a2; i++) {
            for (int j = b1 + 1; j <= b2; j++) {
                dp[0][i][j] += dp[0][i - 1][j] * (j - 1) % MOD;
                dp[0][i][j] += dp[0][i][j - 1] * (i - 1) % MOD;
                dp[0][i][j] += dp[1][i][j - 1] * (i - 1) % MOD;
                dp[0][i][j] += dp[2][i - 1][j] * (j - 1) % MOD;
                //dp[0][i][j] += dp[0][i - 1][j - 1] * (i - 1) % MOD * (j - 1) % MOD;
                //dp[0][i][j] += dp[1][i - 1][j - 1] * (i - 1) % MOD * (j - 1) % MOD;
                //dp[0][i][j] += dp[2][i - 1][j - 1] * (i - 1) % MOD * (j - 1) % MOD;
                dp[0][i][j] %= MOD;

                dp[1][i][j] += dp[0][i - 1][j];
                dp[1][i][j] += dp[1][i - 1][j];
                dp[1][i][j] += dp[2][i - 1][j];
                dp[1][i][j] += dp[1][i - 1][j] * (j - 1) % MOD;
                dp[1][i][j] %= MOD;

                dp[2][i][j] += dp[0][i][j - 1];
                dp[2][i][j] += dp[1][i][j - 1];
                dp[2][i][j] += dp[2][i][j - 1];
                dp[2][i][j] += dp[2][i][j - 1] * (i - 1) % MOD;
                dp[2][i][j] %= MOD;
            }
        }

        long ans = (dp[0][a2][b2] + dp[1][a2][b2] + dp[2][a2][b2]) % MOD;
        out.ans(ans).ln();*/
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
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
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

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

