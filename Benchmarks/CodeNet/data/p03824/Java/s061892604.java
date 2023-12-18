import java.io.*;
import java.util.*;
public class Main
{
	int n;
	ArrayList<Integer> list[];
	final int inf=(int)(1e9+1);
	private void solve()throws IOException
	{
		n=nextInt();
		list=new ArrayList[n+1];
		for(int i=1;i<=n;i++)
			list[i]=new ArrayList<>();
		for(int i=1;i<n;i++)
		{
			int a=nextInt();
			int b=nextInt();
			list[a].add(b);
			list[b].add(a);
		}
		int dia=farthest(farthest(1).first).second;
		int ans=0;
		while(dia>0)
		{
			dia=(dia-1)/2;
			ans++;
		}
		out.println(ans);
	}
	Pair farthest(int v)
	{
		Queue<Integer> queue=new LinkedList<>();
		queue.add(v);
		Pair max=new Pair(v,0);
		int dist[]=new int[n+1];
		Arrays.fill(dist,inf);
		dist[v]=0;
		while(!queue.isEmpty())
		{
			int curr=queue.remove();
			for(int next:list[curr])
				if(dist[next]>dist[curr]+1)
				{
					dist[next]=dist[curr]+1;
					if(dist[next]>max.second)
						max=new Pair(next,dist[next]);
					queue.add(next);
				}
		}
		return max;
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