import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodes[a - 1].childs.add(new Edge(b - 1, 1));
            nodes[b - 1].childs.add(new Edge(a - 1, 1));
        }

        dijkstra(0, nodes);

        System.out.println((nodes[n - 1].minCost - 1) % 2 == 1 ? "Fennec" : "Snuke");
    }

    private class Edge {
        int to;
        long cost;

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    private class Node {
        long minCost = Long.MAX_VALUE;
        List<Edge> childs = new ArrayList<>();
        boolean isFix = false;
    }

    public void dijkstra(int start, Node nodes[]) {
        nodes[start].minCost = 0;

        Queue<Node> queue = new PriorityQueue<>((n1, n2) -> Long.compare(n1.minCost, n2.minCost));
        queue.add(nodes[start]);
        while (!queue.isEmpty()) {
            Node src = queue.poll();
            src.isFix = true;
            for (Edge e : src.childs) {
                Node dst = nodes[e.to];
                if (!dst.isFix) {
                    dst.minCost = Math.min(dst.minCost, src.minCost + e.cost);
                    queue.add(dst);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
