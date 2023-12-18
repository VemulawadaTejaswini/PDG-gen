import java.util.*;

public class Main {
    int G;

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = sc.nextInt();
        this.G = height + 1;

        TriTree tree = buildTree(height);
        for (int i = 0; i < n; i++) {
            String st = sc.next();
            tree.buildNode(st);
        }

        long grundy = tree.calcGrundy();
        if(grundy == 0) System.out.println("Bob");
        else System.out.println("Alice");
    }

    public static void main(String[] args) {
        new Main().run();
    }


    class TriTree {
        Node root;
        int height;

        TriTree(Node root, int height) {
            this.root = root;
            this.height = height;
        }

        void buildNode(String st) {
            root.buildNode(st, 0);
        }

        long calcGrundy() {
            return root.calcGrundy();
        }
    }

    TriTree buildTree(int height) {
        Node root = new Node(-1, 'r');
        TriTree triTree = new TriTree(root, height);
        return triTree;
    }

    class Node {
        int l;
        char ch;
        Node child0, child1;

        Node(int l, char ch) {
            this.l = l;
            this.ch = ch;
        }

        void buildNode(String st, int l) {
            if(st.length() == l) return;
            char ch = st.charAt(l);

            Node node;
            if(ch == '0') {
                if(child0 == null) {
                    child0 = new Node(l, '0');
                }
                node = child0;
            } else {
                if(child1 == null) {
                    child1 = new Node(l, '1');
                }
                node = child1;
            }
            node.buildNode(st, l + 1);
        }

        long calcGrundy() {
            if(l == G) {
                return 0;
            }
            long ans = 0;
            if(child0 == null) {
                ans ^= grundy(G - l);
            } else ans ^= child0.calcGrundy();
            if(child1 == null) {
                ans ^= grundy(G - l);
            } else ans ^= child1.calcGrundy();

            return ans;
        }
    }

    long grundy(int l) {
        long ans = 1;
        while(l % ans == 0) ans <<= 1;
        return ans;
    }
}