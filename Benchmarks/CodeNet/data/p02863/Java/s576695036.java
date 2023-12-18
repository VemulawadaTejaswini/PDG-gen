
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Main{
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}                                              
		return ans;
	} 
	static long mod=1000000007;
	static long power(long x,long y) 
    { 
        long res = 1; 
        x = x % mod; 
        while (y > 0) { 
            if (y % 2 == 1) 
                res = (res * x) % mod; 
            y = y >> 1;
            x = (x * x) % mod; 
        } 
        return res%mod; 
    } 
    static long modInverse(long n) 
    { 
        return power(n, mod-2); 
    } 
    static int[]h;
    static int[]t;
    static int[][]dp;
    static int knapsack(int ind,int capacity)
    {
    	if((double)capacity<(double)0.5)
    		return 0;
    	if(ind==h.length)
    		return 0;
    	if(dp[ind][capacity]!=-1)
    		return dp[ind][capacity];
    	int res=Math.max(knapsack(ind+1,capacity),h[ind]+knapsack(ind+1,capacity-t[ind]));
    	dp[ind][capacity]=res;
    	return res;
    }
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int[]ar=split();
        int n=ar[0];
        int k=ar[1];
        t=new int[n];
        h=new int[n];
        for(int i=0;i<n;i++)
        {
        	ar=split();
        	t[i]=ar[0];
        	h[i]=ar[1];
        }
        dp=new int[n+1][k+1];
        for(int i=0;i<=n;i++)
        {
        	Arrays.fill(dp[i],-1);
        }
        System.out.println(knapsack(0,k));
    }
}