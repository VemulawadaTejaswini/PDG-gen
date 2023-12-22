import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        boolean[] isRoot = new boolean[n];
        Arrays.fill(isRoot, true);
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int k = sc.nextInt();
            int[] children = new int[k];
            for (int j = 0; j < k; j++) {
                children[j] = sc.nextInt();
                isRoot[children[j]] = false;
            }
            nodes[id] = new Node(children);
        }

        for (int i = 0; i < n; i++) {
            if (isRoot[i]) {
                solve(nodes, -1, i, 0);
                break;
            }
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append("node ").append(i).append(": parent = ").append(nodes[i].parent).append(", depth = ").append(nodes[i].depth).append(", ");

            if (nodes[i].parent == -1) sb.append("root");
            else if (nodes[i].children.length == 0) sb.append("leaf");
            else sb.append("internal node");

            sb.append(", [");
            for (int j = 0; j < nodes[i].children.length; j++) {
                sb.append(nodes[i].children[j]);
                if (j != nodes[i].children.length - 1) sb.append(", ");
            }
            sb.append("]\n");
        }
        System.out.print(sb);
    }

    public static void solve(Node[] nodes, int parent, int id, int depth) {
        nodes[id].parent = parent;
        nodes[id].depth = depth;

        for (int i = 0; i < nodes[id].children.length; i++) {
            solve(nodes, id, nodes[id].children[i], depth + 1);
        }
    }
}

class Node {
    public int parent;
    public int depth;
    public int[] children;
    public Node(int[] children) {
        this.children = children;
    }
}