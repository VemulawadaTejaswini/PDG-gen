
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
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n=cin();
        ArrayList<Integer>[]gr=new ArrayList[n+1];
        for(int i=0;i<=n;i++)
        {
        	gr[i]=new ArrayList<>();
        }
        HashMap<String,Integer> index=new HashMap<>();
        for(int i=0;i<n-1;i++)
        {
        	int[]ar=split();
        	int x=ar[0];
        	int y=ar[1];
        	gr[x].add(y);
        	gr[y].add(x);
        	index.put(x+" "+y,i);
        	index.put(y+" "+x,i);
        }
        int c=0;
        for(int i=1;i<=n;i++)
        {
        	c=Math.max(c, gr[i].size());
        }
        int[] color=new int[n-1];
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[] {0,1});
        
        int[] vis=new int[n+1];
        vis[1]=1;
        while(!q.isEmpty())
        {
        	int[] arr=q.poll();
        	int col=-1;
        	if(arr[0]!=0)
        	{
        		col=color[index.get(arr[0]+" "+arr[1])];
        	}
        	int z=1;
        	for(int i=0;i<gr[arr[1]].size();i++)
        	{
        		int y=gr[arr[1]].get(i);
        		if(vis[y]==0)
        		{
        			vis[y]=1;
        			if(z!=col)
        			{
        				color[index.get(arr[1]+" "+y)]=z;
        				z++;
        			}
        			else
        			{
        				color[index.get(arr[1]+" "+y)]=z+1;
        				z=z+2;
        			}
        			q.add(new int[] {arr[1],y});
        		}
        	}
        }
        System.out.println(c);
        for(int i=0;i<n-1;i++)
        {
        	System.out.println(color[i]);
        }
    }
}