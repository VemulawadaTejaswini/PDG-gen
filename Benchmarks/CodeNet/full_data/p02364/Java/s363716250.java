
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static class MinimalSpanningTree_Prim_Eager {

        Integer[] edgeTo; // index is vertex
        boolean[] vertDone;
        int totalWeight;

        public MinimalSpanningTree_Prim_Eager(WeightedGraph graph) {
            edgeTo = new Integer[graph.numVertex];
            vertDone = new boolean[graph.numVertex];

            MinPriorityQ<VertexWithWeight> minPQ = new MinPriorityQ<VertexWithWeight>();
            edgeTo[0] = 0;
            vertDone[0] = true;
            int vertLeft = graph.numVertex - 1;
            Iterator<WeightedGraph.Edge> itEdge = graph.getEdges(0);
            while (itEdge.hasNext()) {
                WeightedGraph.Edge e = itEdge.next();
                minPQ.add(new VertexWithWeight(e.other(0), 0, e.weight));
            }
            while (vertLeft > 0 && !minPQ.isEmpty()) {
                VertexWithWeight vert = minPQ.remove();
                edgeTo[vert.vert] = vert.fromVert;
                vertDone[vert.vert] = true;
                vertLeft--;
                totalWeight+= vert.weight;
                itEdge = graph.getEdges(vert.vert);
                while (itEdge.hasNext()) {
                    WeightedGraph.Edge e = itEdge.next();
                    minPQ.addOrUpdateKey(new VertexWithWeight(e.other(vert.vert), vert.vert, e.weight));
                }
            }
        }

        public Integer totalWeight() {
            return totalWeight;
        }

        public List<Integer> paths(int vertex) {
            LinkedList<Integer> paths = new LinkedList<Integer>();
            while (edgeTo[vertex] != null) {
                paths.addFirst(edgeTo[vertex]);
                if (edgeTo[vertex] != vertex) {
                    vertex = edgeTo[vertex];
                } else {
                    break;
                }
            }
            return paths;
        }

        class VertexWithWeight implements Comparable {

            int vert;
            int weight;
            int fromVert;

            public VertexWithWeight(int vert, int fromVert, int weight) {
                this.vert = vert;
                this.weight = weight;
                this.fromVert = fromVert;
            }

            public boolean equals(Object obj) {
                if (obj instanceof VertexWithWeight) {
                    return vert == ((VertexWithWeight) obj).vert;
                }
                return false;
            }

            @Override
            public int compareTo(Object o) {
                return weight - ((VertexWithWeight) o).weight;
            }
        }
    }

    public static class WeightedGraph {

        int numVertex;
        int numEdge;

        List<Edge>[] srcEdges;
        List<Edge> edgeList;

        @SuppressWarnings("unchecked")
        public WeightedGraph(int numV) {
            this.numVertex = numV;
            srcEdges = new List[numV];
            edgeList = new ArrayList<Edge>();
            for (int i = 0; i < numV; i++) {
                srcEdges[i] = new ArrayList<Edge>();
            }
        }

        public void addEdge(int v1, int v2, int weight) {
            Edge e = new WeightedGraph.Edge(v1, v2, weight);
            srcEdges[v1].add(e);
            srcEdges[v2].add(e);
            edgeList.add(e);
            numEdge++;
        }

        public Iterator<Edge> getEdges() {
            return edgeList.iterator();
        }

        public Iterator<Edge> getEdges(int vert) {
            return srcEdges[vert].iterator();
        }

        public static class Edge {

            int v1;
            int v2;
            int weight;

            public Edge(int v1, int v2, int weight) {
                this.v1 = v1;
                this.v2 = v2;
                this.weight = weight;
            }

            public int other(int vertex) {
                return v1 == vertex ? v2 : v1;
            }

            @Override
            public boolean equals(Object obj) {
                if (obj instanceof Edge) {
                    final Edge other = (Edge) obj;
                    if (this.weight == other.weight) {
                        if ((v1 == other.v1 && v2 == other.v2) || (v2 == other.v1 && v1 == other.v2)) {
                            return true;
                        }
                    }
                }

                return false;
            }
        }
    }

    /**
     * Mimic raising key value for a PriorityQueue.
     * Introducing a HashSet lookup to speed up addOrUpdateKey to lg(N).
     * Otherwise, it would have cost 2*lg(N).
     */
    public static class MinPriorityQ<E> extends PriorityQueue<E> {

        public MinPriorityQ() {
        }
        HashSet<E> set = new HashSet<E>();

        public boolean add(E e) {
            set.add(e);
            return super.add(e);
        }

        public void addOrUpdateKey(E e) {
            if (set.contains(e)) {
                super.remove(e);
                add(e);
            } else {
                set.add(e);
                add(e);
            }
        }

        public boolean remove(Object o) {
            if (set.remove(o)) {
                return super.remove(o);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVertex = scanner.nextInt();
        int numEdge = scanner.nextInt();
        WeightedGraph graph = new WeightedGraph(numVertex);
        while (numEdge-- > 0) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.addEdge(v1, v2, weight);
        }

        MinimalSpanningTree_Prim_Eager mst = new MinimalSpanningTree_Prim_Eager(graph);
        System.out.println(mst.totalWeight());
    }
}