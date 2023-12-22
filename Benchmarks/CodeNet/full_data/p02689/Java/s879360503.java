import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        Graph g =new Graph(N, true);
        for(int i=0;i<N;i++){
            g.vertexAt(i).setScore(sc.nextInt());
        }
        for(int i=0;i<M;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            g.doubleConnect(a, b);
        }
        for(int i=0;i<N;i++){
            ans += g.vertexAt(i).expand()?1:0;   
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}

class Graph {
    int size;
    boolean zero;
    HashMap<Integer, Vertex> vertexMap;
    ArrayList<Edge> edges;

    Graph(int size, boolean zero) {
        this.size = size;
        this.zero = zero;
        vertexMap = new HashMap<Integer, Vertex>(size);
        edges = new ArrayList<Edge>(size * 3);
        if (zero)
            for (int id = 0; id < size; id++) {
                vertexMap.put(id, new Vertex(id));
            }
        else
            for (int id = 1; id <= size; id++) {
                vertexMap.put(id, new Vertex(id));
            }
    }

    void singleConnect(int f, int d) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest);
        from.addEdge(edge);
        edges.add(edge);
    }

    void singleConnect(int f, int d, int len) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest, len);
        from.addEdge(edge);
        edges.add(edge);
    }

    void doubleConnect(int f, int d) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest);
        from.addEdge(edge);
        dest.addEdge(edge.reversed());
        edges.add(edge);
        // edges.add(edge.reversed());
        // union(from, dest);
    }

    void doubleConnect(int f, int d, int len) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest, len);
        from.addEdge(edge);
        dest.addEdge(edge.reversed());
        edges.add(edge);
        // edges.add(edge.reversed());
        // union(from, dest);
    }

    Vertex vertexAt(int v) {
        return vertexMap.get(v);
    }
}

class UnionFindTree {
    int[] parent;
    int[] rank;

    public UnionFindTree(int size) {
        this.parent = new int[size+1];
        this.rank = new int[size+1];
        for (int i = 0; i <= size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }

    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}
class Vertex {
    int id;
    int score = -1;
    Vertex parentVertex = null;
    int rootDistance = -1;
    Vertex ufRoot;
    int ufRank = 0;
    HashMap<Vertex, Edge> edgeMap = new HashMap<Vertex, Edge>();

    Vertex(int id) {
        this.id = id;
        ufRoot = this;
    }

    public void addEdge(Edge edge) {
        edgeMap.put(edge.getDestVertex(), edge);
    }

    public boolean expand() {
        for (Edge edge : edgeMap.values()) {
            if(edge.getDestVertex().getScore()>=this.getScore())return false;;
        }
        return true;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class Edge {
    private Vertex fromVertex;
    private Vertex destVertex;
    private int length = 1;

    Edge(Vertex fVertex, Vertex dVertex) {
        fromVertex = fVertex;
        destVertex = dVertex;
    }

    Edge(Vertex fVertex, Vertex dVertex, int len) {
        fromVertex = fVertex;
        destVertex = dVertex;
        length = len;
    }

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public Vertex getDestVertex() {
        return destVertex;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Edge reversed() {
        return new Edge(getDestVertex(), getFromVertex(), getLength());
    }

    public Edge normalized() {
        if (getDestVertex().id < getFromVertex().id) {
            return new Edge(getDestVertex(), getFromVertex(), getLength());
        } else {
            return new Edge(getFromVertex(), getDestVertex(), getLength());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Edge) {
            Edge edge = (Edge) obj;
            return edge.destVertex == destVertex && edge.fromVertex == fromVertex && edge.length == length;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return fromVertex.id + "~" + destVertex.id + " len:" + length;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}