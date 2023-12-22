import java.util.*;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static int W;
    static int ans1;
    static int ans2;
    static int c;
    public static void main(String[] args){
        c=1;
        while(true){
            W=Integer.parseInt(sc.nextLine());
            if(W==0)break;
            int N=Integer.parseInt(sc.nextLine());
            run(N);
            c++;
        }
    }
    static void run(int N){
        ans1=0;
        ans2=0;
        int[] p=new int[N+1];
        int[] w=new int[N+1];
        for(int i=1;i<=N;i++){
            String[] s=sc.nextLine().split(",");
            p[i]=Integer.parseInt(s[0]);
            w[i]=Integer.parseInt(s[1]);
        }
        int[][] dp=new int[N+1][W+1];
        for(int i=0;i<N+1;i++){
            for(int j=0;j<W+1;j++){
                dp[i][j]=-1;
            }
        }
        dp[0][0]=0;
        for(int i=1;i<=N;i++){
            for(int j=0;j<=W;j++){
                if(dp[i-1][j]!=-1){
                    if(dp[i][j]<dp[i-1][j])dp[i][j]=dp[i-1][j];
                    if(j+w[i]<=W){
                        dp[i][j+w[i]]=Math.max(dp[i][j+w[i]], dp[i-1][j]+p[i]);
                    }
                }
            }
        }
        for(int i=0;i<=W;i++){
            if(ans1<dp[N][i]){
                ans1=dp[N][i];
                ans2=i;
            }
        }
        System.out.println("Case "+c+":");
        System.out.println(ans1);
        System.out.println(ans2);
    }
}