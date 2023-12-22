import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.NoSuchElementException;
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
        FManySlimes solver = new FManySlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class FManySlimes {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            String s = in.string();
            KMP kmp = new KMP(in.string());
            kmp.search(s).forEachRemaining(i -> out.ans(i).ln());
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

        public LightWriter ans(Object obj) {
            return ans(Objects.toString(obj));
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

    static class KMP {
        private final int n;
        private final int[] target;
        private final int[] table;

        public KMP(int[] target) {
            this.n = target.length;
            this.target = Arrays.copyOf(target, n);
            this.table = new int[n];
            this.table[0] = -1;
            int i = 2, j = 0;
            while (i < n) {
                if (this.target[i - 1] == this.target[j]) {
                    this.table[i] = ++j;
                    i++;
                } else if (j > 0) {
                    j = this.table[j];
                } else {
                    this.table[i] = 0;
                    i++;
                }
            }
        }

        public KMP(String target) {
            this(target.chars().toArray());
        }

        public Iterator<Integer> search(int[] s) {
            return new Match(s);
        }

        public Iterator<Integer> search(String s) {
            return search(s.chars().toArray());
        }

        private class Match implements Iterator<Integer> {
            int[] s;
            int m = 0;
            int i = 0;
            boolean hasNext;

            Match(int[] s) {
                this.s = s;
                hasNext = seek();
            }

            boolean seek() {
                while (m + i < s.length) {
                    if (target[i] == s[m + i]) {
                        if (++i == n) return true;
                    } else {
                        m = m + i - table[i];
                        if (i > 0) i = table[i];
                    }
                }
                return false;
            }

            public boolean hasNext() {
                return hasNext;
            }

            public Integer next() {
                if (!hasNext) throw new NoSuchElementException();
                int res = m++;
                i = n > 1 ? table[n - 1] : 0;
                hasNext = seek();
                return res;
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

    }
}


