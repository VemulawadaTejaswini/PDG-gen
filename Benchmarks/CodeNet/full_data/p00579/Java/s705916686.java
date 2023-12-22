import java.util.*;

public class Main {
    static int[] values;
    static int[] prevs;
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        prevs = new int[n];
        PriorityQueue<Area> queue = new PriorityQueue<>();
        for (int i = 0; i < m; i++) {
            queue.add(new Area(sc.nextInt() - 1, sc.nextInt() - 1));
        }
        for (int i = 0; i < n; i++) {
            while (queue.size() > 0 && queue.peek().right < i) {
                queue.poll();
            }
            if (queue.size() == 0 || queue.peek().left > i) {
                prevs[i] = i - 1;
            } else {
                prevs[i] = queue.peek().left - 1;
            }
        }
        dp = new long[n];
        Arrays.fill(dp, Long.MIN_VALUE);
        for (int i = 0; i < n; i++) {
            dfw(i);
        }
        System.out.println(dfw(n - 1));
     }
     
     static long dfw(int idx) {
         if (idx < 0) {
             return 0;
         }
         if (dp[idx] >= 0) {
             return dp[idx];
         }
         return dp[idx] = Math.max(dfw(idx - 1), dfw(prevs[idx]) + values[idx]);
     }
     
     static class Area implements Comparable<Area> {
         int left;
         int right;
         
         public Area(int left, int right) {
             this.left = left;
             this.right = right;
         }
         
         public int compareTo(Area another) {
             return left - another.left;
         }
     }
}
