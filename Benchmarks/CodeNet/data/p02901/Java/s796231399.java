
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class Main {
	static int n,m,cost[],ans=Integer.MAX_VALUE;
	static boolean vis[];
	static ArrayList<Integer> yaoshi[];
	public static void main(String args[]) throws IOException
	{
		StreamTokenizer sc=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		sc.nextToken();
		n=(int) sc.nval;
		sc.nextToken();
		m=(int) sc.nval;
		yaoshi=new ArrayList[m+1];
		vis=new boolean[n+1];
		yaoshi[0]=new ArrayList<Integer>();
		cost=new int[m+1];
		for(int i=1;i<=m;i++)
		{
			yaoshi[i]=new ArrayList<Integer>();
			sc.nextToken();
			cost[i]=(int) sc.nval;
			sc.nextToken();
			int num=(int) sc.nval;
			yaoshi[i].add(num);
			for(int j=1;j<=num;j++)
			{
				sc.nextToken();
				yaoshi[i].add((int)sc.nval);
			}
		}
		dfs(1,0);
		if(ans==Integer.MAX_VALUE)
			ans=-1;
		System.out.println(ans);
	}
	
public static void dfs(int x,int sum)
{//System.out.println(ans);
	if(sum<ans&&x<=m)
	{
		
			boolean bool=true;
			for(int i=1;i<=n;i++)
			{
				if(!vis[i])
				{
					bool=false;
					break;
				}
			}
		if(bool)
			ans=Math.min(ans, sum);
		
		
			for(int j=1;j<=yaoshi[x].get(0);j++)
			{
				vis[yaoshi[x].get(j)]=true;
			
			}
			dfs(x+1,sum+cost[x]);
			
			for(int j=1;j<=yaoshi[x].get(0);j++)
			{
				vis[yaoshi[x].get(j)]=false;
			}
			dfs(x+1,sum);
			}
	
}
}
