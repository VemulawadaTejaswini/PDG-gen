import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dp[][] = new int[n][3];
        for(int i = 0 ; i < n ; i++){
            int first = s.nextInt();
            int second = s.nextInt();
            int third = s.nextInt();
            if(i == 0){
                dp[i][0] = first;
                dp[i][1] = second;
                dp[i][2] = third;
                continue;
            }
            dp[i][0] = first + Math.max(dp[i-1][1] , dp[i-1][2]);
            dp[i][1] = second + Math.max(dp[i-1][2] , dp[i-1][0]);
            dp[i][2] = third + Math.max(dp[i-1][1] , dp[i-1][0]);
        }
        System.out.println( Math.max(dp[n-1][0] , Math.max(dp[n-1][1] , dp[n-1][2])) );
    }
}