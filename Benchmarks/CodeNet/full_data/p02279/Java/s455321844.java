import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Node {
    final static int NIL = -1;

    int id, degree, parent, left, right, depth;

    Node(int id) {
        this.id = id;
        degree = 0;
        parent = NIL;
        left = NIL;
        right = NIL;
        depth = 0;
    }

    boolean isParent() {
        return parent == NIL;
    }

    boolean isLeaf() {
        return left == NIL;
    }

    boolean hasRightSibling() {
        return right != NIL;
    }

    boolean hasChild() {
        return degree > 0;
    }

    String getType() {
        if (isParent()) return "root";
        else if (isLeaf()) return "leaf";
        else return "internal node";
    }
}

class RootedTree {
    static Node findRoot(Node[] nodes) {
        for (Node node : nodes) {
            if (node.isParent()) return node;
        }
        return null;
    }

    private static void setDepth(Node node, Node[] nodes, int depth) {
        node.depth = depth;

        for (int id : getChildrenIds(node, nodes)) {
            setDepth(nodes[id], nodes, depth + 1);
        }
//        if (node.hasChild()) {
//            setDepth(nodes[node.left], nodes, depth + 1);
//        }
//        if (node.hasRightSibling()) {
//            setDepth(nodes[node.right], nodes, depth);
//        }
    }

    static void setDepth(Node[] nodes) {
        Node root = RootedTree.findRoot(nodes);
        assert root != null;
        RootedTree.setDepth(root, nodes, 0);
    }

    static int[] getChildrenIds(Node node, Node[] nodes) {
        if (!node.hasChild()) {
            return new int[]{};
        } else {
            int[] ret = new int[node.degree];
            Node child = nodes[node.left];
            ret[0] = child.id;
            for (int i = 1; i < node.degree; i++) {
                child = nodes[child.right];
                ret[i] = child.id;
            }
            return ret;
        }
    }

    static String nodeToString(Node node, Node[] nodes) {
        return "node " + node.id
                + ": parent = " + node.parent
                + ", depth = " + node.depth
                + ", " + node.getType()
                + ", ["
                + IntStream.of(getChildrenIds(node, nodes))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "))
                + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            final Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node(i);
            }

            for (int i = 0; i < n; i++) {
                int[] arr = Arrays.stream(in.readLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                int id = arr[0];
                Node node = nodes[id];
                node.degree = arr[1];

                if (node.degree == 0) continue;
                // root or internal node
                for (int j = 2; j < 2 + node.degree; j++) {
                    int childId = arr[j];
                    Node child = nodes[childId];
                    child.parent = id;
                    if (j == 2) {
                        node.left = childId;
                    } else {
                        Node leftSibling = nodes[arr[j - 1]];
                        leftSibling.right = childId;
                    }
                }
            }

            RootedTree.setDepth(nodes);

            for (Node node : nodes) {
                System.out.println(RootedTree.nodeToString(node, nodes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

