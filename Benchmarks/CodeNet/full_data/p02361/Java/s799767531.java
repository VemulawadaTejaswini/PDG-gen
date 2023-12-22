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
            DirectedEdge edge = new DirectedEdge(in.nextInt(), in.nextInt(), in.nextInt());
            G.addEdge(edge);
        }
        SP sp = new SP(G, r);
        for (int i = 0; i < V; i++) {
            System.out.println(sp.hasPathTo(i) ? sp.distTo(i) : "INF");
        }
    }
}

class SP {
    private static final int NA = Integer.MAX_VALUE;

    static class DistTo implements Comparable<DistTo> {
        final int node;
        final int dist;

        DistTo(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }

        @Override
        public int compareTo(DistTo other) {
            return dist - other.dist;
        }
    }

    private final int[] distTo;

    SP(EdgeWeightedDigraph G, int s) {
        distTo = new int[G.V()];
        for (int i = 0; i < G.V(); i++) {
            distTo[i] = i == s ? 0 : NA;
        }
        PriorityQueue<DistTo> pq = new PriorityQueue<>();
        pq.add(new DistTo(s, 0));
        while (!pq.isEmpty()) {
            DistTo poll = pq.poll();// closest node
            if (distTo[poll.node] < poll.dist) {
                continue;
            }
            for (DirectedEdge edge : G.adj(poll.node)) {
                if (distTo[edge.to] > distTo[edge.from] + edge.weight) {
                    distTo[edge.to] = distTo[edge.from] + edge.weight;
                    pq.add(new DistTo(edge.to, distTo[edge.to]));
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

    void addEdge(DirectedEdge e) {
        adj[e.from].add(e);
    }

    Iterable<DirectedEdge> adj(int v) {
        return adj[v];
    }
}

class DirectedEdge {
    final int from;
    final int to;
    final int weight;

    DirectedEdge(int from, int to, int weigth) {
        this.from = from;
        this.to = to;
        this.weight = weigth;
    }

    public String toString() {
        return from + "->" + to + " " + String.format("%d", weight);
    }
}