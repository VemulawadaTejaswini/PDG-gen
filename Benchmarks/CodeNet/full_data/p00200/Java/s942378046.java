import java.util.*;

class Main
{
    int m;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.solve();
    }

    public void solve() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            m = sc.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            Vertex[] vs = new Vertex[m];
            Graph<Vertex, Edge> g = new Graph<Vertex, Edge>();
            for (int i = 0; i < m; i++) {
                vs[i] = new Vertex();
            }
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;
                int c = sc.nextInt();
                int t = sc.nextInt();
                g.addEdge(vs[a], new Edge(vs[a], vs[b], c, t));
                g.addEdge(vs[b], new Edge(vs[b], vs[a], c, t));
            }

            int k = sc.nextInt();
            for (int i = 0; i < k; i++) {
                int p = sc.nextInt() - 1;
                int q = sc.nextInt() - 1;
                int r = sc.nextInt();

                HashMap<Vertex, Integer> d = dijkstra(g, vs[p], vs[q], r);
                int result = d.get(vs[q]);
                System.out.println(result);
            }
        }
    }

    public HashMap<Vertex, Integer> dijkstra(Graph<Vertex, Edge> g, Vertex start, Vertex goal, int mode) {
        Comparator<Edge> comp;
        if (mode == 0) {
            comp = new CostComp();
        } else {
            comp = new TimeComp();
        }
        PriorityQueue<Edge> q = new PriorityQueue<Edge>(m * 3, comp);
        q.add(new Edge(start, start, 0, 0));
        HashMap<Vertex, Integer> d = new HashMap<Vertex, Integer>();

        while (!q.isEmpty()) {
            Edge edge = q.poll();
            if (d.containsKey(edge.e)) {
                continue;
            }
            if (mode == 0) {
                d.put(edge.e, edge.c);
            } else {
                d.put(edge.e, edge.t);
            }
            if (edge.e == goal) {
                return d;
            }
            for (Edge e: g.getEdges(edge.e)) {
                if (d.containsKey(e.e)) {
                    continue;
                }
                q.add(new Edge(e.s, e.e, edge.c + e.c, edge.t + e.t));
            }
        }

        return d;
    }

    class Graph<Vertex, Edge>
    {
        public HashSet<Vertex> vs = new HashSet<Vertex>();
        public HashMap<Vertex, LinkedList<Edge>> es = new HashMap<Vertex, LinkedList<Edge>>();

        public void add(Vertex v) {
            vs.add(v);
            es.put(v, new LinkedList<Edge>());
        }

        public void addEdge(Vertex v, Edge e) {
            if (es.get(v) == null) {
                es.put(v, new LinkedList<Edge>());
            }
            es.get(v).add(e);
        }

        public LinkedList<Edge> getEdges(Vertex v) {
            LinkedList<Edge> e = es.get(v);
            if (e == null) {
                es.put(v, new LinkedList<Edge>());
                e = es.get(v);
            }
            return e;
        }
    }

    class Vertex {}

    class Edge 
    {
        public Vertex s;
        public Vertex e;
        public int c;
        public int t;

        Edge(Vertex s, Vertex e, int c, int t) {
            this.s = s;
            this.e = e;
            this.c = c;
            this.t = t;
        }
    }

    class CostComp implements Comparator<Edge>
    {
        public int compare(Edge a, Edge b) {
            if (a.c > b.c) {
                return 1;
            } else if (a.c == b.c) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    class TimeComp implements Comparator<Edge>
    {
        public int compare(Edge a, Edge b) {
            if (a.t > b.t) {
                return 1;
            } else if (a.t == b.t) {
                return 0;
            } else {
                return -1;
            }
        }
    }
}