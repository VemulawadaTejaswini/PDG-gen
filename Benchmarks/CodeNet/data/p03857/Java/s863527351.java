
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    static class Node {
        int index;
        Node parent;
        List<Node> children = new ArrayList<>();

        Node(int index) {
            this.index = index;
        }

        public void union(Node other) {
            Node parent1 = this.findParent();
            Node parent2 = other.findParent();
            if (parent1.equals(parent2)) {
                return;
            }
            if (parent1.index > parent2.index) {
                parent2.parent = parent1;
                parent2.children.forEach(node -> {
                    node.parent = parent1;
                });
                parent1.children.addAll(parent2.children);
            } else {
                parent1.parent = parent2;
                parent1.children.forEach(node -> {
                    node.parent = parent2;
                });
                parent2.children.addAll(parent1.children);
            }

        }

        Node findParent() {
            if (this.parent == null) {
                return this;
            }
            return parent.findParent();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) { return true; }
            if (o == null || getClass() != o.getClass()) { return false; }

            Node node = (Node) o;

            return index == node.index;
        }

        @Override
        public int hashCode() {
            return index;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = scanner.nextInt();
        int l = scanner.nextInt();

        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i));
        }

        for (int i = 0; i < k; i++) {
            int pi = scanner.nextInt();
            int qi = scanner.nextInt();
            Node n1 = nodes.get(pi - 1);
            Node n2 = nodes.get(qi - 1);
            n1.union(n2);
        }
        int[] roads = new int[n];
        for (int i = 0; i < n; i++) {
            roads[i] = nodes.get(i).findParent().index;
        }

        nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i));
        }
        for (int i = 0; i < l; i++) {
            int ri = scanner.nextInt();
            int si = scanner.nextInt();
            Node n1 = nodes.get(ri - 1);
            Node n2 = nodes.get(si - 1);
            n1.union(n2);
        }
        int[] rails = new int[n];
        for (int i = 0; i < n; i++) {
            rails[i] = nodes.get(i).findParent().index;
        }

        Map<String, Integer> all = new HashMap<>();
        for (int i = 0; i < n; i++) {
            all.compute(roads[i] + "," + rails[i], (s, integer) -> {
                if (integer == null) {
                    return 1;
                } else {
                    return integer + 1;
                }
            });
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            joiner.add(all.get(roads[i] + "," + rails[i]) + "");
        }
        System.out.println(joiner);
    }
}
