import java.util.*;

public class Main {
    private static final int INF = Integer.MAX_VALUE;

    public class MinCost {
        int id, cost;

        public MinCost(int id, int cost) {
            this.id = id;
            this.cost = cost;
        }
    }

    public class Node {
        int root, cost;

        public Node(int id, int cost) {
            this.root = id;
            this.cost = cost;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i, sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            link(sc.nextInt(), sc.nextInt(), nodes);
        }
        sc.close();

        if (n - 1 == m) {
            System.out.println(0);
            return;
        } else if (n < 2 * (n - m - 1)) {
            System.out.println("Impossible");
            return;
        }

        Map<Integer, MinCost> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Node node = root(i, nodes);
            int root = node.root;
            if (!map.containsKey(root) || (map.get(root).cost > nodes[i].cost)) {
                map.put(root, new MinCost(i, nodes[i].cost));
            }
        }

        long ans = 0;
        for (Map.Entry<Integer, MinCost> entry : map.entrySet()) {
            MinCost minCost = entry.getValue();
            ans += minCost.cost;
            nodes[minCost.id].cost = INF;
        }

        int cnt = 2 * (n - m - 1) - map.size();
        Arrays.sort(nodes, (o1, o2) -> o1.cost - o2.cost);
        for (int i = 0; i < cnt; i++) {
            ans += nodes[i].cost;
        }

        System.out.println(ans);
    }

    private void link(int src, int dst, Node node[]) {
        node[root(dst, node).root].root = root(src, node).root;
    }

    private Node root(int n, Node node[]) {
        int rootn = node[n].root;
        if (rootn != n) {
            node[n].root = root(rootn, node).root;
        }

        return node[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
