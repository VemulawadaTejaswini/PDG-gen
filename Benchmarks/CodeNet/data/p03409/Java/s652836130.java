public class Main {
    public static void main(String[] args) {
        var sc = new FastScanner();
        var pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }
    public static void solve(FastScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int red[][] = new int[n][2];
        int blue[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            red[i][0] = sc.nextInt();
            red[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            blue[i][0] = sc.nextInt();
            blue[i][1] = sc.nextInt();
        }
        var mf = new MaxFlow(2 * n + 2);
        for (int i = 1; i <= n; i++) {
            mf.addEdge(0, i, 1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (red[i][0] < blue[j][0] && red[i][1] < blue[j][1]) {
                    mf.addEdge(i + 1, n + j + 1, 1);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            mf.addEdge(n + i, 2 * n + 1, 1);
        }
        long ans = mf.fordFulkerson(0, 2 * n + 1);
        pw.println(ans);
    }

    static class MaxFlow {
        private static final class CapEdge {
            final int from;
            final int to;
            long cap;
            final int rev;
            CapEdge(int from, int to, long cap, int rev) {
                this.from = from;
                this.to = to;
                this.cap = cap;
                this.rev = rev;
            }
        }
    
        private final int n;
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
            CapEdge fwd = new CapEdge(from, to, cap, count[to]++);
            CapEdge bwd = new CapEdge(to, from, 0, count[from]++);
            edges.add(fwd);
            edges.add(bwd);
        }
    
        private void buildGraph() {
            for (int i = 0; i < n; i++) {
                g[i] = new CapEdge[count[i]];
            }
            int[] idx = new int[n];
            for (CapEdge e : edges) {
                g[e.from][idx[e.from]++] = e;
            }
        }
    
        private static final long mask = 0xffff_ffffl;
        private static final long inf = Long.MAX_VALUE;
    
        public long fordFulkerson(int s, int t) {
            buildGraph();
            if (s == t) return inf;
            long flow = 0;
            boolean[] used = new boolean[n];
            long[] flowStack = new long[n];
            long[] stack = new long[n];
            int ptr = 0;
            Outer: while (true) {
                java.util.Arrays.fill(used, false);
                java.util.Arrays.fill(flowStack, inf);
                stack[ptr++] = 0l << 32 | s;
                while (ptr > 0) {
                    long last = stack[--ptr];
                    int u = (int) (last & mask);
                    int i = (int) (last >>> 32);
                    long f = flowStack[ptr];
                    used[u] = true;
                    if (u == t) {
                        int v = t;
                        while (ptr > 0) {
                            last = stack[--ptr];
                            u = (int) (last & mask);
                            i = (int) (last >>> 32) - 1;
                            CapEdge e = g[u][i];
                            e.cap -= f;
                            g[v][e.rev].cap += f;
                            v = u;
                        }
                        flow += f;
                        continue Outer;
                    } else if (i < count[u]) {
                        CapEdge e = g[u][i++];
                        int v = e.to;
                        stack[ptr++] += 1l << 32;
                        if (used[v] || e.cap == 0) continue;
                        stack[ptr++] = 0l << 32 | v;
                        flowStack[ptr] = Math.min(f, e.cap);
                    }
                }
                return flow;
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
        this.encoder = java.nio.charset.StandardCharsets.UTF_8.newEncoder();
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
            for (int i = 0; 9 < s.length; i++) {
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
