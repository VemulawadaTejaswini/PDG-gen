import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            String line = in.readLine();
            String[] split = line.split(" ");
            if (split[0].equals("insert")) {
                tree.insert(Integer.parseInt(split[1]));
            } else if (split[0].equals("find")) {
                if (tree.find(Integer.parseInt(split[1]))) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (split[0].equals("delete")) {
                tree.delete(Integer.parseInt(split[1]));
            } else {
                System.out.println(tree.print());
            }
        }
    }
}

class Tree {
    private Node root;

    class Node {
        Node parent;
        Node left;
        Node right;
        int data;

        private Node(int data) {
            this.data = data;
            parent = null;
            left = null;
            right = null;
        }

        boolean isLeaf() {
            return left == null && right == null;
        }

        String preorder() {
            if (isLeaf()) {
                return " " + data;
            } else if (left == null) {
                return " " + data + right.preorder();
            } else if (right == null) {
                return " " + data + left.preorder();
            } else {
                return " " + data + left.preorder() + right.preorder();
            }
        }

        String inorder() {
            if (isLeaf()) {
                return " " + data;
            } else if (left == null) {
                return " " + data + right.inorder();
            } else if (right == null) {
                return left.inorder() + " " + data;
            } else {
                return left.inorder() + " " + data + right.inorder();
            }
        }

        void delete() {
            if (isLeaf()) {
                if (data < parent.data) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                parent = null;
            } else if (left == null) {
                if (data < parent.data) {
                    parent.left = right;
                } else {
                    parent.right = right;
                }
                right.parent = parent;
                parent = null;
                right = null;
            } else if (right == null) {
                if (data < parent.data) {
                    parent.left = left;
                } else {
                    parent.right = left;
                }
                left.parent = parent;
                parent = null;
                left = null;
            } else {
                Node successor = right;
                while (successor.left != null) {
                    successor = successor.left;
                }
                int replaceData = successor.data;
                successor.delete();
                data = replaceData;
            }
        }
    }

    Tree() {
        root = null;
    }

    void insert(int data) {
        Node parent = null;
        Node node = root;
        Node newNode = new Node(data);
        while (node != null) {
            parent = node;
            if (data < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        newNode.parent = parent;

        if (parent == null) {
            root = newNode;
        } else if (newNode.data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    boolean find(int data) {
        Node node = root;
        while (node != null) {
            if (node.data == data) {
                return true;
            }

            if (data < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return false;
    }

    void delete(int data) {
        Node node = root;
        while (node != null) {
            if (node.data == data) {
                break;
            }

            if (data < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        if (node != null) {
            node.delete();
        }
    }

    String print() {
        return inorder() + "\n" + preorder();
    }

    private String preorder() {
        return root.preorder();
    }

    private String inorder() {
        return root.inorder();
    }
}

