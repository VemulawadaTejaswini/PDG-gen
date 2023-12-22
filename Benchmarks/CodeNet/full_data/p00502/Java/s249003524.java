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
import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dn = br.readLine().split(" ");
        int d = Integer.parseInt(dn[0]);
        int n = Integer.parseInt(dn[1]);
        int[] kion = new int[d+1];
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n+1];
        
        for (int i = 0; i < d; i++) {
            kion[i+1] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            a[i+1] = Integer.parseInt(line[0]);
            b[i+1] = Integer.parseInt(line[1]);
            c[i+1] = Integer.parseInt(line[2]);
        }
        
        int[][] dp = new int[d+1][n+1];
        
        for (int i = 1; i <= n; i++) {
            dp[1][i] = 0;
        }
        
        for (int i = 2; i <= d; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (kion[i] < a[j] || b[j] < kion[i]) continue;
                    if (kion[i-1] < a[k] || b[k] < kion[i-1]) continue;
                    dp[i][j] = Math.max(dp[i-1][k]+Math.abs(c[j]-c[k]), dp[i][j]);
                }
            }
        }
        
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dp[d][i]);
        }
        System.out.println(ans);
    }
}




