
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        Node[] tree = new Node[N];
        for (int i = 0; i < N - 1; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            if (tree[from] == null) {
                tree[from] = new Node();
            }
            if (tree[to] == null) {
                tree[to] = new Node();
            }
            tree[from].children.add(tree[to]);
        }
        for (int i = 0; i < Q; i++) {
            int target = sc.nextInt() - 1;
            int add = sc.nextInt();
            recursiveCount(tree[target], add);
        }
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (Node node : tree) {
            sb.append(node.counter);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    private static void recursiveCount(Node target, int value) {
        target.counter += value;
        for (Node child : target.children) {
            recursiveCount(child, value);
        }
    }

    static class Node {
        int counter = 0;
        ArrayList<Node> children = new ArrayList<Node>();
    }
}