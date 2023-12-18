import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int i = 0;
        int[] x = new int[N + 1];
        x[0] = 0;
        int sum = 0;
        int[] subsum = new int[N + 1];
        subsum[0] = 0;
        while(i < N){
            x[i + 1] = sc.nextInt();
            sum += x[i];
            subsum[i + 1] = sum;
            i++;
        }
        int[][][] dp = new int[N + 1][N + 1][sum + 1];
        dp[0][0][0] = 1;

        for (int s = 0; s <= sum; s++) {
            for(int k = 0; k <= N; k++){
                for(int j = k; j <= N; j++){
                    if(s >= x[j] && j >= 1 && k >= 1){
                        dp[j][k][s] = dp[j - 1][k][s] + dp[j - 1][k - 1][s - x[j]];
                    }else if(s < x[j] && j >= 1){
                        dp[j][k][s] = dp[j - 1][k][s];
                    }else if(j != 0 || k != 0 || s != 0){
                        dp[j][k][s] = 0;
                    }
                }
            }
        }
        long ans = 0;
        for(int k = 1; k <= N; k++){
            for(int s = 1; s <= sum; s++){
                if(k * A == s){
                    ans += dp[N][k][s];
                }
            }
        }
        System.out.println(ans);
    }
}
