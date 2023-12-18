import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static int dp[] = new int[1000000];

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int m = std.nextInt();
        int[] from = new int[m];
        int[] to = new int[m];

        for (int i = 0; i < m; i++) {
            from[i] = std.nextInt() - 1;
            to[i] = std.nextInt() - 1;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        long ans = 0;
        for (int k = 0; k < n; k++) {
            deque.add(k);
            while (!deque.isEmpty()) {
                int v = deque.pollLast();
                for (int i = 0; i < from.length; i++) {
                    int f = from[i];
                    if (f == v) {
                        int t = to[i];
                        int cost = dp[v] + 1;

                        dp[t] = Math.max(dp[t], cost);
                        deque.add(t);
                    }
                }
            }
            ans = Math.max(Arrays.stream(dp).max().getAsInt(), ans);
            dp = new int[n];
        }

        System.out.println(ans);
    }
}