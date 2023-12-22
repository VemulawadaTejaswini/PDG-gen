
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main{

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
            // the process is strict dfs with postorder.
            // A quick way is to build dfs topology and process from backwards
            Stack<Integer> vertDfsStack = new Stack<Integer>();
            vertDfsStack.add(-1);
            vertDfsStack.add(0);
            int pos = 0;
            while (pos < vertDfsStack.size()) {
                int fromVert = vertDfsStack.get(pos);
                int vert = vertDfsStack.get(pos + 1);
                for (Edge e : vertEdges[vert]) {
                    int vertOther = e.otherVertex(vert);
                    if (vertOther != fromVert) {
                        vertDfsStack.add(vert);
                        vertDfsStack.add(vertOther);
                    }
                }
                pos = pos + 2;
            }
            HashMap<Integer, Integer> diaMap = new HashMap<Integer, Integer>();
            HashMap<Integer, Integer> heightMap = new HashMap<Integer, Integer>();
            // process from backwards
            while (!vertDfsStack.isEmpty()) {
                int vert = vertDfsStack.pop();
                int fromVert = vertDfsStack.pop();
                int diameter = 0;
                int maxHeight = 0;
                // invariant: maxHeight1 > maxHeight2
                int maxHeight1 = 0;
                int maxHeight2 = 0;
                for (Edge e : vertEdges[vert]) {
                    int vertOther = e.otherVertex(vert);
                    if (vertOther == fromVert) {
                        continue;
                    }
                    int diaSubtree = diaMap.get(vertOther);
                    diameter = Math.max(diameter, diaSubtree);
                    int heightSubtree = e.weight + heightMap.get(vertOther);
                    if (heightSubtree >= maxHeight1) {
                        maxHeight2 = maxHeight1;
                        maxHeight1 = heightSubtree;
                    } else if (heightSubtree >= maxHeight2) {
                        maxHeight2 = heightSubtree;
                    }
                    maxHeight = Math.max(maxHeight, heightSubtree);
                    diameter = Math.max(diameter, maxHeight1 + maxHeight2);
                }
                diaMap.put(vert, diameter);
                heightMap.put(vert, maxHeight);
            }

            return diameter(0, -1, new MaxHeightHolder());
        }

        private int diameter(int vert, int fromVert, MaxHeightHolder holder) {
            int ret = 0;
            // invariant: maxHeight1 > maxHeight2
            int maxHeight1 = 0;
            int maxHeight2 = 0;
            for (Edge e : vertEdges[vert]) {
                int vertOther = e.otherVertex(vert);
                if (vertOther == fromVert) {
                    continue;
                }
                MaxHeightHolder h = new MaxHeightHolder();
                int diaSubtree = diameter(vertOther, vert, h);
                ret = Math.max(ret, diaSubtree);
                int heightSubtree = e.weight + h.value;
                if (heightSubtree >= maxHeight1) {
                    maxHeight2 = maxHeight1;
                    maxHeight1 = heightSubtree;
                } else if (e.weight + h.value >= maxHeight2) {
                    maxHeight2 = heightSubtree;
                }

                holder.value = Math.max(holder.value, heightSubtree);
            }
            ret = Math.max(ret, maxHeight1 + maxHeight2);
            return ret;
        }

        class MaxHeightHolder {

            int value;
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