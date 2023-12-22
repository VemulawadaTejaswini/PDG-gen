
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
		HashMap<String,Integer> map=new HashMap<>();
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
			if(map.containsKey(x+" "+y) || map.containsKey(y+" "+x))
				continue;
			g[x].add(y);
			g[y].add(x);
			map.put(x+" "+y,1);
			map.put(y+" "+x,1);
		}
		int ans=0;
		int[] status=new int[n+1];
		Arrays.fill(status,1);
		for(int i=1;i<=n;i++)
		{
			if(status[i]==0)
				continue;
			for(int j=0;j<g[i].size();j++)
			{
				if(h[i]>=h[g[i].get(j)])
					status[g[i].get(j)]=0;
				if(h[i]<=h[g[i].get(j)])
				{
					status[i]=0;
					break;
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			if(status[i]==1)
			{
				ans++;
			}
		}
		System.out.println(ans);
	}

}
