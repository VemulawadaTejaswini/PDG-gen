import java.util.*;

public class Main {
    static long mod = 1000000007;

    static class Edge {
        Node node;
        long w;

        public Edge(Node n, long w) {
            this.node = n;
            this.w = w;
        }
    }
    static class Node {
        int idx;
        int color;
        ArrayList<Edge> edges;

        public Node(int i) {
            idx = i;
            color = 0;
            edges = new ArrayList<Edge>();
        }
    }

    public static void dfs2(Node node, int color, long w) {
        if (node.color == 0) {
            node.color = color;
        } else {
            return;
        }
        for (Edge e: node.edges) {
            if ((e.w + w) % 2 == 0) {
                dfs2(e.node, color, e.w + w);
            } else {
                dfs2(e.node, color * (-1), e.w + w);
            }
        }

    }

    public static void dfs(int n, Node[] lis) {
        for (int i = 0; i < n; ++i) {
            Node node = lis[i];
            dfs2(node, 1, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] lis = new Node[n];

        for (int i = 0; i < n; ++i) {
            lis[i] = new Node(i + 1);
        }

        for (int i = 0; i < n - 1; ++i) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            long w = sc.nextLong();

            Node a = lis[u - 1];
            Node b = lis[v - 1];
            a.edges.add(new Edge(b, w));
            b.edges.add(new Edge(a, w));
        }

        dfs(n, lis);

        for (int i = 0; i < n; ++i) {
            Node node = lis[i];
            if (node.color == 1) {
                System.out.println(1);
            } else if (node.color == -1) {
                System.out.println(0);
            } else {
                throw new RuntimeException("invalid");
            }
        }
    }
}
