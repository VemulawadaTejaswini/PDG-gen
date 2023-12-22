import java.util.*;
public class Main{
    void run(){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] cost = new int[N];
            int[][] rank = new int[3][N];
            for(int i = 0; i < N; i++){
                sc.nextLine();//空白読み込み
                sc.nextLine();//名前読み込み
                cost[i] = sc.nextInt();
                rank[0][i] = sc.nextInt();
                rank[1][i] = sc.nextInt();
                rank[2][i] = sc.nextInt();
                
            }
            int[][] dp = new int[3][M+1];
            for(int i = 0; i < 3; i++){
                for(int ii = 0; ii < N; ii++){
                    for(int iii = 0; iii <= M - cost[ii]; iii++){
                        dp[i][iii+cost[ii]] = Math.max(dp[i][iii+cost[ii]], dp[i][iii]+rank[i][ii]);
                    }
                }
            }
            /*
            System.out.println(Arrays.toString(dp[0]));
            System.out.println(Arrays.toString(dp[1]));
            System.out.println(Arrays.toString(dp[2]));
            */

            int max = 0;
            for(int[] d: dp){
                for(int c: d){
                    max = Math.max(max, c);
                }
            }
            System.out.println(max);
        }
    }
    public static void main(String[] args){
        new Main().run();   
    }
}