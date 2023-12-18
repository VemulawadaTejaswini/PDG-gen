import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        float bound = e * 1.f / (e + 100);
        float[][] dp = new float[f / 2 + 1][f + 1];
        dp[0][0] = 0.5f;
        float opt = -1.f;
        int sugar = -1;
        int total = -1;
        for (int i = 0; i <= f / 2; i++) {
            for (int j = i; j <= f; j++) {
                if(j >= 100 * b){
                    if(dp[i][j - 100 * b] > 0 || dp[i][j - 100 * a] > 0)
                        dp[i][j] = i * 1.f / j;
                    else if(i >= d && (dp[i - d][j - d] > 0 || dp[i - c][j - c] > 0))
                        dp[i][j] = i * 1.f / j;
                    else if(i >= c && dp[i - c][j - c] > 0)
                        dp[i][j] = i * 1.f / j;
                    if(bound >= dp[i][j] && dp[i][j] > opt){
                        opt = dp[i][j];
                        sugar = i;
                        total = j;
                    }
                }else if(j >= 100*a){
                    if(dp[i][j - 100 * a] > 0)
                        dp[i][j] = i * 1.f / j;
                    else if(i >= d && (dp[i - d][j - d] > 0 || dp[i - c][j - c] > 0))
                        dp[i][j] = i * 1.f / j;
                    else if(i >= c && dp[i - c][j - c] > 0)
                        dp[i][j] = i * 1.f / j;
                    if(bound >= dp[i][j] && dp[i][j] > opt){
                        opt = dp[i][j];
                        sugar = i;
                        total = j;
                    }
                }else if(j >= d){
                    if(i >= d && (dp[i - d][j - d] > 0 || dp[i - c][j - c] > 0))
                        dp[i][j] = i * 1.f / j;
                    else if(i >= c && dp[i - c][j - c] > 0)
                        dp[i][j] = i * 1.f / j;
                    if(bound >= dp[i][j] && dp[i][j] > opt){
                        opt = dp[i][j];
                        sugar = i;
                        total = j;
                    }
                }else if(j >= c){
                    if(i >= c && dp[i - c][j - c] > 0)
                        dp[i][j] = i * 1.f / j;
                    if(bound >= dp[i][j] && dp[i][j] > opt){
                        opt = dp[i][j];
                        sugar = i;
                        total = j;
                    }
                }
            }
        }
        System.out.printf("%d %d\n", total, sugar);
    }
}
