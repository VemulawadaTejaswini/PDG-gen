import java.io.*;
import java.util.*;


public class Main
{

	
	
	

	static OutputStream outputStream = System.out;
	static PrintWriter out = new PrintWriter(outputStream);

	static int inf=(int)2e9;



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
			void ColourReverse(int su,int coll)
			{

				Queue<Integer> q=new LinkedList<Integer>();

				int colour=coll;

	
				q.add(su);
						
				vis[su]=1;
				col[su]=colour;

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

		static class dsu
		{
			int [] par,size;
			dsu(int n)
			{
				par=new int[n];size=new int[n];
				for(int i=0;i<n;i++)
				{
					size[i]=1;par[i]=i;
				}
			}
			void merge(int x,int y)
			{
				int parx=find(x),pary=find(y);
				if(size[parx]>size[pary])
				{
					par[pary]=parx;size[parx]+=size[pary];
				}
				else
				{
					par[parx]=pary;size[pary]+=size[parx];
				}
			}
			int find(int x)
			{
				if(par[x]==x)
					return x;
				else
					return find(par[x]);
			}
		}





	
	public static void main(String[] args)throws IOException{
		
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			int n=Integer.parseInt(br.readLine());
			String[] s;

			graph gr=new graph(n);
			dsu dsu=new dsu(n);


			ArrayList<Integer> l=new ArrayList<Integer>();
			ArrayList<Integer> r=new ArrayList<Integer>();


			for(int i=0;i<n-1;i++)
			{
				s=br.readLine().split(" ");
				int fd=Integer.parseInt(s[0])-1;
				int df=Integer.parseInt(s[1])-1;
				if(Integer.parseInt(s[2])%2==1)
				{
					gr.insert(fd,df);
					if(dsu.find(fd)!=dsu.find(df)) dsu.merge(fd,df);
				}
				else
				{
					l.add(fd);
					r.add(df);
				}
			}

			gr.BFS();
			gr.vis=new int[n];

			for(int i=0;i<l.size();i++)
			{
				if(dsu.find(l.get(i))!=dsu.find(r.get(i)))
				{
					if(gr.col[l.get(i)]!=gr.col[r.get(i)])
					{
						gr.ColourReverse(r.get(i),gr.col[l.get(i)]);
					}
					dsu.merge(l.get(i),r.get(i));
					gr.insert(l.get(i),r.get(i));
				}
			}

			

			
			for(int i=0;i<n;i++) out.println(gr.col[i]);
			
			
			out.close();

	}
}