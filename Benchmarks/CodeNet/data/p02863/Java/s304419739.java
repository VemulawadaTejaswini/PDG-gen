import java.util.*;

public class Main{
    /*標準入力
    DP　ナップサック問題 O(N)
    n W v_1 w_1 v_2 w_2
    */
    public static void main(String[] args){
    //入力部分
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] L = new int[N][2];
        for(int i=0;i<N;i++){
            L[i][1] = sc.nextInt();
            L[i][0] = sc.nextInt();
        }
        int[][] DP = new int[N][T+1];
        Arrays.sort(L,(a,b) -> b[0]-a[0]);

    //処理部分
        for(int i=-1;i<=N-2;i++){
            for(int j=0;j<=T;j++){
                if(i==-1){
                    DP[i+1][j] = 0;
                }
                else{
                    if(j<L[i+1][1]){
                        DP[i+1][j] = DP[i][j];
                    }
                    else{
                        DP[i+1][j] = Math.max(DP[i][j],DP[i][j-L[i+1][1]]+L[i+1][0]);
                    }
                }
            }
        }    
    //出力部分
        System.out.println(DP[N-1][T-1]+L[0][0]);
        sc.close();
    }
}