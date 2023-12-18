import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;


public class MainApp{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int[] cnt = new int[4];
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            cnt[tmp]++;
        }
        double[][][]dp = new double[n+2][n+2][n+2];
        //dp[a][b][c]表示把a个1，b个2，c个3吃到0的期望操作次数
        dp[0][0][0] = 0;
        for(int k = 0;k<=n;k++) {
            for (int j =0;j<=n;j++) {
                for (int i=0;i<=n;i++) {
                    if(i==0&&j==0&&k==0)
                        continue;
                    double sum = (n/(double)(i+j+k));
                    if(i!=0) sum+=(i/(double)(i+j+k))*dp[i-1][j][k];
                    if(j!=0&&i+1<=n) sum+=(j/(double)(i+j+k))*dp[i+1][j-1][k];
                    if(k!=0&&j+1<=n) sum+=(k/(double)(i+j+k))*dp[i][j+1][k-1];
                    dp[i][j][k] = sum;
                }
            }
        }
        System.out.println(dp[cnt[1]][cnt[2]][cnt[3]]);
    }



}