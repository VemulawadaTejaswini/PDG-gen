import java.io.*;
import java.util.*;
public class Main
{
	int n,m,minfare[];
	ArrayList<Pair> list[];
	HashSet<Integer> set[];
	final int inf=(int)(1e9+1);
	private void solve()throws IOException
	{
		n=nextInt();
		m=nextInt();
		list=new ArrayList[n+1];
		for(int i=1;i<=n;i++)
			list[i]=new ArrayList<>();
		for(int i=1;i<=m;i++)
		{
			int p=nextInt();
			int q=nextInt();
			int c=nextInt();
			list[p].add(new Pair(q,c));
			list[q].add(new Pair(p,c));
		}
		minfare=new int[n+1];
		Arrays.fill(minfare,inf);
		minfare[1]=0;
		set=new HashSet[n+1];
		for(int i=1;i<=n;i++)
			set[i]=new HashSet<>();
		PriorityQueue<Integer> pq=new PriorityQueue<>(11,new Comparator<Integer>(){
			public int compare(Integer a,Integer b){
				return minfare[a]-minfare[b];
			}
		});
		pq.add(1);
		while(!pq.isEmpty())
		{
			int v=pq.remove();
			for(Pair vv:list[v])
			{
				int curr=minfare[v]+(set[v].contains(vv.second)?0:1);
				if(minfare[vv.first]==curr)
					set[vv.first].add(vv.second);
				else if(minfare[vv.first]>curr)
				{
					minfare[vv.first]=curr;
					set[vv.first]=new HashSet<>();
					set[vv.first].add(vv.second);
					pq.add(vv.first);
				}
			}
		}
		out.println(minfare[n]==inf?-1:minfare[n]);
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