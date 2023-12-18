import java.util.*;

public class Main {
    private static long INF = Long.MIN_VALUE;

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            nodes[a - 1].childs.add(new Edge(b - 1, c));
        }

        boolean isLoop = false;
        nodes[0].maxCost = 0;
        for (int i = 0; i < n; i++) {
            for (int v = 0; v < n; v++) {
                if (nodes[v].maxCost == INF) {
                    continue;
                }
                for (Edge e : nodes[v].childs) {
                    if (nodes[e.to].maxCost < nodes[v].maxCost + e.cost) {
                        nodes[e.to].maxCost = nodes[v].maxCost + e.cost;
                        if (i == n - 1) {
                            isLoop = true;
                        }
                    }
                }
            }
        }

        System.out.println(!isLoop ? nodes[n - 1].maxCost : "inf");
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
        long maxCost = INF;
        List<Edge> childs = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
