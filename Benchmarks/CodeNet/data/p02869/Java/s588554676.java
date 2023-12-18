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
        ENonTriangularTriplets solver = new ENonTriangularTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class ENonTriangularTriplets {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long k = in.longs();
            long[] a = new long[n], b = new long[n], c = new long[n];
            for (int i = 0; i < n; i++) c[i] = k + 2 * n + i;
            for (int i = 0; i <= (n - 1) / 2; i++) {
                a[i] = k + ((n - 1) / 2) - i;
                b[i] = k + n + i * 2;
            }
            for (int i = (n + 1) / 2; i < n; i++) {
                int j = i - ((n + 1) / 2);
                a[i] = k + (n - 1) - j;
                b[i] = k + n + j * 2 + 1;
            }
            boolean ok = true;
            for (int i = 0; i < n; i++) {
                if (a[i] + b[i] > c[i]) {
                    ok = false;
                    break;
                }
            }
            //System.out.println(Arrays.toString(a));
            //System.out.println(Arrays.toString(b));
            //System.out.println(Arrays.toString(c));

            if (!ok) {
                out.ans(-1);
                return;
            }
            for (int i = 0; i < n; i++) {
                out.ans(a[i]).ans(b[i]).ans(c[i]).ln();
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

        public long longs() {
            return Long.parseLong(string());
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
}

