
import java.util.*;

/**
 * A_
 */
public class Main {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //node set
        Node[] node = new Node[n];
        boolean[] root = new boolean[n];

        Arrays.fill(root, true);

        for(int i=0; i<n; i++) {

            int id = sc.nextInt();
            int k = sc.nextInt();
            int[] c = new int[k];

            for(int j=0; j<k; j++) {

                c[j] = sc.nextInt();
                root[c[j]] = false;

            }

            node[id] = new Node(c);

        }

        for(int i=0; i<n; i++) {

            if(root[i]) {
                make(node, i, -1, 0);
            }

        }

        export(node, n);
        sc.close();

    }

    public static void make(Node[] nodes, int id, int parent, int depth) {

        StringBuilder sb = new StringBuilder();

        sb.append("node ").append(id).append(": parent = ").append(parent).append(", depth = ").append(depth).append(", ");
        if(parent == -1) {
            sb.append("root");
        } else if(nodes[id].c.length == 0) {
            sb.append("leaf");
        } else {
            sb.append("internal node");
        }
        sb.append(", [");
        for(int i=0; i < nodes[id].c.length; i++) {

            sb.append(nodes[id].c[i]);
            if(i != nodes[id].c.length-1) {
                sb.append(", ");
            }
            make(nodes, nodes[id].c[i], id, depth+1);

        }
        sb.append("]");
        nodes[id].tree = sb.toString();

    }

    public static void export(Node[] node, int n) {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(node[i].tree).append("\n");
        }
        System.out.println(sb);

    }

}

class Node {

    public int[] c;
    public String tree; //retain tree information
    public Node(int[] c) {
        this.c = c;
    }

}
