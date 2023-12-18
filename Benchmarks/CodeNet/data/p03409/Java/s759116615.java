import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int red[][] = new int[n][2];
        int blue[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            red[i][0] = fsc.nextInt();
            red[i][1] = fsc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            blue[i][0] = fsc.nextInt();
            blue[i][1] = fsc.nextInt();
        }
        fsc.close();
        Node[] nodes = new Node[2 * n + 2];
        for (int i = 0; i < 2 * n + 2; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 1; i <= n; i++) {
            addEdge(0, i, 1, nodes);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (red[i][0] < blue[j][0] && red[i][1] < blue[j][1]) {
                    addEdge(i + 1, n + j + 1, 1, nodes);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            addEdge(n + i, 2 * n + 1, 1, nodes);
        }
        long ans = dinic(0, 2 * n + 1, 2 * n + 2, nodes);
        System.out.println(ans);
    }

    static void addEdge(int fr, int to, int cap, Node[] nodes) {
        nodes[fr].edges.add(new Edge(to, cap, nodes[to].edges.size()));
        nodes[to].edges.add(new Edge(fr, 0, nodes[fr].edges.size() - 1));
    }

    static long dinic(int s, int t, int n, Node[] nodes) {
        long flow = 0;
        int[] level, iter;
        while (true) {
            level = bfs(s, t, n, nodes);
            if (level[t] < 0) {
                break;
            }
            iter = new int[n];
            long f = dfs(s, t, nodes, Long.MAX_VALUE, level, iter);
            while (f > 0) {
                flow += f;
                f = dfs(s, t, nodes, Long.MAX_VALUE, level, iter);
            }
        }
        return flow;
    }

    private static int[] bfs(int s, int t, int n, Node[] nodes) {
        IntQueue iq = new IntQueue(n);
        iq.add(s);
        int[] level = new int[n];
        for (int i = 0; i < n; i++) {
            level[i] = -1;
        }
        level[s] = 0;
        while (iq.size() > 0) {
            int now = iq.poll();
            for (Edge e : nodes[now].edges) {
                if (level[e.to] < 0 && e.cap > 0) {
                    iq.add(e.to);
                    level[e.to] = level[now] + 1;
                }
            }
        }
        return level;
    }

    private static long dfs(int now, int t, Node[] nodes, long f, int[] level, int[] iter) {
        if (now == t) return f;
        for (int i = iter[now]++; i < nodes[now].edges.size(); i++) {
            Edge e = nodes[now].edges.get(i);
            if (level[now] < level[e.to] && e.cap > 0) {
                long d = dfs(e.to, t, nodes, Math.min(f, e.cap), level, iter);
                if (d > 0) {
                    e.cap -= d;
                    nodes[e.to].edges.get(e.rev).cap += d;
                    return d;
                }
            }
        }
        return 0;
    }

    static class Node {
        int id;
        ArrayList<Edge> edges;

        Node(int id) {
            this.id = id;
            edges = new ArrayList<>();
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Node))
                return false;
            Node n = (Node) o;
            if (n.id == id)
                return true;
            else
                return false;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }

    static class Edge {
        int to;
        long cap;
        int rev;

        Edge(int to, long cap, int rev) {
            this.to = to;
            this.cap = cap;
            this.rev = rev;
        }
    }

    static class IntQueue {
        private int[] a;
        private int head = 0, tail = 0;
        private int size = 0;

        public IntQueue(int max) {
            a = new int[max];
        }

        public void add(int x) {
            a[tail++] = x;
            size++;
        }

        public int poll() {
            if (size == 0) {
                try {
                    throw new Exception("no elements.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            size--;
            return a[head++];
        }

        public int size() {
            return size;
        }

        public void init() {
            head = 0;
            tail = 0;
            size = 0;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen)
                return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0)
                    return false;
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b)
                throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b))
                    return minus ? -n : n;
                else
                    throw new NumberFormatException();
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
