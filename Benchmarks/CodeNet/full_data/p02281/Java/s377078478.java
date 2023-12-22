import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Tree> nodes = new HashMap<>();
        int rootID = 0;
        ArrayList<Integer> notRoots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            int leftID = in.nextInt();
            int rightID = in.nextInt();
            if (leftID != -1) notRoots.add(leftID);
            if (rightID != -1) notRoots.add(rightID);
            Tree node = new Tree(id, leftID, rightID);
            nodes.put(node.id, node);
        }
        notRoots.sort(Integer::compareTo);
        for (Integer i : notRoots) {
            if (rootID == i) {
                rootID++;
            }
        }
        Tree tree = Tree.constructTree(nodes.get(rootID), nodes);
        System.out.println("Preorder");
        System.out.println(tree.preorder());
        System.out.println("Inorder");
        System.out.println(tree.inorder());
        System.out.println("Postorder");
        System.out.println(tree.postorder());
    }
}

class Tree {
    Tree left;
    Tree right;
    int id;
    int leftID;
    int rightID;

    public Tree(int id, int leftID, int rightID) {
        this.id = id;
        this.leftID = leftID;
        this.rightID = rightID;
        left = null;
        right = null;
    }

    static Tree constructTree(Tree currentNode, HashMap<Integer, Tree> nodes) {
        if (currentNode.leftID != -1) {
            currentNode.left = Tree.constructTree(nodes.get(currentNode.leftID), nodes);
        }
        if (currentNode.rightID != -1) {
            currentNode.right = Tree.constructTree(nodes.get(currentNode.rightID), nodes);
        }
        return currentNode;
    }

    boolean isLeaf() {
        return leftID == -1 && rightID == -1;
    }

    String preorder() {
        if (isLeaf()) {
            return " " + id;
        } else if (leftID == -1) {
            return " " + id + right.preorder();
        } else if (rightID == -1) {
            return " " + id + left.preorder();
        } else {
            return " " + id + left.preorder() + right.preorder();
        }
    }

    String inorder() {
        if (isLeaf()) {
            return " " + id;
        } else if (leftID == -1) {
            return " " + id + right.inorder();
        } else if (rightID == -1) {
            return left.inorder() + " " + id;
        } else {
            return left.inorder() + " " + id + right.inorder();
        }
    }

    String postorder() {
        if (isLeaf()) {
            return " " + id;
        } else if (leftID == -1) {
            return right.postorder() + " " + id;
        } else if (rightID == -1) {
            return left.postorder() + " " + id;
        } else {
            return left.postorder() + right.postorder() + " " + id;
        }
    }
}
