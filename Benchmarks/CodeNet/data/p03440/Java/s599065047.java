import java.util.*;

public class Main {
    private static final int INF = Integer.MAX_VALUE;

    public class MinCost {
        int cost, id;

        public MinCost(int cost, int id) {
            this.cost = cost;
            this.id = id;
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
            if (!map.containsKey(root) || (map.get(root).cost > node.cost)) {
                map.put(root, new MinCost(node.cost, i));
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
        Node srcRoot = root(src, node);
        Node dstRoot = root(dst, node);

        node[dstRoot.root] = new Node(srcRoot.root, dstRoot.cost);
    }

    private Node root(int n, Node node[]) {
        if (node[n].root == n) {
            return node[n];
        }

        return node[n] = new Node(root(node[n].root, node).root, node[n].cost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
