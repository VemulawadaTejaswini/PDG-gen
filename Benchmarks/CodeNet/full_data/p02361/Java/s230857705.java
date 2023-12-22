import java.util.*;

public class Main {

    static class Edge {
        int from, to, cost;

        public Edge(int from, int to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
    }

    static class Node implements Comparable<Node> {
        int id, value;

        public Node(int id, int value) {
            this.id = id;
            this.value = value;
        }

        @Override
        public int compareTo(Node o) {
            return value - o.value;
        }
    }

    static int n;
    static List<List<Edge>> graph;
    static int[] dist;
    static int INF = 1000000100;

    static void dijkstra(int start) {
        dist = new int[n];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(n * 2);
        pq.offer(new Node(start, 0));

        boolean[] visited = new boolean[n];

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            visited[node.id] = true;

            if (dist[node.id] < node.value) continue;;

            List<Edge> edges = graph.get(node.id);
            for (int i = 0; i < edges.size(); ++i) {
                Edge edge = edges.get(i);

                if (visited[edge.to]) continue;

                int newDist = dist[edge.from] + edge.cost;
                if (newDist < dist[edge.to]) {
                    dist[edge.to] = newDist;
                    pq.offer(new Node(edge.to, dist[edge.to]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int e = sc.nextInt();
        int r = sc.nextInt();
        graph = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; ++i) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int cost = sc.nextInt();
            graph.get(from).add(new Edge(from, to, cost));
        }

        dijkstra(r);

        for (int i = 0; i < n; ++i) {
            if (dist[i] == INF)
                System.out.println("INF");
            else
                System.out.println(dist[i]);
        }
    }
}
