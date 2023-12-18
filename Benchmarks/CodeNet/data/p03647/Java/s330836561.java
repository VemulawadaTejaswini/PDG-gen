import java.util.*;

public class Main {
    int n, m;
    ArrayList<Integer>[] es;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        es = new ArrayList[n];
        for (int i = 0; i < n; i++)
            es[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            es[a].add(b);
            es[b].add(a);
        }
    }

    void solve() {
        int[] log = new int[n];
        Arrays.fill(log, Integer.MAX_VALUE);
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparing(Node::getCost));
        queue.add(new Node(0, 0));
        log[0] = 0;
        while (!queue.isEmpty()) {
            Node a = queue.poll();
            if (log[a.current] < a.cost) continue;
            log[a.current] = a.cost;
            for (int e: es[a.current]) {
                if (log[a.current] + 1  <= 2)
                    queue.add(new Node(e, log[a.current]+1));
            }
        }
        if (log[n-1] <= 2)
            System.out.println("POSSIBLE");
        else
            System.out.println("IMPOSSIBLE");
    }

    private class Node {
        int current;
        int cost;
        Node (int curr, int c) {
            current = curr;
            cost = c;
        }

        public int getCost() {
            return cost;
        }
    }
}
