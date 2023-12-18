
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	//0-WHITE
	//1-BLACK
	static ArrayList<par>[] adj;;
	static int ans[];
	public static void dfs(int u,int par,int color)
	{
		
//		System.out.println(u);
		for(par next:adj[u])
		{
			if(next.v==par)continue;
			if(next.weight%2==0)
			{
				ans[next.v]=color;
			}else {
				ans[next.v]=(1-color);
			}
			dfs(next.v,u,ans[next.v]);
			
		}
		
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int val[]=new int[n];
		adj=new ArrayList[n];
		ans=new int[n];
		for(int i=0;i<n;i++)
		{
			adj[i]=new ArrayList<par>();
		}
		
		
		for(int i=0;i<n-1;i++)
		{
			int u=scan.nextInt();
			int v=scan.nextInt();
			int w=scan.nextInt();
			
			u--;
			v--;
			
			adj[u].add(new par(v,w));
			adj[v].add(new par(u,w));
		}
//		System.out.println("start");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(i+" ");
//			for(par v:adj[0])
//			{
//				System.out.print(v.v+" ");
//			}
//			System.out.println();
//		}
		dfs(0,-1,0);
		for(int i=0;i<n;i++)
		{
			System.out.println(ans[i]);
		}
		
		
	}
}
class par{
	int v;
	int weight;
	par(int a,int b)
	{
		v=a;
		weight=b;
	}
	
}