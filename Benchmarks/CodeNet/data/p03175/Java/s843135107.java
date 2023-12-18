import java.io.*;
import java.util.*; 
import java.lang.*;

public class Main 
{   
    static LinkedList<Integer>[] adj;
    static int[][] dp;
    static int N;
    static int mod = 1000000007;
    
    static int fn(int prev, int curr, int col) {
        if (dp[curr][col] != -1) { return dp[curr][col]; }
        if (col == 0) {
            int ans = 1;
            for (int i = 0; i < adj[curr].size(); i ++) {
                int next = adj[curr].get(i);
                if (next != curr && next != prev) {
                    ans = ((ans%mod)*(fn(curr, next, 0)%mod + fn(curr, next, 1)%mod)%mod)%mod;
                }
            }
            dp[curr][col] = ans;
        }
        else {
            int ans = 1;
            for (int i = 0; i < adj[curr].size(); i ++) {
                int next = adj[curr].get(i);
                if (next != curr && next != prev) {
                    ans = ((ans%mod)*(fn(curr, next, 0)%mod))%mod;
                }
            }
            dp[curr][col] = ans;
        }
        return dp[curr][col];
    }
    
    public static void main(String[] args) throws IOException 
    {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        adj = new LinkedList[N+1];
        for (int n = 0; n < N+1; n ++) {
            adj[n] = new LinkedList();
        }
        for (int n = 0; n < N-1; n ++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        dp = new int[N+1][2];
        for (int n = 0; n < N+1; n ++) {
            dp[n][0] = -1;
            dp[n][1] = -1;
        }
        System.out.println(((fn(0,1,0)%mod + fn(0,1,1)%mod)%mod));
    }
}    