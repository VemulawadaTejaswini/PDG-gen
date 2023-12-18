import java.io.*;
import java.util.*;
public class Main
{
	int n,m,A[],B[];
	char s[];
	ArrayList<Integer> list[];
	private void solve()throws IOException
	{
		n=nextInt();
		m=nextInt();
		s=(" "+nextLine()).toCharArray();
		//A[i] is the number of adjacent A to i and similarly B[i]
		A=new int[n+1];
		B=new int[n+1];
		list=new ArrayList[n+1];
		for(int i=1;i<=n;i++)
			list[i]=new ArrayList<>();
		for(int i=1;i<=m;i++)
		{
			int a=nextInt();
			int b=nextInt();
			list[a].add(b);
			if(s[b]=='A')
				A[a]++;
			else
				B[a]++;
			list[b].add(a);
			if(s[a]=='A')
				A[b]++;
			else
				B[b]++;
		}
		boolean bad[]=new boolean[n+1];
		Queue<Integer> queue=new LinkedList<>();
		for(int i=1;i<=n;i++)
			if(A[i]==0 || B[i]==0)
			{
				bad[i]=true;
				queue.add(i);
			}
		while(!queue.isEmpty())
		{
			int v=queue.remove();
			for(int vv:list[v])
			{
				if(bad[vv])
					continue;
				if(s[v]=='A')
					A[vv]--;
				else
					B[vv]--;
				if(A[vv]==0 || B[vv]==0)
				{
					bad[vv]=true;
					queue.add(vv);
				}
			}
		}
		for(int i=1;i<=n;i++)
			if(!bad[i])
			{
				out.println("Yes");
				return;
			}
		out.println("No");
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