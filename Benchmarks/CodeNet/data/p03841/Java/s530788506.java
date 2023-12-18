import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		int n=nextInt();
		int a[]=new int[n*n+1];
		Pair x[]=new Pair[n+1];
		for(int i=1;i<=n;i++)
			x[i]=new Pair(i,nextInt());
		Arrays.sort(x,1,n+1,new Comparator<Pair>(){
			public int compare(Pair a,Pair b){
				return a.second-b.second;
			}
		});
		Queue<Integer> queue=new LinkedList<>();
		for(int i=1,j=1;i<=n*n;i++)
		{
			if(j<=n && x[j].second==i)
			{
				a[i]=x[j].first;
				for(int t=1;t<=x[j].first-1;t++)
				{
					if(queue.isEmpty())
					{
						out.println("No");
						return;
					}
					a[queue.remove()]=x[j].first;
				}
				j++;
			}
			else
				queue.add(i);
		}
		queue.clear();
		for(int i=n*n,j=n;i>=1;i--)
		{
			if(j>=1 && x[j].second==i)
			{
				for(int t=1;t<=n-x[j].first;t++)
				{
					if(queue.isEmpty())
					{
						out.println("No");
						return;
					}
					a[queue.remove()]=x[j].first;
				}
				j--;
			}
			else if(a[i]==0)
				queue.add(i);
		}
		out.println("Yes");
		for(int i=1;i<=n*n;i++)
			out.print(a[i]+" ");
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