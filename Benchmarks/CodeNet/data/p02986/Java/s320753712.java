
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class UnionFindTree {
        int nodeNum;
        int [] parent;

        public UnionFindTree(int nodeNum) {
            this.nodeNum = nodeNum;
            parent = new int[nodeNum + 1];
            for (int i = 1; i <= nodeNum; ++i) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                return parent[x] = find(parent[x]);
            }
        }

        // make y as x's father
        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent[rootX] = rootY;
        }

    }

    public static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a &&
                    b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int [][] color = new int[n + 1][n + 1];
        int [][] length = new int[n + 1][n + 1];
        Map<Integer, Set<Integer>> query = new HashMap<>();
        for (int i = 0; i < n + 1; ++i) {
            color[i] = new int[n + 1];
            length[i] = new int[n + 1];
        }

        for (int i = 1; i <= n - 1; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            Set<Integer> aNexts = graph.getOrDefault(a, new HashSet<>());
            Set<Integer> bNexts = graph.getOrDefault(b, new HashSet<>());
            aNexts.add(b);
            bNexts.add(a);
            graph.put(a, aNexts);
            graph.put(b, bNexts);
            color[a][b] = c;
            color[b][a] = c;
            length[a][b] = d;
            length[b][a] = d;
        }

        int[] X = new int[q];
        int[] Y = new int[q];
        int[] U = new int[q];
        int[] V = new int[q];
        for (int i = 0; i < q; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            X[i] = x;
            Y[i] = y;
            U[i] = u;
            V[i] = v;
            Set<Integer> queryU = query.getOrDefault(u, new HashSet<>());
            queryU.add(v);
            query.put(u, queryU);
            Set<Integer> queryV = query.getOrDefault(v, new HashSet<>());
            queryV.add(u);
            query.put(v, queryV);
        }
        UnionFindTree unionFindTree = new UnionFindTree(n + 1);
        int [] visited = new int[n + 1];
        Map<Pair, Integer> LCA = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> colorsNum = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> colorsSum = new HashMap<>();
        Map<Integer, Integer> totalSum = new HashMap<>();

        findLCA(graph, visited, unionFindTree, 1, query, LCA);

        totalSum.put(1, 0);
        bfs(n, graph, color, length, colorsNum, colorsSum, totalSum);

        for (int i = 0; i < q; ++i) {
            int x = X[i];
            int y = Y[i];
            int u = U[i];
            int v = V[i];
            int rootU = totalSum.getOrDefault(u, 0) - colorsSum.getOrDefault(u, new HashMap<>()).getOrDefault(x, 0)
                    + colorsNum.getOrDefault(u, new HashMap<>()).getOrDefault(x, 0) * y;

            int rootV = totalSum.getOrDefault(v, 0) - colorsSum.getOrDefault(v, new HashMap<>()).getOrDefault(x, 0)
                    + colorsNum.getOrDefault(v, new HashMap<>()).getOrDefault(x, 0) * y;

            int lca = LCA.get(new Pair(u, v));
            int rootLCA = totalSum.getOrDefault(lca, 0) - colorsSum.getOrDefault(lca, new HashMap<>()).getOrDefault(x, 0)
                    + colorsNum.getOrDefault(lca, new HashMap<>()).getOrDefault(x, 0) * y;

        //    System.out.println("rootU: " + rootU + " rootV: " + rootV + " lca: " + lca + " rootLCA: " + rootLCA);
            int result = rootU + rootV - 2 * rootLCA;
            System.out.println(result);
        }
    }

    public static void findLCA(
            Map<Integer, Set<Integer>> graph,
            int[] visited,
            UnionFindTree unionFindTree,
            int current,
            Map<Integer, Set<Integer>> query,
            Map<Pair, Integer> LCA
    ) {
        visited[current] = 1;
        Set<Integer> sons = graph.get(current);
        for (Integer son : sons) {
            if (visited[son] == 1) {
                continue;
            }
            findLCA(graph, visited, unionFindTree, son, query, LCA);
            unionFindTree.union(son, current);
        }
        for (Integer v : query.getOrDefault(current, new HashSet<>())) {
            if (visited[v] == 1) {
                LCA.put(new Pair(Math.min(current, v), Math.max(current, v)), unionFindTree.find(v));
            }
        }
    }

    public static void bfs(
            int n,
            Map<Integer, Set<Integer>> graph, int[][] color, int[][] length,
            Map<Integer, Map<Integer, Integer>> colorsNum,
            Map<Integer, Map<Integer, Integer>> colorsSum,
            Map<Integer, Integer> totalSum
    ) {
        int [] visited = new int[n + 1];
        Queue<Integer> nodes = new LinkedList<>();
        nodes.add(1);
        visited[1] = 1;
        while (!nodes.isEmpty()) {
            int current = nodes.poll();
            Set<Integer> sons = graph.get(current);
            Map<Integer, Integer> rootCurrentColorsNum = colorsNum.getOrDefault(
                    current,
                    new HashMap<>()
            );
            Map<Integer, Integer> rootCurrentColorsSum = colorsSum.getOrDefault(
                    current,
                    new HashMap<>()
            );
            int rootCurrentTotalSum = totalSum.getOrDefault(current, 0);
            for (Integer son : sons) {
                if (visited[son] == 1) {
                    continue;
                }
                int currentColor = color[current][son];
                int currentLength = length[current][son];
                Map<Integer, Integer> rootSonColorsNum = new HashMap<>(rootCurrentColorsNum);
                Map<Integer, Integer> rootSonColorsSum = new HashMap<>(rootCurrentColorsSum);
                int originalColorNum = rootCurrentColorsNum.getOrDefault(currentColor, 0);
                int originalColorSum = rootCurrentColorsSum.getOrDefault(currentColor, 0);
                rootSonColorsNum.put(currentColor, originalColorNum + 1);
                rootSonColorsSum.put(currentColor, originalColorSum + currentLength);
                colorsNum.put(son, rootSonColorsNum);
                colorsSum.put(son, rootSonColorsSum);
                totalSum.put(son, rootCurrentTotalSum + currentLength);
                visited[son] = 1;
                nodes.add(son);
            }
        }
    }
}
