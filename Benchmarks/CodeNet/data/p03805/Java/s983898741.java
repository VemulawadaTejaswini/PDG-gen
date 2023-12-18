import java.util.*;

public class Main {

    static class Node {
        final int id;

        final List<Node> links = new ArrayList<>();

        Node(int id) {
            this.id = id;
        }

        void connect(Node n) {
            this.links.add(n);
            n.links.add(this);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; ++i) {
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < m; ++i) {
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;

            nodes[a].connect(nodes[b]);
        }

        int fullbits = (1 << n) - 1;
        int count = dfs(nodes[0], 0, fullbits);
        System.out.println(count);
    }

    public static int dfs(Node n, int bits, int fullbits) {
        int count = 0;
        int bits1 = bits | (1 << n.id);
        if (bits1 == fullbits) {
            return 1;
        }
        for (Node n1 : n.links) {
            if ((bits1 & (1 << n1.id)) == 0) {
                count += dfs(n1, bits1, fullbits);
            }
        }
        return count;
    }

}
