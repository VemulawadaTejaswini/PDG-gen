import java.util.*;
public class Main {
	static int n,m;
	static char mp[][]=new char [200][200];
	static int vis[][]=new int [200][200];
	static int minstep[][]=new int [200][200];
	static class node
	{
		public int x;
		public int y;
		public int step;
	}
	static int dis[][]= {{0,1},{1,0}};
	static class cmp implements Comparator <node>
	{
		public int compare(node a,node b)
		{
			return b.step-a.step;
		}
	}
	static int bfs()
	{
		for(int i=0;i<=n;i++)
			for(int j=0;j<=m;j++) {vis[i][j]=0;minstep[i][j]=n*m+1;}
		PriorityQueue<node> q=new PriorityQueue<node>(new cmp());
		node p=new node();
		p.x=1;p.y=1;vis[1][1]=1;
		if(mp[1][1]=='#')p.step=1;
		else
			p.step=0;
		q.offer(p);
		int ans=n*m+1;
		minstep[1][1]=Math.min(p.step, minstep[1][1]);
		while(!q.isEmpty())
		{
			p=q.peek();q.poll();
			if(p.x==n&&p.y==m)
			{
				 ans=Math.min(ans,p.step);
			}
		else 
		for(int i=0;i<2;i++)
		{
			node next=new node();
			next.x=p.x+dis[i][0];next.y=p.y+dis[i][1];
			next.step=p.step;
			if(next.x<1||next.x>n||next.y<1||next.y>m)continue;
			if(vis[next.x][next.y]==1)continue;
			if(mp[next.x][next.y]=='#')next.step+=1;
			if(next.step>=minstep[next.x][next.y])continue;
			else minstep[next.x][next.y]=next.step;
			//vis[next.x][next.y]=1;
			q.offer(next);
		}
		}
		return ans;
	}
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
	 n=input.nextInt();m=input.nextInt();
	 input.hasNextLine();
	 for(int i=1;i<=n;i++)
	 {
		 String s=input.next();
		 for(int j=0;j<s.length();j++)
			 mp[i][j+1]=s.charAt(j);
	 }
	 int ans=bfs();
	 System.out.println(ans);
 }
}