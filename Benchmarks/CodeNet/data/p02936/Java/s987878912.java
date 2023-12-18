import java.util.*;

class Main {
    static Node[] ns;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        ns = new Node[N];
        for (int i = 0; i < N; i++)
            ns[i] = new Node(i);
        for (int i = 0; i < N - 1; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            ns[s].add(ns[t]);
            ns[t].add(ns[s]);
        }
        dfs(ns[0], null);
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            ns[p - 1].cnt += x;
        }
        sum(ns[0]);
        StringJoiner res = new StringJoiner(" ");
        for (Node node : ns)
            res.add(String.valueOf(node.cnt));
        System.out.println(res.toString());
        sc.close();
    }

    private static void sum(Node node) {
        if (node.parent != null)
            node.cnt += node.parent.cnt;
        for (Node c : node) {
            if (c != node.parent) {
                sum(c);
            }
        }
    }

    private static void dfs(Node c, Node p) {
        c.parent = p;
        for (Node cc : c)
            if (cc != p)
                dfs(cc, c);
    }

    static class Node extends ArrayList<Node> {
        Node parent;
        int id;
        int cnt = 0;

        Node(int _id) {
            id = _id;
        }
    }
}