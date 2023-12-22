
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int SENTINEL = 100000007;
    public static int MAX = 10007;
    public static int NIL = -1;

    public static int[] Depth = new int[MAX];
    public static int[] Height = new int[MAX];
    public static Node[] Tree = new Node[MAX];
    public static int n;

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            Tree[i] = new Node(NIL, NIL, NIL);
        }
        int v, l, r;
        for (int i = 0; i < n; i++) {
            v = sc.nextInt();
            l = sc.nextInt();
            r = sc.nextInt();
            Tree[v].left = l;
            Tree[v].right = r;
            if(l != NIL) Tree[l].parent = v;
            if(r != NIL) Tree[r].parent = v;
        }

        int root = 0;
        for(int i = 0; i < n; i++) {
            if(Tree[i].parent == NIL) root = i;
        }

        // ??????
        System.out.println("Preorder");
        preorder(root);
        System.out.println();
        System.out.println("Inorder");
        inorder(root);
        System.out.println();
        System.out.println("Postorder");
        postorder(root);
        System.out.println();
    }

    public static void preorder(int u) {
        if(u == NIL) return;
        System.out.printf(" %d", u);
        preorder(Tree[u].left);
        preorder(Tree[u].right);
    }
    public static void inorder(int u) {
        if(u == NIL) return;
        inorder(Tree[u].left);
        System.out.printf(" %d", u);
        inorder(Tree[u].right);
    }
    public static void postorder(int u) {
        if(u == NIL) return;
        postorder(Tree[u].left);
        postorder(Tree[u].right);
        System.out.printf(" %d", u);
    }

}

class Node {
    int parent;
    int left;
    int right;
    Node(int p, int l, int r) {
        parent = p;
        left = l;
        right = r;
    }
}