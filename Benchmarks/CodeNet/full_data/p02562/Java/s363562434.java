import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        FastPrintStream pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(FastScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] a = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextLong();
            }
        }
        MinCostFlow mcf = new MinCostFlow(n * n + 2 * n + 2);
        int s = n * n + 2 * n;
        int t = s + 1;
        int r = n * n;
        int c = n * n + n;
        for (int i = 0; i < n; i++) {
            mcf.addEdge(s, r + i, k, 0);
            mcf.addEdge(c + i, t, k, 0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mcf.addEdge(r + i, i * n + j, 1, -a[i][j]);
                mcf.addEdge(i * n + j, c + j, 1, 0);
            }
        }
        long ans = -mcf.minCostFlow(s, t);
        char[][] g = new char[n][n];
        for (char[] gi : g) Arrays.fill(gi, '.');
        for (MinCostFlow.WeightedCapEdge e : mcf.getEdges()) {
            int u = e.from;
            int v = e.to;
            if (u == s || v == t || e.getFlow() == 0) continue;
            int i, j;
            if (u < n * n) {
                i = u / n;
                j = u % n;
            } else {
                i = v / n;
                j = v % n;
            }
            g[i][j] = 'X';
        }
        pw.println(ans);
        for (char[] gi : g) {
            pw.println(gi);
        }
    }

    static class MinCostFlow {
        public class WeightedCapEdge {
            private final int from, to;
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
            public int getFrom()  {return from;}
            public int getTo()    {return to;}
            public long getCap()  {return cap;}
            public long getCost() {return cost;}
            public long getFlow() {return g[to][rev].cap;}
        }
    
        private static final long INF = Long.MAX_VALUE;
    
        private final int n;
        private int m;
        private final java.util.ArrayList<WeightedCapEdge> edges;
        private final int[] count;
        private final WeightedCapEdge[][] g;
    
        public MinCostFlow(int n) {
            this.n = n;
            this.edges = new java.util.ArrayList<>();
            this.count = new int[n];
            this.g = new WeightedCapEdge[n][];
        }
    
        public int addEdge(int from, int to, long cap, long cost) {
            vertexRangeCheck(from);
            vertexRangeCheck(to);
            capNonNegativeCheck(cap);
            WeightedCapEdge e = new WeightedCapEdge(from, to, cap, cost, count[to]);
            count[from]++; count[to]++;
            edges.add(e);
            return m++;
        }
    
        public WeightedCapEdge getEdge(int i) {
            edgeRangeCheck(i);
            return edges.get(i);
        }
    
        public java.util.ArrayList<WeightedCapEdge> getEdges() {
            return edges;
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
    
        public long minCostFlow(int s, int t) {
            vertexRangeCheck(s);
            vertexRangeCheck(t);
            buildGraph();
            long[] dist = new long[n];
            WeightedCapEdge[] prev = new WeightedCapEdge[n];
            long cost = 0;
            while (true) {
                long c = bellmanford(s, t, dist, prev);
                if (c >= 0) {
                    return cost;
                } else {
                    for (int v = t; v != s;) {
                        WeightedCapEdge e = prev[v];
                        cost += e.cost;
                        e.cap -= 1;
                        g[v][e.rev].cap += 1;
                        v = e.from;
                    }
                }
            }
        }
    
        private long bellmanford(int s, int t, long[] dist, WeightedCapEdge[] prev) {
            java.util.Arrays.fill(dist, INF);
            dist[s] = 0;
            for (int $ = 1; $ < n; $++) {
                for (int u = 0; u < n; u++) {
                    if (dist[u] == INF) continue;
                    for (WeightedCapEdge e : g[u]) {
                        int v = e.to;
                        if (e.cap <= 0) continue;
                        if (dist[u] + e.cost < dist[v]) {
                            dist[v] = dist[u] + e.cost;
                            prev[v] = e;
                        }
                    }
                }
            }
            for (int u = 0; u < n; u++) {
                if (dist[u] == INF) continue;
                for (WeightedCapEdge e : g[u]) {
                    int v = e.to;
                    if (e.cap <= 0) continue;
                    if (dist[u] + e.cost < dist[v]) {
                        throw new AssertionError("Negative loop.");
                    }
                }
            }
            if (dist[t] == INF) return INF;
            long cost = 0;
            for (int v = t; v != s;) {
                WeightedCapEdge e = prev[v];
                cost += e.cost;
                v = e.from;
            }
            return cost;
        }
    
        private void vertexRangeCheck(int i) {
            if (i < 0 || i >= n) {
                throw new IndexOutOfBoundsException(
                    String.format("Index %d out of bounds for length %d", i, n)
                );
            }
        }
    
        private void edgeRangeCheck(int i) {
            if (i < 0 || i >= m) {
                throw new IndexOutOfBoundsException(
                    String.format("Index %d out of bounds for length %d", i, m)
                );
            }
        }
    
        private void capNonNegativeCheck(long cap) {
            if (cap < 0) {
                throw new IllegalArgumentException(
                    String.format("Capacity %d is negative.", cap)
                );
            }
        }
    }
}

class FastPrintStream implements AutoCloseable {
    private static final int BUF_SIZE = 1 << 15;
    private final byte[] buf = new byte[BUF_SIZE];
    private int ptr = 0;
    private final java.lang.reflect.Field strField;
    private final java.nio.charset.CharsetEncoder encoder;

    private java.io.OutputStream out;

    public FastPrintStream(java.io.OutputStream out) {
        this.out = out;
        java.lang.reflect.Field f;
        try {
            f = java.lang.String.class.getDeclaredField("value");
            f.setAccessible(true);
        } catch (NoSuchFieldException | SecurityException e) {
            f = null;
        }
        this.strField = f;
        this.encoder = java.nio.charset.StandardCharsets.US_ASCII.newEncoder();
    }

    public FastPrintStream(java.io.File file) throws java.io.IOException {
        this(new java.io.FileOutputStream(file));
    }

    public FastPrintStream(java.lang.String filename) throws java.io.IOException {
        this(new java.io.File(filename));
    }

    public FastPrintStream() {
        this(System.out);
        try {
            java.lang.reflect.Field f = java.io.PrintStream.class.getDeclaredField("autoFlush");
            f.setAccessible(true);
            f.set(System.out, false);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            // ignore
        }
    }

    public FastPrintStream println() {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) '\n';
        return this;
    }

    public FastPrintStream println(java.lang.Object o) {
        return print(o).println();
    }

    public FastPrintStream println(java.lang.String s) {
        return print(s).println();
    }

    public FastPrintStream println(char[] s) {
        return print(s).println();
    }

    public FastPrintStream println(char c) {
        return print(c).println();
    }

    public FastPrintStream println(int x) {
        return print(x).println();
    }

    public FastPrintStream println(long x) {
        return print(x).println();
    }

    public FastPrintStream println(double d, int precision) {
        return print(d, precision).println();
    }

    private FastPrintStream print(byte[] bytes) {
        int n = bytes.length;
        if (ptr + n > BUF_SIZE) {
            internalFlush();
            try {
                out.write(bytes);
            } catch (java.io.IOException e) {
                throw new RuntimeException();
            }
        } else {
            System.arraycopy(bytes, 0, buf, ptr, n);
            ptr += n;
        }
        return this;
    }

    public FastPrintStream print(java.lang.Object o) {
        return print(o.toString());
    }

    public FastPrintStream print(java.lang.String s) {
        if (strField == null) {
            return print(s.getBytes());
        } else {
            try {
                return print((byte[]) strField.get(s));
            } catch (IllegalAccessException e) {
                return print(s.getBytes());
            }
        }
    }

    public FastPrintStream print(char[] s) {
        try {
            return print(encoder.encode(java.nio.CharBuffer.wrap(s)).array());
        } catch (java.nio.charset.CharacterCodingException e) {
            byte[] bytes = new byte[s.length];
            for (int i = 0; i < s.length; i++) {
                bytes[i] = (byte) s[i];
            }
            return print(bytes);
        }
    }

    public FastPrintStream print(char c) {
        if (ptr == BUF_SIZE) internalFlush();
        buf[ptr++] = (byte) c;
        return this;
    }

    public FastPrintStream print(int x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(long x) {
        if (x == 0) {
            if (ptr == BUF_SIZE) internalFlush();
            buf[ptr++] = '0';
            return this;
        }
        int d = len(x);
        if (ptr + d > BUF_SIZE) internalFlush();
        if (x < 0) {
            buf[ptr++] = '-';
            x = -x;
            d--;
        }
        int j = ptr += d; 
        while (x > 0) {
            buf[--j] = (byte) ('0' + (x % 10));
            x /= 10;
        }
        return this;
    }

    public FastPrintStream print(double d, int precision) {
        if (d < 0) {
            print('-');
            d = -d;
        }
        d += Math.pow(10, -d) / 2;
        print((long) d).print('.');
        d -= (long) d;
        for(int i = 0; i < precision; i++){
            d *= 10;
            print((int) d);
            d -= (int) d;
        }
        return this;
    }

    private void internalFlush() {
        try {
            out.write(buf, 0, ptr);
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void flush() {
        try {
            out.write(buf, 0, ptr);
            out.flush();
            ptr = 0;
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            out.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int len(int x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        int p = -10;
        for (int i = 1; i < 10; i++, p *= 10) if (x > p) return i + d;
        return 10 + d;
    }

    private static int len(long x) {
        int d = 1;
        if (x >= 0) {d = 0; x = -x;}
        long p = -10;
        for (int i = 1; i < 19; i++, p *= 10) if (x > p) return i + d;
        return 19 + d;
    }
}

class FastScanner implements AutoCloseable {
    private final java.io.InputStream in;
    private final byte[] buf = new byte[2048];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner(java.io.InputStream in) {
        this.in = in;
    }

    public FastScanner() {
        this(System.in);
    }

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try {
            buflen = in.read(buf);
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
        return buflen > 0;
    }

    private int readByte() {
        return hasNextByte() ? buf[ptr++] : -1;
    }

    public boolean hasNext() {
        while (hasNextByte() && !(32 < buf[ptr] && buf[ptr] < 127)) ptr++;
        return hasNextByte();
    }

    private StringBuilder nextSequence() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        for (int b = readByte(); 32 < b && b < 127; b = readByte()) {
            sb.appendCodePoint(b);
        }
        return sb;
    }

    public String next() {
        return nextSequence().toString();
    }

    public String next(int len) {
        return new String(nextChars(len));
    }

    public char nextChar() {
        if (!hasNextByte()) throw new java.util.NoSuchElementException();
        return (char) readByte();
    }

    public char[] nextChars() {
        StringBuilder sb = nextSequence();
        int l = sb.length();
        char[] dst = new char[l];
        sb.getChars(0, l, dst, 0);
        return dst;
    }
    public char[] nextChars(int len) {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        char[] s = new char[len];
        int i = 0;
        int b = readByte();
        while (32 < b && b < 127 && i < len) {
            s[i++] = (char) b; b = readByte();
        }
        if (i != len) {
            throw new java.util.NoSuchElementException(
                String.format("Next token has smaller length than expected.", len)
            );
        }
        return s;
    }
    public long nextLong() {
        if (!hasNext()) throw new java.util.NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while (true) {
            if ('0' <= b && b <= '9') {
                n = n * 10 + b - '0';
            } else if (b == -1 || !(32 < b && b < 127)) {
                return minus ? -n : n;
            } else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        return Math.toIntExact(nextLong());
    }
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    public void close() {
        try {
            in.close();
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }
}
