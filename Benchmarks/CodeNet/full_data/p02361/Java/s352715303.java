
import java.util.*;

public class Main {
    int n, m, start;
    ArrayList<ArrayList<Edge>> es;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();
        es = new ArrayList<ArrayList<Edge>>(n);
        for (int i = 0; i < n; i++)
            es.add(new ArrayList<Edge>());
        for (int i = 0; i < m; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int c = sc.nextInt();
            es.get(f).add(new Edge(f, t, c));
        }
    }

    private void solve() {
        PriorityQueue<Node> queue =
                new PriorityQueue<>(new Comparator<Node>() {
                    @Override
                    public int compare(Node node, Node t1) {
                        return Integer.compare(node.getTotalCost(), t1.getTotalCost());
                    }
                });
        int[] log = new int[n];
            queue.add(new Node(start, 0));
            Arrays.fill(log, Integer.MAX_VALUE);
            while (!queue.isEmpty()) {
                Node n = queue.poll();
                if (n.totalCost >= log[n.current])
                    continue;
                log[n.current] = n.totalCost;
                int tmp;
                for (ArrayList<Edge> _es: es) {
                    for (Edge e : _es) {
                        tmp = n.totalCost + e.cost;
                        if (tmp < log[e.to])
                            queue.add(new Node(e.to, tmp));
                    }
                }
            }
        for (int ans: log) {
                if (ans == Integer.MAX_VALUE)
                    System.out.println("INF");
                else
                     System.out.println(ans);
        }
    }

     private class Edge {
        int from, to;
        int cost;
        Edge(int f, int t, int c) {
            from = f; to = t; cost = c;
        }
    }

    private class Node {
        int current;
        int totalCost;
        Node (int c, int t) {
            current = c;
            totalCost = t;
        }

        int getTotalCost() {
            return totalCost;
        }
    }
}