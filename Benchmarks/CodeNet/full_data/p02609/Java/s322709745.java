import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws Exception
	{
		int n=nextInt();
		int bit[]=new int[n+1];
		String s=nextLine();
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			bit[i]=s.charAt(i-1)-'0';
			if(bit[i]==1)
				cnt++;
		}
		int d1=0;
		if(cnt!=1)
		{
			for(int j=n;j>=1;j--)
			{
				if(bit[j]==1)
					d1=(d1+(int)modpow(2,n-j,cnt-1))%(cnt-1);
			}
		}
		int d2=0;
		for(int j=n;j>=1;j--)
		{
			if(bit[j]==1)
				d2=(d2+(int)modpow(2,n-j,cnt+1))%(cnt+1);
		}
		for(int i=1;i<=n;i++)
		{
			if(bit[i]==1 && cnt==1)
			{
				out.println(0);
				continue;
			}
			int d;
			if(bit[i]==1)
				d=(d1-(int)modpow(2,n-i,cnt-1)+(cnt-1))%(cnt-1);
			else
				d=(d2+(int)modpow(2,n-i,cnt+1))%(cnt+1);
			int ans=1;
			while(d>0)
			{
				d=d%Integer.bitCount(d);
				ans++;
			}
			out.println(ans);
		}
	}
	long modpow(long a,long b,long mod)
	{
	    long ret=1;
	    while(b!=0)
	    {
	        if(b%2==1)
	            ret=(ret*a)%mod;
	        a=(a*a)%mod;
	        b=b/2;
	    }
	    return ret;
	} 
	 
	///////////////////////////////////////////////////////////

	public void run()throws Exception
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws Exception{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws Exception{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws Exception{
		return br.readLine();
	}
	int nextInt()throws Exception{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws Exception{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws Exception{
		return Double.parseDouble(nextToken());
	}
}