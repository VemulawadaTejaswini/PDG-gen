import java.util.*;

public class Main {

    private class NodeWithCost {
        public int id;
        public long cost;

        public NodeWithCost(int id, long cost) {
            this.id = id;
            this.cost = cost;
        }
    }

    private Map<Integer, Long> buildCostData(int root, Map<Integer, List<NodeWithCost>> tree) {
        Map<Integer, Long> result = new HashMap<>();
        Queue<NodeWithCost> q = new LinkedList<>();
        Map<Integer, Object> visited = new HashMap<>();
        q.add(new NodeWithCost(root, 0));
        while (!q.isEmpty()) {
            NodeWithCost toSearch = q.poll();
            long costSoFar = toSearch.cost;
            visited.put(toSearch.id, new Object());

            for (NodeWithCost neighbor : tree.get(toSearch.id)) {
                if (!visited.containsKey(neighbor.id)) {
                    long costFromRootToNeighbor = costSoFar + neighbor.cost;
                    result.put(neighbor.id, costFromRootToNeighbor);
                    q.add(new NodeWithCost(neighbor.id, costFromRootToNeighbor));
                }
            }
        }
        return result;
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<NodeWithCost>> tree = new HashMap<>();
        for (int i = 0; i < (n - 1); i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            if (!tree.containsKey(a)) {
                tree.put(a, new ArrayList<>());
            }
            if (!tree.containsKey(b)) {
                tree.put(b, new ArrayList<>());
            }
            tree.get(a).add(new NodeWithCost(b, cost));
            tree.get(b).add(new NodeWithCost(a, cost));
        }
        int q = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer, Long> costDataFromK = buildCostData(k, tree);

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(costDataFromK.get(x) + costDataFromK.get(y));
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
