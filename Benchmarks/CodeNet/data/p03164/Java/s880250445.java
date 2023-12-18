import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        long DP[][] = new long[N+1][W+1];
        for(int i=0;i<N+1;i++)Arrays.fill(DP[i],0);
        for(int i=1;i<=N;i++) {
            int w = sc.nextInt();
            int v = sc.nextInt();
            for(int j=1;j<W+1;j++){
                DP[i][j]=Math.max(DP[i-1][j],DP[i][j-1]);
                if(j-w>=0)DP[i][j]=Math.max(DP[i][j],DP[i-1][j-w]+v);
            }
        }
        System.out.println(DP[N][W]);
    }
}