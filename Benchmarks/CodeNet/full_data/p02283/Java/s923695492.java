import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Node {
    long key;
    Node parent, left, right;

    Node(long key) {
        this.key = key;
    }
}

class BinarySearchTree {
    Node root = null;

    void insert(Node node) {
        if (root == null) {
            root = node;
        } else {
            Node parent = null;
            Node curr = root;
            while (curr != null) {
                parent = curr;
                if (node.key < parent.key)
                    curr = curr.left;
                else
                    curr = curr.right;
            }
            // Insert the node
            node.parent = parent;

            // Set the node as a child of the parent
            if (node.key < parent.key)
                parent.left = node;
            else
                parent.right = node;
        }
    }

    void inorderTreeWalk(List<Long> ret, Node curr) {
        if (curr == null) return;
        inorderTreeWalk(ret, curr.left);
        ret.add(curr.key);
        inorderTreeWalk(ret, curr.right);
    }

    void preorderTreeWalk(List<Long> ret, Node curr) {
        if (curr == null) return;
        ret.add(curr.key);
        preorderTreeWalk(ret, curr.left);
        preorderTreeWalk(ret, curr.right);
    }

    void print() {
        List<Long> arr = new ArrayList<>();
        inorderTreeWalk(arr, root);
        System.out.println(" " + arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));

        arr.clear();
        preorderTreeWalk(arr, root);
        System.out.println(" " + arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            BinarySearchTree btree = new BinarySearchTree();

            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                if (line[0].charAt(0) == 'i') {
                    Node node = new Node(Long.parseLong(line[1]));
                    btree.insert(node);
                } else {
                    btree.print();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

