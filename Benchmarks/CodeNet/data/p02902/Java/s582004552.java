import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    static List<List<Integer>> edges;
    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edges.get(a).add(b);
        }
        for (int i = 0; i < n; i++) {
            List<Integer> list = dfs(i, i, new boolean[n], new boolean[n]);
            if (list != null) {
                System.out.println(list.size());
                for (int j : list) {
                    System.out.println(j + 1);
                }
                return;
            }
        }
        System.out.println(-1);
    }

    static List<Integer> dfs(int parent, int v, boolean[] visited, boolean[] used) {
        List<Integer> can = new ArrayList<>();
        for (int u : edges.get(v)) {
            if (used[u]) {
                return null;
            }
            if (!visited[u]) {
                can.add(u);
            }
        }
        for (int u : can) {
            visited[u] = true;
        }
        for (int u : can) {
            if (u == parent) {
                return new ArrayList<>(Collections.singletonList(v));
            }
            used[u] = true;
            List<Integer> list = dfs(parent, u, visited, used);
            if (list != null) {
                list.add(v);
                return list;
            }
            used[u] = false;
        }
        for (int u : can) {
            visited[u] = false;
        }
        return null;
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
