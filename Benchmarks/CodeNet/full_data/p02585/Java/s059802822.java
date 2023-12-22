
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
		return Integer.valueOf(br.readLine().replaceAll("\\s", ""));
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
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
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
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int[]ar=split();
        int n=ar[0];
        int k=ar[1];
        long ans=-(long)Math.pow(10, 18);
        int[]p=split();
        int[]c=split();
        for(int i=0;i<n;i++)
        {
        	long a=-(long)Math.pow(10, 18);
        	long curr=0;
        	int x=p[i];
        	int[]vis=new int[n+1];
        	int moves=k;
        	int node=0;
        	while(moves!=0)
        	{
        		if(vis[x]!=0)
        		{
        			node=x;
        			break;
        		}
        		vis[x]=1;
        		curr+=(long)c[x-1];
        		a=(long)Math.max(a, curr);
        		x=p[x-1];
        		moves--;
        	}
        	if(moves!=0)
        	{
        		moves=k;
        		x=p[i];
        		long org=0;
        		long h=-(long)Math.pow(10, 18);
        		while(x!=node)
        		{
        			org+=(long)c[x-1];
        			h=Math.max(h, org);
        			x=p[x-1];
        			moves--;
        		}
        		int c_len=0;
        		x=node;
        		vis=new int[n+1];
        		long mx=-(long)Math.pow(10, 18);
        		curr=0;
        		long[] max=new long[n+1];
        		while(true)
        		{
        			if(vis[x]==1)
        				break;
        			vis[x]=1;
        			c_len++;
        			curr+=(long)c[x-1];
        			mx=(long)Math.max(mx, curr);
        			x=p[x-1];
        			max[c_len]=mx;
        		}
        		int m=moves/c_len;
        		int rem=moves%c_len;
        		a=(long)Math.max(h,(long)Math.max(org+mx,(long)(org+(long)m*curr+Math.max(0,max[rem]))));
        	}
        	ans=Math.max(ans, a);
        }
        System.out.println(ans);
    }
}