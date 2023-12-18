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
        D2MagicSquare2 solver = new D2MagicSquare2();
        solver.solve(1, in, out);
        out.close();
    }

    static class D2MagicSquare2 {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int a = in.ints(), b = in.ints(), c = in.ints();
            int s = 3 * c;
            {
                int[][] ans = new int[3][3];
                ans[0][0] = a;
                ans[0][1] = b;
                ans[1][1] = c;
                ans[0][2] = s - a - b;
                ans[2][2] = s - a - c;
                ans[1][2] = s - ans[0][2] - ans[2][2];
                ans[2][1] = s - ans[0][1] - ans[1][1];
                ans[1][0] = s - ans[1][1] - ans[1][2];
                ans[2][0] = s - ans[0][0] - ans[1][0];

            /*{
                int s3 = 0, s4 = 0;
                for (int i = 0; i < 3; i++) {
                    int s1 = 0, s2 = 0;
                    for (int j = 0; j < 3; j++) {
                        s1 += ans[i][j];
                        s2 += ans[j][i];
                    }
                    if (s1 != s || s2 != s) continue outer;
                    s3 += ans[i][i];
                    s4 += ans[i][2 - i];
                }
                if (s3 != s || s4 != s) continue outer;
            }*/

                for (int i = 0; i < 3; i++) {
                    out.ans(ans[i]).ln();
                }
            }
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
        }

        public LightWriter ans(int... n) {
            for (int n1 : n) {
                ans(n1);
            }
            return this;
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
}

