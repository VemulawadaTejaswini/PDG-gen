import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int dp[][] = new int[N][N];
        int max = 0;
        
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if(str.charAt(i) == str.charAt(j)){
                    if(i == 0) {
                        dp[i][j] = 1;
                        continue;
                    }
                    
                    int t = dp[i-1][j-1] + 1;
                    if( i + t > j)continue;
                    
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        
        System.out.println( (max < 2) ? 0 : max );
        
        
    }
}
