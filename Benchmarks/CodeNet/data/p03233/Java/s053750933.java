

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class Node implements Comparable<Node> {
        public long value;
        public int index;

        public Node(final long value, final int index) {
            this.value = value;
            this.index = index;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return value == node.value &&
                    index == node.index;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, index);
        }

        @Override
        public int compareTo(Node o) {
            if (this.value < o.value) {
                return -1;
            } else if (this.value == o.value) {
                return 0;
            } else {
                return 1;
            }

        }
    }
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final PriorityQueue<Node> a = new PriorityQueue<>(
        );
        final PriorityQueue<Node> b = new PriorityQueue<>(
                Comparator.reverseOrder()
        );
        final Set<Integer> visited = new HashSet<>();

        for (int i = 1; i <= n; ++i) {
            long currentA = scanner.nextLong();
            long currentB = scanner.nextLong();
            a.add(new Node(currentA, i));
            b.add(new Node(currentB, i));
        }
        long result = 0;
        int startIndex = a.peek().index;

        while (!a.isEmpty()) {
            Node aNode = a.poll();
            Node bNode = b.poll();
            Set<Node> bNodes = new HashSet<>();
            while (aNode.index == bNode.index
                    || (visited.contains(aNode.index) && bNode.index == startIndex)
                    || ((!b.isEmpty()) && visited.contains(bNode.index))
            ) {
                bNodes.add(bNode);
                bNode = b.poll();
            }
            result += Math.min(aNode.value, bNode.value);
            visited.add(bNode.index);
            b.addAll(bNodes);
        }
        System.out.println(result);
    }
}

