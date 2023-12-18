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
import java.util.AbstractMap.SimpleEntry;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        // int[] A = new int[N];
        // ArrayList<HashSet<Integer>> dls = new ArrayList<HashSet<Integer>>();
        // for(int i=0;i<N;i++)
        // dls.add(new HashSet<Integer>());
        ArrayList<Order> orders = new ArrayList<Order>(Q);
        for (int i = 0; i < Q; i++) {
            orders.add(new Order(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(orders, Comparator.comparing(Order::getD).reversed());
        // int[][] dp = new int[N][M];
        Graph g = new Graph(N * 20, true);
        for (Order o : orders) {
            int a = o.a;
            int b = o.b;
            int c = o.c;
            int d = o.d;
            if (a < b) {
                for (int i = 1; i + c <= M; i++)
                    g.singleConnect(a * 10 + i, b * 10 + i+c, d);
            } else {
                for (int i = M; i - c >= 1; --i)
                    g.singleConnect(b * 10 + i, a * 10 +i- c, d);
            }
        }

        for (int i = 1; i <= M; i++) {
            for(Vertex v: g.vertexMap.values())v.visited=false;
            ans = Math.max(ans, g.vertexAt(i).treeExpand());
            System.err.println();
        }
        System.out.println(ans);
    }

    class Order {
        int a;
        int b;
        int c;
        int d;

        Order(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        /**
         * @return the d
         */
        public int getD() {
            return d;
        }
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

    Vertex vertexAt(int v) {
        return vertexMap.get(v);
    }

    HashMap<Vertex, HashMap<Vertex, Integer>> dijkstraMap = new HashMap<Vertex, HashMap<Vertex, Integer>>();
    HashMap<Vertex, HashMap<Vertex, Edge>> dijkstraPvevMap = new HashMap<Vertex, HashMap<Vertex, Edge>>();

}

class Vertex {
    int id;
    int score = -1;
    Vertex parentVertex = null;
    int rootDistance = -1;
    Vertex ufRoot;
    int ufRank = 0;
    boolean visited = false;
    HashMap<Vertex, Edge> edgeMap = new HashMap<Vertex, Edge>();

    Vertex(int id) {
        this.id = id;
        ufRoot = this;
    }

    public void addEdge(Edge edge) {
        edgeMap.put(edge.getDestVertex(), edge);
    }

    public boolean isLeaf() {
        return edgeMap.size() <= 1;
    }

    public long treeExpand() {
        if(visited)return 0;
        long ret = 0;
        for (Edge edge : edgeMap.values()) {
            ret += edge.getDestVertex().treeExpand();
            ret += edge.getLength();
            System.err.println(edge.getLength());
        }
        visited=true;
        return ret;
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