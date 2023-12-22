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
		while(sc.hasNext()){
			int n=sc.nextInt();//the number of roads
			Dijkstra ds=new Dijkstra(10);
			for(int i=0;i<n;i++){
				int from=sc.nextInt();
				int to=sc.nextInt();
				int cost=sc.nextInt();
				ds.addEdge(from, to, cost);
				ds.addEdge(to, from, cost);
			}
			long ans=99999999999L;
			long ans2=0;
			for(int i=0;i<n;i++){
				long a=ds.getShortestPath(i);
				if(a==0)continue;
				if(ans>a){
					ans=a;
					ans2=i;
				}
			}
			System.out.println(ans2+" "+ans);
		}
	}



	class Dijkstra{
		int n;
		long[] d;
		int s;
		List<Edge>[]edges;
		PriorityQueue<Vertice> pq;
		final long INF=Long.MAX_VALUE/4;
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
		}
		public long getShortestPath(int i){
			if(i!=s){
				s=i;
				Arrays.fill(d, INF);
				d[i]=0;
				pq=new PriorityQueue<Vertice>();
				pq.add(new Vertice(i,d[i]));
				while(!pq.isEmpty()){
					Vertice u=pq.poll();
					if(d[u.me]<u.cost){
						continue;//skip old vertex
					}
					for(int ii=0;ii<edges[u.me].size();ii++){
						Edge e=edges[u.me].get(ii);
						if(d[e.from]!=INF&&e.cost+d[e.from]<d[e.to]){
							d[e.to]=e.cost+d[e.from];
							pq.add(new Vertice(e.to,d[e.to]));
						}else{
						}
					}
				}
				s=i;
			}
			int sum=0;
			for(int ii=0;ii<d.length;ii++){
				if(d[ii]==INF)continue;
				sum+=d[ii];
			}
			return sum;
		}
		void addEdge(int from,int to,long cost){
			edges[from].add(new Edge(from,to,cost));
		}
	}
	class Edge{
		int from;
		int to;
		long cost;
		Edge(int i,int j,long cost){
			this.from=i;
			this.to=j;
			this.cost=cost;
		}
	}
	class Vertice implements Comparable<Vertice>{
		int me;
		long cost;
		Vertice(int me,long cost){
			this.me=me;
			this.cost=cost;
		}
		@Override
		public int compareTo(Vertice o){
			return Long.compare(this.cost, o.cost);
		}
	}
	void tr(Object...o){System.out.println(Arrays.deepToString(o));}
}