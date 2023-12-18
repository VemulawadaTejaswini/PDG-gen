import java.util.*;

public class Main {

    static void dfs(int at, int prev) {
        if (visited[at]) return;
        visited[at] = true;
        if (prev != -1) counter[at] += counter[prev];

        List<Integer> from = graph.get(at);
        for (Integer to: from) {
            if (visited[to]) continue;
            dfs(to, at);
        }
    }

    static int N;
    static int Q;
    static List<List<Integer>> graph;
    static long[] counter;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        visited = new boolean[N];
        Arrays.fill(visited, false);
        counter = new long[N];
        Arrays.fill(counter, 0);
        graph = new ArrayList<>();
        for (int i = 0; i < N; ++i) graph.add(new ArrayList<>());
        for (int i = 0; i < N-1; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < Q; ++i) {
            int id = sc.nextInt() - 1;
            long x = sc.nextLong();
            counter[id] += x;
        }

        dfs(0, -1);

        for (int i = 0; i < N; ++i)
            System.out.print(counter[i] + " ");
        System.out.println();
    }
}