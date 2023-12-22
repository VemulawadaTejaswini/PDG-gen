import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        Node[] tree = new Node[m];
        String[] input;
        int index = 0;
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < m; i++) {
            input = sc.nextLine().split(" ");
            if (input[0].charAt(0) == 'i') {
                insert(tree, index, new Node(Integer.parseInt(input[1]), -1, -1));
                index++;
            } else {
                print(sb, tree);
            }
        }
        System.out.println(sb);
    }

    public static void insert(Node[] tree, int index, Node node) {
        if (index == 0) {
            tree[0] = node;
            return;
        }

        int parent;
        int child = 0;
        while (true) {
            parent = child;
            if (node.key < tree[child].key) {
                if (tree[child].left == -1) break;
                child = tree[child].left;
            } else {
                if (tree[child].right == -1) break;
                child = tree[child].right;
            }
        }
        tree[index] = node;
        if (node.key < tree[parent].key) {
            tree[parent].left = index;
        } else {
            tree[parent].right = index;
        }
    }

    public static void print(StringBuilder sb, Node[] tree) {
        printInorder(sb, tree, 0);
        sb.append("\n");
        printPreorder(sb, tree, 0);
        sb.append("\n");
    }

    public static void printPreorder(StringBuilder sb, Node[] tree, int index) {
        if (index == -1) return;
        sb.append(" ").append(tree[index].key);
        printPreorder(sb, tree, tree[index].left);
        printPreorder(sb, tree, tree[index].right);
    }

    public static void printInorder(StringBuilder sb, Node[] tree, int index) {
        if (index == -1) return;
        printInorder(sb, tree, tree[index].left);
        sb.append(" ").append(tree[index].key);
        printInorder(sb, tree, tree[index].right);
    }
}

class Node {
    public int key;
    public int left;
    public int right;

    public Node(int key, int left, int right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}