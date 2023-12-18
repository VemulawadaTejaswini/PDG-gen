import java.util.Arrays;
import java.util.*;
class Main
{
	static ArrayList<Integer> adj[];
	static int dpi[],dpo[],vis[];
	static int ans;
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt(); int m=sc.nextInt();
		dpi=new int[n]; dpo=new int[n];
		adj=new ArrayList[n]; ans=0;
		for(i=0;i<n;i++)
			adj[i]=new ArrayList();
		for(i=0;i<m;i++) 
		{
			int u=sc.nextInt()-1; int v=sc.nextInt()-1;
			adj[u].add(v); 
		}
		vis=new int[n];
		for(i=0;i<n;i++)
		{
			if(vis[i]==0)
				dfs(i,-1,0);
		}
		Arrays.fill(vis, 0);
		for(i=0;i<n;i++)
		{
			if(vis[i]==0)
				dfs(i,-1,0);
		}
		for(i=0;i<n;i++)
			if(dpi[i]+dpo[i]>ans)
				ans=dpi[i]+dpo[i];
		System.out.println(ans);
	}
	public static void dfs(int v,int p,int l)
	{
		vis[v]=1;
		dpi[v]=Math.max(dpi[v], l);
		if(p!=-1)
		{
			dpo[p]=Math.max(dpo[p], 1+dpo[v]);
			dpi[v]=Math.max(dpi[v], dpi[p]+1);
		}
		for(int node:adj[v])
		{
			if(vis[node]==0)
			{
				dfs(node,v,l+1);
				dpo[v]=Math.max(dpo[v], 1+dpo[node]);
			}
			else
			{
				dpi[node]=Math.max(dpi[node], dpi[v]+1);
				dpo[v]=Math.max(dpo[node]+1, dpo[v]);
			}
		}
		
	}
} 