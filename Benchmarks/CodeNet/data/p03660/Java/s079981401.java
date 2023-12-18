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

        long cost1[] = dijkstra(0, n, nodes);
        long costn[] = dijkstra(n - 1, n, nodes);

        int fennec = 1;
        int snuke = 1;
        for (int i = 1; i < n - 1; i++) {
            if (cost1[i] <= costn[i]) {
                fennec++;
            } else {
                snuke++;
            }
        }

        System.out.println(fennec > snuke ? "Fennec" : "Snuke");
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
        Long minCost = Long.MAX_VALUE;
        List<Edge> childs = new ArrayList<>();
        boolean isFix = false;

        public Node copy() {
            Node node = new Node();
            node.minCost = this.minCost;
            node.childs.addAll(this.childs);
            node.isFix = this.isFix;
            return node;
        }
    }

    public long[] dijkstra(int start, int n, Node data[]) {
        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = data[i].copy();
        }
        nodes[start].minCost = 0L;

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

        long res[] = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nodes[i].minCost;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
