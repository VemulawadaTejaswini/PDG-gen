import java.util.Arrays;
import java.util.*;
class Main
{
	static ArrayList<Integer> adj[];
	static int ans;
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt(); int m=sc.nextInt();
		adj=new ArrayList[n]; ans=0;
		for(i=0;i<n;i++)
			adj[i]=new ArrayList();
		for(i=0;i<m;i++) 
		{
			int u=sc.nextInt()-1; int v=sc.nextInt()-1;
			adj[u].add(v); 
		}
		for(i=0;i<n;i++)
			dfs(i,0);	
		System.out.println(ans);
	}
	public static void dfs(int v,int l)
	{
		if(l>ans)
			ans=l;
		for(int node:adj[v])
			dfs(node,l+1);
	}
} 