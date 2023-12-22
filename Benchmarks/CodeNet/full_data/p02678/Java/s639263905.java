
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] cmd=s.split(" ");
		int n=Integer.valueOf(cmd[0]);
		int m=Integer.valueOf(cmd[1]);
		ArrayList<Integer>[] graph=new ArrayList[n+1];
		for(int i=0;i<=n;i++)
		{
			graph[i]=new ArrayList<>();
		}
		for(int i=0;i<m;i++)
		{
			cmd=br.readLine().split(" ");
			int x=Integer.valueOf(cmd[0]);
			int y=Integer.valueOf(cmd[1]);
			graph[x].add(y);
			graph[y].add(x);
		}
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		int[] bool=new int[n+1];
		bool[1]=1;
		int[] ans=new int[n+1];
		while(!q.isEmpty())
		{
			int x=q.poll();
			for(int i=0;i<graph[x].size();i++)
			{
				if(bool[graph[x].get(i)]==0)
				{
					bool[graph[x].get(i)]=1;
					ans[graph[x].get(i)]=x;
					q.add(graph[x].get(i));
				}
			}
		}
		System.out.println("Yes");
		for(int i=2;i<=n;i++)
		{
			System.out.println(ans[i]);
		}
	}
}
