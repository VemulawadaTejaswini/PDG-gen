import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        Node nodeA = null;
        Node root = null;
        Map<Integer, Node> map = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (!map.containsKey(a)) {
                nodeA = new Node();
                if (root == null) {
                    root = nodeA;
                }
                map.put(a, nodeA);
            } else {
                nodeA = map.get(a);
            }

            Node nodeB = new Node();
            map.put(b, nodeB);
            nodeA.addChild(nodeB);
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            Node nodeP = map.get(p);
            nodeP.plus(x);
            nodeP.counter += x;
        }

        root.show();
    }

}

class Node {
    long counter;
    List<Node> children;

    public Node() {
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    public void plus(int x) {
        for (Node node : children) {
            node.counter += x;
            node.plus(x);
        }
    }

    public void show() {
        System.out.print(this.counter + " ");
        for (Node node : children) {
            node.show();
        }
    }
}