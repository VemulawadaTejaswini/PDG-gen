import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int H = Integer.parseInt(in.next());
            int W = Integer.parseInt(in.next());
            String S[] = new String[H];
            for (int i = 0; i < H; i++) {
                S[i] = in.next();
            }
            long ans = 0;

            GridGraph G = new GridGraph(H, W, S);

            for (int i = 0; i < H * W; i++) {
                long M = Long.MIN_VALUE;
                long B[] = G.bfs(i);
                for (int j = 0; j < B.length; j++) {
                    if (M < B[j]) M = B[j];
                }
                ans = Math.max(ans, M);
            }
            // 出力
            out.println(ans);

        }

        class Edge {
            int to;
            long cost;

            Edge(int a, long b) {
                to = a;
                cost = b;
            }

        }

        class GridGraph extends Graph {
            int N;
            int M;
            String[] S;

            GridGraph(int n, int m, String[] s) {
                super(n * m);
                N = n;
                M = m;
                S = s;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < m; j++) {
                        if (S[i].charAt(j) == '.' && S[i + 1].charAt(j) == '.') {
                            addWeightedEdge(convvertex(i, j), convvertex(i + 1, j), 1);
                            addWeightedEdge(convvertex(i + 1, j), convvertex(i, j), 1);
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m - 1; j++) {
                        if (S[i].charAt(j) == '.' && S[i].charAt(j + 1) == '.') {
                            addWeightedEdge(convvertex(i, j), convvertex(i, j + 1), 1);
                            addWeightedEdge(convvertex(i, j + 1), convvertex(i, j), 1);
                        }

                    }
                }

            }

            int convvertex(int i, int j) {
                return i * M + j;
            }

        }

        class Graph {
            ArrayList<Edge>[] list;
            int size;

            Graph(int N) {
                size = N;
                list = new ArrayList[N];
                for (int i = 0; i < N; i++) {
                    list[i] = new ArrayList<Edge>();
                }
            }

            void addWeightedEdge(int a, int b, long c) {
                list[a].add(new Edge(b, c));
            }

            long[] bfs(int s) {
                long[] L = new long[size];
                for (int i = 0; i < size; i++) {
                    L[i] = -1;
                }
                L[s] = 0;
                ArrayDeque<Integer> Q = new ArrayDeque<Integer>();
                Q.add(s);

                while (!Q.isEmpty()) {
                    int v = Q.poll();
                    for (Edge e : list[v]) {
                        int w = e.to;
                        long c = e.cost;
                        if (L[w] == -1) {
                            L[w] = L[v] + c;
                            Q.add(w);
                        }
                    }
                }
                return L;
            }

        }

    }
}

