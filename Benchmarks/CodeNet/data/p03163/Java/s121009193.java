import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt();
        int[] ws = new int[n];
        long[] vs = new long[n];

        long[][] dp = new long[n][w + 1];
        for (int i = 0; i < n; i++) {
            ws[i] = sc.nextInt();
            vs[i] = sc.nextInt();
        }
        //System.out.println(maxKnapsack(ws, vs, 0, w, dp));
        System.out.println(maxKnapsack(ws, vs, w));
    }


    private static long maxKnapsack(int[] ws, long[] vs, int w) {
        long[][] dp = new long[ws.length+1][w + 1];

        for (int i = 1; i <= ws.length; i++) {
            for (int s = 1; s <= w; s++) {
              	dp[i][s] = dp[i-1][s];
              	if(s >= ws[i - 1])
                	dp[i][s] = Math.max(dp[i-1][s - ws[i-1]] + vs[i-1], dp[i][s]);
            }
        }
        return dp[ws.length][w];
    }
}

