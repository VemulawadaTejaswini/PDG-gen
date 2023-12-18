import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
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
        FPermutationOddness solver = new FPermutationOddness();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPermutationOddness {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), k = in.ints();
            if (k % 2 == 1 || k > (n * n) / 2) {
                out.ans(0).ln();
            } else if (k == 0) {
                out.ans(1).ln();
            } else if (n <= 10) {
                int ans = 0;
                int[] test = IntStream.range(0, n).toArray();
                while (test != null) {
                    int oddness = 0;
                    for (int i = 0; i < n; i++) oddness += Math.abs(i - test[i]);
                    if (oddness == k) ans++;
                    test = Permutation.nextPermutation(test);
                }
                out.ans(ans).ln();
            } else {
                throw new RuntimeException();
            }
        }

    }

    static final class Permutation {
        private int[] next;

        public Permutation(int n) {
            next = IntStream.range(0, n).toArray();
        }

        public static int[] nextPermutation(int[] a) {
            if (a == null || a.length < 2) {
                return null;
            }
            int p = 0;
            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i] < a[i + 1]) {
                    p = i;
                    break;
                }
            }
            int q = 0;
            for (int i = a.length - 1; i > p; i--) {
                if (a[i] > a[p]) {
                    q = i;
                    break;
                }
            }
            if (p == 0 && q == 0) {
                return null;
            }
            int temp = a[p];
            a[p] = a[q];
            a[q] = temp;
            ArrayUtil.reverse(a, p + 1, a.length);
            return a;
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void reverse(int[] a, int left, int right) {
            right--;
            while (left < right) {
                int temp = a[left];
                a[left++] = a[right];
                a[right--] = temp;
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

