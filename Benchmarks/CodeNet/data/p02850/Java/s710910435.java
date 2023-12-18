import java.util.*;

public class Main {

    static class Edge {
        int from, to, id;

        public Edge(int from, int to, int id) {
            this.from = from;
            this.to = to;
            this.id = id;
        }
    }

    static class Pair implements Comparable<Pair> {
        int id, prevColor;

        public Pair(int id, int prevColor) {
            this.id = id;
            this.prevColor = prevColor;
        }

        @Override
        public int compareTo(Pair o) {
            return id - o.id;
        }
    }

    static void bfs(int at) {
        visited = new boolean[N];
        visited[at] = true;

        Deque<Pair> deq = new ArrayDeque<>();
        deq.offer(new Pair(0, -1));

        while(!deq.isEmpty()) {
            Pair node = deq.poll();
            int color = 1;
            if (color == node.prevColor) ++color;

            for (Edge edge : graph.get(node.id)) {
                if (visited[edge.to]) continue;
                deq.offer(new Pair(edge.to, color));
                visited[edge.to] = true;
                res[edge.id] = color;
                ++color;
                if (color == node.prevColor) ++color;
            }
        }
    }

    static int N;
    static int maxDeg = 0;
    static List<List<Edge>> graph;
    static int[] res;
    static boolean[] visited;
    static List<Pair> edges;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        graph = new ArrayList<>();
        res = new int[N-1];
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());

        edges = new ArrayList<>();
        for (int i = 0; i < N-1; ++i) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            graph.get(a).add(new Edge(a, b, i));
            graph.get(b).add(new Edge(b, a, i));
        }

        int maxColor = 0;
        for (int i = 0; i < N; ++i) {
            maxColor = Math.max(maxColor, graph.get(i).size());
        }

        for (int i = 0; i < N; ++i) {
            maxDeg = Math.max(maxDeg, graph.get(i).size());
        }


        bfs(0);

        System.out.println(maxColor);
        for (int i = 0; i < res.length; ++i) {
            System.out.println(res[i]);
        }
    }
}