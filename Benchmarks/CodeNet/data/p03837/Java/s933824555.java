
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Graph g = new Graph(N);
        for (int i = 0; i < M; i++) {
            g.doubleConnect(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        HashSet<Edge> used = new HashSet<Edge>();
        for (int i = 1; i <= N; i++) {
            Vertex v = g.vertexAt(i);
            HashMap<Vertex, Integer> dMap = g.dijkstraMap(v);
            for (int k = 1; k <= N; k++) {
                ArrayList<Edge> path = g.shortestPath(v, g.vertexAt(k));
                used.addAll(path);
            }
        }
        System.out.println(M - used.size() / 2);
        //System.out.println(Arrays.toString(used.toArray()));
    }
}

class Graph {
    HashMap<Integer, Vertex> vertexMap;
    ArrayList<Edge> edges;

    Graph(int size) {
        vertexMap = new HashMap<Integer, Vertex>(size);
        edges = new ArrayList<Edge>(size * 3);
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
        union(f, d);
    }

    void doubleConnect(int f, int d, int len) {
        Vertex from = vertexAt(f);
        Vertex dest = vertexAt(d);
        Edge edge = new Edge(from, dest, len);
        from.addEdge(edge);
        dest.addEdge(edge.reversed());
        edges.add(edge);
        // edges.add(edge.reversed());
        union(f, d);
    }

    private void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        if (vertexAt(xRoot).rank > vertexAt(yRoot).rank) {
            vertexAt(yRoot).ufparent = xRoot;
        } else if (vertexAt(xRoot).rank < vertexAt(yRoot).rank) {
            vertexAt(xRoot).ufparent = yRoot;
        } else if (xRoot != yRoot) {
            vertexAt(yRoot).ufparent = xRoot;
            vertexAt(xRoot).rank++;
        }
    }

    private int find(int i) {
        if (i != vertexAt(i).ufparent) {
            vertexAt(i).ufparent = find(vertexAt(i).ufparent);
        }
        return vertexAt(i).ufparent;
    }

    boolean same(int x, int y) {
        return find(x) == find(y);
    }

    Vertex vertexAt(int v) {
        return vertexMap.get(v);
    }

    HashMap<Vertex, HashMap<Vertex, Integer>> dijkstraMap = new HashMap<Vertex, HashMap<Vertex, Integer>>();
    HashMap<Vertex, HashMap<Vertex, Edge>> dijkstraPvevMap = new HashMap<Vertex, HashMap<Vertex, Edge>>();

    HashMap<Vertex, Integer> dijkstraMap(Vertex rootVertex) {
        HashMap<Vertex, Integer> reached = new HashMap<Vertex, Integer>();
        HashMap<Vertex, Edge> prev = new HashMap<Vertex, Edge>();
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>((e1, e2) -> {
            return (reached.get(e1.getFromVertex()) + e1.getLength())
                    - (reached.get(e2.getFromVertex()) + e2.getLength());
        });

        reached.put(rootVertex, 0);
        queue.addAll(rootVertex.edgeMap.values());

        while (!queue.isEmpty() && reached.size() < vertexMap.size()) {
            Edge peekEdge = queue.poll();
            Vertex from = peekEdge.getFromVertex();
            Vertex dest = peekEdge.getDestVertex();
            if (reached.containsKey(dest))
                continue;
            reached.put(dest, reached.get(from) + peekEdge.getLength());
            prev.put(dest, peekEdge);
            queue.addAll(dest.edgeMap.values());
        }
        dijkstraMap.put(rootVertex, reached);
        dijkstraPvevMap.put(rootVertex, prev);
        return reached;
    }

    ArrayList<Edge> shortestPath(Vertex from, Vertex dest) {
        ArrayList<Edge> path = new ArrayList<Edge>();
        HashMap<Vertex, Edge> prev = dijkstraPvevMap.get(from);
        Edge edge;
        Vertex tmpDest = dest;
        while ((edge = prev.get(tmpDest)) != null) {
            path.add(edge);
            tmpDest = edge.getFromVertex();
        }
        Collections.reverse(path);
        return path;
    }

}

class Vertex {
    int id;
    int score = -1;
    Vertex parentVertex = null;
    int rootDistance = -1;
    int ufparent;
    int rank = 0;
    HashMap<Vertex, Edge> edgeMap = new HashMap<Vertex, Edge>();

    Vertex(int id) {
        this.id = id;
        ufparent = id;
    }

    public void addEdge(Edge edge) {
        edgeMap.put(edge.getDestVertex(), edge);
    }

    public boolean isLeaf() {
        return edgeMap.size() <= 1;
    }

    public void treeExpand(Vertex pVertex, int dist) {
        if (rootDistance != -1)// distance < dist
            return;
        parentVertex = pVertex;
        for (Edge edge : edgeMap.values()) {
            if (edge.getDestVertex().equals(parentVertex))
                continue;
            edge.getDestVertex().treeExpand(this, rootDistance + edge.getLength());
        }
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

    @Override
    public String toString() {
        return fromVertex.id + "~" + destVertex.id + " len:" + length;
    }
}