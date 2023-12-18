
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static class Node {
        int x;
        int parent;

        Node(int x) {
            this.x = x;
            this.parent = x;
        }

        public void setParent(int parent) {
            this.parent = parent;
        }

        boolean isRoot() {
            return x == parent;
        }
    }

    static class Union {
        Map<Integer, Node> nodes = new HashMap<>();

        public void addNode(int i) {
            nodes.put(i, new Node(i));
        }

        public int findRoot(int i) {
            Node node = nodes.get(i);
            if (!node.isRoot()) {
                return findRoot(node.parent);
            }
            return node.x;
        }

        public void merge(int x, int y) {
            int root1 = findRoot(x);
            int root2 = findRoot(y);
            if (root1 != root2) {
                nodes.get(root2).parent = root1;
            }
        }

        public int count(int x, int y) {
            int count = 0;
            int root1 = findRoot(x);
            int root2 = findRoot(y);
            for (Node node : nodes.values()) {
                if (findRoot(node.x) == root1 || findRoot(node.x) == root2) {
                    count++;
                }
            }
            return count;
        }
    }

    static class Pair {
        int from;
        int to;

        public Pair(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return "Pair{" +
                   "from=" + from +
                   ", to=" + to +
                   '}';
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Pair> p = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            p.add(new Pair(from, to));
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            Union union = new Union();
            for (int k = 0; k < n; k++) {
                union.addNode(k);
            }
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int b3 = scanner.nextInt();
            for (int j = 0; j < p.size(); j++) {
                int count = union.count(b1 - 1, b2 - 1);
                if (count >= b3) {
                    System.out.println(j);
                    break;
                }
                Pair pair = p.get(j);
                union.merge(pair.from - 1, pair.to - 1);
            }
        }

    }
}
