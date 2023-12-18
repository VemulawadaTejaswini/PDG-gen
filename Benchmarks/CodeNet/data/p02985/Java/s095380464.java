import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int mod = 1000000007;
    static int k;
    static boolean[] visited;
    static List<Set<Integer>> edge;
    public static void main(String[]$) {
        int n = scanner.nextInt();
        k = scanner.nextInt();
        visited = new boolean[n];
        edge = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edge.add(new HashSet<>());
        }

        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        System.out.println(dfs(0, 0, 0));
    }

    static long dfs(int v, int c2, int c1) {
        visited[v] = true;
        long x = k - c2 - c1;
        int index = 0;
        for (int i : edge.get(v)) {
            if (!visited[i]) {
                x = x * dfs(i, c1 + index, 1) % mod;
                index++;
            }
        }
        return x;
    }
}