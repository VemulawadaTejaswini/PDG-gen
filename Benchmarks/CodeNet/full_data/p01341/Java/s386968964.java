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
		int n=sc.nextInt();//the number of piles
		int m=sc.nextInt();//the number of fences
		double[] x=new double[n];
		double[] y=new double[n];
		double sum=0;
		for(int i=0;i<n;i++){
			x[i]=sc.nextDouble();
			y[i]=sc.nextDouble();
		}
		Kruskal kl=new Kruskal(n);
		for(int i=0;i<m;i++){
			int from=sc.nextInt()-1;
			int to=sc.nextInt()-1;
			double d=Math.sqrt((x[from]-x[to])*(x[from]-x[to])+(y[from]-y[to])*(y[from]-y[to]));
			kl.addEdge(from, to, d);
			kl.addEdge(from, to, d);
//			tr(from,to,d);
			sum+=d;
		}
		double total=kl.get_minimum_spanning_tree();
		System.out.println(sum-total);
	}

	class Kruskal{
		int n;//the number of vertices
		double weight_sum=-1;
		List<Edge>[] edges;//adjacency list
		PriorityQueue<Edge> pq;
		Kruskal(int n){
			this.n=n;
//			edges=new List[n];
//			for(int i=0;i<n;i++){
//				edges[i]=new ArrayList<Edge>();
//			}
			pq=new PriorityQueue<Edge>();
		}

		double get_minimum_spanning_tree(){
			DJSet ds=new DJSet(n);
			weight_sum=0;
			while(!pq.isEmpty()){
				Edge e=pq.poll();
				if(ds.same(e.from, e.to))continue;
				weight_sum+=e.cost;
				ds.setUnion(e.from, e.to);
			}
//			if(ds.size(0)!=n)return -1;
return weight_sum;
		}
		void addEdge(int from,int to,double cost){
//			edges[from].add(new Edge(from,to,cost));
			pq.add(new Edge(from,to,cost));
		}
	}

	class Edge implements Comparable<Edge>{
		int from;
		int to;
		double cost;
		Edge(int from,int to,double cost){
			this.from=from;
			this.to=to;
			this.cost=cost;
		}
		public int compareTo(Edge o){
			return this.cost>o.cost?-1:this.cost<o.cost?1:0;
		}
	}
	class DJSet{
		int n;//the number of vertices
		int[] d;
		DJSet(int n){
			this.n=n;
			d=new int[n];
			Arrays.fill(d, -1);
		}
		int root(int x){
			return d[x]<0?x:root(d[x]);
		}
		boolean setUnion(int x,int y){
			x=root(x);
			y=root(y);
			if(x!=y){
				if(x<y){
					int d=x;
					x=y;
					y=d;
				}
				//x>y
				d[y]+=d[x];
				d[x]=y;
			}
			return x!=y;
		}
		boolean same(int x,int y){
			return root(x)==root(y);
		}
		int size(int x){
			return d[root(x)]*(-1);
		}
	}


	void tr(Object...objects){System.out.println(Arrays.deepToString(objects));}
}