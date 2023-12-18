import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        int[] from = new int[m];
        int[] to = new int[m];
        long dp[] = new long[n];
        for (int i = 0; i < m; i++) {
            from[i] = std.nextInt() - 1;
            to[i] = std.nextInt() - 1;
        }

        List<List<Integer>> edgeTo = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edgeTo.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            edgeTo.get(from[i]).add(to[i]);
        }

        PriorityQueue<Integer> deque = new PriorityQueue<>();

        long ans = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            deque.add(i);

            while (!deque.isEmpty()) {
                int v = deque.poll();
                visited[v] = true;
                for(Integer t : edgeTo.get(v)) {
                    long cost = dp[v] + 1;
                    dp[t] = Math.max(dp[t], cost);
                    deque.add(t);
                }
            }
        }

        ans = Math.max(Arrays.stream(dp).max().getAsLong(), ans);
        System.out.println(ans);
    }
}