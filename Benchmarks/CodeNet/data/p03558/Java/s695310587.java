import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;

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
        static int zeroOneBFS(Vertex start, Vertex goal) {
            int dist = 1;
            Set<Vertex> checked = new HashSet<>();
            Deque<Vertex> vertexDeque = new ArrayDeque<>();
            vertexDeque.add(start);
            checked.add(start);
            while (vertexDeque.size() > 0) {
                Deque<Vertex> nextDeque = new ArrayDeque<>();
                while (vertexDeque.size() > 0) {
                    Vertex cv = vertexDeque.poll();
                    if (cv == goal) return dist;
                    for (int j = 0; j < cv.getDegree(); j++) {
                        Vertex next = cv.getEdge(j).getVertex();
                        if (cv.getEdge(j).getCost() == 1) {
                            if (checked.contains(next)) continue;
                            nextDeque.add(next);
                        } else {
                            if (nextDeque.contains(next)) {
                                vertexDeque.add(next);
                                nextDeque.remove(next);
                            }
                            if (checked.contains(next)) continue;
                            vertexDeque.add(next);
                        }
                        checked.add(next);
                    }
                }
                vertexDeque = nextDeque;
                dist++;
            }
            return -1;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            Vertex[] vertices = new Vertex[n];
            for (int i = 0; i < n; i++) vertices[i] = new Vertex();
            for (int i = 0; i < n; i++) {
                vertices[i].setEdge(vertices[(i + 1) % n], 1);
                vertices[i].setEdge(vertices[(i * 10) % n], 0);
            }
            out.println(zeroOneBFS(vertices[1], vertices[0]));
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
        private Vertex v;
        private int cost;

        Edge() {
            this.v = v;
        }

        Edge(Vertex v) {
            this.v = v;
        }

        Edge(Vertex v, int c) {
            this.v = v;
            this.cost = c;
        }

        public Vertex getVertex() {
            return this.v;
        }

        public int getCost() {
            return this.cost;
        }

    }
}

