import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int h = in.nextInt();
            final int w = in.nextInt();
            final int d = in.nextInt();
            TaskD.Vertex[][] field = new TaskD.Vertex[h][w];

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    field[i][j] = new TaskD.Vertex(in.nextInt());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int cv = field[i][j].getValue();
                    int tv = cv + d;
                    for (int k = 0; k < h; k++) {
                        for (int l = 0; l < w; l++) {
                            if (field[k][l].getValue() == tv) {
                                TaskD.Edge e = new TaskD.Edge(field[k][l], Math.abs(i - k) + Math.abs(j - l));
                                field[i][j].setEdge(e);
                                k = h;
                                l = w;
                            }
                        }
                    }
                }
            }

            final int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int c = in.nextInt();
                int t = in.nextInt();
                TaskD.Vertex cv = new TaskD.Vertex();

                for (int j = 0; j < h; j++) {
                    for (int k = 0; k < w; k++) {
                        if (field[j][k].getValue() == c) {
                            cv = field[j][k];
                            j = h;
                            k = w;
                        }
                    }
                }

                long cost = 0;
                while (c != t) {
                    cost += (long) cv.getEdge(0).getCost();
                    cv = cv.getEdge(0).getVertex();
                    c = cv.getValue();
                }
                out.println(cost);
            }
        }

        static class Vertex {
            private int value;
            private ArrayList<TaskD.Edge> edges = new ArrayList<TaskD.Edge>();

            Vertex() {
            }

            Vertex(int v) {
                this.value = v;
            }

            void setEdge(TaskD.Edge e) {
                this.edges.add(e);
            }

            int getValue() {
                return this.value;
            }

            TaskD.Edge getEdge(int index) {
                return this.edges.get(index);
            }

        }

        static class Edge {
            private TaskD.Vertex v;
            private int cost;

            Edge() {
                this.v = v;
            }

            Edge(TaskD.Vertex v) {
                this.v = v;
            }

            Edge(TaskD.Vertex v, int c) {
                this.v = v;
                this.cost = c;
            }

            TaskD.Vertex getVertex() {
                return this.v;
            }

            int getCost() {
                return this.cost;
            }

        }

    }
}

