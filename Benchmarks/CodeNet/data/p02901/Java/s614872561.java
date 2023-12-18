import java.util.*;

public class Main {
    private static int INF = 100100100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] key = new int[M][2];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            key[i][0] = a; // cost
            int s = 0;
            for (int j = 0; j < b; j++) {
                int c = sc.nextInt();
                s |= 1 << (c-1);
            }
            key[i][1] = s; // set
        }

        int size = 1 << N;
        int[] dp = new int[size];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int s = 0; s < size; s++) {
            for (int j = 0; j < M; j++) {
                int t = s | key[j][1];
                dp[t] = Math.min(dp[t], dp[s]+key[j][0]);
            }
        }
        
        System.out.println(dp[size-1] == INF ? -1 : dp[size-1]);
    }
}
