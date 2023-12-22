import java.util.*;
import java.util.Arrays;

public class Main {
    class Node {
        int id;
        int left = -1, right = -1;
        String nodeType = null;
        Node(int id, int left, int right) {
            this.id = id;
            this.left = left;
            this.right = right;
        }
        void print() {
            System.out.println(id + ", " + left + ", " + right);
        }
    }
    int[] result;
    int resultIndex;
    void postorder(Node[] nodes, int x) {
        if (nodes[x].left != -1)
            postorder(nodes, nodes[x].left);
        if (nodes[x].right != -1)
            postorder(nodes, nodes[x].right);
        result[resultIndex++] = x;
    }

    Node[] nodes;
    int[] pre;
    int[] in;
    int ap;
int search(int b1p, int b2p) {
        int center = -1;
        if (ap >= pre.length) {
            return -1;
        }
        int top = pre[ap];
        if (b1p + 1 == b2p) {
            nodes[top] = new Node(top, -1, -1);
            return top;
        } else if (b1p >= b2p) {
            return -1;
        }
        for (int i = b1p; i < b2p; i++) {
            if (top == in[i]) {
                center = i;
                break;
            }
        }
        ap++;
        int left = search(b1p, center);
        if (left != -1) ap++;
        int right = search(center+1, b2p);
        nodes[top] = new Node(top, left, right);
        return top;
    }
void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nodes = new Node[n+1];
        pre = new int[n];
        in  = new int[n];
        int root = 0;
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            if (i == 0) root = id;
            pre[i] = id;
        }
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            in[i] = id;
        }
        search(0, nodes.length);
        result = new int[n];
        resultIndex = 0;
        postorder(nodes, root);
        System.out.print(result[0]);
        for (int i = 1; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new Main().run();
    }
}

