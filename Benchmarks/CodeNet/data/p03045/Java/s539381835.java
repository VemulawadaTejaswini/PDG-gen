import java.util.*;
public class Main {

	public static class unionfind{
		int[] parent;
		int[] rank;
		int[] size;
		public unionfind(int n){
			this.parent = new int[n+1];
			this.rank = new int[n+1];
			this.size = new int[n+1];
			for(int i = 1; i <= n; i++) set(i);
		}
		public void set(int i) {
			parent[i] = i;
			rank[i] = 0;
			size[i] = 1;
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
			if(rank[xroot] > rank[yroot]) {
				parent[yroot] = xroot;
				size[xroot] += size[yroot];
			}
			else if(rank[xroot] < rank[yroot]) {
				parent[xroot] = yroot;
				size[yroot] += size[xroot];
			}
			else {
				parent[yroot] = xroot;
				size[xroot] += size[yroot];
				rank[xroot]++;
			}
		}
		public int getsize(int i) {
			return size[find(i)];
		}
		public int groupnum() {
			Set<Integer> parents = new HashSet<>();
			for(int i = 1; i < this.parent.length; i++)
				parents.add(find(i));
			return parents.size();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		unionfind u = new unionfind(N);
		int ans = 0;
		for(int i = 0; i < M; i++) {
			u.unite(sc.nextInt(), sc.nextInt());
			sc.nextInt();
		}
		System.out.println(u.groupnum());

	}

}