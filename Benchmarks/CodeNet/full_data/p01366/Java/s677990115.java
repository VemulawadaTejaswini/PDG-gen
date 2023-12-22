import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws Exception{
		new Main().solve();
	}
	void solve(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();//the number of cities
			int m=sc.nextInt();//the number of roads
			if(n==0&&m==0)break;
			Dijkstra ds=new Dijkstra(n);
			int[][] cost=new int[n][n];
			for(int i=0;i<m;i++){
				int u=sc.nextInt()-1;
				int v=sc.nextInt()-1;
				int d=sc.nextInt();
				int c=sc.nextInt();
				cost[u][v]=c;
				cost[v][u]=c;
				ds.addEdge(u, v, d, c);
				ds.addEdge(v, u, d, c);
			}
			ds.getShortestPath(0, 0);
			boolean[][] used=new boolean[n][n];
			long ans=0;
			for(int i=0;i<n;i++){
				int a=ds.prev[i];
				int b=i;
				if(used[a][b])continue;
				used[a][b]=true;
				used[b][a]=true;
				ans+=cost[a][b];
			}
			System.out.println(ans);
		}
	}
	class Dijkstra{
		int n;
		long[] d;
		int s;
		List<Edge>[]edges;
		PriorityQueue<Vertice> pq;
		final long INF=Long.MAX_VALUE/4;
		int[] prev;//????????????????????????????????????????????????
		Dijkstra(int n){
			this.n=n;
			d=new long[n];
			@SuppressWarnings("unchecked")
			List<Edge>[]edges=new List[n];
			this.edges=edges;
			for(int i=0;i<n;i++){
				edges[i]=new ArrayList<Edge>();
			}
			s=-1;
			prev=new int[n];
		}
		long getShortestPath(int i,int j){
			if(i!=s){
				s=i;
				Arrays.fill(d, INF);
				Arrays.fill(prev,-1);
				d[i]=0;
				prev[0]=0;
				pq=new PriorityQueue<Vertice>();
				pq.add(new Vertice(i,d[i],0));
				while(!pq.isEmpty()){
					Vertice u=pq.poll();
					if(d[u.me]<u.distance){
						continue;//skip old vertex
					}
					for(int ii=0;ii<edges[u.me].size();ii++){
						Edge e=edges[u.me].get(ii);
						if(d[e.from]!=INF&&e.distance+d[e.from]<d[e.to]){
							d[e.to]=e.distance+d[e.from];
							pq.add(new Vertice(e.to,d[e.to],u.total_cost+e.cost));
							prev[e.to]=e.from;
						}
					}
				}
				s=i;
			}
			return d[j];
		}
		void addEdge(int from,int to,long distance,long cost){
			edges[from].add(new Edge(from,to,distance,cost));
		}
	}
	class Edge{
		int from;
		int to;
		long distance;
		long cost;
		Edge(int i,int j,long distance,long cost){
			this.from=i;
			this.to=j;
			this.distance=distance;
			this.cost=cost;
		}
	}
	class Vertice implements Comparable<Vertice>{
		int me;
		long distance;
		long total_cost;
		Vertice(int me,long distance,long total_cost){
			this.me=me;
			this.distance=distance;
			this.total_cost=total_cost;
		}
		@Override
		public int compareTo(Vertice o){
			//			return Long.compare(this.cost, o.cost);
			return this.distance>o.distance?1:this.distance<o.distance?-1:this.total_cost>o.total_cost?1:this.total_cost<o.total_cost?-1:0;
		}
	}
}