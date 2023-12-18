import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int ans = 0;

            A.Graph G = new A.Graph(n);
            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(in.next()) - 1;
                int b = Integer.parseInt(in.next()) - 1;
                G.addEdge(a, b, 1);
                G.addEdge(b, a, 1); // 無向グラフの場合
            }

            long[] d = G.dijkstra(0);
            if (d[n - 1] == 2) out.println("POSSIBLE");
            else out.println("IMPOSSIBLE");

        }

        static class Graph {
            ArrayList<A.Edge>[] list;
            int size;
            int[] color;

            public Graph(int n) {
                size = n;
                list = new ArrayList[n];
                color = new int[n];
                for (int i = 0; i < n; i++) {
                    list[i] = new ArrayList<A.Edge>();
                }
            }

            void addEdge(int from, int to, long cost) {
                list[from].add(new A.Edge(to, cost));
            }

            long[] dijkstra(int s) {
                long[] L = new long[size];
                for (int i = 0; i < size; i++) {
                    L[i] = -1;
                }
                int[] visited = new int[size];
                L[s] = 0;
                PriorityQueue<A.Edge> Q = new PriorityQueue<A.Edge>();
                Q.add(new A.Edge(s, 0L));//Edgeに最短距離候補を持たせる
                while (!Q.isEmpty()) {
                    A.Edge C = Q.poll();
                    if (visited[C.to] == 0) {
                        L[C.to] = C.cost;
                        visited[C.to] = 1;
                        for (A.Edge D : list[C.to]) {
                            Q.add(new A.Edge(D.to, L[C.to] + D.cost));
                        }
                    }
                }
                return L;
            }

        }

        static class Edge implements Comparable<A.Edge> {
            int to;
            long cost;

            public Edge(int to, long cost) {
                this.to = to;
                this.cost = cost;
            }

            public boolean equals(Object obj) {
                if (obj instanceof A.Edge) {
                    A.Edge other = (A.Edge) obj;
                    return other.to == this.to && other.cost == this.cost;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.to, this.cost);
            }

            public int compareTo(A.Edge p2) {
                if (this.cost > p2.cost) {
                    return 1;
                } else if (this.cost < p2.cost) {
                    return -1;
                } else {
                    return 0;
                }
            }

        }

    }
}

