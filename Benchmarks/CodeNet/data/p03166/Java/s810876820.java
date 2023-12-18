import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int getInt() {
        return Integer.parseInt(line());
    }

    private static int[] getIntArr(int n) {
        int[] ans = new int[n];

        StringTokenizer stringTokenizer = new StringTokenizer(line(), " ");
        for (int i = 0; i < n && stringTokenizer.hasMoreTokens(); i++) {
            ans[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        return ans;
    }

    private static String line() {
        try {
            return READER.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int solve() {
        int[] nm = getIntArr(2);
        int n = nm[0];
        int m = nm[1];

        int[][] edges = new int[m][];
        for (int i = 0; i < m; i++) {
            edges[i] = getIntArr(2);
        }
        return solveInternal(n, m, edges);
    }

    private static int solveInternal(int n, int m, int[][] edges) {
        Graph graph = new Graph(n, edges);
        System.out.println(graph.origin);
        int cnt = 0;
        HashSet<Integer> cur = graph.roots;
        while (!cur.isEmpty()) {
            System.out.println(cur);
            HashSet<Integer> next = new HashSet<>();
            for (int node : cur) {
                List<Integer> list = graph.origin.get(node);
                if (list != null) {
                    next.addAll(list);
                }
            }
            cur = next;
            cnt++;
        }

        return cnt - 1;
    }

    private static int max(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }

    private static final class Graph {
        public final HashMap<Integer, ArrayList<Integer>> origin;
        public final HashSet<Integer> roots;
//        public final int[] marks;

        private Graph(int n, int[][] edges) {
//            marks = new int[n];
            roots = new HashSet<>(n);
            for (int i = 1; i <= n; i++) {
                roots.add(i);
            }
            origin = new HashMap<>();

            for (int[] edge : edges) {
                int x = edge[0];
                int y = edge[1];
                roots.remove(y);
                ArrayList<Integer> list = origin.get(x);
                if (list == null) {
                    list = new ArrayList<>(1);
                    list.add(y);
                    origin.put(x, list);
                } else {
                    list.add(y);
                }
            }
        }
    }

    public static void main(String... args) {
        System.out.println(solve());
//        System.out.println(
//                solveInternal(4, 5, new int[][]{
//                        {1, 2},
//                        {1, 3},
//                        {3, 2},
//                        {2, 4},
//                        {3, 4}
//                })
//        );
    }
}