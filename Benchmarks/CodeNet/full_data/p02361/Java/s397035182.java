import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int V = in.nextInt(), E = in.nextInt(), r = in.nextInt();
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(V);
        for (int i = 0; i < E; i++) {
            G.addEdge(in.nextInt(), new DirectedEdge(in.nextInt(), in.nextInt()));
        }
        SP sp = new SP(G, r);
        for (int i = 0; i < V; i++) {
            System.out.println(sp.hasPathTo(i) ? sp.distTo(i) : "INF");
        }
    }
}

class SP {
    private static final int NA = Integer.MAX_VALUE;
    private final int[] distTo;

    static class NodeDist implements Comparable<NodeDist> {
        final int node;
        final int dist;

        NodeDist(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(NodeDist that) {
            return that.dist - this.dist;
        }
    }

    SP(EdgeWeightedDigraph G, int s) {
        distTo = new int[G.V()];
        for (int i = 0; i < G.V(); i++) {
            distTo[i] = i == s ? 0 : NA;
        }
        PriorityQueue<NodeDist> pq = new PriorityQueue<>();
        pq.add(new NodeDist(s, 0));
        while (!pq.isEmpty()) {
            NodeDist poll = pq.poll();// closest node
            if (distTo[poll.node] < poll.dist) {
                continue;
            }
            for (DirectedEdge edge : G.adj(poll.node)) {
                if (distTo[edge.to] > distTo[poll.node] + edge.weight) {
                    distTo[edge.to] = distTo[poll.node] + edge.weight;
                    pq.add(new NodeDist(edge.to, distTo[edge.to]));
                }
            }
        }
    }

    int distTo(int t) {
        return distTo[t];
    }

    boolean hasPathTo(int t) {
        return distTo[t] != NA;
    }
}

class EdgeWeightedDigraph {
    private final List<DirectedEdge>[] adj;
    private int E = 0;

    @SuppressWarnings("unchecked")
    EdgeWeightedDigraph(int V) {
        adj = new List[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<DirectedEdge>();
        }
    }

    int V() {
        return adj.length;
    }

    int E() {
        return E;
    }

    void addEdge(int from, DirectedEdge e) {
        adj[from].add(e);
        E++;
    }

    Iterable<DirectedEdge> adj(int s) {
        return adj[s];
    }

    Iterable<DirectedEdge> edges() {
        List<DirectedEdge> edges = new ArrayList<>();
        for (List<DirectedEdge> adjEdges : adj) {
            edges.addAll(adjEdges);
        }
        return edges;
    }
}

class DirectedEdge {
    final int to;
    final int weight;

    DirectedEdge(int to, int weigth) {
        this.to = to;
        this.weight = weigth;
    }

    public String toString() {
        return "->" + to + " " + String.format("%d", weight);
    }
}