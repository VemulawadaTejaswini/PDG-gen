import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), T = sc.nextInt();
        int food[][] = new int[N][2];
        for(int i=0;i<N;i++){
            food[i][1]=sc.nextInt();//T
            food[i][0]=sc.nextInt();//A
        }
        sc.close();
        int dp[][] = new int[N+1][T+1];
        for(int i=1;i<N+1;i++){
            for(int j=0;j<T+1;j++){
                if(j>=food[i-1][1]){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-food[i-1][1]]+food[i-1][0]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        int food2[][] = new int[N][2];
        for(int i=0;i<N;i++){
            food2[N-1-i][0] = food[i][0];
            food2[N-1-i][1] = food[i][1];
        }
        int dp2[][] = new int[N+1][T+1];
        for(int i=1;i<N+1;i++){
            for(int j=0;j<T+1;j++){
                if(j>=food2[i-1][1]){
                    dp2[i][j]=Math.max(dp2[i-1][j],dp2[i-1][j-food2[i-1][1]]+food2[i-1][0]);
                }else{
                    dp2[i][j]=dp2[i-1][j];
                }
            }
        }

        int max = 0;
        for(int i=0;i<N;i++){
            int ans = 0;
            for(int t=0;t<T;t++){
                int tmp = 0;
                if(i==N-1)tmp = dp[i][t];
                else tmp = dp[i][t] + dp2[N-i-2][T-t];
                ans = Math.max(ans, tmp);
            }
            ans += food[i][0];
            max = Math.max(ans,max);
        }
        System.out.println(max);
    }
}