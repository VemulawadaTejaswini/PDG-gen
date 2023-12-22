import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	class UnionFind{
		int[] pars;
		UnionFind(int n){
			pars = new int[n];
			for(int i=0; i<n; i++)
				pars[i] = i;
		}
		int getRoot(int x){
			return x==pars[x]?x:(pars[x] = getRoot(pars[x]));
		}
		boolean isSame(int x, int y){
			return getRoot(x) == getRoot(y);
		}
		void merge(int x, int y){
			pars[getRoot(x)] = getRoot(y);
		}
	}

	class Edge{
		int dist, e1, e2;
		Edge(int _e1, int _e2, int _d){
			this.dist = _d;
			this.e1 = _e1;
			this.e2 = _e2;
		}
	}

	class Cmp implements Comparator<Edge>{
		public int compare(Edge a, Edge b){
			return (a.dist < b.dist)?-1:(a.dist > b.dist)?1:0;
		}
	}

	Edge[] edges;
	int N, M;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			M = in.nextInt();
			if(N==0 && M==0) return ;
			edges = new Edge[M];
			for(int i=0; i<M; i++){
				edges[i] = new Edge(in.nextInt()-1, in.nextInt()-1, in.nextInt());
			}
			System.out.println(solve());
		}
	}

	int solve(){
		int ans = Integer.MAX_VALUE;
		sort(edges, new Cmp());
		for(int i=0; i<M; i++){
			int mi = edges[i].dist, ma = 0, cnt=0;
			UnionFind uf = new UnionFind(N);
			for(int j=i; j<M; j++){
				if(!uf.isSame(edges[j].e1, edges[j].e2)){
					uf.merge(edges[j].e1, edges[j].e2);
					if(++cnt == N-1){
						ma = edges[j].dist;
						break;
					}
				}
			}
			if(cnt==N-1){
				ans = min(ans, ma - mi);
			}
			else{
				break;
			}
		}
		return ans==Integer.MAX_VALUE?-1:ans;
	}

	public static void main(String args[]){
		new Main().run();
	}
}