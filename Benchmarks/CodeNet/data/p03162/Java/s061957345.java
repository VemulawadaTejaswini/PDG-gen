/**
 *
 * @author Daipayan Mukherjee
 * @Jadavpur University,Information Technology
 *
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int n = Integer.parseInt(st);
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        
        for(int i=0;i<n;i++){
            String[] s = br.readLine().split(" ");
            a[i] = Integer.parseInt(s[0]);
            b[i] = Integer.parseInt(s[1]);
            c[i] = Integer.parseInt(s[2]);
        }
        int[][] dp = new int[n][3];
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];
        
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2]) + a[i];
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2]) + b[i];
            dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1]) + c[i]; 
        }
        System.out.println(Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2])));
    }
}
