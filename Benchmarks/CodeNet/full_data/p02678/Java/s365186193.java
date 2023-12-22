import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		ArrayList<Integer>[] arr=new ArrayList[n+1];
		
		for(int i=0;i<n+1;i++)
		{
			ArrayList<Integer> list=new ArrayList<>();
			arr[i]=list;
		}
		
		for(int i=0;i<m;i++)
		{
			int a=s.nextInt();
			int b=s.nextInt();
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		int[] visited=new int[n+1];
		int[] ans=new int[n+1];
		
		bfs(arr,visited,ans);
		
		int p=0;
		
		for(int i=2;i<n+1;i++)
		{
			if(ans[i]==0)
			{
				p=1;
				break;
			}
		}
		
		if(p==0)
		{
			System.out.println("Yes");
			
			for(int i=2;i<n+1;i++)
			{
				System.out.println(ans[i]);
			}
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
	public static void bfs(ArrayList<Integer>[] arr,int[] visited,int[] ans)
	{
		Queue<pair> q=new LinkedList<pair>();
		
		pair p=new pair(1,-1);
		q.add(p);
		
		visited[1]=1;
		
		while(!q.isEmpty())
		{
			pair curr=q.poll();
			
			ans[curr.node]=curr.pre;
			
			for(int i=0;i<arr[curr.node].size();i++)
			{
				int now=arr[curr.node].get(i);
				
				if(visited[now]==0)
				{
					pair pp=new pair(now,curr.node);
					q.add(pp);
					
					visited[now]=1;
				}
			}
		}
	}
	
}

class pair
{
	int node;
	int pre;
	
	public pair(int node,int pre)
	{
		this.node=node;
		this.pre=pre;
	}
}