import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        int root = 0;
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int k = sc.nextInt();
            int[] children = new int[k];
            for (int j = 0; j < k; j++) {
                children[j] = sc.nextInt();
            }
            if (i == 0) root = id;
            nodes[id] = new Node(children);
        }

        solve(nodes, -1, root, 0);

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append(nodes[i].output).append("\n");
        }
        System.out.print(sb);
    }

    public static void solve(Node[] nodes, int parent, int id, int depth) {
        StringBuilder sb = new StringBuilder("");
        sb.append("node ").append(id).append(": parent = ").append(parent).append(", depth = ").append(depth).append(", ");

        if (parent == -1) sb.append("root");
        else if (nodes[id].children.length == 0) sb.append("leaf");
        else sb.append("internal node");

        sb.append(", [");
        for (int i = 0; i < nodes[id].children.length; i++) {
            sb.append(nodes[id].children[i]);
            if (i != nodes[id].children.length - 1) sb.append(", ");

            solve(nodes, id, nodes[id].children[i], depth + 1);
        }
        sb.append("]");
        nodes[id].output = sb.toString();
    }
}

class Node {
    public int[] children;
    public String output;
    public Node(int[] children) {
        this.children = children;
    }
}