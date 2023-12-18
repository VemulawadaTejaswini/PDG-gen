import java.io.*;
import java.util.*;
public class Main
{
	final int logn=20;
	int n,x[],l,dp[][];
	private void solve()throws IOException
	{
		n=nextInt();
		x=new int[n+1];
		for(int i=1;i<=n;i++)
			x[i]=nextInt();
		l=nextInt();
		init();
		int q=nextInt();
		while(q-->0)
		{
			int a=nextInt();
			int b=nextInt();
			if(a>b)
			{
				int t=a;
				a=b;
				b=t;
			}
			int ans=0;
			for(int i=logn;i>=0;i--)
				if(dp[i][a]<=b)
				{
					ans+=1<<i;
					a=dp[i][a];
					if(a==b)
						break;
				}
			out.println(ans);
		}
	}
	void init()
	{
		dp=new int[logn+1][n+1];
		for(int i=1;i<=n;i++)
			dp[0][i]=floor(x[i]+l);
		for(int i=1;i<=logn;i++)
			for(int j=1;j<=n;j++)
				dp[i][j]=dp[i-1][dp[i-1][j]];
	}
	int floor(int d)
	{
		int low=1,high=n,ans=0;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(x[mid]<=d)
			{
				ans=mid;
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return ans;
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();
		
		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
		while(st==null || !st.hasMoreTokens())
		st=new StringTokenizer(br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}