
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		int n=Integer.valueOf(cmd[0]);
		int m=Integer.valueOf(cmd[1]);
		int[] h=new int[n+1];
		cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			h[i+1]=Integer.valueOf(cmd[i]);
		}
		ArrayList<Integer>[] g=new ArrayList[n+1];
		for(int i=0;i<n+1;i++)
		{
			g[i]=new ArrayList<>();
		}
		for(int i=0;i<m;i++)
		{
			cmd=br.readLine().split(" ");
			int x=Integer.valueOf(cmd[0]);
			int y=Integer.valueOf(cmd[1]);
			g[x].add(y);
			g[y].add(x);
		}
		int ans=0;
		int[] bool=new int[n+1];
		int[] status=new int[n+1];
		Arrays.fill(status,1);
		for(int i=1;i<=n;i++)
		{
			if(g[i].size()==0)
			{
				status[i]=1;
				continue;
			}
			if(bool[i]==0)
			{
				bool[i]=1;
				Queue<Integer> q=new LinkedList<>();
				q.add(i);
				while(!q.isEmpty())
				{
					int x=q.poll();
					for(int j=0;j<g[x].size();j++)
					{
						int y=g[x].get(j);
						if(bool[y]==0)
						{
							bool[y]=1;
							q.add(y);
							if(h[y]>=h[x])
								status[x]=0;
							if(h[y]<=h[x])
								status[y]=0;
						}
					}
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			if(status[i]==1)
				ans++;
		}
		System.out.println(ans);
	}

}
