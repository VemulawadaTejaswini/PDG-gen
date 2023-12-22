import java.io.IOException;
import java.io.InputStream;
import java.util.*;

class UnionFind {
    int[] size;
    int[] id;

    public UnionFind(int n) {
        size = new int[n];
        id = new int[n];
        for (int i = 0; i < n; ++i) {
            size[i] = 1;
            id[i] = i;
        }
    }

    void unify(int p, int q) {
        int root1 = find(p);
        int root2 = find(q);

        if (size[root1] > size[root2]) {
            size[root1] += size[root2];
            id[root2] = root1;
        } else {
            size[root2] += size[root1];
            id[root1] = root2;
        }
    }

    int find(int p) {
        int root = p;
        while (root != id[root]) root = id[root];
        while (p != root) {
            int next = id[p];
            id[p] = root;
            p = next;
        }
        return root;
    }

    boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}

class Edge implements Comparable<Edge> {
    int from, to, cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return cost - o.cost;
    }
}

public class Main {

    static List<Edge> edges;
    static int V, E;

    static int kruskal() {
        int mstCost = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(edges);
        UnionFind uf = new UnionFind(V);

        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            if (uf.connected(e.from, e.to)) continue;
            mstCost += e.cost;
            uf.unify(e.from, e.to);
            if (uf.size[uf.find(0)] == V) break;
        }

        return mstCost;
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        V = fs.nextInt();
        E = fs.nextInt();
        edges = new ArrayList<>();
        for (int i = 0; i < E; ++i) {
            int a = fs.nextInt();
            int b = fs.nextInt();
            int cost = fs.nextInt();
            edges.add(new Edge(a, b, cost));
        }

        System.out.println(kruskal());
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() { return Double.parseDouble(next());}
}




























