
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) { return true; }
            if (o == null || getClass() != o.getClass()) { return false; }

            Node node = (Node) o;

            if (x != node.x) { return false; }
            return y == node.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            map.compute(u, (integer, integers) -> {
                if (integers == null) {
                    integers = new ArrayList<>();
                }
                integers.add(v);
                return integers;
            });
            map.compute(v, (integer, integers) -> {
                if (integers == null) {
                    integers = new ArrayList<>();
                }
                integers.add(u);
                return integers;
            });
        }
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nodes.add(new Node(i, j));
            }
        }

        int r = 0;
        Set<Node> global = new HashSet<>(nodes);
        for (Node node : nodes) {
            if (global.contains(node)) {
                r++;
                clear(node, map, global);
            }
        }
        System.out.println(r);
    }

    private static void clear(Node node, Map<Integer, List<Integer>> map, Set<Node> global) {
        List<Integer> target1 = map.get(node.x);
        List<Integer> target2 = map.get(node.y);
        if (target1 == null || target2 == null) {
            return;
        }
        for (Integer x : target1) {
            for (Integer y : target2) {
                Node o = new Node(x, y);
                if (global.remove(o)) {
                    clear(o, map, global);
                }
            }
        }
    }

}
