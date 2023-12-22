import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK=8*1024*1024;
		new Thread(null, new AOJ0180(), "RUN!", STACK).start();
	}
	
	class AOJ0180 implements Runnable{
		AOJ0180(){}
		@Override public void run(){
			while(sc.hasNext()){
				int N=sc.nextInt(),E=sc.nextInt();
				if((N|E)==0)	break;
				solve(N,E);
			}
		}
		void solve(int N,int E){
			int[][] g=new int[N][N];
			for(int i=0; i<N; i++)for(int j=0; j<N; j++)g[i][j]=1<<29;
			for(int i=0; i<E; i++){
				int u=sc.nextInt(),v=sc.nextInt(),c=sc.nextInt();
				g[u][v]=c;
				g[v][u]=c;
			}
			//System.out.println(prim(g,N));
			System.out.println(new kruskal(g,N).solve());
		}
		
		class kruskal{
			ArrayList<Edge> es;
			int E,N;
			final int INF=1<<29;
			kruskal(int[][] g,int N){
				this.N=N;
				es=new ArrayList<kruskal.Edge>();
				for(int i=0; i<N; i++){
					for(int j=0; j<N; j++){
						if(-1*INF<g[i][j] && g[i][j]<INF)	es.add(new Edge(i,j,g[i][j]));
					}
				}
				this.E=es.size();
			}
			int solve(){
				Collections.sort(es);
				UnionFind uf=new UnionFind(N);
				int ret=0;
				for(int i=0; i<E; i++){
					Edge e=es.get(i);
					if(!uf.isSame(e.u, e.v)){
						uf.unite(e.u, e.v);
						ret+=e.cost;
					}
				}
				return ret;
			}
			class Edge implements Comparable<Edge>{
				int u,v,cost;
				Edge(int u,int v,int cost){
					this.u=u;	this.v=v;	this.cost=cost;
				}
				@Override public int compareTo(Edge e){
					return this.cost-e.cost;
				}
			}
		}
		
		class UnionFind{
			int[] par,rank;
			UnionFind(int n){
				par=new int[n];
				rank=new int[n];
				for(int i=0; i<n; i++){
					par[i]=i;
					rank[i]=0;
				}
			}
			
			// 木の根を求める
			int find(int x){
				if(par[x]==x)	return x;
				else			return par[x]=find(par[x]);
			}
			
			// xとyの属する集合を併合
			void unite(int x,int y){
				x=find(x);
				y=find(y);
				if(x==y)	return;
				
				if(rank[x]<rank[y]){
					par[x]=y;
				}else{
					par[y]=x;
					if(rank[x]==rank[y])	++rank[x];
				}
			}
			
			// xとyが同じ集合に属するか否か
			boolean isSame(int x,int y){
				return find(x)==find(y);
			}
		}
		
		int prim(int[][] g,int N){
			final int INF=1<<29;
			int[] mincost=new int[N];
			boolean[] used=new boolean[N];
			for(int i=0; i<N; i++)	mincost[i]=INF;
			
			mincost[0]=0;
			int ret=0;
			
			while(true){
				int v=-1;
				for(int u=0; u<N; u++){
					if(!used[u] && (v==-1 || mincost[u] < mincost[v]))	v=u;
				}
				if(v < 0)	break;
				used[v]=true;
				ret+=mincost[v];
				
				for(int u=0; u<N; u++)	mincost[u]=min(mincost[u], g[v][u]);
			}
			return ret;
		}
	}
}