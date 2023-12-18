import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    static List<List<Integer>> edges;
    static int next = -1;
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
        boolean[] visited = new boolean[n];
        boolean[] used = new boolean[n];
        for (int i = n - 1; i >= 0; i--) {
            dfs(i, i, visited, used);
            visited[i] = true;
            if (next != -1) {
                dfs(next, next, visited, used);
            }
        }
        System.out.println(-1);
    }

    static void dfs(int parent, int v, boolean[] visited, boolean[] used) {
        if (edges.get(v).isEmpty()) {
            return;
        }
        List<Integer> can = new ArrayList<>();
        for (int u : edges.get(v)) {
            if (used[u]) {
                next = u;
                return;
            }
            if (!visited[u]) {
                can.add(u);
            }
        }
        if (can.isEmpty()) {
            return;
        }
        for (int u : can) {
            visited[u] = true;
        }
        for (int u : can) {
            if (u == parent) {
                List<Integer> list = new ArrayList<>();
                list.add(u);
                for (int i = 0; i < used.length; i++) {
                    if (used[i]) {
                        list.add(i);
                    }
                }
                System.out.println(list.size());
                for (int i : list) {
                    System.out.println(i + 1);
                }
                System.exit(0);
            }
            used[u] = true;
            dfs(parent, u, visited, used);
            used[u] = false;
        }
        for (int u : can) {
            visited[u] = false;
        }
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
