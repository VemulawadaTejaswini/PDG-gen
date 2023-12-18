import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static FastReader in = new FastReader(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        // direct friends
        int[] directFriends = new int[n];

        for (int i = 0; i < m; i++) {
            // friends
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;

            nodes[a].addChild(b);
            nodes[b].addChild(a);

            directFriends[a]++;
            directFriends[b]++;
        }

        // friends set reverse map
        Set<Integer>[] friendsMap = new Set[n];

        // do bfs and make friends list
        boolean[] visited = new boolean[nodes.length];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Set<Integer> friendsList = bfs(nodes, i, visited);
                for (Integer f : friendsList) {
                    friendsMap[f] = friendsList;
                }
            }
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = friendsMap[i].size() - directFriends[i] - 1;
        }

        // block relations
        for (int i = 0; i < k; i++) {
            int c = in.nextInt() - 1;
            int d = in.nextInt() - 1;

            if (friendsMap[c].contains(d)) {
                ans[c]--;
                ans[d]--;
            }
        }

        out.println(
                Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "))
        );
    }

    private static class Node {
        private List<Integer> children;
        private int parent;

        public Node() {
            this.parent = -1;
            this.children = new ArrayList<>();
        }

        public void addChild(int child) {
            this.children.add(child);
        }
    }

    // bfs
    // First call: bfs(nodes, root); (root is the root index)
    private static Set<Integer> bfs(Node[] nodes, int root, boolean[] visited) {
        Queue<Integer> toVisit = new ArrayDeque<>();
        visited[root] = true;
        toVisit.add(root);

        Set<Integer> friends = new HashSet<>();

        while (!toVisit.isEmpty()) {
            int current = toVisit.poll();
            Node node = nodes[current];

            // Do something with the current node
            friends.add(current);

            for (int next : node.children) {
                // Do something with the current (parent) node and next (child) node

                if (!visited[next]) {
                    visited[next] = true;
                    toVisit.add(next);
                }
            }
        }
        return friends;
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
