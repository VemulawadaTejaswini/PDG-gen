

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pair{
	int to;
	int cost;
	pair(int a,int b)
	{
		to=a;
		cost=b;
	}

}
public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int p=scan.nextInt();
		ArrayList<pair> adj[]=new ArrayList[n];
		ArrayList<Integer> adj2[]=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			adj[i]=new ArrayList<pair>();
			adj2[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			u--;
			v--;
			int cost=scan.nextInt();
			adj[u].add(new pair(v,cost-p));
			adj2[u].add(v);
		}
		boolean foundend[]=new boolean[n];
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(n-1);
		foundend[n-1]=true;
		while(!q.isEmpty())
		{
			int cur=q.poll();
			for(int to:adj2[cur])
			{
				if(!foundend[to]) {
					foundend[to]=true;
					q.add(to);
				}
			}
		}
		long dist[]=new long[n];
		for(int i=0;i<n;i++)
		{
			dist[i]=Integer.MIN_VALUE;
		}
		dist[0]=0;
		boolean found[]=new boolean[n];
		found[0]=true;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(dist[j]==Integer.MIN_VALUE)continue;
				for(pair x:adj[j]) {
					int to=x.to;
					found[to]=true;
					if(dist[to]<dist[j]+x.cost) {
						dist[to]=dist[j]+x.cost;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(pair x:adj[i])
			{
				int to=x.to;
				int cost=x.cost;
				if(dist[to]==Integer.MIN_VALUE||dist[i]==Integer.MIN_VALUE)
				{
					continue;
				}
				if(dist[to]<(dist[i]+cost) && foundend[to]) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(Math.max(0L, dist[n-1]));
	}
}
