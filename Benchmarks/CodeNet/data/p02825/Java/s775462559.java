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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        private static final char[][] TABLE_3 = {
                {'a', 'd', 'd',},
                {'a', '.', 'c',},
                {'b', 'b', 'c',},
        };
        private static final char[][] TABLE_X = {
                {'a', 'a'},
                {'b', 'b'},
        };
        private static final char[][] TABLE_Y = {
                {'c', 'd'},
                {'c', 'd'},
        };
        private static final char[][] TABLE_5 = {
                {'a', '.', 'b', 'c', 'c'},
                {'a', '.', 'b', 'd', '.'},
                {'.', 'g', 'g', 'd', 'e'},
                {'h', 'h', 'j', '.', 'e'},
                {'i', 'i', 'j', 'f', 'f'},
        };
        private static final char[][] TABLE_7 = {
                {'a', 'a', 'b', 'b', 'c', 'c', '.'},
                {'x', 'x', 'y', '.', '.', '.', 'a'},
                {'w', 'a', 'y', '.', '.', '.', 'a'},
                {'w', 'z', 'z', '.', '.', '.', 'b'},
                {'.', '.', '.', 'x', 'x', 'y', 'b'},
                {'.', '.', '.', 'w', '.', 'y', 'c'},
                {'.', '.', '.', 'w', 'z', 'z', 'c'},
        };

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            if (n == 2) {
                out.ans(-1).ln();
            } else if (n % 3 == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        out.print(TABLE_3[i % 3][j % 3]);
                    }
                    out.ln();
                }
            } else if (n % 2 == 0) {
                char[][] ans = new char[n][n];
                ArrayUtil.fill(ans, '.');
                for (int i = 0; i < n - 2; i += 2) {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            ans[i + j][i + k] = TABLE_X[j][k];
                            ans[i + j][i + k + 2] = TABLE_Y[j][k];
                        }
                    }
                }
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        ans[n - 2 + j][n - 2 + k] = TABLE_X[j][k];
                        ans[n - 2 + j][k] = TABLE_Y[j][k];
                    }
                }
                for (int i = 0; i < n; i++) {
                    out.ans(String.valueOf(ans[i])).ln();
                }
            } else if (n % 5 == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        out.print(TABLE_5[i % 5][j % 5]);
                    }
                    out.ln();
                }
            } else if (n % 7 == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        out.print(TABLE_7[i % 7][j % 7]);
                    }
                    out.ln();
                }
            } else {
                int t = n, c = 0;
                while (t % 2 != 0) {
                    t -= 5;
                    c++;
                }
                if (t < 4) {
                    out.ans(-1).ln();
                    return;
                }
                char[][] ans = new char[n][n];
                ArrayUtil.fill(ans, '.');
                for (int i = 0; i < t - 2; i += 2) {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            ans[i + j][i + k] = TABLE_X[j][k];
                            ans[i + j][i + k + 2] = TABLE_Y[j][k];
                        }
                    }
                }
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        ans[t - 2 + j][t - 2 + k] = TABLE_X[j][k];
                        ans[t - 2 + j][k] = TABLE_Y[j][k];
                    }
                }
                for (int i = 0; i < c; i++) {
                    for (int j = 0; j < 5; j++) {
                        for (int k = 0; k < 5; k++) {
                            ans[t + i * 5 + j][t + i * 5 + k] = TABLE_5[j][k];
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    out.ans(String.valueOf(ans[i])).ln();
                }
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

