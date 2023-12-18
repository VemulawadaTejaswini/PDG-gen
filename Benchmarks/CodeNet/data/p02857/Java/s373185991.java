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
        EMajorityOfBalls solver = new EMajorityOfBalls();
        solver.solve(1, in, out);
        out.close();
    }

    static class EMajorityOfBalls {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            out.enableAutoFlush();
            in = in;
            out = out;

            int n = in.ints();

            char init = 0;
            out.ans('?');
            for (int i = 0; i < n; i++) out.ans(i + 1);
            out.ln().flush();
            init = in.string().charAt(0);

            int min = 0, max = n;
            while (max - min > 1) {
                int mid = (min + max) / 2;
                out.ans('?');
                for (int i = 0; i < n; i++) out.ans(mid + i + 1);
                out.ln().flush();
                if (in.string().charAt(0) == init) min = mid;
                else max = mid;
            }

            char[] res = new char[2 * n];
            res[min] = init;


            int pivot = -1;
            for (int i = 0; i < 2 * n; i++) {
                if (min <= i && i < min + n) continue;
                out.ans('?').ans(i + 1);
                for (int j = 1; j < n; j++) out.ans(min + j + 1);
                out.ln().flush();
                res[i] = in.string().charAt(0);
                if (res[i] != init) pivot = i;
            }


            for (int i = min + 1; i < min + n; i++) {
                out.ans('?').ans(i + 1);
                for (int j = 0; j < 2 * n; j++) {
                    if ((min <= j && j < min + n) || j == pivot) continue;
                    out.ans(j + 1);
                }
                out.ln().flush();
                res[i] = in.string().charAt(0);
            }

            out.ans('!').ans(String.valueOf(res)).ln().flush();
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

        public void enableAutoFlush() {
            autoflush = true;
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

        public LightWriter ans(char c) {
            if (!breaked) {
                print(' ');
            }
            return print(c);
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

        public LightWriter flush() {
            try {
                out.flush();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
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

