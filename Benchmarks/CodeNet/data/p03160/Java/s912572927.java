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
        int numstones = Integer.parseInt(kb.readLine());
        
        int[] stones = new int[numstones];
        
        StringTokenizer st = new StringTokenizer(kb.readLine());
        for(int i = 0; i < numstones; i++){
            stones[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(dp(stones, numstones));
    }
    
    static int dp(int[] stones, int numstones){
        int[] dp = new int[numstones];
        
        dp[0] = 0;
        dp[1] = Math.abs(stones[0]-stones[1])+ dp[0];
        
        for(int i = 2; i < numstones; i++){
            dp[i] = Math.min(Math.abs(stones[i-2]-stones[i]) + dp[i-2], Math.abs(stones[i-1]-stones[i]) + dp[i-1]);
        }
        return dp[numstones-1];
    }
}
