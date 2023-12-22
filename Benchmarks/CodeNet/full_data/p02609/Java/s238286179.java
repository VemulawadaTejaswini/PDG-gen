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

		for(int i=1;i<=n;i++)
		{
			if(i!=1)
			{
				bit[i-1]^=1;
				if(bit[i-1]==1)
					cnt++;
				else
					cnt--;
			}
			bit[i]^=1;
			if(bit[i]==1)
				cnt++;
			else
				cnt--;

			if(cnt==0)
			{
				out.println(0);
				continue;
			}

			int ans=1;
			int d=0;
			for(int j=n;j>=1;j--)
			{
				if(bit[j]==1)
					d=(d+(int)modpow(2,n-j,cnt))%cnt;
			}
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