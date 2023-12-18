import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class G1 {


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

        Deque<Integer> deque = new ArrayDeque<>();
        long ans = 0;
        boolean[] visited = new boolean[n];
        for (int k = 0; k < n; k++) {
            if (visited[k]) {
                continue;
            }
            deque.add(k);
            while (!deque.isEmpty()) {
                int v = deque.poll();
                visited[v] = true;
                for (int i = 0; i < m; i++) {
                    int f = from[i];
                    if (f == v) {
                        int t = to[i];
                        long cost = dp[v] + 1;

                        dp[t] = Math.max(dp[t], cost);
                        if (!deque.contains(t)) {
                            deque.add(t);
                        }
                    }
                }
            }
        }

        ans = Math.max(Arrays.stream(dp).max().getAsLong(), ans);
        System.out.println(ans);
    }
}
