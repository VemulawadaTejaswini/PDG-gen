import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Comparator;
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
        APC001D solver = new APC001D();
        solver.solve(1, in, out);
        out.close();
    }

    static class APC001D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            LinkedList<APC001D.Vertex> v = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                APC001D.Vertex nv = new APC001D.Vertex(in.nextInt());
                v.add(nv);
            }
            for (int i = 0; i < m; i++) {
                int indexA = in.nextInt();
                int indexB = in.nextInt();
                APC001D.Vertex v1 = v.get(indexA);
                APC001D.Vertex v2 = v.get(indexB);
                v1.setEdge(v2);
                v2.setEdge(v1);
            }

            LinkedList<APC001D.Tree> t = new LinkedList<>();
            HashSet<APC001D.Vertex> joined = new HashSet<APC001D.Vertex>();
            for (APC001D.Vertex cv : v) {
                if (joined.contains(cv)) continue;
                APC001D.Tree nt = new APC001D.Tree();
                nt.joinVertices(cv);
                for (int j = 0; j < nt.getVerticesSize(); j++) {
                    joined.add(nt.getVertex(j));
                }
                t.add(nt);
            }

            if (n < (n - 1 - m) * 2) {
                out.println("Impossible");
                return;
            }
            if (m == n - 1) {
                out.println(0);
                return;
            }

            int costSum = 0;
            Comparator<APC001D.Tree> verticesSizeComparator = Comparator.comparing(APC001D.Tree::getVerticesSize);
            t.sort(verticesSizeComparator.reversed());

            while (t.size() > 1) {
                APC001D.Tree t1 = t.get(0);
                APC001D.Tree t2 = t.get(1);

                t1.sortVertices();
                APC001D.Vertex t1Vertex = t1.getVertex(0);
                int t1MinCost = t1Vertex.getValue();

                t2.sortVertices();
                APC001D.Vertex t2Vertex = t2.getVertex(0);
                int t2MinCost = t2Vertex.getValue();

                costSum += t1MinCost + t2MinCost;
            /*
            t1Vertex.setEdge(t2Vertex);
            t2Vertex.setEdge(t1Vertex);
            checked.add(t1Vertex);
            checked.add(t2Vertex);
            */
                t1.removeVertex(t1Vertex);
                t2.removeVertex(t1Vertex);
                t1.mergeTree(t2);
                t.remove(t2);
            }
            out.println(costSum);
        }

        static class Vertex {
            private int value;
            private boolean hasValue = false;
            private ArrayList<APC001D.Edge> edges = new ArrayList<APC001D.Edge>();

            Vertex() {
            }

            Vertex(int v) {
                this.value = v;
                this.hasValue = true;
            }

            void setEdge(APC001D.Vertex v) {
                this.edges.add(new APC001D.Edge(v));
            }

            int getValue() {
                return this.value;
            }

            int getDegree() {
                return this.edges.size();
            }

            APC001D.Edge getEdge(int index) {
                return this.edges.get(index);
            }

        }

        static class Edge {
            private APC001D.Vertex v;
            private int cost;

            Edge() {
                this.v = v;
            }

            Edge(APC001D.Vertex v) {
                this.v = v;
            }

            Edge(APC001D.Vertex v, int c) {
                this.v = v;
                this.cost = c;
            }

            APC001D.Vertex getVertex() {
                return this.v;
            }

        }

        static class Tree {
            private LinkedList<APC001D.Vertex> vertices = new LinkedList<APC001D.Vertex>();

            Tree() {
            }

            public void addVertex(APC001D.Vertex v) {
                vertices.add(v);
            }

            public void removeVertex(APC001D.Vertex v) {
                vertices.remove(v);
            }

            public APC001D.Vertex getVertex(int index) {
                return vertices.get(index);
            }

            public int getVerticesSize() {
                return vertices.size();
            }

            public boolean contains(APC001D.Vertex v) {
                return vertices.contains(v);
            }

            private void sortVertices() {
                Comparator<APC001D.Vertex> valueComparator = Comparator.comparing(APC001D.Vertex::getValue);
                this.vertices.sort(valueComparator);
            }

            private void joinVertices(APC001D.Vertex v) {
                this.addVertex(v);
                for (int i = 0; i < v.getDegree(); i++) {
                    APC001D.Vertex nv = v.getEdge(i).getVertex();
                    if (!contains(nv)) {
                        joinVertices(nv);
                    }
                }
            }

            private LinkedList<APC001D.Vertex> getVerticesList() {
                return vertices;
            }

            public void mergeTree(APC001D.Tree t) {
                this.vertices.addAll(t.getVerticesList());
            }

        }

    }
}

