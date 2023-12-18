import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wnqmw
 */
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(kb.readLine());
        int numstones = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] stones = new int[numstones];
        
        st = new StringTokenizer(kb.readLine());
        for(int i = 0; i < numstones; i++){
            stones[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(dp(stones, numstones, k));
    }
    
    static int dp(int[] stones, int numstones, int k){
        int[] dp = new int[numstones];
        
        dp[0] = 0;
        for(int i = 1; i < numstones; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < numstones; i++){
            for(int x = 1; x <= k && x+i < numstones; x++){
                
                dp[i+x] = Math.min(dp[i+x], Math.abs(stones[i]-stones[i+x])+dp[i]);
            }
        }
        return dp[numstones-1];
    }
}
