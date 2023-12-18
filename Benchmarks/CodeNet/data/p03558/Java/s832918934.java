import java.util.*;

/**
 * AtCoder Beginner Contest 077
 * D - Small Multiple
 */
public class Main {

    /**
     * 型Vの値を頂点とする有向グラフ
     */
    static class Graph<V> {
        private Set<V> vertices = new HashSet<V>();
        private Map<V, List<Edge>> edges = new HashMap<V, List<Edge>>();

        void addVertex(V vertex) {
            vertices.add(vertex);
        }
        boolean containsVertex(V vertex) {
            return vertices.contains(vertex);
        }

        /*
         * 頂点をコピーする (同じ出次辺集合を持つ)
         */
        void cloneVertex(V from, V clone) {
            this.addVertex(clone);
            edges.put(clone, new LinkedList<Edge>());
            edges.get(clone).addAll(edges.get(from));
        }

        void addEdge(V from, int weight, V to) {
            if (! this.containsVertex(to)) {
                this.addVertex(to);
            }
            if (! edges.containsKey(from)) {
                edges.put(from, new LinkedList<Edge>());
            }
            edges.get(from).add(new Edge(weight, to));
        }

        /**
         * fromからtoまでの最短経路の距離 (辺の重みの和)
         */
        int shortestPath(V from, V to) {
            // Dijkstra法で解く
            Queue<Edge> queue = new PriorityQueue<Edge>();
            queue.add(new Edge(0, from, 0));
            while (! queue.isEmpty()) {
                // 距離最小の頂点uを選ぶ
                Edge uu = queue.remove();
                V u = uu.to;
                if (u.equals(to)) return uu.dist;  // toの距離が確定したら終了

                List<Edge> uEdges = edges.get(u);
                if (uEdges == null) continue;

                // uの隣接頂点の距離を更新
                for (Edge e: uEdges) {
                    int d = uu.dist + e.weight;
                    if (e.dist > d) {
                        e.dist = d;
                        queue.add(e);
                    }
                }
                edges.remove(u);
            }
            return Integer.MAX_VALUE;
        }

        class Edge implements Comparable<Edge> {
            int weight;
            V   to;
            int dist = Integer.MAX_VALUE;  // 開始頂点からtoまでの距離

            Edge(int weight, V to) {
                this.weight = weight;
                this.to     = to;
            }
            Edge(int weight, V to, int dist) {
                this(weight, to);
                this.dist = dist;
            }
            public int compareTo(Edge that) {
                return this.dist - that.dist;
            }
            public String toString() {
                return "(" + weight + "," + to + ")";
            }
        }

        public String toString() {
            return vertices.toString() + edges.toString();
        }
    }

    /**
     * 有向グラフを構築する。
     *   * 頂点は carry (in 0..99998) (K * d (d in 0..9) の上位桁)
     *   * carry から carry' = (carry + K * d) // 10 (d in 0..9) への有向辺
     *   * 辺のラベルは (carry + K * d) % 10 (最下位桁)
     */
    static Graph<Integer> createGraph(int K) {
        Graph<Integer> graph = new Graph<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);  // carry == 0 が開始頂点
        graph.addVertex(0);
        while (! queue.isEmpty()) {
            int u = queue.remove();
            for (int d = 0; d < 10; d++) {  // 1桁の数
                if (u == 0 && d == 0) continue;  // 0の自己閉路を削除
                int v = (u + K * d) / 10;  // 次のcarry
                int w = (u + K * d) % 10;  // 最下位桁
                if (! graph.containsVertex(v)) {
                    queue.add(v);
                }
                graph.addEdge(u, w, v);
            }
        }
        return graph;
    }

    static int solve(int K) {
        Graph<Integer> graph = createGraph(K);
        // 開始頂点のコピーから開始頂点への最短経路を求める
        graph.cloneVertex(0, -1);
        return graph.shortestPath(-1, 0);
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(solve(K));
    }
}
