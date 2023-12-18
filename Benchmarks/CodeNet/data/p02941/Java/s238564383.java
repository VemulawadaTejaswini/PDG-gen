import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
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
        CNumbersOnACircle solver = new CNumbersOnACircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CNumbersOnACircle {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long[] a = in.longs(n), b = in.longs(n);
            PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.comparing(i -> -b[i]));
            boolean[] done = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    out.ans(-1).ln();
                    return;
                } else if (a[i] != b[i]) q.offer(i);
                else done[i] = true;
            }
            long ans = 0;
            while (!q.isEmpty()) {
                int i = q.poll();
                long pre = b[(i + n - 1) % n], nxt = b[(i + 1) % n];
                long delta = pre + nxt;
                long dest = a[i];
                if (!done[(i + n - 1) % n]) dest = Math.max(dest, pre);
                if (!done[(i + 1) % n]) dest = Math.max(dest, nxt);

                long cnt = (b[i] - dest + delta - 1) / delta;
                //System.out.println(cnt + " ops on b[" + i + "]=" + b[i]);
                b[i] -= cnt * delta;
                ans += cnt;


                if (a[i] > b[i]) {
                    out.ans(-1).ln();
                    return;
                } else if (a[i] != b[i]) q.offer(i);
                else done[i] = true;
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

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

    }
}

