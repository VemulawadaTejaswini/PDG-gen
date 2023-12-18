import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int a[]=new int[n+1];
		Pair b[]=new Pair[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=nextInt();
			b[i]=new Pair(a[i],i);
		}
		Arrays.sort(b,1,n+1,new Comparator<Pair>(){
			public int compare(Pair a,Pair b){
				return a.first-b.first;
			}
		});
		long sum=0;
		long dp[]=new long[n+1];
		for(int i=n;i>=1;i--)
		{
			dp[b[i].second]=sum-(n-i)*b[i].first;
			sum+=b[i].first;
		}
		int max[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			if(a[i]>a[max[i-1]])
				max[i]=i;
			else
				max[i]=max[i-1];
		}
		long ans[]=new long[n+1];
		int curr=max[n];
		long time=0;
		while(curr>1)
		{
			int x=max[curr-1];
			long t=dp[x]-time;
			ans[curr]=t;
			time+=t;
			curr=x;
		}
		ans[1]=sum-time;
		for(int i=1;i<=n;i++)
			out.println(ans[i]);
	}
	class Pair{
	    int first,second;
	    Pair(int a,int b){
	        first=a;
	        second=b;
	    }
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