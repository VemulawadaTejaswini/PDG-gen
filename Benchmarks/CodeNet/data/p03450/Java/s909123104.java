import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import static java.util.Arrays.fill;



public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int m = fsc.nextInt();
        UnionFindTree t = new UnionFindTree(n);
        int[][] lrd = new int[m][3];
        for (int i = 0; i < m; i++) {
            int l = fsc.nextInt() - 1;
            int r = fsc.nextInt() - 1;
            int d = fsc.nextInt();
            lrd[i][0] = l;
            lrd[i][1] = r;
            lrd[i][2] = d;
            if (d == 0) {
                t.unite(l, r);
            }
        }
        Graph g = new Graph(n, m);
        for (int i = 0; i < m; i++) {
            g.addDirectedEdge(t.root(lrd[i][0]), t.root(lrd[i][1]), lrd[i][2]);
        }
        HashSet<Integer> visited=new HashSet<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int[] d = new int[n];
        fill(d, -1);
        for (int i = 0; i < n; i++) {
            if (g.nodes[i].in == 0) {
                d[i] = 0;
                dq.add(i);
                visited.add(i);
            }
        }
        while(dq.size()>0){
            int now=dq.pollFirst();
            for(Edge e:g.nodes[now].edges){
                if(d[e.to]<0){
                    d[e.to]=d[e.from]+(int)e.cost;
                    dq.add(e.to);
                    visited.add(e.to);
                } else if(d[e.to]!=d[e.from]+e.cost) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println(visited.size()==n?"Yes":"No");
    }
}

class Graph{
    public Node[] nodes;
    public Edge[] edges;
    public int n;
    public int m;

    private int mIndx = 0;

    public Graph(int n, int m){
        this.nodes = new Node[n];
        for(int i = 0; i < n; i++) nodes[i] = new Node(i);
        this.edges = new Edge[m];
        this.n = n;
        this.m = m;
    }

    public void addDirectedEdge(int from, int to, long cost){
        Edge e = new Edge(from, to, cost);
        nodes[from].edges.add(e);
        nodes[to].in++;
        edges[mIndx++] = e;
    }
    public void addNonDirectedEdge(int from, int to, long cost){
        Edge e = new Edge(from, to, cost);
        Edge er = new Edge(to, from, cost);
        nodes[from].edges.add(e);
        nodes[to].edges.add(er);
        nodes[from].in++;
        nodes[to].in++;
        edges[mIndx++] = e;
    }
    public void addDirectedEdge(int from, int to){
        addDirectedEdge(from, to, 1l);
    }
    public void addNonDirectedEdge(int from, int to){
        addNonDirectedEdge(from, to, 1l);
    }
    public void addCapEdge(int from, int to, long cap) {
        nodes[from].edges.add(new Edge(to, cap, nodes[to].edges.size()));
        nodes[to].edges.add(new Edge(from, 0l, nodes[from].edges.size() - 1));
    }
    public void setNodeWeight(long[] w){
        for(int i = 0; i < n; i++) nodes[i].w = w[i];
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


class Node{
    public int id;
    public ArrayList<Edge> edges;
    public long w;
    public int in;
    
    public Node(int id){
        this.id=id;
        this.edges = new ArrayList<Edge>();
    }
    public Node(int id, long w){
        this.id = id;
        this.w = w;
        this.edges = new ArrayList<>();
    }
    @Override public boolean equals(Object o){
        if(this == o) return true;
        if(! (o instanceof Node)) return false;
        Node n=(Node) o;
        return n.id == id;
    }
    @Override public int hashCode(){
        return id;
    }
}


class UnionFindTree {
    private int[] parent;
    private int[] rank;
    private int[] size;
    private int groups;
    public UnionFindTree(int n){
        this.parent = new int[n];
        this.rank = new int[n];
        this.size = new int[n];
        this.groups = n;
        fill(this.size, 1);
        for(int i = 0; i < n; i++) parent[i] = i;
    }
    public int root(int x){
        if(parent[x] == x) return x;
        return parent[x] = root(parent[x]);
    }
    public boolean isSame(int x, int y){
        return root(x) == root(y);
    }
    public void unite(int x, int y){
        int xr = root(x);
        int yr = root(y);
        if(xr == yr) return;
        if(rank[xr] < rank[yr]){
            parent[xr] = yr;
            size[yr] += size[xr];
        }
        else{
            parent[yr] = xr;
            size[xr] += size[yr];
            if(rank[xr] == rank[yr]) rank[xr]++;
        }
        groups--;
    }
    public int size(int x){
        return size[root(x)];
    }
    public boolean isRoot(int x){
        return parent[x]==x;
    }
    public int groups(){
        return groups;
    }
}

class Edge{
    public int from, to;
    public long cost;
    public long cap;
    public int rev;
    public Edge(int to, long cap, int rev) {
        this.to = to;
        this.cap = cap;
        this.rev = rev;
    }
    public Edge(int from, int to, long cost){
        this.from = from;
        this.to = to;
        this.cost=cost;
    }
    public Edge(int from, int to){
        this.from = from;
        this.to = to;
    }
    public Edge(int to, long cost){
        this.to = to;
        this.cost = cost;
    }
}
