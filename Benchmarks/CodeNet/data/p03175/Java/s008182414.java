import java.io.*;
import java.util.*; 
import java.lang.*;

public class Main 
{   
    static LinkedList<Integer>[] adj;
    static int[][] dp;
    static int N;
    static int mod = 1000000007;
    
    static int sum(int a, int b, int m) 
{ 
    // add two numbers 
    int s = a + b; 
  
    // do a mod with m 
    s = s % m; 
  
    return s; 
} 
    static int mult(int a, 
                            int b, int mod) 
    { 
          
        // Initialize result 
        int res = 0;   
  
        // Update a if it is more than  
        // or equal to mod  
        a %= mod; 
  
        while (b > 0)  
        { 
              
            // If b is odd, add a with result  
            if ((b & 1) > 0)  
            { 
                res = (res + a) % mod; 
            } 
  
            // Here we assume that doing 2*a  
            // doesn't cause overflow  
            a = (2 * a) % mod; 
  
            b >>= 1; // b = b / 2  
        } 
        return res; 
    }
    
    static int fn(int prev, int curr, int col) {
        if (dp[curr][col] != 0) { return dp[curr][col]; }
        dp[curr][0] = 1;
        dp[curr][1] = 1;
        for (int i = 0; i < adj[curr].size(); i ++) {
                int next = adj[curr].get(i);
                if (next != curr && next != prev) {
                    int a1 = fn(curr, next, 0);
                    int a2 = fn(curr, next, 1);
                    dp[curr][0] = mult(dp[curr][0], sum(a1, a2, mod), mod);
                    dp[curr][1] = mult(dp[curr][1], a1, mod);
                }
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
        System.out.println(sum(fn(0,1,0), fn(0,1,1), mod));
    }
}    