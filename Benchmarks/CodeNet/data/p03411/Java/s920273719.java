import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        P[] red = new P[N], blue = new P[N];
        for (int i = 0; i < N; i++) {
            red[i] = new P(in.nextInt(), in.nextInt());
        }
        for (int i = 0; i < N; i++) {
            blue[i] = new P(in.nextInt(), in.nextInt());
        }

        FlowGraph G = new FlowGraph(2 * N + 2);
        int SOURCE = 2 * N, SINK = 2 * N + 1;
        for (int i = 0; i < N; i++) {
            G.addEdge(new FlowEdge(SOURCE, i, 1));
            G.addEdge(new FlowEdge(i + N, SINK, 1));
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (red[i].x < blue[j].x &&
                        red[i].y < blue[j].y) {
                    G.addEdge(new FlowEdge(i, j + N, 1));
                }
            }
        }
        // System.out.println(G);
        FordFulkerson ff = new FordFulkerson(G, SOURCE, SINK);

        int ans = ff.value();
        System.out.println(ans);
    }

    private static class P {
        final int x, y;

        P(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

class FlowGraph {
    private final List<FlowEdge>[] adj;

    @SuppressWarnings("unchecked")
    FlowGraph(int V) {
        adj = new List[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    int V() {
        return adj.length;
    }

    void addEdge(FlowEdge e) {
        adj[e.from()].add(e);
        adj[e.to()].add(e);
    }

    Iterable<FlowEdge> adj(int v) {
        return adj[v];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("V=").append(V()).append("\n");
        for (int v = 0; v < V(); v++) {
            s.append(v).append(": ").append(adj(v)).append("\n");
        }
        return s.toString();
    }
}

class FordFulkerson {
    private final int V;
    private boolean[] marked;
    private FlowEdge[] edgeTo;
    private int value;

    public FordFulkerson(FlowGraph G, int s, int t) {
        V = G.V();
        validate(s);
        validate(t);
        if (s == t)
            throw new IllegalArgumentException("Source equals sink");
        if (!isFeasible(G, s, t))
            throw new IllegalArgumentException("Initial flow is infeasible");

        // while there exists an augmenting path, use it
        value = excess(G, t);
        while (hasAugmentingPath(G, s, t)) {

            // compute bottleneck capacity
            int bottle = Integer.MAX_VALUE;
            for (int v = t; v != s; v = edgeTo[v].other(v)) {
                bottle = Math.min(bottle, edgeTo[v].residualCapacityTo(v));
            }

            // augment flow
            for (int v = t; v != s; v = edgeTo[v].other(v)) {
                edgeTo[v].addResidualFlowTo(v, bottle);
            }

            value += bottle;
        }

        // check optimality conditions
        assert check(G, s, t);
    }

    public int value() {
        return value;
    }

    public boolean inCut(int v) {
        validate(v);
        return marked[v];
    }

    private void validate(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (V - 1));
    }

    private boolean hasAugmentingPath(FlowGraph G, int s, int t) {
        edgeTo = new FlowEdge[G.V()];
        marked = new boolean[G.V()];

        // breadth-first search
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        marked[s] = true;
        while (!queue.isEmpty() && !marked[t]) {
            int v = queue.remove();

            for (FlowEdge e : G.adj(v)) {
                int w = e.other(v);

                // if residual capacity from v to w
                if (e.residualCapacityTo(w) > 0) {
                    if (!marked[w]) {
                        edgeTo[w] = e;
                        marked[w] = true;
                        queue.add(w);
                    }
                }
            }
        }

        return marked[t];
    }

    private int excess(FlowGraph G, int v) {
        int excess = 0;
        for (FlowEdge e : G.adj(v)) {
            if (v == e.from())
                excess -= e.flow();
            else
                excess += e.flow();
        }
        return excess;
    }

    private boolean isFeasible(FlowGraph G, int s, int t) {

        for (int v = 0; v < G.V(); v++) {
            for (FlowEdge e : G.adj(v)) {
                if (e.flow() < 0 || e.flow() > e.capacity()) {
                    return false;
                }
            }
        }

        if (Math.abs(value + excess(G, s)) > 0) {
            return false;
        }
        if (Math.abs(value - excess(G, t)) > 0) {
            return false;
        }
        for (int v = 0; v < G.V(); v++) {
            if (v == s || v == t)
                continue;
            else if (Math.abs(excess(G, v)) > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean check(FlowGraph G, int s, int t) {
        if (!isFeasible(G, s, t)) {
            return false;
        }
        if (!inCut(s)) {
            return false;
        }
        if (inCut(t)) {
            return false;
        }
        int mincutValue = 0;
        for (int v = 0; v < G.V(); v++) {
            for (FlowEdge e : G.adj(v)) {
                if ((v == e.from()) && inCut(e.from()) && !inCut(e.to()))
                    mincutValue += e.capacity();
            }
        }

        if (Math.abs(mincutValue - value) > 0) {
            return false;
        }

        return true;
    }
}

class FlowEdge {
    private final int v; // from
    private final int w; // to
    private final int capacity; // capacity
    private int flow; // flow

    public FlowEdge(int v, int w, int capacity) {
        this(v, w, capacity, 0);
    }

    public FlowEdge(int v, int w, int capacity, int flow) {
        this.v = v;
        this.w = w;
        this.capacity = capacity;
        this.flow = flow;
    }

    public FlowEdge(FlowEdge e) {
        this(e.v, e.w, e.capacity, e.flow);
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    public int capacity() {
        return capacity;
    }

    public int flow() {
        return flow;
    }

    public int other(int vertex) {
        if (vertex == v)
            return w;
        else if (vertex == w)
            return v;
        else
            throw new IllegalArgumentException("invalid endpoint");
    }

    public int residualCapacityTo(int vertex) {
        if (vertex == v)
            return flow; // backward edge
        else if (vertex == w)
            return capacity - flow; // forward edge
        else
            throw new IllegalArgumentException("invalid endpoint");
    }

    public void addResidualFlowTo(int vertex, int delta) {
        if (vertex == v)
            flow -= delta; // backward edge
        else if (vertex == w)
            flow += delta; // forward edge
        else
            throw new IllegalArgumentException("invalid endpoint");

        if (!(flow >= 0))
            throw new IllegalArgumentException("Flow is negative");
        if (!(flow <= capacity))
            throw new IllegalArgumentException("Flow exceeds capacity");
    }

    public String toString() {
        return v + "->" + w + " " + flow + "/" + capacity;
    }
}