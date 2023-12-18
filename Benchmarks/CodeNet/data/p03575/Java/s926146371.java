import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));

//        System.out.println(solve(new Scanner(ex)));
    }

    private static final String ex = "3 3\n" +
            "1 2\n" +
            "1 3\n" +
            "2 3";

    private static int solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        boolean[][] graph = new boolean[N][N];
        int[][] edges = new int[M][2];
        for (int i = 0; i < M; i ++) {
            split = scanner.nextLine().split(" ");
            int a = Integer.parseInt(split[0]) - 1;
            int b = Integer.parseInt(split[1]) - 1;

            graph[a][b] = true;
            graph[b][a] = true;

            edges[i] = new int[] {a, b};
        }

        int count = 0;
        for (int i = 0; i < edges.length; i ++) {
            int a = edges[i][0];
            int b = edges[i][1];

            graph[a][b] = false;
            graph[b][a] = false;

            if (! isComplete(0, graph)) {
                count ++;
            }

            graph[a][b] = true;
            graph[b][a] = true;
        }

        return count;
    }

    private static boolean isComplete(int start, boolean[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (queue.size() > 0) {
            int cur = queue.poll();

            List<Integer> next = new LinkedList<>();

            for (int i = 0; i < graph[cur].length; i ++) {
                if (graph[cur][i] && ! visited.contains(i)) {
                    visited.add(i);
                    queue.add(i);
                }
            }
        }

        return visited.size() == graph.length;
    }
}