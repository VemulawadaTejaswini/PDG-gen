import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        Tree tree[] = new Tree[n+1];
        for(int i=0; i<n+1; i++) {
            tree[i] = new Tree();
            tree[i].value = 0;
            tree[i].tree = new Tree();
        }

        for(int i=0; i<n-1; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            tree[b].tree = tree[a];
        }

        for(int i=0; i<q; i++) {
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            tree[p].value += x;
        }

        for(int i=0; i<n; i++) {
            if (tree[i+1].tree != null)
                tree[i+1].value += tree[i+1].tree.value;
            System.out.print(tree[i+1].value);
            if(i+1 < n)
                System.out.print(" ");
            else
                System.out.println();
        }
    }
}

class Tree {
    int value = 0;
    Tree tree;

    public Tree(){}
}
