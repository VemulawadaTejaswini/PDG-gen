import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int k = in.nextInt();

            Vertex[] vertices = new Vertex[k];
            for (int i = 0; i < k; i++) vertices[i] = new Vertex(i);

            for (int i = 0; i < k; i++) {
                vertices[i].setEdge(vertices[(i * 10) % k], 0);
                vertices[i].setEdge(vertices[(i + 1) % k], 1);
            }

            out.println(Search.dijkstra(vertices[1], vertices[0]));
        }

    }

    static class Vertex {
        private int value;
        private List<Edge> edges = new ArrayList<Edge>();

        public Vertex() {
        }

        public Vertex(int v) {
            this.value = v;
        }

        public void setEdge(Vertex v, int cost) {
            this.edges.add(new Edge(v, cost));
        }

        public int getDegree() {
            return this.edges.size();
        }

        public Edge getEdge(int index) {
            return this.edges.get(index);
        }

    }

    static class Edge {
        private Vertex vertex;
        private int cost;

        public Edge() {
        }

        public Edge(Vertex v) {
            this.vertex = v;
        }

        public Edge(Vertex v, int c) {
            this.vertex = v;
            this.cost = c;
        }

        public Vertex getVertex() {
            return this.vertex;
        }

        public int getCost() {
            return this.cost;
        }

    }

    static class Search {
        public static int dijkstra(Vertex start, Vertex goal) {
            Map<Vertex, Integer> cost = new HashMap<>();
            cost.put(start, 1);

            // initialize priority queue of vertices ordered by cost
            Comparator<Vertex> costComparator = (Vertex o1, Vertex o2) -> (cost.get(o1) - cost.get(o2));
            Queue<Vertex> vertexQ = new PriorityQueue<>(costComparator);
            vertexQ.add(start);

            Set<Vertex> visited = new HashSet<>();
            // find path
            while (vertexQ.size() > 0) {
                Vertex cv = vertexQ.poll();
                visited.add(cv);
                if (cv == goal) return cost.get(cv);

                // see each connected edges
                for (int i = 0; i < cv.getDegree(); i++) {
                    Vertex nextV = cv.getEdge(i).getVertex();
                    if (visited.contains(nextV)) continue;

                    int nextCost = cost.get(cv) + cv.getEdge(i).getCost();
                    // if new cost is smaller, replace it
                    if (nextCost < cost.getOrDefault(nextV, Integer.MAX_VALUE)) {
                        cost.put(nextV, nextCost);
                        if (vertexQ.contains(nextV)) vertexQ.remove(nextV);
                        vertexQ.add(nextV);
                    }
                }
            }
            return -1;
        }

    }
}

