public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(
            // new java.io.FileInputStream(new java.io.File("MaxFlow/in"))
        );
        FastPrintStream pw = new FastPrintStream(
            // new java.io.File("MaxFlow/out")
        );
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(FastScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        var g = new char[n][];
        java.util.Arrays.setAll(g, i -> sc.nextChars(m));
        MaxFlow mf = new MaxFlow(n * m + 2);
        int s = n * m;
        int t = s + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == '#') continue;
                if (((i ^ j) & 1) == 0) {
                    mf.addEdge(s, i * m + j, 1);
                } else {
                    mf.addEdge(i * m + j, t, 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i & 1; j < m; j += 2) {
                if (g[i][j] == '#') continue;
                if (j - 1 >= 0 && g[i][j - 1] == '.') {
                    mf.addEdge(i * m + j, i * m + (j - 1), 1);
                }
                if (j + 1 < m && g[i][j + 1] == '.') {
                    mf.addEdge(i * m + j, i * m + (j + 1), 1);
                }
                if (i - 1 >= 0 && g[i - 1][j] == '.') {
                    mf.addEdge(i * m + j, (i - 1) * m + j, 1);
                }
                if (i + 1 < n && g[i + 1][j] == '.') {
                    mf.addEdge(i * m + j, (i + 1) * m + j, 1);
                }
            }
        }
        int ans = (int) mf.fordFulkersonMaxFlow(s, t);
        int cnt = 0;
        for (var e : mf.getEdges()) {
            if (e.getFlow() == 0) continue;
            int u = e.getFrom();
            int v = e.getTo();
            if (u == s || v == t) continue;
            int ui = u / m, uj = u % m;
            int vi = v / m, vj = v % m;
            if (g[ui][uj] != '.' || g[vi][vj] != '.') {
                throw new AssertionError();
            }
            if (ui == vi) {
                if (uj + 1 == vj) {
                    g[ui][uj] = '>';
                    g[vi][vj] = '<';
                } else if (uj == vj + 1) {
                    g[ui][uj] = '<';
                    g[vi][vj] = '>';
                } else {
                    throw new AssertionError();
                }
            } else if (uj == vj) {
                if (ui + 1 == vi) {
                    g[ui][uj] = 'v';
                    g[vi][vj] = '^';
                } else if (ui == vi + 1) {
                    g[ui][uj] = '^';
                    g[vi][vj] = 'v';
                } else {
                    throw new AssertionError();
                }
            } else {
                throw new AssertionError();
            }
            cnt++;
        }
        if (ans != cnt) throw new AssertionError();
        pw.println(ans);
        for (var gi : g) {
            pw.println(gi);
        }
    }

    static class MaxFlow {
        public class CapEdge {
            private final int from;
            private final int to;
            private long cap;
            private final int rev;
            CapEdge(int from, int to, long cap, int rev) {
                this.from = from;
                this.to = to;
                this.cap = cap;
                this.rev = rev;
            }
            public int getFrom() {
                return from;
            }
            public int getTo() {
                return to;
            }
            public long getCap() {
                return cap;
            }
            public long getFlow() {
                return g[to][rev].cap;
            }
        }
    
        private static final long INF = Long.MAX_VALUE;
    
        private final int n;
        private int m;
        private final java.util.ArrayList<CapEdge> edges;
        private final int[] count;
        private final CapEdge[][] g;
    
        public MaxFlow(int n) {
            this.n = n;
            this.edges = new java.util.ArrayList<>();
            this.count = new int[n];
            this.g = new CapEdge[n][];
        }
    
        public void addEdge(int from, int to, long cap) {
            vertexRangeCheck(from);
            vertexRangeCheck(to);
            capNonNegativeCheck(cap);
            CapEdge e = new CapEdge(from, to, cap, count[to]);
            count[from]++; count[to]++;
            edges.add(e);
            m++;
        }
    
        public CapEdge getEdge(int i) {
            edgeRangeCheck(i);
            return edges.get(i);
        }
    
        public java.util.ArrayList<CapEdge> getEdges() {
            return edges;
        }
    
        public void changeEdge(int i, long newCap, long newFlow) {
            edgeRangeCheck(i);
            capNonNegativeCheck(newCap);
            if (newFlow > newCap) {
                throw new IllegalArgumentException(
                    String.format("Flow %d is greater than capacity %d.", newCap, newFlow)
                );
            }
            CapEdge e = edges.get(i);
            CapEdge er = g[e.to][e.rev];
            e.cap = newCap - newFlow;
            er.cap = newFlow;
        }
    
        private void buildGraph() {
            for (int i = 0; i < n; i++) {
                g[i] = new CapEdge[count[i]];
            }
            int[] idx = new int[n];
            for (CapEdge e : edges) {
                g[e.to][idx[e.to]++] = new CapEdge(e.to, e.from, 0, idx[e.from]);
                g[e.from][idx[e.from]++] = e;
            }
        }
    
        public long fordFulkersonMaxFlow(int s, int t) {
            vertexRangeCheck(s);
            vertexRangeCheck(t);
            buildGraph();
            boolean[] used = new boolean[n];
            long flow = 0;
            while (true) {
                java.util.Arrays.fill(used, false);
                long f = fordFulkersonDFS(s, t, INF, used);
                if (f <= 0) return flow;
                flow += f;
            }
        }
    
        private long fordFulkersonDFS(int cur, int t, long f, boolean[] used) {
            if (cur == t) return f;
            used[cur] = true;
            for (CapEdge e : g[cur]) {
                if (used[e.to] || e.cap <= 0) continue;
                long d = fordFulkersonDFS(e.to, t, Math.min(f, e.cap), used);
                if (d <= 0) continue;
                e.cap -= d;
                g[e.to][e.rev].cap += d;
                return d;
            }
            return 0;
        }
    
        public long dinicMaxFlow(int s, int t) {
            vertexRangeCheck(s);
            vertexRangeCheck(t);
            buildGraph();
            long flow = 0;
            int[] level = new int[n];
            int[] que = new int[n];
            int[] iter = new int[n];
            while (true) {
                java.util.Arrays.fill(level, -1);
                dinicBFS(s, t, level, que);
                if (level[t] < 0) return flow;
                java.util.Arrays.fill(iter, 0);
                while (true) {
                    long d = dinicDFS(t, s, INF, iter, level);
                    if (d <= 0) break;
                    flow += d;
                }
            }
        }
    
        private void dinicBFS(int s, int t, int[] level, int[] que) {
            int hd = 0, tl = 0;
            que[tl++] = s;
            level[s] = 0;
            while (tl > hd) {
                int u = que[hd++];
                for (CapEdge e : g[u]) {
                    int v = e.to;
                    if (e.cap <= 0 || level[v] >= 0) continue;
                    level[v] = level[u] + 1;
                    if (v == t) return;
                    que[tl++] = v;
                }
            }
        }
    
        private long dinicDFS(int cur, int s, long f, int[] iter, int[] level) {
            if (cur == s) return f;
            long res = 0;
            while (iter[cur] < count[cur]) {
                CapEdge er = g[cur][iter[cur]++];
                int u = er.to;
                CapEdge e = g[u][er.rev];
                if (level[u] >= level[cur] || e.cap <= 0) continue;
                long d = dinicDFS(u, s, Math.min(f - res, e.cap), iter, level);
                if (d <= 0) continue;
                e.cap -= d;
                er.cap += d;
                res += d;
                if (res == f) break;
            }
            return res;
        }
    
        public boolean[] minCut(int s) {
            vertexRangeCheck(s);
            boolean[] reachable = new boolean[n];
            int[] stack = new int[n];
            int ptr = 0;
            stack[ptr++] = s;
            while (ptr > 0) {
                int u = stack[--ptr];
                reachable[u] = true;
                for (CapEdge e : g[u]) {
                    int v = e.to;
                    if (reachable[v] || e.cap <= 0) continue;
                    reachable[v] = true;
                    stack[ptr++] = v;
                }
            }
            return reachable;
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
