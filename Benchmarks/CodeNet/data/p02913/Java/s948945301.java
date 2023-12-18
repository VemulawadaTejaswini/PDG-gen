import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
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
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            String s = in.string();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int[] z = StringUtil.zalgorithm(s.substring(i));
                for (int j = 0; j < n - i; j++) {
                    ans = Math.max(ans, Math.min(j, z[j]));
                }
            }
            out.ans(ans).ln();
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

    static class StringUtil {
        private StringUtil() {
        }

        public static int[] zalgorithm(int[] s) {
            int n = s.length;
            int[] a = new int[n + 1];
            a[0] = n;
            for (int i = 1, j = 0; i < n; ) {
                while (i + j < n && s[j] == s[i + j]) j++;
                a[i] = j;
                if (j == 0) {
                    i++;
                    continue;
                }
                int k = 1;
                while (i + k < n && k + a[k] < j) {
                    a[i + k] = a[k];
                    k++;
                }
                i += k;
                j -= k;
            }
            return a;
        }

        public static int[] zalgorithm(String s) {
            return zalgorithm(s.chars().toArray());
        }

    }

    static interface Verified {
    }
}

