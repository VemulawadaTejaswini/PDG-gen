import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int m = scan.nextInt();
			UnionFind uf = new UnionFind(n);
			edge[] e = new edge[m];
			for(int i = 0;i < m;i++){
				String[] str = scan.next().split(",");
				e[i] = new edge(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2])/100-1);
			}
			for(int i = 0;i < m;i++){
				for(int j = m-1;j > i;j--){
					if(e[j-1].cost > e[j].cost){
						swap(e,j,j-1);
					}
				}
			}
			int min = 0;
			for(int i = 0;i < m;i++){
				if(!uf.same(e[i].u,e[i].v)){
					uf.unite(e[i].u,e[i].v);
					min += e[i].cost;
				}
			}
			System.out.println(min);
		}
	}
	public void swap(edge[] e,int i,int j){
		edge t = e[j];e[j] = e[i];e[i] = t;
	}
	public class UnionFind{
		int[] par;
		int[] rank;
		public UnionFind(int n){
			par = new int[n];
			rank = new int[n];
			for(int i = 0;i < n;i++){
				par[i] = i;
				rank[i] = 0;
			}
		}
		public int find(int x){
			if(par[x] == x){
				return x;
			}else{
				return par[x] = find(par[x]);
			}
		}
		public void unite(int x,int y){
			x = find(x);
			y = find(y);
			if(x == y){
				return;
			}
			if(rank[x] < rank[y]){
				par[x] = y;
			}else{
				par[y] = x;
				if(rank[x] == rank[y]){
					rank[x]++;
				}
			}
		}
		public boolean same(int x,int y){
			return find(x) == find(y);
		}
	}
	public class edge{
		int u;
		int v;
		int cost;
		public edge(int u,int v,int cost){
			this.u = u;
			this.v = v;
			this.cost = cost;
		}
	}
}