
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int SENTINEL = 100000007;
    public static int MAX = 10007;
    public static int NIL = -1;

    public static int[] Depth = new int[MAX];
    public static Tree[] Node = new Tree[MAX];
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
            Node[i] = new Tree(NIL, NIL, NIL);
        }
        int v, c, d, l;
        for (int i = 0; i < n; i++) {
            v = sc.nextInt();
            d = sc.nextInt();
            l = 0;
            for(int j = 0; j < d; j++) {
                c = sc.nextInt();
                if (j == 0) Node[v].left = c;
                else Node[l].right = c;
                l = c;
                Node[c].parent = v;
            }
        }
        int r = 0;
        for(int i = 0; i < n; i++) {
            if(Node[i].parent == NIL) r = i;
        }
        rec(r, 0);
        // ??????
        for(int i = 0; i < n; i++) print(i);
    }

    public static void rec(int u, int p) {
        Depth[u] = p;
        if(Node[u].right != NIL) rec(Node[u].right, p);
        if(Node[u].left != NIL) rec(Node[u].left, p + 1);
    }

    public static void print(int u) {
        System.out.printf("node  %d: parent = %d, depth = %d, ", u, Node[u].parent, Depth[u]);
        if(Node[u].parent != NIL) System.out.print("root, ");
        else if(Node[u].left == NIL) System.out.print("leaf, ");
        else System.out.print("internal node, ");

        System.out.print("[");
        int c = Node[u].left;
        for(int i = 0; c != NIL; c = Node[c].right) {
            if(i != 0) System.out.print(", ");
            System.out.print(c);
            i++;
        }
        System.out.println("]");
    }
}

class Tree {
    int parent;
    int left;
    int right;
    Tree(int p, int l, int r) {
        parent = p;
        left = l;
        right = r;
    }
}