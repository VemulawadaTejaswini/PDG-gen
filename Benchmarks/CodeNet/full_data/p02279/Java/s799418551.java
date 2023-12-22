import java.util.Scanner;

class Node {

    int parent;
    int depth;
    String type;
    int[] childlen;

    Node(int[] c) {
        childlen = c;
        parent = -1;
    }

    static void setParents(Node[] tree, int n) {
        for(int i = 0; i < n; i++) {
            for(int id : tree[i].childlen) {
                tree[id].parent = i;
            }
        }
    }

    void setInfo(Node[] tree) {
        depth = 0;
        int tmp = parent;
        while(tmp >= 0) {
            depth++;
            tmp = tree[tmp].parent;
        }

        if(depth == 0) {
            type = "root";
        }else if(childlen.length == 0) {
            type = "leaf";
        }else {
            type = "internal node";
        }
    }

    void printInfo(int id) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < childlen.length; i++) {
            if(i != 0) sb.append(", ");
            sb.append(childlen[i]);
        }

        System.out.printf("node %d: parent = %d, depth = %d, %s, [%s]\n",
                id, parent, depth, type, sb.toString());
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        Node[] tree = new Node[n];
        for(int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int k = sc.nextInt();
            int[] c = new int[k];
            for(int j = 0; j < k; j++) {
                c[j] = sc.nextInt();
            }
            tree[id] = new Node(c);
        }

        Node.setParents(tree, n);
        for(int i = 0; i < n; i++) {
            tree[i].setInfo(tree);
            tree[i].printInfo(i);
        }

        sc.close();
    }
}

