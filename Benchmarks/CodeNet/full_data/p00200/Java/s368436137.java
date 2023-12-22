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
                g.add(vs[i]);
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
                HashMap<Vertex, Integer> d = find(g, vs[p], r);
                System.out.println(d.get(vs[q]));
            }
        }
    }

    public HashMap<Vertex, Integer> find(Graph<Vertex, Edge> g, Vertex s, int mode) {
        HashMap<Vertex, Integer> p = new HashMap<Vertex, Integer>();
        for (Vertex v: g.vs) {
            p.put(v, Integer.MAX_VALUE);
        }
        p.put(s, 0);

        int c;
        for (c = 0; c < g.vs.size(); c++) {
            if (!update(g, p, mode)) {
                break;
            }
        }

        return p;
    }

    public boolean update(Graph<Vertex, Edge> g, HashMap<Vertex, Integer> p, int mode) {
        boolean changed = false;
        for (Vertex v: g.vs) {
            for (Edge e: g.getEdges(v)) {
                int oldCost = p.get(e.e);
                int newCost;
                if (p.get(e.s) == Integer.MAX_VALUE) {
                    newCost = Integer.MAX_VALUE;
                } else if (mode == 0) {
                    newCost = p.get(e.s) + e.c;
                } else {
                    newCost = p.get(e.s) + e.t;
                }

                if (newCost < oldCost) {
                    p.put(e.e, newCost);
                    changed = true;
                }
            }
        }

        return changed;
    }

    class Graph<T1, T2>
    {
        public HashSet<T1> vs = new HashSet<T1>();
        public HashMap<T1, LinkedList<T2>> es = new HashMap<T1, LinkedList<T2>>();

        public void add(T1 v) {
            vs.add(v);
            es.put(v, new LinkedList<T2>());
        }

        public void addEdge(T1 v, T2 e) {
            if (es.get(v) == null) {
                es.put(v, new LinkedList<T2>());
            }
            es.get(v).add(e);
        }

        public LinkedList<T2> getEdges(T1 v) {
            LinkedList<T2> e = es.get(v);
            if (e == null) {
                es.put(v, new LinkedList<T2>());
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
}