import java.util.*;

class Main {
    class Node {
        int id;
        Node left;
        Node right;
        Node parent;

        public Node(int id) {
            this.id = id;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    int count;

    public static void main(String[] args) {
        new Main().main();
    }

    public void main() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ", -1);
            int id = Integer.parseInt(line[0]);
            int left = Integer.parseInt(line[1]);
            int right = Integer.parseInt(line[2]);

            Node node = nodes[id];
            if (left != -1) {
                node.setLeft(nodes[left]);
            }
            if (right != -1) {
                node.setRight(nodes[right]);
            }
        }

        System.out.println("Preorder");
        this.count = n;
        this.preorder(nodes[0]);

        System.out.println("Inorder");
        this.count = n;
        this.inorder(nodes[0]);

        System.out.println("Postorder");
        this.count = n;
        this.postorder(nodes[0]);
    }

    private void preorder(Node node) {
        this.countNode(node);
        if (node.left != null) {
            this.preorder(node.left);
        }
        if (node.right != null) {
            this.preorder(node.right);
        }
    }

    private void inorder(Node node) {
        if (node.left != null) {
            this.inorder(node.left);
        }
        this.countNode(node);
        if (node.right != null) {
            this.inorder(node.right);
        }
    }

    private void postorder(Node node) {
        if (node.left != null) {
            this.postorder(node.left);
        }
        if (node.right != null) {
            this.postorder(node.right);
        }
        this.countNode(node);
    }

    private void countNode(Node node) {
        this.count--;
        System.out.printf((this.count == 0 ? "%d\n" : "%d "), node.id);
    }
}

