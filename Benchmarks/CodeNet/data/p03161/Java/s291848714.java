
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
    static int digits(int n)
    {
    	int ans=0;
    	while(n!=0)
    	{
    		ans++;
    		n=n/10;
    	}
    	return ans;
    }
    static int[] dp;
    static int min(int[]h,int ind,int k)
    {
    	if(ind==h.length-1)
    		return 0;
    	if(ind>=h.length)
    		return 1000000000;
    	if(dp[ind]!=-1)
    		return dp[ind];
    	int res=1000000000;
    	for(int i=1;i<=k;i++)
    	{
    		if(ind+i<h.length)
    			res=Math.min(res,Math.abs(h[ind+i]-h[ind])+min(h,ind+i,k));
    	}
    	dp[ind]=res;
    	return res;
    }
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int[]ar=split();
        int n=ar[0];
        int k=ar[1];
        int[]h=split();
        dp=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(min(h,0,k));
    }
}