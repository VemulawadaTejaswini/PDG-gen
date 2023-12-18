import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    public static class Node {
        private int counter;
        private List<Integer> children;

        public Node() {
            this.children = new ArrayList<>();
        }

        public void addChild(int child) {
            this.children.add(child);
        }
    }

    private static void solve() {
        int n = in.nextInt();
        int q = in.nextInt();

        Node[] nodes = new Node[n];
        for (int i=0; i < n; i++)
            nodes[i] = new Node();

        for (int i=0; i < n-1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            nodes[a - 1].addChild(b - 1);
            nodes[b - 1].addChild(a - 1);
        }

        for (int i=0; i < q; i++) {
            int p = in.nextInt();
            int x = in.nextInt();
            nodes[p - 1].counter += x;
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> toVisit = new ArrayDeque<>();
        visited[0] = true;
        toVisit.add(0);
        while (!toVisit.isEmpty()) {
            int i = toVisit.poll();
            Node p = nodes[i];
            List<Integer> toAdd = p.children;
            for (int a : toAdd) {
                if (!visited[a]) {
                    visited[a] = true;
                    toVisit.add(a);
                    nodes[a].counter += p.counter;
                }
            }
        }
        

        // dfs(nodes, -1, 0);

        out.println(
                Arrays.stream(nodes).map(p -> String.valueOf(p.counter)).collect(Collectors.joining(" "))
        );
    }

    private static void dfs(Node[] nodes, int parent, int index) {
        if (parent >= 0) {
            nodes[index].counter += nodes[parent].counter;
        }

        for (int child : nodes[index].children) {
            if (child != parent)
                dfs(nodes, index, child);
        }
    }

}
