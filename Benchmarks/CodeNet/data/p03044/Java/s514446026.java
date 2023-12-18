import java.util.*;
public class Main {

	public static class unionfind{
		int[] parent;
		int[] rank;
		public unionfind(int n){
			this.parent = new int[n+1];
			this.rank = new int[n+1];
			for(int i = 1; i <= n; i++)
				set(i);
		}
		public void set(int i) {
			parent[i] = i;
			rank[i] = 0;
		}
		public int find(int i) {
			if (i == parent[i])
				return parent[i];
			else
				return parent[i] = find(parent[i]);
			
		}
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		public void unite(int x, int y) {
			int xroot = find(x);
			int yroot = find(y);
			if(xroot == yroot)
				return;
			if(rank[xroot] > rank[yroot])
				parent[yroot] = xroot;
			else if(rank[xroot] < rank[yroot])
				parent[xroot] = yroot;
			else {
				parent[yroot] = xroot;
				rank[xroot]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		unionfind ut = new unionfind(N);
		for(int i = 0; i < N-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			if(w % 2 == 0)
				ut.unite(u, v);
		}
		for(int i = 1; i <= N; i++) {
			if(ut.same(i, 1))
				System.out.println(0);
			else
				System.out.println(1);
		}
	}

}