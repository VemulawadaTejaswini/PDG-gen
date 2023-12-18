import java.util.Scanner;

public class Main {
    public static int [][]dp;
    public  static  void main(String []args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int W= sc.nextInt();
        int []w= new int[N];
        int []v= new int[N];
        dp= new int[N+1][W+1];
        for(int i=0;i<N;i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }

        System.out.println(maxValue(w,v,W,N));
    }
    static long maxValue(int []w,int []v,int W,int N){
        long [][]dp= new long[N+1][W+1];
        for (int i=0;i<=N;i++){
            for(int j=0;j<=W;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(w[i-1]<=j)
                    dp[i][j]=Math.max(v[i-1]+dp[i-1][j-w[i-1]],dp[i-1][j]);
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[N][W];
    }
}
