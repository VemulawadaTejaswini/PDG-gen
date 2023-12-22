public class Main {
    public static void main(String[] args) {
        var sc = new FastScanner(System.in);
        var pw = new FastPrintStream();
        solve(sc, pw);
        sc.close();
        pw.flush();
        pw.close();
    }

    public static void solve(FastScanner sc, FastPrintStream pw) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        var scc = new SCC(n);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            scc.addEdge(a, b);
        }
        int[][] g = scc.build();
        int k = g.length;
        pw.println(k);
        for (int i = 0; i < k; i++) {
            int l = g[i].length;
            pw.print(l);
            for (int j = 0; j < l; j++) {
                pw.print(' ').print(g[i][j]);
            }
            pw.println();
        }
    }

    static class SCC {

        static class Edge {
            int from, to;
            public Edge(int from, int to) {
                this.from = from; this.to = to;
            }
        }
    
        final int n;
        int m;
        final java.util.ArrayList<Edge> unorderedEdges;
        final int[] start;
        final int[] ids;
        boolean hasBuilt = false;
    
        public SCC(int n) {
            this.n = n;
            this.unorderedEdges = new java.util.ArrayList<>();
            this.start = new int[n + 1];
            this.ids = new int[n];
        }
    
        public void addEdge(int from, int to) {
            unorderedEdges.add(new Edge(from, to));
            start[from + 1]++;
            this.m++;
        }
    
        public int id(int i) {
            if (!hasBuilt) {
                throw new UnsupportedOperationException(
                    "Graph hasn't been built."
                );
            }
            return ids[i];
        }
        
        public int[][] build() {
            for (int i = 1; i <= n; i++) {
                start[i] += start[i - 1];
            }
            Edge[] orderedEdges = new Edge[m];
            int[] count = new int[n + 1];
            System.arraycopy(start, 0, count, 0, n + 1);
            for (Edge e : unorderedEdges) {
                orderedEdges[count[e.from]++] = e;
            }
            int nowOrd = 0;
            int groupNum = 0;
            int k = 0;
            // parent
            int[] par = new int[n];
            int[] vis = new int[n];
            int[] low = new int[n];
            int[] ord = new int[n];
            java.util.Arrays.fill(ord, -1);
            // u = lower32(stack[i]) : visiting vertex
            // j = upper32(stack[i]) : jth child
            long[] stack = new long[n];
            // size of stack
            int ptr = 0;
            // non-recursional DFS
            for (int i = 0; i < n; i++) {
                if (ord[i] >= 0) continue;
                par[i] = -1;
                // vertex i, 0th child.
                stack[ptr++] = 0l << 32 | i;
                // stack is not empty
                while (ptr > 0) {
                    // last element
                    long p = stack[--ptr];
                    // vertex
                    int u = (int) (p & 0xffff_ffffl);
                    // jth child
                    int j = (int) (p >>> 32);
                    if (j == 0) { // first visit
                        low[u] = ord[u] = nowOrd++;
                        vis[k++] = u;
                    }
                    if (start[u] + j < count[u]) { // there are more children
                        // jth child
                        int to = orderedEdges[start[u] + j].to;
                        // incr children counter
                        stack[ptr++] += 1l << 32;
                        if (ord[to] == -1) { // new vertex
                            stack[ptr++] = 0l << 32 | to;
                            par[to] = u;
                        } else { // backward edge
                            low[u] = Math.min(low[u], ord[to]);
                        }
                    } else { // no more children (leaving)
                        while (j --> 0) {
                            int to = orderedEdges[start[u] + j].to;
                            // update lowlink
                            if (par[to] == u) low[u] = Math.min(low[u], low[to]);
                        }
                        if (low[u] == ord[u]) { // root of a component
                            while (true) { // gathering verticies
                                int v = vis[--k];
                                ord[v] = n;
                                ids[v] = groupNum;
                                if (v == u) break;
                            }
                            groupNum++; // incr the number of components
                        }
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                ids[i] = groupNum - 1 - ids[i];
            }
            
            int[] counts = new int[groupNum];
            for (int x : ids) counts[x]++;
            int[][] groups = new int[groupNum][];
            for (int i = 0; i < groupNum; i++) {
                groups[i] = new int[counts[i]];
            }
            for (int i = 0; i < n; i++) {
                int cmp = ids[i];
                groups[cmp][--counts[cmp]] = i;
            }
            hasBuilt = true;
            return groups;
        }
    }
    
    static class FastScanner implements AutoCloseable {
        private static final int BUF_SIZE = 1 << 15;
        private final java.io.InputStream in;
        private final byte[] buf = new byte[BUF_SIZE];
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

    static class FastPrintStream implements AutoCloseable {
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

    static int[] nextInts(int n, FastScanner sc) {
        var dat = new int[n];
        java.util.Arrays.setAll(dat, i -> sc.nextInt());
        return dat;
    }

    static long[] nextLongs(int n, FastScanner sc) {
        var dat = new long[n];
        java.util.Arrays.setAll(dat, i -> sc.nextLong());
        return dat;
    }
}
