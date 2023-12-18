import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.AbstractCollection;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
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
        FAbsoluteMinima solver = new FAbsoluteMinima();
        solver.solve(1, in, out);
        out.close();
    }

    static class FAbsoluteMinima {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int q = in.ints();
            long b = 0;
            FAbsoluteMinima.Tree ts = new FAbsoluteMinima.Tree();
            for (int i = 0; i < q; i++) {
                int t = in.ints();
                if (t == 1) {
                    ts.add(in.longs());
                    b += in.longs();
                } else {
                    long x = ts.mid();
                    out.ans(x).ans(ts.min(x) + b).ln();
                }
            }
        }

        private static class Tree {
            PriorityQueue<Long> p = new PriorityQueue<>(Comparator.reverseOrder());
            PriorityQueue<Long> q = new PriorityQueue<>(Comparator.naturalOrder());
            long psum;
            long qsum;

            void add(long x) {
                if (p.isEmpty() || p.peek() >= x) {
                    p.offer(x);
                    psum += x;
                    if (!p.isEmpty() && p.size() > q.size() + 1) {
                        long y = p.poll();
                        psum -= y;
                        qsum += y;
                        q.offer(y);
                    }
                } else {
                    q.offer(x);
                    if (q.size() > p.size()) {
                        long y = q.poll();
                        qsum -= y;
                        psum += y;
                        p.offer(y);
                    }
                }
            }

            long mid() {
                if ((!q.isEmpty() && p.peek() > q.peek()) || !(p.size() == q.size() || p.size() - 1 == q.size()))
                    throw new RuntimeException();
                return p.peek();
            }

            long min(long d) {
                long left = p.size() * d - psum;
                long right = qsum - q.size() * d;
                return left + right;
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

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
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

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

