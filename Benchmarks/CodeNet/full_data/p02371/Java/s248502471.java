
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static class Tree {

        List<Edge>[] vertEdges;
        int numNodes;

        @SuppressWarnings("unchecked")
        public Tree(int n) {
            numNodes = n;
            vertEdges = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                vertEdges[i] = new ArrayList<Edge>();
            }
        }

        class Edge {

            int v1;
            int v2;
            int weight;

            public Edge(int v1, int v2, int weight) {
                this.v1 = v1;
                this.v2 = v2;
                this.weight = weight;
            }

            public int otherVertex(int v) {
                return v1 == v ? v2 : v1;
            }

            public boolean equals(Object o) {
                if (o instanceof Edge) {
                    Edge edge = (Edge) o;
                    return ((v1 == edge.v1 && v2 == edge.v2) || (v1 == edge.v2 && v2 == edge.v1));
                }
                return false;
            }

        }

        public void addEdge(int n1, int n2, int weight) {
            Edge e = new Edge(n1, n2, weight);
            vertEdges[n1].add(e);
            vertEdges[n2].add(e);
        }

        public int diameter() {
            int vertRandom = 0;
            BFSNode node = bfsFarthest(vertRandom);
            node = bfsFarthest(node.vert);
            return node.distance;
        }

        private BFSNode bfsFarthest(int vert) {
            Queue<BFSNode> queue = new LinkedList<BFSNode>();
            queue.add(new BFSNode(vert, -1, 0));
            BFSNode fathest = new BFSNode(0, 0, 0);
            while (!queue.isEmpty()) {
                BFSNode node = queue.remove();
                if (node.distance > fathest.distance) {
                    fathest = node;
                }
                for (Edge e : vertEdges[node.vert]) {
                    int vertOther = e.otherVertex(node.vert);
                    if (vertOther != node.fromVert) {
                        queue.add(new BFSNode(vertOther, node.vert, node.distance + e.weight));
                    }
                }
            }
            return fathest;
        }

        class BFSNode {

            private int vert;
            private int fromVert;
            private int distance;

            public BFSNode(int vert, int fromVert, int distance) {
                this.vert = vert;
                this.fromVert = fromVert;
                this.distance = distance;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Tree tree = new Tree(n);
        for (int i = 0; i < n - 1; i++) {
            int s = scanner.nextInt();
            int t = scanner.nextInt();
            int weight = scanner.nextInt();
            tree.addEdge(s, t, weight);
        }
        System.out.println(tree.diameter());

    }
}