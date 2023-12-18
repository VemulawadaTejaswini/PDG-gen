import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int w[]=new int[N];
        int v[]=new int[N];

        long dp[][] = new long[N][W+1];

        for(int i=0;i<N;i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }

        for(int i=0;i<w[0];i++)dp[0][i]=0;
        for(int i=w[0];i<W+1;i++)dp[0][i]=v[0];

        for(int i=1;i<N;i++){
            for(int j=0;j<w[i];j++){
                dp[i][j]=dp[i-1][j];
            }
            for(int j=w[i];j<W+1;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
            }
        }
        /*

        for(int i=0;i<N;i++){
            for(int j=0;j<W+1;j++) System.out.print(dp[i][j]+" ");
            System.out.println();
        }

         */
        System.out.println(dp[N-1][W]);

    }
}
