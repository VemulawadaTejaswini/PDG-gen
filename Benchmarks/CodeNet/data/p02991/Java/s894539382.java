import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Pair {
        int left;
        int right;
        Pair(int l, int r) {
            left = l;
            right = r;
        }
    }

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

        int[][] dp = new int[1000010][3];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        int start = std.nextInt() - 1;
        int end = std.nextInt() - 1;
        List<List<Integer>> edgeTo = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            edgeTo.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int v = from[i];
            edgeTo.get(v).add(to[i]);
        }

        dp[start][0] = 0;
        Deque<Pair> deque = new ArrayDeque<>();
        deque.add(new Pair(start, 0));
        while (!deque.isEmpty()) {
            int v = deque.peekFirst().left;
            int l = deque.peekFirst().right;
            deque.pop();

            List<Integer> tos = edgeTo.get(v);
            for (int i = 0; i < tos.size(); i++) {
                int nv = tos.get(i);
                int nl = (l + 1) % 3;
                if (dp[nv][nl] != -1) {
                    continue;
                }
                int cost = dp[v][l] + 1;
                dp[nv][nl] = cost;
                deque.add(new Pair(nv, nl));
            }
        }

        if (dp[end][0] % 3 == 0) {
            int count = dp[end][0] / 3;
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
