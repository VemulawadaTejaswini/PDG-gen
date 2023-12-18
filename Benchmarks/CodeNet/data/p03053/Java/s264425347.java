import java.io.*;
import java.util.*;






public class Main
{

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);	


	static class node
	{
		int x;int y;int s;

		node(int dx,int dy,int ds)
		{
			x=dx;y=dy;s=ds;
		}
	}


	public static void main(String[] Atul)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		String[] s_=br.readLine().split(" ");

		int n=Integer.parseInt(s_[0]),m=Integer.parseInt(s_[1]);


		int[][] vis=new int[n][m];

		int[][] a=new int[n][m];


		for(int i=0;i<n;i++)
		{
			String s1=br.readLine();
			for(int j=0;j<m;j++)
			{
				if(s1.charAt(j)=='#') a[i][j]=1;
				else a[i][j]=0;
			}
		}

		Queue<node> q=new LinkedList<node>();


		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==1)
				{
					q.add(new node(i,j,0));
					vis[i][j]=1;
				}
			}
		}

		int max=0;

		while(q.size()>0)
		{
			node top=q.poll();

			int i=top.x,j=top.y,s=top.s;

			max=Math.max(max,s);

			if((j-1)>=0 && vis[i][j-1]==0 && a[i][j-1]==0)
			{
				vis[i][j-1]=1;
				q.add(new node(i,j-1,s+1));
			}
			if((j+1)<n && vis[i][j+1]==0 && a[i][j+1]==0)
			{
				vis[i][j+1]=1;
				q.add(new node(i,j+1,s+1));
			}
			if((i-1)>=0 && vis[i-1][j]==0 && a[i-1][j]==0)
			{
				vis[i-1][j]=1;
				q.add(new node(i-1,j,s+1));
			}
			if((i+1)<n && vis[i+1][j]==0 && a[i+1][j]==0)
			{
				vis[i+1][j]=1;
				q.add(new node(i+1,j,s+1));
			}
		}
		out.println(max);
		
		out.close();

	}
}