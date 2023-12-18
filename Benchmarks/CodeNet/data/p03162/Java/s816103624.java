import java.util.*;

public class Main {
    private static final long INF = 1L<<60;
    private static long[][] dp = new long[3][100010];
    //dp[do][day] ... day日目にした行動と、day日目の幸福度の総和の最大値
    //do = 0 海 , do = 1 山 , do = 2 家 それ以外の行動を取る
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[][] doArray = new int[3][N+10];
        //doArray[do][day] ... day日目にする行動によって得られる幸福度
        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++){
                doArray[j][i] = Integer.parseInt(sc.next());
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(j == k) continue; //j = k は不成立(前日と同じ行動はできないため)
                    dp[k][i+1] = Math.max(dp[k][i + 1] , dp[j][i] + doArray[k][i]);
                }
            }
        }
        long res = 0;
        for(int i=0;i<3;i++){
            res = Math.max(res,dp[i][N]);
        }
        System.out.println(res);
    }
}