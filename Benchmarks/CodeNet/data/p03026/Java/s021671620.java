
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static class Edge {
        int a;
        int b;
        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return a == edge.a &&
                    b == edge.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    public static class Node implements Comparable<Node> {
        int index;
        int degrees;
        public Node(int index, int degrees) {
            this.index = index;
            this.degrees = degrees;
        }

        @Override
        public int compareTo(Node o) {
            if (degrees < o.degrees) {
                return -1;
            } else if (degrees == o.degrees) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] graph = new int[n + 1][n + 1];
        long [] value = new long[n];
        Map<Integer, Integer> nodeDegrees = new HashMap<>();
        Set<Edge> edges = new HashSet<>();
        for (int i = 0; i < n - 1; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
            edges.add(new Edge(a, b));
            int aDegrees = nodeDegrees.getOrDefault(a, 0);
            nodeDegrees.put(a, aDegrees + 1);
            int bDegrees = nodeDegrees.getOrDefault(b, 0);
            nodeDegrees.put(b, bDegrees + 1);
        }
        for (int i = 0; i < n; ++i) {
            value[i] = scanner.nextLong();
        }
        Arrays.sort(value);
        PriorityQueue<Node> nodes = new PriorityQueue<>();
        for (int i = 1; i <= n; ++i) {
            Node node = new Node(i, nodeDegrees.get(i));
            nodes.add(node);
        }

        int i = 0;
        long [] assign = new long[n + 1];
        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            assign[node.index] = value[i];
            ++i;
        }
        long sum = 0;
        for (Edge edge : edges) {
            int a = edge.a;
            int b = edge.b;
            long aValue = assign[a];
            long bValue = assign[b];
      //      System.out.println("a: " + a + " + b: " + b + " value: " + (Math.min(aValue, bValue)));
            sum += Math.min(aValue, bValue);
        }
        System.out.println(sum);
        for (i = 1; i <= n; ++i) {
            System.out.print(assign[i] + " ");
        }

    }
}
