import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;
import java.awt.Point;


public class Main {
    static int[] nums;
    static int n;
    static long count;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String[] nd = br.readLine().split(" ");
        n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        nums = new int[n+1];
        for (int i = 0; i < n; i++) {
            nums[i+1] = Integer.parseInt(line[i]);
        }
        
        //
        long[][] dp = new long [n][21];
        dp[1][nums[1]] = 1;
        
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < 21; j++) {
                if (j-nums[i] >= 0) {
                    dp[i][j] += dp[i-1][j-nums[i]];
                }
                if (j+nums[i] <= 20) {
                    dp[i][j] += dp[i-1][j+nums[i]];
                }
            }
        }
        
        
        //System.out.println(dp[1][8]);
        System.out.println(dp[n-1][nums[n]]);
    }
    
}


