import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
        DFTRobot solver = new DFTRobot();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFTRobot {
        private static final int OFFSET = 10000;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            char[] s = in.string().toCharArray();
            int x = in.ints(), y = in.ints();
            int[] xs = new int[10000], ys = new int[100000];
            int xlen = 0, ylen = 0;
            int dir = -1;
            for (char c : s) {
                if (c == 'F') {
                    if (dir == -1) x--;
                    else if (dir % 2 == 0) ys[ylen - 1]++;
                    else xs[xlen - 1]++;
                } else {
                    dir++;
                    if (dir % 2 == 0 && !(ylen > 0 && ys[ylen - 1] == 0)) ylen++;
                    else if (!(xlen > 0 && xs[xlen - 1] == 0)) xlen++;
                }
            }
            xs = Arrays.copyOf(xs, xlen);
            ys = Arrays.copyOf(ys, ylen);
            out.ans(solve(x, xs) && solve(y, ys)).ln();
        }

        private static boolean solve(int x, int[] a) {
            int n = a.length;
            boolean[][] dp = new boolean[n + 1][OFFSET * 2];
            dp[0][OFFSET + x] = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2 * OFFSET - a[i]; j++) dp[i + 1][j + a[i]] |= dp[i][j];
                for (int j = a[i]; j < 2 * OFFSET; j++) dp[i + 1][j - a[i]] |= dp[i][j];
            }
            return dp[n][OFFSET];
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;
        private LightWriter.BoolLabel boolLabel = LightWriter.BoolLabel.YES_NO_FIRST_UP;

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

        public LightWriter ans(boolean b) {
            return ans(boolLabel.transfer(b));
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

        public enum BoolLabel {
            YES_NO_FIRST_UP("Yes", "No"),
            YES_NO_ALL_UP("YES", "NO"),
            YES_NO_ALL_DOWN("yes", "no"),
            Y_N_ALL_UP("Y", "N"),
            POSSIBLE_IMPOSSIBLE_FIRST_UP("Possible", "Impossible"),
            POSSIBLE_IMPOSSIBLE_ALL_UP("POSSIBLE", "IMPOSSIBLE"),
            POSSIBLE_IMPOSSIBLE_ALL_DOWN("possible", "impossible"),
            FIRST_SECOND_FIRST_UP("First", "Second"),
            FIRST_SECOND_ALL_UP("FIRST", "SECOND"),
            FIRST_SECOND_ALL_DOWN("first", "second"),
            ALICE_BOB_FIRST_UP("Alice", "Bob"),
            ALICE_BOB_ALL_UP("ALICE", "BOB"),
            ALICE_BOB_ALL_DOWN("alice", "bob"),
            ;
            private final String positive;
            private final String negative;

            BoolLabel(String positive, String negative) {
                this.positive = positive;
                this.negative = negative;
            }

            private String transfer(boolean f) {
                return f ? positive : negative;
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
}

