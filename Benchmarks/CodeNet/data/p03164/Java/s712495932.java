import java.io.*;
import java.util.*;
import java.lang.Math.*;

class Main{

    static long[][] dp = new long[101][100001];
    static int maxVal = 1000000001;

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();

        for(int i = 1; i<= N; i++){
            dp[i][0] = 0;
            for(int j = 1; j <= 100000; j++){
                dp[i][j] = maxVal;
            }
        }

        int w = sc.nextInt();
        int v = sc.nextInt();
    
        for(int j = 0; j <= 100000; j++){
            if(v >= j) dp[1][j] = w;
        }        

        for(int i = 2; i <= N; i++){
            w = sc.nextInt();
            v = sc.nextInt();
            for(int j = 1; j <= 100000; j++){
                //slucaj da ne uzememo i-ti po redu
                dp[i][j] = dp[i-1][j];
                //ako zelimo uzeti i-ti po redu                
                int temp = w;
                if(j - v > 0) temp += dp[i-1][j-v];
                dp[i][j] = Math.min(dp[i][j], temp);

            }    
        }            

        int res = 0;
        for(int j = 1; j <= 100000; j++){
            //System.out.print(dp[N][j] + " ");            
            if(dp[N][j] <= W) res = j;
            else break;
        }
        
        System.out.println(res);
    }
}



















