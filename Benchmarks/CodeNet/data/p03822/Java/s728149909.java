import java.util.*;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static class Node {
        int id;
        List<Node> children;
        Node(int id) {
            this.id = id;
            this.children = new ArrayList<>();
        }

        public String toString() {
            return id + ": " + children;
        }

        public int minDepth() {
            if(children.size() == 0) return 0;

            int minDepth = 0;
            for(Node child: children) {
                int depth = child.minDepth();
                minDepth = Math.max(child.minDepth(), minDepth);
            }
            return Math.max(minDepth + 1, children.size());
        }
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Node[] nodes = new Node[N];
        for(int i = 0 ; i < N; i++) {
            nodes[i] = new Node(i);
        }

        for(int i = 1; i < N; i++) {
            int id = sc.nextInt() - 1;
            Node child = nodes[i];
            Node parent = nodes[id];
            parent.children.add(child);
        }

        System.out.println(nodes[0].minDepth());
    }
}