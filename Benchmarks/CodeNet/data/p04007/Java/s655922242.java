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
        CANDGrid solver = new CANDGrid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CANDGrid {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints();
            char[][] ans0 = new char[n][m], ans1 = new char[n][m];
            ArrayUtil.fill(ans0, '.');
            ArrayUtil.fill(ans1, '.');
            for (int i = 0; i < m; i++) {
                ans0[0][i] = ans1[n - 1][i] = '#';
                for (int j = 1; j < n - 1; j++) {
                    if (i % 2 == 0) ans0[j][i] = '#';
                    else ans1[j][i] = '#';
                }
            }
            for (int i = 0; i < n; i++) {
                char[] s = in.string().toCharArray();
                for (int j = 0; j < m; j++) {
                    if (s[j] == '#') ans0[i][j] = ans1[i][j] = '#';
                }
            }
            for (int i = 0; i < n; i++) out.ans(String.valueOf(ans0[i])).ln();
            out.ln();
            for (int i = 0; i < n; i++) out.ans(String.valueOf(ans1[i])).ln();
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

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(char[] a, char v) {
            Arrays.fill(a, v);
        }

        public static void fill(char[][] a, char v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }
}

