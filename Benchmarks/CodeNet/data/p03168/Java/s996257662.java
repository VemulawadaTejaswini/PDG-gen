import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static String longer(String x, String y){
        if(x.length() > y.length()) return x;
        else return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] p = new double[N];
        for(int n=0;n<N;n++) p[n]=sc.nextDouble();

        double[][] dp = new double[N][N+1];
        dp[0][1] = p[0];
        dp[0][0] = 1 - p[0];

        for(int n=1; n<N; n++) for(int head=0; head<=n+1; head++){
            dp[n][head] = dp[n-1][head] * (1-p[n]) + (head==0?0: dp[n-1][head-1] * p[n]);
        }

        double ans = 0;
        for(int head=N; head>N-head; head--) ans += dp[N-1][head];
        System.out.println(ans);

    }
}
