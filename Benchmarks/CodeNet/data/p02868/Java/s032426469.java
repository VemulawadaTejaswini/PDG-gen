import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        DShortestPathOnALine solver = new DShortestPathOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DShortestPathOnALine {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints();
            DShortestPathOnALine.Bridge[] bridges = new DShortestPathOnALine.Bridge[m];
            for (int i = 0; i < m; i++) {
                bridges[i] = new DShortestPathOnALine.Bridge(in.ints() - 1, in.ints() - 1, in.longs());
            }
            PriorityQueue<DShortestPathOnALine.Bridge> q = new PriorityQueue<>(Comparator.comparing(bridge -> bridge.costFrom0));
            PriorityQueue<DShortestPathOnALine.Bridge> b = new PriorityQueue<>(Comparator.comparing(bridge -> bridge.s));
            for (int i = 0; i < m; i++) b.offer(bridges[i]);
            while (!b.isEmpty() && b.peek().s == 0) q.offer(b.poll());
            for (int i = 0; i < n; i++) {
                while (!q.isEmpty() && q.peek().t < i) q.poll();
                if (q.isEmpty()) break;
                long cost = q.peek().costFrom0;
                //System.out.println("i=" + i + ": " + cost);
                while (!b.isEmpty() && b.peek().s <= i) {
                    DShortestPathOnALine.Bridge peek = b.poll();
                    peek.costFrom0 += cost;
                    q.offer(peek);
                }
            }
            out.ans(q.isEmpty() ? -1 : q.peek().costFrom0);
        }

        private static class Bridge {
            int s;
            int t;
            long cost;
            long costFrom0;

            Bridge(int s, int t, long cost) {
                this.s = s;
                this.t = t;
                this.cost = cost;
                this.costFrom0 = cost;
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

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

