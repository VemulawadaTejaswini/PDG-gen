
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class Main {
	static int n,m,cost[],ans=Integer.MAX_VALUE,TT[];
	static int vis=0;
	static int yaoshi[];
	public static void main(String args[]) throws IOException
	{
		StreamTokenizer sc=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		sc.nextToken();
		n=(int) sc.nval;
		TT=new int[16];
		for(int i=1;i<=15;i++)
			TT[i]=(int) (TT[i-1]+Math.pow(2, i-1));
		sc.nextToken();
		m=(int) sc.nval;
		yaoshi=new int[m+1];
		cost=new int[m+1];
		for(int i=1;i<=m;i++)
		{
			sc.nextToken();
			cost[i]=(int) sc.nval;
			sc.nextToken();
			int yaoshinum=(int) sc.nval;
			for(int j=1;j<=yaoshinum;j++)
			{
				sc.nextToken();
				yaoshi[i]=yaoshi[i]|(1<<(int)sc.nval-1);
			}
			//System.out.println(yaoshi[i]);
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
		//System.out.println(vis);
		if(vis==TT[n])
			ans=Math.min(ans, sum);
		int newvis=vis;
		vis=vis|yaoshi[x];
		//System.out.println(vis);
		dfs(x+1,sum+cost[x]);
			
			vis=newvis;
			dfs(x+1,sum);
			}
	
}
}
