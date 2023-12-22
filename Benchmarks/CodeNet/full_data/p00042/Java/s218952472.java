import java.util.*;

public class Main {
    static Scanner sc=new Scanner(System.in);
    static int W;     //風呂敷が耐えられる重さ
    static int N;     //お宝の個数
    static int[] sw;  //各お宝の重さ
    static int[] sv;  //各お宝の価値
    static int[][] dp;//dp[i][j]:i番目の荷物まで見て重さの合計がjになる時の合計の価値の最大値
    public static void main(String[] args){
        int C=1;    //何ケース目か
        while(true){
            W=Integer.parseInt(sc.nextLine());
            if(W==0)break;  //W=0で終了
            N=Integer.parseInt(sc.nextLine());
            sw=new int[N+1];
            sv=new int[N+1];
            dp=new int[N+1][W+1];
            for(int i=1;i<=N;i++){
                String[] s=sc.nextLine().split(",");
                sv[i]=Integer.parseInt(s[0]);
                sw[i]=Integer.parseInt(s[1]);
            }
            solve(C);
            C++;
        }
        
    }
    static void solve(int C){
        int ans1=0;//価値の最大値
        int ans2=0;//価値が最大値を取るときの重さの合計の最小値
        for(int i=0;i<N;i++){
            for(int j=0;j<=W;j++){
                dp[i+1][j]=Math.max(dp[i][j], dp[i+1][j]);  //dp[i+1][j]の更新
                if(j+sw[i+1]<=W){
                    if(dp[i+1][j+sw[i+1]]<dp[i][j]+sv[i+1]){//i番目の荷物をぶちこむかどうか
                        dp[i+1][j+sw[i+1]]=dp[i][j]+sv[i+1];    //ぶちこむ
                        if(ans1<dp[i+1][j+sw[i+1]]){        //ans1を更新するか
                            ans1=dp[i+1][j+sw[i+1]];            //ans1の更新
                            ans2=j+sw[i+1];                     //ans2の更新
                        }else if(ans1==dp[i+1][j+sw[i+1]]){ //ans1が等しい場合
                            ans2=Math.min(ans2, j+sw[i+1]);     //ans2の更新
                        }
                    }
                }
            }
        }
        System.out.println("Case "+C+":");
        System.out.println(ans1);
        System.out.println(ans2);
    }
}