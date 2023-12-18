import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		UnionFind uf = new UnionFind(n);
		int[] friend = new int[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			uf.unite(a, b);
			friend[a]++;
			friend[b]++;
		}
		int[][] hate = new int[k][2];
		for (int i = 0; i < k; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			hate[i][0] = a;
			hate[i][1] = b;
		}
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = uf.amount(i)-friend[i];
		}
		for (int i = 0; i < k; i++) {
			if(uf.same(hate[i][0],hate[i][1])) {
				ans[hate[i][0]]--;
				ans[hate[i][1]]--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ",ans[i]-1);
		}sc.close();
	}	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
	public static class UnionFind {
		int par[]; int rank[]; int size[]; int count;
		public UnionFind(int n) {
			this.par = new int[n];
			this.rank = new int[n];
			this.size = new int[n];
			this.count = n;
			for(int i = 0; i < n; i++) {
				par[i] = i; rank[i] = 0; size[i] = 1;
			}
		}
		int find(int x) {//xの属する集合の根を探す
			if(par[x] == x) return x;
			else return par[x] = find(par[x]);
		}
		void unite(int x, int y) {//x,yの集合を合併
			x = find(x);
			y = find(y);
			if(x == y) return ;
			if(rank[x] < rank[y]) {
				par[x] = y;
				size[y] += size[x];
			}else {
				par[y] = x;
				size[x] += size[y];
				if(rank[x] == rank[y]) {
					rank[x]++;
				}
			}
			count--;
		}
		boolean same(int x, int y) {//x,yが同じ集合に属するか
			return find(x) == find(y);
		}
		int amount(int x) {//xの属する集合の要素数
			return size[find(x)];
		}
		int count() {//集合の数
			return count;
		}
	}
}