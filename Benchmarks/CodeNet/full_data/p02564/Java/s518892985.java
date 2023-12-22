import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    static FastScanner sc = new FastScanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        pw.write(sb.toString());
        pw.flush();
        pw.close();
    }

    public static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        var scc = new SCC(n);
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            scc.addEdge(new Edge(a, b));
        }
        int[][] g = scc.build();
        int k = g.length;
        sb.append(k).append('\n');
        for (int i = 0; i < k; i++) {
            int l = g[i].length;
            sb.append(l);
            for (int j = 0; j < l; j++) {
                sb.append(' ').append(g[i][j]);
            }
            sb.append('\n');
        }
        pw.write(sb.toString());
        pw.flush();
        pw.close();
    }

    static class SCC {
        int n;
        int m;
        java.util.ArrayList<Edge> unorderedEdges;
        int[] start;
        public SCC(int n) {
            this.n = n;
            this.unorderedEdges = new java.util.ArrayList<>();
            this.start = new int[n + 1];
        }
        public void addEdge(Edge edge) {
            unorderedEdges.add(edge);
            start[edge.from + 1]++;
            this.m++;
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
            int[] par = new int[n];
            int[] visited = new int[n];
            int[] low = new int[n];
            int[] ord = new int[n];
            java.util.Arrays.fill(ord, -1);
            int[] ids = new int[n];
            java.util.Arrays.fill(ids, -1000);
            long[] stack = new long[n];
            int ptr = 0;
            final long mask = 0xffff_ffffl;
            for (int i = 0; i < n; i++) {
                if (ord[i] >= 0) continue;
                par[i] = -1;
                stack[ptr++] = 0l << 32 | i;
                while (ptr > 0) {
                    long p = stack[--ptr];
                    int u = (int) (p & mask);
                    int j = (int) (p >>> 32);
                    if (j == 0) {
                        low[u] = ord[u] = nowOrd++;
                        visited[k++] = u;
                    }
                    if (start[u] + j < count[u]) {
                        int to = orderedEdges[start[u] + j].to;
                        stack[ptr++] += 1l << 32;
                        if (ord[to] == -1) {
                            stack[ptr++] = 0l << 32 | to;
                            par[to] = u;
                        } else {
                            low[u] = Math.min(low[u], ord[to]);
                        }
                    } else {
                        while (j --> 0) {
                            int to = orderedEdges[start[u] + j].to;
                            if (par[to] == u) low[u] = Math.min(low[u], low[to]);
                        }
                        if (low[u] == ord[u]) {
                            while (true) {
                                int v = visited[--k];
                                ord[v] = n;
                                ids[v] = groupNum;
                                if (v == u) break;
                            }
                            groupNum++;
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
            return groups;
        }
    }
    
    static interface EdgeInterface {
        int from();
        int to();
        interface Weighted extends EdgeInterface {
            long cost();
        }
        interface Capacity extends EdgeInterface {
            long cap();
            void setCap(long newCap);
            int rev();
        }
    }
    
    static class Edge implements EdgeInterface {
        int from;
        int to;
        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
        public int from() {
            return from;
        }
        public int to() {
            return to;
        }
    }
    
    static class WeightedEdge implements EdgeInterface.Weighted {
        int from;
        int to;
        long cost;
        WeightedEdge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
        public int from() {
            return from;
        }
        public int to() {
            return to;
        }
        public long cost() {
            return cost;
        }
    }
    
    static class CapacityEdge implements EdgeInterface.Capacity {
        int from;
        int to;
        long cap;
        int rev;
        CapacityEdge(int from, int to, long cap, int rev) {
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
        public int from() {
            return from;
        }
        public int to() {
            return to;
        }
        public long cap() {
            return cap;
        }
        public void setCap(long newCap) {
            this.cap = newCap;
        }
        public int rev() {
            return rev;
        }
    }
    
    static class WeightedCapEdge implements EdgeInterface.Weighted, EdgeInterface.Capacity {
        int from;
        int to;
        long cost;
        long cap;
        int rev;
        WeightedCapEdge(int from, int to, long cost, long cap, int rev) {
            this.to = to;
            this.cost = cost;
            this.cap = cap;
            this.rev = rev;
        }
        public int to() {
            return to;
        }
        public int from() {
            return from;
        }
        public long cost() {
            return cost;
        }
        public long cap() {
            return cap;
        }
        public void setCap(long newCap) {
            this.cap = newCap;
        }
        public int rev() {
            return rev;
        }
    }
    
    static class FastScanner {
        private final InputStream in;
        private final byte[] buf = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(InputStream in) {this.in = in;}
        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buf);}
            catch (final IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
        public boolean hasNext() {
            while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
            return hasNextByte();
        }
        private StringBuilder nextSequence() {
            if (!hasNext()) throw new NoSuchElementException();
            final StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
            return sb;
        }
        public String next() {
            return nextSequence().toString();
        }
        public String next(int len) {
            return new String(nextChars(len));
        }
        public char[] nextChars() {
            final StringBuilder sb = nextSequence();
            int l = sb.length();
            char[] dst = new char[l];
            sb.getChars(0, l, dst, 0);
            return dst;
        }
        public char[] nextChars(int len) {
            if (!hasNext()) throw new NoSuchElementException();
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
            if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
            return s;
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {minus = true; b = readByte();}
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') n = n * 10 + b - '0';
                else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {return Math.toIntExact(nextLong());}
        public double nextDouble() {return Double.parseDouble(next());}
    }

    static int[] nextInts(int n) {
        var dat = new int[n];
        Arrays.setAll(dat, i -> sc.nextInt());
        return dat;
    }

    static long[] nextLongs(int n) {
        var dat = new long[n];
        Arrays.setAll(dat, i -> sc.nextLong());
        return dat;
    }
}
