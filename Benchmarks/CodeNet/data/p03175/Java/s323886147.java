import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;

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
        PIndependentSet solver = new PIndependentSet();
        solver.solve(1, in, out);
        out.close();
    }

    static class PIndependentSet {
        final int MOD = 1_000_000_000 + 7;

        int add(int a, int b) {
            int res = a + b;
            if (res > MOD) res -= MOD;
            return res;
        }

        int mul(int a, int b) {
            long res = (long) a * (long) b;
            return (int) (res % MOD);
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            ArrayList<Set<Integer>> outVertices = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                outVertices.add(new HashSet<>());
            }
            for (int i = 0; i < N - 1; i++) {
                int v1 = in.nextInt() - 1;
                int v2 = in.nextInt() - 1;
                outVertices.get(v1).add(v2);
                outVertices.get(v2).add(v1);
            }
            ArrayList<Set<Integer>> children = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                children.add(new HashSet<>());
            }

            // # ways[c][i] to properly color sub-tree i, such that node i has color c
            int[][] ways = new int[2][N];
            boolean[] visited = new boolean[N];
            Deque<Integer> path = new ArrayDeque<>(N);
            path.add(0);
            while (!path.isEmpty()) {
                int parent = path.removeLast();
                if (!visited[parent]) {
                    visited[parent] = true;
                    path.addLast(parent);
                    for (int v : outVertices.get(parent)) {
                        if (!visited[v]) {
                            children.get(parent).add(v);
                            path.addLast(v);
                        }
                    }
                } else { // visiting parent for the second time => time to accumulate results
                    ways[0][parent] = 1;
                    ways[1][parent] = 1;
                    for (int child : children.get(parent)) {
                        ways[0][parent] = mul(ways[0][parent], add(ways[0][child], ways[1][child]));
                        ways[1][parent] = mul(ways[1][parent], ways[0][child]);
                    }
                }
            }

            int res = add(ways[0][0], ways[1][0]);
            out.println(res);
        }

    }
}

