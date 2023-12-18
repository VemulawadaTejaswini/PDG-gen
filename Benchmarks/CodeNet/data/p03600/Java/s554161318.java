import java.util.*;
import java.util.stream.Stream;

public class Main {

    private static int N;
    private static int A[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve());
    }

    static long solve() {

        List<Dijkstra.Edge> edges = new ArrayList<>();
        for (int i = 0; i < N-1 ; i++) {
            for (int j = i+1; j < N; j++) {
                edges.add(new Dijkstra.Edge(i, j, A[i][j]));
            }
        }

        boolean[][] direct = new boolean[N][N];
        for (int i = 0; i < N-1 ; i++) {
            for (int j = i+1; j < N ; j++) {
                int a = A[i][j];
                long d = distWithoutEdge(i, j, edges);
                if( a < d ) {
                    direct[i][j] = true;
                } else if( a == d ) {
                    direct[i][j] = false;
                } else {
                    // おかしい
                    return -1;
                }
            }
        }

        long ans = 0;

        for (int i = 0; i < N-1 ; i++) {
            for (int j = i+1; j < N ; j++) {
                if( direct[i][j] ) {
                    ans += A[i][j];
                }
            }
        }

        return ans;
    }

    static long distWithoutEdge(int i, int j, List<Dijkstra.Edge> edges) {
        long[] dist = Dijkstra.calcDistances(N, i, edges.stream().filter(e -> !(e.a == i && e.b == j)));
        return dist[j];
    }

    static class Dijkstra {

        // node: 0-origin
        static long[] calcDistances(int n, int from, Stream<Edge> edges) {
            List<Edge>[] adjList = calcAdjList(n, edges);

            long[] distance = new long[n];
            Arrays.fill(distance, Long.MAX_VALUE);
            distance[from] = 0;

            Queue<Point> q = new PriorityQueue<>();
            q.add(new Point(from, 0));

            while( !q.isEmpty() ) {
                Point p = q.poll();
                if( distance[p.node] < p.cost ) {
                    continue;
                }

                distance[p.node] = p.cost;

                for (Edge edge : adjList[p.node]) {
                    int to = edge.to(p.node);
                    q.add( new Point(to, p.cost + edge.cost) );
                }
            }
            return distance;
        }

        static class Point implements Comparable<Point> {
            private final int node;
            private final long cost;

            public Point(int node, long cost) {
                this.node = node;
                this.cost = cost;
            }

            @Override
            public int compareTo(Point o) {
                return Long.compare(cost, o.cost);
            }
        }

        static class Edge {
            final int a;
            final int b;
            final int cost;

            public Edge(int a, int b, int cost) {
                this.a = a;
                this.b = b;
                this.cost = cost;
            }

            int to(int node) {
                if( node == a ) return b;
                else if( node == b ) return a;
                throw new RuntimeException("wtf : " + a + " " + b + " " + node);
            }
        }

        static List<Edge>[] calcAdjList(int n, Stream<Edge> edges) {
            @SuppressWarnings("unchecked")
            List<Edge>[] array = new List[n];
            for (int i = 0; i < n; i++) {
                array[i] = new ArrayList<>();
            }

            edges.forEach(e -> {
                array[e.a].add(e);
                array[e.b].add(e);
            });
            return array;
        }
    }
}
