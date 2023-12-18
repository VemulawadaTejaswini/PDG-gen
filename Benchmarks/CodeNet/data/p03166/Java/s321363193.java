import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] x = new int[M + 1];
            int[] y = new int[M + 1];
            for (int e = 1; e <= M; e++) {
                x[e] = in.nextInt();
                y[e] = in.nextInt();
            }
            Graph g = new Graph(N, M, x, y);
            int res = 0;
            for (int e = 1; e <= M; e++) {
                res = Math.max(res, g.longestPath(x[e]));
            }
            out.println(res);
        }

    }

    static class Graph {
        final int N;
        final int M;
        final Map<Integer, Set<Integer>> outEdges = new HashMap<>();
        final Map<Integer, Integer> longestPathSeen = new HashMap<>();

        Graph(int n, int m, int[] from, int[] to) {
            N = n;
            M = m;
            for (int i = 1; i <= m; i++) {
                addEdge(from[i], to[i]);
            }
        }

        void addEdge(int from, int to) {
            if (!outEdges.containsKey(from)) {
                outEdges.put(from, new HashSet<>());
            }
            outEdges.get(from).add(to);
        }

        int longestPath(int vFrom) {
            if (longestPathSeen.containsKey(vFrom)) {
                return longestPathSeen.get(vFrom);
            }
            longestPathSeen.put(vFrom, 0);

            if (outEdges.containsKey(vFrom)) {
                for (int vTo : outEdges.get(vFrom)) {
                    longestPathSeen.put(vFrom, Math.max(
                            longestPathSeen.get(vFrom),
                            longestPath(vTo) + 1));
                }
            }
            return longestPathSeen.get(vFrom);
        }

    }
}

