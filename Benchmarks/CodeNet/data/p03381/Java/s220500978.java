import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		Pair a[]=new Pair[n+1];
		for(int i=1;i<=n;i++)
			a[i]=new Pair(nextInt(),i);
		Arrays.sort(a,1,n+1,new Comparator<Pair>(){
			public int compare(Pair a,Pair b){
				return a.first-b.first;
			}
		});
		int ans[]=new int[n+1];
		for(int i=1;i<=n/2;i++)
			ans[a[i].second]=a[n/2+1].first;
		for(int i=n/2+1;i<=n;i++)
			ans[a[i].second]=a[n/2].first;
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