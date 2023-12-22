import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            Node r = null;
            String line;
            while ((line = br.readLine()) != null) {
                String[] c_k = line.split(" ");
                if (c_k[0].equals("insert")) {
                    Node z = new Node(Integer.parseInt(c_k[1]));
                    r = insert(r, z);
                }
                if (c_k[0].equals("find")) {
                    int k = Integer.parseInt(c_k[1]);
                    if (find(r, k) == null) {
                        System.out.println("no");
                    } else {
                        System.out.println("yes");
                    }
                }
                if (c_k[0].equals("delete")) {
                    int k = Integer.parseInt(c_k[1]);
                    Node x = find(r, k);
                    deleteNode(r, x);
                }
                if (c_k[0].equals("print")) {
                    printInorder(r);
                    System.out.println();
                    printPreorder(r);
                    System.out.println();
                }
            }
        } catch (IOException
                | NoSuchElementException
                | NumberFormatException e) {
            System.out.println(e);
        }
    }

    private static class Node {
        Node() {}
        Node(int key) {
            this.key = key;
        }
        int key = -1;
        Node parent, left, right;
    }

    private static Node insert(Node r, Node z) {
        Node y = null;
        Node x = r;
        while (x != null) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        z.parent = y;

        if (y == null) {
            r = z;
        } else if (z.key < y.key) {
            y.left = z;
        } else {
            y.right = z;
        }
        return r;
    }

    private static Node find(Node x, int k) {
        while (x != null && k != x.key) {
            if (k < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return x;
    }

    private static void deleteNode(Node r, Node z) {
        Node x, y;
        if (z.left == null || z.right == null) {
            y = z;
        } else {
            y = getSuccessor(z);
        }
        if (y.left != null) {
            x = y.left;
        } else {
            x = y.right;
        }
        if (x != null) {
            x.parent = y.parent;
        }

        if (y.parent == null) {
            r = x;
        } else if (y == y.parent.left) {
            y.parent.left = x;
        } else {
            y.parent.right = x;
        }
        if (y != z) {
            z.key = y.key;
        }
    }

    private static Node getSuccessor(Node z) {
        if (z.right != null) {
            return getMinimum(z.right);
        }

        Node y = z.parent;
        while (y != null && z == y.right) {
            z = y;
            z = y.parent;
        }
        return y;
    }

    private static Node getMinimum(Node z) {
        while (z.left != null) {
            z = z.left;
        }
        return z;
    }

    private static void printPreorder(Node r) {
        System.out.printf(" %d", r.key);
        if (r.left != null) {
            printPreorder(r.left);
        }
        if (r.right != null) {
            printPreorder(r.right);
        }
    }

    private static void printInorder(Node r) {
        if (r.left != null) {
            printInorder(r.left);
        }
        System.out.printf(" %d", r.key);
        if (r.right != null) {
            printInorder(r.right);
        }
    }
}

