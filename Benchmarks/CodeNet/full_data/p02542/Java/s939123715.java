import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.nio.CharBuffer;
import java.io.IOException;
import java.nio.charset.CharsetDecoder;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.io.UncheckedIOException;
import java.security.AccessControlException;
import java.io.Writer;
import java.util.BitSet;
import java.io.InputStream;

/**
 * Built using CHelper reloaded plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner2 in = new LightScanner2(inputStream);
        LightWriter2 out = new LightWriter2(outputStream);
        CMovingPieces solver = new CMovingPieces();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMovingPieces {
        public void solve(int testNumber, LightScanner2 in, LightWriter2 out) {
            int n = in.ints(), m = in.ints();
            int bias = n + m;
            char[][] b = in.chars(n);

            AclMinCostFlow flow = new AclMinCostFlow(2 * n * m + 2);
            int s = 2 * n * m, t = 2 * n * m + 1, nm = n * m;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (b[i][j] != '#') flow.addEdge(nm + i * m + j, t, 1, 0);
                    if (b[i][j] == 'o') flow.addEdge(s, i * m + j, 1, 0);
                }
            }
            BitSet[][] f = new BitSet[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    f[i][j] = new BitSet(n * m);
                    if (b[i][j] != '#') f[i][j].set(i * m + j);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (b[i][j] == '#') continue;
                    if (i != 0) f[i][j].or(f[i - 1][j]);
                    if (j != 0) f[i][j].or(f[i][j - 1]);
                    for (int k = 0; k < n * m; k++) {
                        if (!f[i][j].get(k)) continue;
                        int ki = k / m, kj = k % m;
                        flow.addEdge(k, nm + i * m + j, 1, bias - Math.abs(i - ki) - Math.abs(j - kj));
                    }
                }
            }

            long[] ans = flow.minCostFlow(s, t, n);
            out.ans(-ans[1] + bias * ans[0]).ln();
        }

    }

    static class AclMinCostFlow {
        private static final long INF = Long.MAX_VALUE;
        private final int n;
        private int m;
        private final java.util.ArrayList<WeightedCapEdge> edges;
        private final int[] count;
        private final WeightedCapEdge[][] g;
        private final long[] potential;
        private final long[] dist;
        private final WeightedCapEdge[] prev;
        private long addFlow;
        private long addCost;

        public AclMinCostFlow(int n) {
            this.n = n;
            this.edges = new java.util.ArrayList<>();
            this.count = new int[n];
            this.g = new WeightedCapEdge[n][];
            this.potential = new long[n];
            this.dist = new long[n];
            this.prev = new WeightedCapEdge[n];
        }

        public int addEdge(int from, int to, long cap, long cost) {
            rangeCheck(from, 0, n);
            rangeCheck(to, 0, n);
            nonNegativeCheck(cap, "Capacity");
            nonNegativeCheck(cost, "Cost");
            WeightedCapEdge e = new WeightedCapEdge(from, to, cap, cost, count[to]);
            count[from]++;
            count[to]++;
            edges.add(e);
            return m++;
        }

        private void buildGraph() {
            for (int i = 0; i < n; i++) {
                g[i] = new WeightedCapEdge[count[i]];
            }
            int[] idx = new int[n];
            for (WeightedCapEdge e : edges) {
                g[e.to][idx[e.to]++] = new WeightedCapEdge(e.to, e.from, 0, -e.cost, idx[e.from]);
                g[e.from][idx[e.from]++] = e;
            }
        }

        public long[] minCostFlow(int s, int t, long flowLimit) {
            rangeCheck(s, 0, n);
            rangeCheck(t, 0, n);
            if (s == t) {
                throw new IllegalArgumentException(String.format("s = t = %d", s));
            }
            nonNegativeCheck(flowLimit, "Flow");
            buildGraph();
            long flow = 0;
            long cost = 0;
            while (true) {
                dijkstra(s, t, flowLimit - flow);
                if (addFlow == 0) break;
                flow += addFlow;
                cost += addFlow * addCost;
            }
            return new long[]{flow, cost};
        }

        private void dijkstra(int s, int t, long maxFlow) {
            final class State implements Comparable<State> {
                final int v;
                final long d;

                State(int v, long d) {
                    this.v = v;
                    this.d = d;
                }

                public int compareTo(State s) {
                    return d == s.d ? v - s.v : d > s.d ? 1 : -1;
                }
            }
            Arrays.java.util.Arrays.fill(dist, INF);
            dist[s] = 0;
            java.util.PriorityQueue<State> pq = new java.util.PriorityQueue<>();
            pq.add(new State(s, 0l));
            while (pq.size() > 0) {
                State st = pq.poll();
                int u = st.v;
                if (st.d != dist[u]) continue;
                for (WeightedCapEdge e : g[u]) {
                    if (e.cap <= 0) continue;
                    int v = e.to;
                    long nextCost = dist[u] + e.cost + potential[u] - potential[v];
                    if (nextCost < dist[v]) {
                        dist[v] = nextCost;
                        prev[v] = e;
                        pq.add(new State(v, dist[v]));
                    }
                }
            }
            if (dist[t] == INF) {
                addFlow = 0;
                addCost = INF;
                return;
            }
            for (int i = 0; i < n; i++) {
                potential[i] += dist[i];
            }
            addCost = 0;
            addFlow = maxFlow;
            for (int v = t; v != s; ) {
                WeightedCapEdge e = prev[v];
                addCost += e.cost;
                addFlow = Math.java.lang.Math.min(addFlow, e.cap);
                v = e.from;
            }
            for (int v = t; v != s; ) {
                WeightedCapEdge e = prev[v];
                e.cap -= addFlow;
                g[v][e.rev].cap += addFlow;
                v = e.from;
            }
        }

        private void rangeCheck(int i, int minInclusive, int maxExclusive) {
            if (i < 0 || i >= maxExclusive) {
                throw new IndexOutOfBoundsException(
                        String.format("Index %d out of bounds for length %d", i, maxExclusive)
                );
            }
        }

        private void nonNegativeCheck(long cap, java.lang.String attribute) {
            if (cap < 0) {
                throw new IllegalArgumentException(
                        String.format("%s %d is negative.", attribute, cap)
                );
            }
        }

        public class WeightedCapEdge {
            private final int from;
            private final int to;
            private long cap;
            private long cost;
            private final int rev;

            WeightedCapEdge(int from, int to, long cap, long cost, int rev) {
                this.from = from;
                this.to = to;
                this.cap = cap;
                this.cost = cost;
                this.rev = rev;
            }

        }

    }

    static abstract class LightScannerAdapter implements AutoCloseable {
        public abstract String string();

        public char[] chars() {
            return string().toCharArray();
        }

        public final char[][] chars(int h) {
            char[][] res = new char[h][];
            Arrays.setAll(res, ignored -> chars());
            return res;
        }

        public abstract void close();

    }

    static class LightScanner2 extends LightScannerAdapter {
        private static final int BUF_SIZE = 1024 * 1024;
        private final InputStream stream;
        private final StringBuilder builder = new StringBuilder();
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private int len;

        public LightScanner2(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (ptr < len) return buf[ptr++];
            try {
                ptr = 0;
                len = stream.read(buf);
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (len == -1) return -1;
            return buf[ptr++];
        }

        private void skip() {
            int b;
            while (isTokenSeparator(b = read()) && b != -1) ;
            if (b == -1) throw new NoSuchElementException("EOF");
            ptr--;
        }

        private void loadToken() {
            builder.setLength(0);
            skip();
            for (int b = read(); !isTokenSeparator(b); b = read()) {
                builder.appendCodePoint(b);
            }
        }

        public String string() {
            loadToken();
            return builder.toString();
        }

        public char[] chars() {
            loadToken();
            char[] res = new char[builder.length()];
            builder.getChars(0, builder.length(), res, 0);
            return res;
        }

        public int ints() {
            long x = longs();
            if (x < Integer.MIN_VALUE || Integer.MAX_VALUE < x) throw new NumberFormatException("Overflow");
            return (int) x;
        }

        public long longs() {
            skip();
            int b = read();
            boolean negate;
            if (b == '-') {
                negate = true;
                b = read();
            } else negate = false;
            long x = 0;
            for (; !isTokenSeparator(b); b = read()) {
                if ('0' <= b && b <= '9') x = x * 10 + b - '0';
                else throw new NumberFormatException("Unexpected character '" + b + "'");
            }
            return negate ? -x : x;
        }

        public void close() {
            try {
                stream.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        private static boolean isTokenSeparator(int b) {
            return b < 33 || 126 < b;
        }

    }

    static class LightWriter2 implements AutoCloseable {
        private static final int BUF_SIZE = 1024 * 1024;
        private static final int BUF_THRESHOLD = 64 * 1024;
        private final OutputStream out;
        private final byte[] buf = new byte[BUF_SIZE];
        private int ptr;
        private final Field fastStringAccess;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter2(OutputStream out) {
            this.out = out;
            Field f;
            try {
                f = String.class.getDeclaredField("value");
                f.setAccessible(true);
                if (f.getType() != byte[].class) f = null;
            } catch (ReflectiveOperationException | AccessControlException ignored) {
                f = null;
            }
            this.fastStringAccess = f;
        }

        public LightWriter2(Writer out) {
            this.out = new LightWriter2.WriterOutputStream(out);
            this.fastStringAccess = null;
        }

        private void allocate(int n) {
            if (ptr + n <= BUF_SIZE) return;
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            if (BUF_SIZE < n) throw new IllegalArgumentException("Internal buffer exceeded");
        }

        public void close() {
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.flush();
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

        public LightWriter2 print(char c) {
            allocate(1);
            buf[ptr++] = (byte) c;
            breaked = false;
            return this;
        }

        public LightWriter2 print(String s) {
            byte[] bytes;
            if (this.fastStringAccess == null) bytes = s.getBytes();
            else {
                try {
                    bytes = (byte[]) fastStringAccess.get(s);
                } catch (IllegalAccessException ignored) {
                    bytes = s.getBytes();
                }
            }
            int n = bytes.length;
            if (n <= BUF_THRESHOLD) {
                allocate(n);
                System.arraycopy(bytes, 0, buf, ptr, n);
                ptr += n;
                return this;
            }
            try {
                out.write(buf, 0, ptr);
                ptr = 0;
                out.write(bytes);
                out.flush();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        private int print(long l) {
            if (l == 0) {
                print('0');
                return 1;
            } else if (l < 0) {
                print('-');
                l = -l;
            }
            int n = 0;
            long t = l;
            while (t > 0) {
                t /= 10;
                n++;
            }
            allocate(n);
            for (int i = 1; i <= n; i++) {
                buf[ptr + n - i] = (byte) (l % 10 + '0');
                l /= 10;
            }
            ptr += n;
            return n;
        }

        public LightWriter2 ans(long l) {
            if (!breaked) {
                print(' ');
            }
            breaked = false;
            print(l);
            return this;
        }

        public LightWriter2 ln() {
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

        private static class WriterOutputStream extends OutputStream {
            final Writer writer;
            final CharsetDecoder decoder;

            WriterOutputStream(Writer writer) {
                this.writer = writer;
                this.decoder = StandardCharsets.UTF_8.newDecoder();
            }

            public void write(int b) throws IOException {
                writer.write(b);
            }

            public void write(byte[] b) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b)).array());
            }

            public void write(byte[] b, int off, int len) throws IOException {
                writer.write(decoder.decode(ByteBuffer.wrap(b, off, len)).array());
            }

            public void flush() throws IOException {
                writer.flush();
            }

            public void close() throws IOException {
                writer.close();
            }

        }

    }
}

