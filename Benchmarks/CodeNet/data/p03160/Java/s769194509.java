import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i=0; i<n; i++) h[i] = sc.nextInt();

        int ans = 0;

        int[] dp = new int[n];

        dp[1] = Math.abs(h[1]-h[0]);

        for (int i=2; i<n; i++){
            int a = Math.abs(h[i]-h[i-2])+dp[i-2];
            int b = Math.abs(h[i]-h[i-1])+dp[i-1];
            dp[i] = Math.min(a, b);
        }

        System.out.println(dp[n-1]);
    }
}