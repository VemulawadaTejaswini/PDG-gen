import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DColoringEdgesOnTree solver = new DColoringEdgesOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DColoringEdgesOnTree {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            DColoringEdgesOnTree.Vertex[] vertices = new DColoringEdgesOnTree.Vertex[n];
            DColoringEdgesOnTree.Edge[] edges = new DColoringEdgesOnTree.Edge[(n - 1) * 2];
            for (int i = 0; i < n; i++) {
                vertices[i] = new DColoringEdgesOnTree.Vertex();
            }

            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                vertices[a].addEdge(vertices[b], i * 2, edges);
                vertices[b].addEdge(vertices[a], i * 2 + 1, edges);
            }

            DColoringEdgesOnTree.Vertex root = vertices[0];

            ArrayDeque<DColoringEdgesOnTree.Vertex> queue = new ArrayDeque<>();
            queue.addLast(root);
            root.isAdded = true;
            int maxColor = 0;

            while (!queue.isEmpty()) {
                DColoringEdgesOnTree.Vertex current = queue.pollFirst();
                int color = 1;
                for (DColoringEdgesOnTree.Edge next : current.edges) {
                    if (!next.t.isAdded) {
                        if (next.s.forbiddenColor == color)
                            color++;

                        next.t.isAdded = true;
                        queue.addLast(next.t);

                        next.color = color;
                        next.t.forbiddenColor = color;
                        maxColor = Math.max(maxColor, color);
                        color++;
                    }
                }
            }

            Arrays.sort(edges, Comparator.comparingInt(e -> e.id));

            out.println(maxColor);
            for (DColoringEdgesOnTree.Edge edge : edges) {
                if (edge.color != 0)
                    out.println(edge.color);
            }
        }

        public static class Edge {
            int color;
            DColoringEdgesOnTree.Vertex s;
            DColoringEdgesOnTree.Vertex t;
            int id;

        }

        public static class Vertex {
            boolean isAdded;
            int forbiddenColor;
            List<DColoringEdgesOnTree.Edge> edges = new ArrayList<>();

            public void addEdge(DColoringEdgesOnTree.Vertex vertex, int id, DColoringEdgesOnTree.Edge[] allEdges) {
                DColoringEdgesOnTree.Edge edge = new DColoringEdgesOnTree.Edge();
                edge.s = this;
                edge.t = vertex;
                edge.id = id;
                edges.add(edge);
                allEdges[id] = edge;
            }

        }

    }
}

