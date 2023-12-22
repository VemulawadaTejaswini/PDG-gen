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
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            long[] dp = new long[n+1];
            dp[0] = 1;
            if (n >= 2) dp[1] = 1;
            if (n >= 3) dp[2] = 2;
            //if (n >= 4) dp[3] = 2;
            
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
            
            System.out.println(dp[n]/10/365+1);
        }
        
    }
}


