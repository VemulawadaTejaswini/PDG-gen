import java.util.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		new AOJ2161();
	}
	class AOJ2161{
		AOJ2161(){
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				solve();
			}
		}
		int N,M;
		class Edge implements Comparable<Edge>{
			int f,t;
			double w;
			Edge(int f,int t,double w){
				this.f=f;	this.t=t;	this.w=w;
			}
			@Override public int compareTo(Edge o){
				if(this.w<o.w)	return -1;
				if(this.w>o.w)	return 1;
				return 0;
			}
		}
		void solve(){
			int[] x=new int[N],y=new int[N],s=new int[N];
			for(int i=0; i<N; ++i){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
				s[i]=sc.nextInt();
			}
			ArrayList<Edge> es=new ArrayList<Edge>(N*M);
			// 0~N-1, N~N+N-1
			for(int i=0; i<M; ++i){
				int xx=sc.nextInt(),yy=sc.nextInt();
				for(int j=0; j<N; ++j){
					int a=x[j]-xx, b=y[j]-yy;
					es.add(new Edge(j, N+i, sqrt(a*a+b*b)/s[j]));
				}
			}
			Collections.sort(es);
			G=new ArrayList<ArrayList<Integer>>(N+M);
			for(int i=0; i<N+M; ++i)	G.add(new ArrayList<Integer>());
			double ans=0.0;
			for(Edge e:es){
				ans=e.w;
				G.get(e.f).add(e.t);
				G.get(e.t).add(e.f);
				int ret=bipartiteMatching(G, N+M);
//				System.out.println(ret+" "+ans);
				if(ret>=M)	break;
			}
			System.out.printf("%.8f\n", ans);
		}
		int[] match;
		boolean[] used;
		ArrayList<ArrayList<Integer>> G;
		int bipartiteMatching(ArrayList<ArrayList<Integer>> G,int V){
			this.G=G;
			match=new int[V];
			Arrays.fill(match, -1);
			used=new boolean[V];
			int ret=0;
			for(int v=0; v<V; ++v){
				if(match[v]<0){
					Arrays.fill(used, false);
					if(dfs(v))	++ret;
				}
			}
			return ret;
		}
		boolean dfs(int v){
			used[v]=true;
			for(int u: G.get(v)){
				int w=match[u];
				if(w<0 || !used[w] && dfs(w)){
					match[v]=u;
					match[u]=v;
					return true;
				}
			}
			return false;
		}
	}

}