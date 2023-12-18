import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int x = scn.nextInt();
        int y = scn.nextInt();
        Graph graph = new Graph();
        for (int i = 1; i <= n; i++) {
            graph.addVertex(i);
            if (i != 1) {
                graph.addEdge(i, i - 1);
            }
        }

        graph.addEdge(x, y);
        int[] arrayAns = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                arrayAns[graph.shortestDistance(i, j)]++;
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(arrayAns[i]);
        }

    }
}

class Graph {
    class Node {
        int data;
        HashSet<Node> nbrs;

        Node(int data) {
            this.data = data;
            nbrs = new HashSet<>();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return data == node.data;
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }
    }

    HashMap<Integer, Node> vtcs;

    Graph() {
        vtcs = new HashMap<>();
    }

    void addVertex(int n) {
        vtcs.put(n, new Node(n));
    }

    void addEdge(int a, int b) {
        vtcs.get(a).nbrs.add(vtcs.get(b));
        vtcs.get(b).nbrs.add(vtcs.get(a));
    }

    int shortestDistance(int a, int b) {
        HashSet<Node> nodes = new HashSet<>();
        HashSet<Node> processed = new HashSet<>();
        nodes.add(vtcs.get(a));
        processed.add(vtcs.get(a));

        int i = 0;
        while (!nodes.contains(vtcs.get(b))) {
            HashSet<Node> newSet = new HashSet<>();
            for (Node node : nodes) {
                for (Node c : node.nbrs) {
                    if (!processed.contains(c)) {
                        newSet.add(c);
                    }
                }
            }
            nodes = newSet;
            i++;
        }
        return i;
    }
}