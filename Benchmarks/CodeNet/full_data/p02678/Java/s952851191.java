import java.io.*;
import java.util.*;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static class Node {
        private List<Integer> children;
        private int parent;
        private int depth;

        public Node() {
            this.parent = -1;
            this.depth = -1;
            this.children = new ArrayList<>();
        }

        public void addChild(int child) {
            this.children.add(child);
        }
    }

    private static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;

            nodes[a].addChild(b);
            nodes[b].addChild(a);
        }

        // build up parent
        // treeDfs(nodes, -1, 0, new boolean[nodes.length]);

        treeBfs(nodes, 0);

        out.println("Yes");
        for (int i = 0; i < n - 1; i++) {
            out.println(nodes[i + 1].parent + 1);
        }
    }

    // Tree dfs, expected no loop in the graph
    // First call: treeDfs(nodes, -1, root); (root is the root index)
    private static void treeDfs(Node[] nodes, int parent, int current, boolean[] visited) {
        for (int child : nodes[current].children) {
            if (child != parent) {
                nodes[child].parent = current;
                if (visited[child]) {
                    continue;
                }
                visited[child] = true;
                treeDfs(nodes, current, child, visited);
            }
        }
    }

    // treeBfs
    // First call: treeBfs(nodes, root); (root is the root index)
    private static void treeBfs(Node[] nodes, int root) {
        Queue<Integer> toVisit = new ArrayDeque<>();
        boolean[] visited = new boolean[nodes.length];
        toVisit.add(root);
        nodes[root].depth = 0;

        while (!toVisit.isEmpty()) {
            int current = toVisit.poll();
            Node node = nodes[current];
            // out.println("BFS: on index " + current + ", depth " + (current == 0 ? 0 : nodes[node.parent].depth + 1));
            if (visited[current]) {
                continue;
            }
            visited[current] = true;

            // record depth
            if (current != 0) {
                Node parent = nodes[node.parent];
                node.depth = parent.depth + 1;
            }

            for (int next : node.children) {
                if (next != nodes[current].parent) {
                    toVisit.add(next);
                    if (nodes[next].parent == -1) {
                        // out.println("Recording index " + next + "'s parent as " + current);
                        nodes[next].parent = current;
                    }
                    // Do something with the current (parent) node and next (child) node
                }
            }
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader(InputStream inputStream) {
            br = new BufferedReader(new
                    InputStreamReader(inputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        // https://qiita.com/masakinpo/items/5f77f2a879578a85a0bb
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
