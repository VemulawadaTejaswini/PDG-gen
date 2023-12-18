import java.io.*;
import java.util.*;


public class Main
{

	
	
	

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);

	static int inf=(int)2e9;

	static int[] a;


	static class node1
		{
			int data;
			node1 link=null;
			node1(int d)
			{
				data=d;
			}
		}
		static class linkl
		{
			node1 front=null,end=null;
		
			void inst(int d)
			{
				node1 newnode=new node1(d);
				if(front==null){front=newnode;end=newnode;}
				else
				{
					end.link=newnode;end=newnode;
				}
			}
		}
		static class node_4graph
		{
			linkl l;
			node_4graph()
			{
				l=new linkl();
			}
		}
		static class graph
		{
			node_4graph[] arr;int[] vis,col;
	
			graph(int n)
			{
				arr=new node_4graph[n];
				vis=new int[n];
				col=new int[n];
				for(int i=0;i<n;i++)
				{
					node_4graph lw=new node_4graph();
					arr[i]=lw;
				}
			}
			void insert(int x,int y)
			{
				arr[x].l.inst(y);
				arr[y].l.inst(x);
			}
			void BFS()
			{
	
				for(int i=1;i<arr.length;i++)
				{
					if(vis[i]==0)
					{
						Queue<Integer> q=new LinkedList<Integer>();
	
						q.add(i);
						
						vis[i]=1;
						int colour=0;
						col[i]=colour;
	
						while(q.size()!=0)
						{
							int u=q.poll();
							colour=1;
							if(col[u]==1) colour=0;
	
							node1 temp=arr[u].l.front;
							while(temp!=null)
							{
								if(vis[temp.data]==0)
								{
									vis[temp.data]=1;
									col[temp.data]=colour;
									q.add(temp.data);
								}
								temp=temp.link;
							}
						}
						
					}
				}
				
			}
		
		}





	
	public static void main(String[] args)throws IOException{
		
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			int n=Integer.parseInt(br.readLine());
			String[] s;

			graph gr=new graph(n);

			for(int i=0;i<n-1;i++)
			{
				s=br.readLine().split(" ");
				if(Integer.parseInt(s[2])%2==1)
				{
					gr.insert(Integer.parseInt(s[0])-1,Integer.parseInt(s[1])-1);
				}
			}

			gr.BFS();
			
			for(int i=0;i<n;i++) out.println(gr.col[i]);
			
			
			out.close();

	}
}