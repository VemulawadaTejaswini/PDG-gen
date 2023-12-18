import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
static ArrayList<edge> []adj;
public static int dijkstra(int s)
{
	int inf=100000000;
	int []dist=new int[10];
	Arrays.fill(dist, inf);
	dist[s]=0;
	PriorityQueue<edge> pq=new PriorityQueue();
	pq.add(new edge(s,0));
	while(!pq.isEmpty())
	{
		edge e=pq.poll();
		int from=e.to;
		int w=e.weight;
		if(from==1)
			return w;
		if(dist[from]<w)
			continue;
		for(edge curr:adj[from])
		{
			int total=w+curr.weight;
			if(total<dist[curr.to])
			{
				dist[curr.to]=total;
				pq.add(new edge(curr.to,total));
			}
		}
	}
	return -1;
	
}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		adj=new ArrayList[10];
		int [][]mp=new int [10][10];
		for(int i=0;i<10;i++)
		{	
			adj[i]=new ArrayList();
			for(int j=0;j<10;j++)
			{	
				mp[i][j]=sc.nextInt();
				adj[i].add(new edge(j,mp[i][j]));
			}	
			
		}
		int []sp=new int [10];
		for(int i=0;i<10;i++)
			if(i!=1)
				sp[i]=dijkstra(i);
		
		long ans=0;
		for(int i=1;i<=r;i++)
			for(int j=1;j<=c;j++)
			{
				int x=sc.nextInt();
				if(x==-1)
					continue;
				ans+=sp[x];
			}
		
		System.out.println(ans);
		
	}
	
	
	
	
	
	
	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}
		
		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}
		
		public double nextDouble() throws IOException
		{
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if(x.charAt(0) == '-')
			{
				neg = true;
				start++;
			}
			for(int i = start; i < x.length(); i++)
				if(x.charAt(i) == '.')
				{
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				}
				else
				{
					sb.append(x.charAt(i));
					if(dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg?-1:1);
		}
		
		public boolean ready() throws IOException {return br.ready();}


	}

}
class edge implements Comparable<edge>
{
	int weight;int to;
	public edge(int x,int y)
	{
		to=x;weight=y;
	}
	public int compareTo(edge p)
	{
		return weight-p.weight;
	}
}