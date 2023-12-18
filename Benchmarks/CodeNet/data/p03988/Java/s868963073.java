import java.io.*;
import java.util.*;
public class Main
{
	
	private boolean solve()throws IOException
	{
		int n=nextInt();
		int a[]=new int[n];
		for(int i=1;i<=n;i++)
			a[nextInt()]++;
		int l;
		for(l=n-1;l>=1;l--)
			if(a[l]!=0)
				break;
		if(a[l]<2)
			return false;
		a[l]-=2;
		for(int i=1;i<=l-1;i++)
		{
			int d=Math.max(i,l-i);
			if(a[d]==0)
				return false;
			a[d]--;
		}
		int r=(l+1)/2;
		for(int i=1;i<=r;i++)
			if(a[i]>0)
				return false;
		return true;
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		out.println(solve()?"Possible":"Impossible");
		
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