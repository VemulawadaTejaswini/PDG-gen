import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
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
        int[] as = new int[n];
        int[] bs = new int[n];
        long[][] dp = new long[n + 1][m + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.right - o2.right;
            }
        });
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
            bs[i] = std.nextInt();
            pq.add(new Pair(bs[i], as[i]));
        }

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }

        int count = 0;
        long ans = 0;
        while (count != m || !pq.isEmpty()) {
            Pair p = pq.poll();
            int c = Math.min(m - count, p.left);
            count += c;
            ans += p.right * c;
        }

        System.out.println(ans);

    }
}
