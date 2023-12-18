import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            Edge ab = new Edge(i, -1, a, b);
            Edge ba = new Edge(i, -1, b, a);
            nodes[a].add(ab);
            nodes[b].add(ba);
        }
        int color = 0;
        for (int ee : nodes[0].adj.keySet()) {
            Edge e = nodes[0].adj.get(ee);
            e.color = color;
            nodes[e.dst].paint(color, 0, nodes);
            color++;
        }
        int[] ans = new int[n - 1];
        color = 0;
        for (Node node : nodes) {
            for (Edge e : node.adj.values()) {
                ans[e.idx] = e.color + 1;
                color = Math.max(color, e.color + 1);
            }
        }
        System.out.println(color);
        Arrays.stream(ans).forEach(System.out::println);
    }

    private static class Edge {
        int idx;
        int color;
        int src;
        int dst;

        public Edge(int i, int c, int s, int d) {
            idx = i;
            color = c;
            src = s;
            dst = d;
        }
    }

    private static class Node {
        int id;
        HashMap<Integer, Edge> adj;

        public Node(int i) {
            id = i;
            adj = new HashMap<Integer, Edge>();
        }

        void add(Edge e) {
            adj.put(e.dst, e);
        }

        void paint(int rootColor, int root, Node[] ns) {
            Edge er = adj.get(root);
            er.color = rootColor;
            int color = 0;
            for (int e0 : adj.keySet()) {
                Edge e = adj.get(e0);
                if (e.dst == root) {
                    continue;
                }
                if (color == rootColor) {
                    color++;
                }
                e.color = color;
                ns[e.dst].paint(color, e.src, ns);
                color++;
            }
        }
    }
}