
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
				p[i]=i;
				rank[i]=1;
				cnt[i]=1;
			}
		}

		private int find(int x) {
			if(p[x] == x) return x;
			return p[x] = find(p[x]);
		}
		public boolean unite(int x, int y) {
			return link(find(x), find(y));
		}
		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
		private boolean link(int x, int y) {
			if(x==y) return false;
			if(rank[x]<rank[y]) {
				p[x]=y;
				cnt[y] += cnt[x];
			}else {
				p[y]=x;
				cnt[x] += cnt[y];
				if(rank[x]==rank[y]) {
					rank[x]++;
				}
			}
			return true;
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
		int deg[] = new int[n];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt(); a--;
			int b = sc.nextInt(); b--;
			uf.unite(a, b);
			deg[a]++;
			deg[b]++;
		}

		ArrayList<ArrayList<Integer>> to = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<n; i++) {
			to.add(new ArrayList<Integer>());
		}
		for(int i=0 ;i<k; i++) {
			int c = sc.nextInt(); c--;
			int d = sc.nextInt(); d--;
			to.get(c).add(d);
			to.get(d).add(c);
		}

		for(int i=0; i<n; i++) {
			int ans = uf.size(i) - deg[i] - 1;
			for(int j : to.get(i)) {
				if(uf.same(i, j)) {
					ans--;
				}
			}
			System.out.print(ans + (i==n-1 ? "\n" : " "));
		}
		sc.close();
	}

}
