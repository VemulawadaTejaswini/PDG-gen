
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;

public class Main {

    static class Node {
        int index;

        Node(int index) {
            this.index = index;
        }

        Node parent; //if null then this is root;

        void union(Node other) {
            Node parent1 = findParent();
            Node parent2 = other.findParent();
            if (parent1.equals(parent2)) {
                return;
            }
            parent1.parent = parent2;
        }

        @Override
        public String toString() {
            return "Node{" +
                   "index=" + index +
                   '}';
        }

        Node findParent() {
            if (parent == null) {
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
        List<Node> roads = new ArrayList<>();
        List<Node> rails = new ArrayList<>();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Node node = new Node(i);
            roads.add(node);

            Node node1 = new Node(i);
            rails.add(node1);
        }

        int k = scanner.nextInt();
        int l = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            int pi = scanner.nextInt();
            int qi = scanner.nextInt();
            Node p = roads.get(pi - 1);
            Node q = roads.get(qi - 1);
            p.union(q);

        }
        for (int i = 0; i < l; i++) {
            int ri = scanner.nextInt();
            int si = scanner.nextInt();
            Node r = rails.get(ri - 1);
            Node s = rails.get(si - 1);
            r.union(s);
        }

        Map<Node, Set<Node>> rootToNode = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Node node = roads.get(i);
            Node root = node.findParent();
            Set<Node> nodes = rootToNode.computeIfAbsent(root, r -> {
                HashSet<Node> objects = new HashSet<>();
                objects.add(r);
                return objects;
            });
            if (!node.equals(root)) {
                nodes.add(node);
            }
        }

        Map<Integer, Set<Node>> all1 = new HashMap<>();
        for (Set<Node> nodes : rootToNode.values()) {
            for (Node node : nodes) {
                all1.put(node.index, nodes);
            }
        }

        Map<Node, Set<Node>> rootToNode2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Node node = rails.get(i);
            Node root = node.findParent();
            Set<Node> nodes = rootToNode2.computeIfAbsent(root, r -> {
                HashSet<Node> objects = new HashSet<>();
                objects.add(r);
                return objects;
            });
            if (!node.equals(root)) {
                nodes.add(node);
            }
        }
        Map<Integer, Set<Node>> all2 = new HashMap<>();
        for (Set<Node> nodes : rootToNode2.values()) {
            for (Node node : nodes) {
                all2.put(node.index, nodes);
            }
        }

        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < n; i++) {
            HashSet<Node> nodes = new HashSet<>(all1.get(i));
            nodes.retainAll(all2.get(i));
            stringJoiner.add(nodes.size() + "");
        }
        System.out.println(stringJoiner.toString());
    }
}
