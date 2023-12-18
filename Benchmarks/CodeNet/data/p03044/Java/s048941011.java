import java.io.*;
import java.util.*;


public class Main
{

	
	
	

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);

	static int inf=(int)2e9;



	static class node1
		{
			int data,weight;
			node1 link=null;
			node1(int d,int w)
			{
				data=d;weight=w;
			}
		}
		static class linkl
		{
			node1 front=null,end=null;
		
			void inst(int d,int w)
			{
				node1 newnode=new node1(d,w);
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
			void insert(int x,int y,int w)
			{
				arr[x].l.inst(y,w);
				arr[y].l.inst(x,w);
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
						col[i]=1;
	
						while(q.size()!=0)
						{
							int u=q.poll();
							node1 temp=arr[u].l.front;
							while(temp!=null)
							{
								if(vis[temp.data]==0)
								{
									vis[temp.data]=1;
									q.add(temp.data);

									if(temp.weight%2==0) col[temp.data]=col[u];
									else if(col[u]==0) col[temp.data]=1;
									else col[temp.data]=0;
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
				int fd=Integer.parseInt(s[0])-1;
				int df=Integer.parseInt(s[1])-1;
				gr.insert(fd,df,Integer.parseInt(s[2]));
					
			}

			gr.BFS();

						
			for(int i=0;i<n;i++) out.println(gr.col[i]);
			
			
			out.close();

	}
}