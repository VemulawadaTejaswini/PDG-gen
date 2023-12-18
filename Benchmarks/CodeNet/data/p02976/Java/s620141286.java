
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
        int remainingOutDegree;
        int index;

        public Node(int remainingOutDegree, int index) {
            this.remainingOutDegree = remainingOutDegree;
            this.index = index;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.remainingOutDegree, o.remainingOutDegree);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < m; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Set<Integer> nextA = graph.getOrDefault(a, new HashSet<>());
            nextA.add(b);
            Set<Integer> nextB = graph.getOrDefault(b, new HashSet<>());
            nextB.add(a);
            graph.put(a, nextA);
            graph.put(b, nextB);
        }
        
        int [] remainings = new int[n + 1];
        Set<Edge> edges = new HashSet<>();
        PriorityQueue<Node> nodes = new PriorityQueue<>();
        for (int i = 1; i <= n; ++i) {
            int degree = graph.get(i).size();
            int outDegree = degree % 2 == 0 ? degree : degree - 1;
            nodes.add(new Node(outDegree, i));
            remainings[i] = outDegree;
        }
        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            int index = node.index;
            int currentRemainingPair = node.remainingOutDegree;

     //       System.out.println("current: " + index + " remaining: " + currentRemainingPair);
            if (remainings[index] < currentRemainingPair) {
                continue;
            }
            if (currentRemainingPair % 2 == 0) {
                Set<Integer> connected = graph.getOrDefault(index, new HashSet<>());
                for (Integer connect : connected) {
                    if (!edges.contains(new Edge(connect, index)) &&
                            !edges.contains(new Edge(index, connect))
                    ) {
                   //     System.out.println("Edge: " + connect + " -> " + index);
                        edges.add(new Edge(connect, index));
                        remainings[connect]--;
                        nodes.add(new Node(remainings[connect], connect));
                    }

                }
            } else {
                Set<Integer> connected = graph.getOrDefault(index, new HashSet<>());
                if (connected.size() < 1) {
                    System.out.println(-1);
                    return;
                }
                for (Integer connect : connected) {
                    if (!edges.contains(new Edge(connect, index)) &&
                            !edges.contains(new Edge(index, connect))
                    ) {
              //          System.out.println("Edge: " + index + " -> " + connect);

                        edges.add(new Edge(index, connect));
                        remainings[index]--;
                        nodes.add(new Node(remainings[index], connect));
                        break;
                    }
                }
            }
        }
        if (edges.size() != m) {
            System.out.println(-1);
            return;
        }
        for (Edge edge : edges) {
            System.out.println(edge.a + " " + edge.b);
        }
    }
}
