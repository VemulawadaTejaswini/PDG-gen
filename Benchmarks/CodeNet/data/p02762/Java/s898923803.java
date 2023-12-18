
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class UF{
		int p[];
		int rank[];
		int cnt[];
		public UF(int n) {
			p = new int[n];
			rank = new int[n];
			cnt = new int[n];

			for(int i=0; i<n; i++) {
				p[i] = i;
				rank[i]=1;
				cnt[i]=1;
			}
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
		}

		private int find(int x) {
			if(p[x] == x) return x;
			p[x] = find(p[x]);
			return p[x];
		}

		public void unite(int x, int y) {
			link(find(x), find(y));
		}

		private void link(int x, int y) {
			if(x==y) return;
			if(rank[x] > rank[y]) {
				p[y] = x;
				cnt[x] += cnt[y];
			}else {
				p[x] = y;
				cnt[y] += cnt[x];
				if(rank[x] == rank[y]) {
					rank[y]++;
				}
			}
		}

		public int size(int x) {
			return cnt[find(x)];
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		UF uf = new UF(n);
		int f[] = new int[n];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt(); a--;
			int b = sc.nextInt(); b--;
			uf.unite(a,b);
			f[a]++;
			f[b]++;
		}
		ArrayList<ArrayList<Integer>> blk = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<n; i++) {
			blk.add(new ArrayList<Integer>());
		}
		for(int i=0; i<k; i++) {
			int c = sc.nextInt(); c--;
			int d = sc.nextInt(); d--;
			blk.get(c).add(d);
			blk.get(d).add(c);
		}

		for(int i=0; i<n; i++) {
			int ans = uf.size(i) - f[i] - 1;
			for(int b : blk.get(i)) {
				if(uf.same(i, b)) {
					ans--;
				}
			}
			System.out.print(ans + (i==n-1 ? "\n" : " "));
		}
		sc.close();
	}

}
