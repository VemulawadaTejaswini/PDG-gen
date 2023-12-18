import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        int n = 0;
        int[] arr = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            arr = new int[n];
            for(int i = 0; i < n ;i++) {
                arr[i] = scanner.nextInt();
            }
        }
        
        long[][] dp = new long[n+1][n+1];
        for(int l = n - 1; l >= 0; l--) {
            for(int r = l; r < n; r++) {
                if(l == r)
                    dp[l][r] = arr[l];
                else
                    dp[l][r] = Math.max(arr[l] - dp[l+1][r]
                                    , arr[r] - dp[l][r-1]);
            }
        }
        
        
        // for(int[]d :dp) 
        //     System.out.println(Arrays.toString(d));
        
        System.out.println(dp[0][n- 1]);
        
    }
    
}