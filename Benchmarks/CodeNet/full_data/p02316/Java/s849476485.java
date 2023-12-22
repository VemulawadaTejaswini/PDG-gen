import java.util.Scanner;
public class Main{
    public static int Max(int a, int b, int c){
        if(a >= b && a >= c)
            return a;
        else if(b >= c)
            return b;
        else
            return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int v[] = new int[N];
        int w[] = new int[N];
        int dp[][] = new int[N+1][W+1];
        for(int i = 0 ; i <= W ; i++)
            dp[0][i] = 0;
        for(int i = 0 ; i < N ; i++){
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j <= W ; j++){
                if(w[i] <= j)
                    dp[i+1][j] = Math.max(dp[i][j-w[i]]+v[i] , dp[i][j]);
                else
                    dp[i+1][j] = dp[i][j];
            }
        }
        System.out.println(dp[N][W]);
    }
}
