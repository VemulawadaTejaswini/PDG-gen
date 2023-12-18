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
        EYutori solver = new EYutori();
        solver.solve(1, in, out);
        out.close();
    }

    static class EYutori {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), k = in.ints(), c = in.ints();
            char[] s = in.chars();

            int[] left = new int[n], last = new int[n];
            for (int i = 0; i < n; i++) {
                if (s[i] == 'x') {
                    if (0 < i) {
                        left[i] = left[i - 1];
                        last[i] = last[i - 1];
                    }
                } else {
                    left[i] = 1;
                    last[i] = i;
                    if (0 <= i - c - 1) left[i] += left[i - c - 1];
                    if (0 < i && left[i - 1] == left[i]) {
                        last[i] = last[i - 1];
                    }
                }
            }
            int[] right = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                if (s[i] == 'o') {
                    right[i] = 1;
                    if (i + c + 1 < n) right[i] += right[i + c + 1];
                } else {
                    right[i] = i + 1 < n ? right[i + 1] : 0;
                }
            }

            //System.out.println(Arrays.toString(left));
            //System.out.println(Arrays.toString(right));

            for (int i = 0; i < n; i++) {
                int count;
                if (0 < i) {
                    count = left[i - 1];
                    int next = Math.max(last[i - 1] + c + 1, i + 1);
                    if (next < n) count += right[next];
                } else {
                    count = i + 1 < n ? right[i + 1] : 0;
                }
                //System.out.println("i=" + i + " count=" + count);
                if (count < k) out.ans(i + 1).ln();
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

        public char[] chars() {
            return string().toCharArray();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

