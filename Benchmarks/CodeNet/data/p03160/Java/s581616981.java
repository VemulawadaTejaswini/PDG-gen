import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }

        int[] dp = new int[N];

        for(int x=0; x<N-2; x++){
            dp[x+2] = Math.min(dp[x] + Math.abs(h[x+2] - h[x]), dp[x+1] + Math.abs(h[x+2] - h[x+1]));
        }
        int x = N-2;
        dp[x+1] = Math.min(dp[x] + Math.abs(h[x+1] - h[x]), dp[x+1]);

        System.out.println(dp[N-1]);
    }
}