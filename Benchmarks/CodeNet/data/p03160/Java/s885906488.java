import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];

        for(int i = 1; i<N+1; i++) {
            a[i] = sc.nextInt();
        }
        if(N==1) {
            System.out.println(a[1]);
            return;
        }
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i<=N; i++) {
            dp[i] = Math.min(dp[i-1] + (int)Math.abs(a[i]-a[i-1]), dp[i-2] + (int)Math.abs(a[i]-a[i-2]));
        }
        System.out.println(dp[N]);
    }

}