import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[]) {
        int n = 0, w = 0;
        int[][] arr = null;
        int sumValues = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            w = scanner.nextInt();
            
            arr = new int[n][2];
            for (int i=0; i < n; i++) {
                for(int j = 0; j < 2 ; j++) {
                    arr[i][j] = scanner.nextInt();
                    if(j == 1)
                        sumValues += arr[i][j];
                }
            }
        }
        long[] dp = new long[sumValues + 1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i < n; i++) {
            int curW = arr[i][0];
            int curV = arr[i][1];
            for(int j = sumValues; j >= 0 ; j--) {
                if(dp[j] == Long.MAX_VALUE)
                    continue;
                long combinedW = dp[j] + curW;
                int combinedV = j + curV;
                if(dp[combinedV] > combinedW)
                    dp[combinedV] = combinedW;
            }
        }
        
        // System.out.println(Arrays.toString(dp));
        for(int j = sumValues; j >= 0 ; j--) {
            if(dp[j] <= w){
                System.out.println(j);
                return;
            }
        }
        
        System.out.println(-1);
        
    }
}