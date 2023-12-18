import java.io.*;
import java.util.*;
public class Main {
    
    static long MOD = 1000*1000*1000 + 7;
    public static void main(String args[]) {
        int n = 0;
        int[] h = null;
        int[] a = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            h = new int[n];
            a = new int[n];
            for(int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }
            for(int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
        }
        
        //dp[i] = max possible beauty for height i;
        long[] dp = new long[n+1];
        long ret = 0;
        for(int flower = 0; flower < n ; flower++) {
            for(int he = 0; he < h[flower]; he++) {
                dp[h[flower]] = Math.max(dp[h[flower]], dp[he] + a[flower]);
                ret = Math.max(ret, dp[h[flower]]);
            }
        }
        
        System.out.println(ret);
    }
    
}