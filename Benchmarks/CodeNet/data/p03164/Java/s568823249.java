import java.util.Scanner;
class Main {
    private static long maxKnapsack(int[] ws, long[] vs, int idx, int total, long[] dp) {
        if(idx < ws.length && ws[idx] > total) return 0;
        if( total == 0) return 0;
        if(idx == ws.length ||total < 0) return -1;
        long max = Long.MIN_VALUE;
 
        if(dp[idx] != 0)
            return dp[idx];
        for(int i = idx; i < ws.length; i++){
            long res = maxKnapsack(ws, vs, i, total - ws[i], dp);
            if(res == -1) continue;
            else
                max = Long.max(max, vs[i] + res);
        }
        dp[idx] = max;
        return max;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt();
        int[] ws = new int[n];
        long[] vs = new long[n];
 
        long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
            ws[i] = sc.nextInt();
            vs[i] = sc.nextInt();
        }
        System.out.println(maxKnapsack(ws, vs, 0, w, dp));
    }
}