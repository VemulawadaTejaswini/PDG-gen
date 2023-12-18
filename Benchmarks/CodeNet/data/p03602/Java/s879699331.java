
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long MOD = 1000000007;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[][] arrs = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrs[i][j] = sc.nextLong();
            }
        }

        List<Vertex> vertexs = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vertexs.add(new Vertex(i));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long d = arrs[i][j];
                if (d > 0) {
                    edges.add(new Edge(String.valueOf(i), vertexs.get(i), vertexs.get(j), d));
                }
            }
        }

        Graph graph = new Graph(vertexs, edges);
        WarshallFloydAlgorithm warshallFloydAlgorithm = new WarshallFloydAlgorithm(graph);
        long[][] warshallResutls = warshallFloydAlgorithm.execute();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j && warshallResutls[i][j] != arrs[i][j]) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long longest = Long.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    long distance = warshallResutls[i][k] + warshallResutls[k][j];
                    if (i != k && j != k && distance < longest) {
                        longest = distance;
                    }
                }

                if (longest == warshallResutls[i][j]) {
                    warshallResutls[i][j] = 1000000000L;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (warshallResutls[i][j] != 1000000000L) {
                    ans += warshallResutls[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(warshallResutls[i]));

        }

        System.out.println(ans);
    }

    static private class WarshallFloydAlgorithm {

        private final List<Vertex> vertexes;
        private final List<Edge> edges;
        private final long INF = 1000000000L;

        public WarshallFloydAlgorithm(Graph graph) {
            this.vertexes = new ArrayList<>(graph.getVertices());
            this.edges = new ArrayList<>(graph.getEdges());
        }

        public long[][] execute() {
            int n = vertexes.size();

            long[][] distances = new long[n][n];
            for (long[] row : distances)
                Arrays.fill(row, INF);

            for (Edge edge : this.edges) {
                distances[edge.getSource().getId()][edge.getDestination().getId()] = edge.getWeight();
                distances[edge.getDestination().getId()][edge.getSource().getId()] = edge.getWeight();
            }

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        long d = distances[i][k] + distances[k][j];
                        if (d < distances[i][j])
                            distances[i][j] = d;
                    }
                }
            }

            return distances;
        }
    }

    static private class Graph {
        private final List<Vertex> vertices;
        private final List<Edge> edges;

        public Graph(List<Vertex> vertices, List<Edge> edges) {
            this.vertices = vertices;
            this.edges = edges;
        }


        public List<Vertex> getVertices() {
            return this.vertices;
        }

        public List<Edge> getEdges() {
            return this.edges;
        }
    }

    static private class Edge {
        private final String id;
        private final Vertex source;
        private final Vertex destination;
        private final long weight;

        public Edge(String id, Vertex source, Vertex destination, long weight) {
            this.id = id;
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        public String getId() {
            return this.id;
        }

        public Vertex getDestination() {
            return this.destination;
        }

        public Vertex getSource() {
            return this.source;
        }

        public long getWeight() {
            return this.weight;
        }

        @Override
        public String toString() {
            return "weight: " + this.weight + ", " + this.source.toString() + "," + this.destination.toString();
        }
    }

    static private class Vertex {
        final private int id;

        public Vertex(int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public int hashCode() {
            return this.id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            Vertex other = (Vertex) obj;
            return this.getId() == other.getId();
        }

        @Override
        public String toString() {
            return "id: " + this.id;
        }
    }
}