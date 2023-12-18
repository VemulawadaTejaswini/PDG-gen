import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.IntUnaryOperator;
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
        CSnukeTheWizard solver = new CSnukeTheWizard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSnukeTheWizard {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), q = in.ints();
            String s = in.string();
            char[] t = new char[q], d = new char[q];
            for (int i = 0; i < q; i++) {
                t[i] = in.string().charAt(0);
                d[i] = in.string().charAt(0);
            }

            IntUnaryOperator move = x -> {
                int cur = x;
                for (int i = 0; i < q; i++) {
                    if (cur >= n) {
                        return n;
                    } else if (cur < 0) {
                        return -1;
                    }
                    if (s.charAt(cur) == t[i]) {
                        if (d[i] == 'L') {
                            cur--;
                        } else {
                            cur++;
                        }
                    }
                }
                return cur;
            };

            int rangeMin, rangeMax;
            {
                int min = -1, max = n;
                while (max - min > 1) {
                    int mid = (min + max) / 2;
                    if (n <= move.applyAsInt(mid)) {
                        max = mid;
                    } else {
                        min = mid;
                    }
                }
                rangeMax = min;
            }

            {
                int min = -1, max = n;
                while (max - min > 1) {
                    int mid = (min + max + 1) / 2;
                    if (move.applyAsInt(mid) < 0) {
                        min = mid;
                    } else {
                        max = mid;
                    }
                }
                rangeMin = max;
            }


            //System.out.println("(" + l + ", " + r + ")");
            //System.out.println("[" + rangeMin + ", " + rangeMax + "]");

            out.ansln(Math.min(Math.max(0, rangeMax - rangeMin + 1), n));
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

        public LightWriter ansln(int... n) {
            for (int n1 : n) {
                ans(n1).ln();
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

