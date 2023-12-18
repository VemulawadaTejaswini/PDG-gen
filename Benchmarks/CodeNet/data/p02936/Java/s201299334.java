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
        int q = in.nextInt();

        Node[] nodes = new Node[n];
        for (int i=0; i < n; i++)
            nodes[i] = new Node();

        for (int i=0; i < n-1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            nodes[a - 1].children.add(b - 1);
            nodes[b - 1].children.add(a - 1);
        }

        for (int i=0; i < q; i++) {
            int p = in.nextInt();
            int x = in.nextInt();

            nodes[p - 1].counter += x;
        }

        treeBfs(nodes, 0);

        out.println(
                Arrays.stream(nodes).map(p -> String.valueOf(p.counter)).collect(Collectors.joining(" "))
        );
    }

    public static class Node {
        private List<Integer> children;
        private int parent;
        private int counter;

        public Node() {
            this.parent = -1;
            this.children = new ArrayList<>();
        }

        public void addChild(int child) {
            this.children.add(child);
        }
    }

    // treeBfs
    // First call: treeBfs(nodes, root); (root is the root index)
    private static void treeBfs(Node[] nodes, int root) {
        Queue<Integer> toVisit = new ArrayDeque<>();

        toVisit.add(root);
        while (!toVisit.isEmpty()) {
            int current = toVisit.poll();
            Node node = nodes[current];

            // Do something with the current node

            for (int next : node.children) {
                if (next != nodes[current].parent) {
                    toVisit.add(next);
                    nodes[next].parent = current;
                    // Do something with the current (parent) node and next (child) node
                    nodes[next].counter += nodes[current].counter;
                }
            }
        }
    }

    // https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream inputStream) {
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
