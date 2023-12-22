import java.util.*;
import java.io.*;
class Main
{
	static boolean visited[];
	static long dp[][][];
	static long MOD=1000000007L;
	static Hashtable<String , Long>hash=new Hashtable<>();
	public static void main(String args[]) throws java.lang.Exception
	{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			// String h[]=inp.readLine().split(" ");
			// String h[]=inp.readLine().split(" ");

			String h[]=inp.readLine().split(" ");
			System.out.println(Integer.parseInt(h[0])*Integer.parseInt(h[1]));
			
	}
	static int[] gg(String aa)
	{
		int a[]=new int[aa.length()];
		for(int i=0;i<aa.length();i++)
		{
			a[i]=(int)aa.charAt(i)-(int)'0';
		}
		return a;
	}
	static long get(int a[], int d, int sum, int tight, int i)
	{
		if(i==a.length){if(sum%d==0 && sum!=0){return 1;}return 0;}
		// if(dp[i][sum][tight]!=-1){return dp[i][sum][tight];}
		String s=i+" "+sum+" "+tight;
		if(hash.containsKey(i+" "+sum+" "+tight) && tight!=1){return hash.get(i+" "+sum+" "+tight);}
		long ans=0;
		
		int limit=(tight==0?9:a[i]);
			for(int j=0;j<=limit;j++)
			{
				int newt=(a[i]==j?tight:0);

				ans=(ans%MOD+get(a,d,sum+j,newt,i+1)%MOD)%MOD;
			}
			// dp[i][sum%d][tight]=ans;
			hash.put(s,ans);
			return ans;	
	}


	
	static long bfs(int src, ArrayList<ArrayList<Integer>>arr)
	{
		Queue<Pair>q=new LinkedList<>();
		q.add(new Pair(src,1,1));
		visited[src]=true;
		long ans=0;
		while(q.size()!=0)
		{
			ans=0;
			int size=q.size();
			for(int j=0;j<size;j++)
			{
				Pair t=q.poll();
				ans=(ans%MOD+(t.b%MOD+t.c%MOD)%MOD)%MOD;
				for(Integer node:arr.get(t.a))
				{
					if(!visited[node])
					{
						visited[node]=true;
						q.add(new Pair(node,t.b+t.c,t.b));
					}
				}
			}
		}
		return ans%MOD;
	}
}
class Pair
{
	int a;
	long b;
	long c;
	Pair(int e, long f, long h)
	{
		a=e;
		b=f;
		c=h;
	}
}