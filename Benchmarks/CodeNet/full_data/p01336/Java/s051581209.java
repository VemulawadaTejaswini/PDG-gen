import java.util.*;
public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] cost = new int[N];
            int[] rank = new int[N];
            for(int i = 0; i < N; i++){
                sc.nextLine();//空白読み込み
                sc.nextLine();//名前読み込み
                cost[i] = sc.nextInt();
                rank[i] = Math.max(sc.nextInt(),Math.max(sc.nextInt(),sc.nextInt()));
            }
            int[] dp = new int[M+1];
            for(int i = 0; i < N; i++){
                for(int ii = 0; ii <= M - cost[i]; ii++){
                    dp[ii+cost[i]] = Math.max(dp[ii+cost[i]], dp[ii]+rank[i]);
                }
            }
            //System.out.println(Arrays.toString(dp));
            int max = 0;
            for(int c: dp){
                max = Math.max(max, c);
            }
            System.out.println(max);
        }
    }
    public static void main(String[] args){
        new Main().run();   
    }
}