import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        new Main().run();
    }
 
    private void run() throws NumberFormatException, IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n; i++) {
            int v = scanner.nextInt();
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            nodes[v].left = left;
            nodes[v].right = right;
            if (left != -1)
                nodes[left].p = v;
            if (right != -1)
                nodes[right].p = v;
        }
 
        int root = 0;
        for (int i = 0; i < n; i++) {
            if (nodes[i].p == -1) {
                root = i;
            }
        }
        System.out.println("Preorder");
        preParse(root, nodes);
        System.out.println();
        System.out.println("Inorder");
        inParse(root, nodes);
        System.out.println();
        System.out.println("Postorder");
        postParse(root, nodes);
        System.out.println();
    }
 
    private void postParse(int id, Node[] nodes) {
        if (id == -1) //
            return;
        postParse(nodes[id].left, nodes);
        postParse(nodes[id].right, nodes);
        System.out.print(" " + id);
    }
 
    private void inParse(int id, Node[] nodes) {
        if (id == -1)
            return;
        inParse(nodes[id].left, nodes);
        System.out.print(" " + id);
        inParse(nodes[id].right, nodes);
    }
 
    private void preParse(int id, Node[] nodes) {
        if (id == -1)
            return;
        System.out.print(" " + id);
        preParse(nodes[id].left, nodes);
        preParse(nodes[id].right, nodes);
    }
 
    class Node {
        int p = -1, left, right;
    }
}