import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Node {
    final static int NIL = -1;

    int id, parent, left, right;

    Node(int id) {
        this.id = id;
        parent = NIL;
        left = NIL;
        right = NIL;
    }

    boolean isRoot() {
        return parent == NIL;
    }
}

class RootedTree {
    static Node findRoot(Node[] nodes) {
        for (Node node : nodes) {
            if (node.isRoot()) return node;
        }
        return null;
    }
}

class TreeWalk {
    static void preorderTreeWalk(List<Integer> ret, Node node, Node[] tree) {
        ret.add(node.id);
        if (node.left != Node.NIL)
            preorderTreeWalk(ret, tree[node.left], tree);
        if (node.right != Node.NIL)
            preorderTreeWalk(ret, tree[node.right], tree);
    }

    static void inorderTreeWalk(List<Integer> ret, Node node, Node[] tree) {
        if (node.left != Node.NIL)
            inorderTreeWalk(ret, tree[node.left], tree);
        ret.add(node.id);
        if (node.right != Node.NIL)
            inorderTreeWalk(ret, tree[node.right], tree);
    }

    static void postorderTreeWalk(List<Integer> ret, Node node, Node[] tree) {
        if (node.left != Node.NIL)
            postorderTreeWalk(ret, tree[node.left], tree);
        if (node.right != Node.NIL)
            postorderTreeWalk(ret, tree[node.right], tree);
        ret.add(node.id);
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            Node[] nodes = IntStream.range(0, n).mapToObj(Node::new).toArray(Node[]::new);

            for (int i = 0; i < n; i++) {
                int[] arr = Arrays.stream(in.readLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                Node node = nodes[arr[0]];
                node.left = arr[1];
                node.right = arr[2];

                if (node.left != Node.NIL)
                    nodes[node.left].parent = node.id;
                if (node.right != Node.NIL)
                    nodes[node.right].parent = node.id;
            }

            Node root = RootedTree.findRoot(nodes);
            assert root != null;

            List<Integer> ret = new ArrayList<>(n);

            TreeWalk.preorderTreeWalk(ret, root, nodes);
            System.out.println("Preorder");
            System.out.println(" " + ret.stream().map(String::valueOf).collect(Collectors.joining(" ")));

            ret.clear();
            TreeWalk.inorderTreeWalk(ret, root, nodes);
            System.out.println("Inorder");
            System.out.println(" " + ret.stream().map(String::valueOf).collect(Collectors.joining(" ")));

            ret.clear();
            TreeWalk.postorderTreeWalk(ret, root, nodes);
            System.out.println("Postorder");
            System.out.println(" " + ret.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

