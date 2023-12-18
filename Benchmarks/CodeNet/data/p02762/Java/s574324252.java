
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int rank[];
	int p[];
	Map<Integer, HashSet<Integer>> f = new HashMap<Integer, HashSet<Integer>>();
	Map<Integer, HashSet<Integer>> b = new HashMap<Integer, HashSet<Integer>>();
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		init(n);
		for(int i=1; i<=n; i++) {
			f.put(i, new HashSet<Integer>());
			b.put(i, new HashSet<Integer>());
		}

		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(!same(a,b)) {
				unite(a,b);
			}
			f.get(a).add(b);
			f.get(b).add(a);
		}

		for(int i=0; i<k; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			b.get(c).add(d);
			b.get(d).add(c);
		}

		for(int i=1; i<=n; i++) {
			int cnt=0;
			for(int j=1; j<=n; j++) {
				if(i==j) continue;
				if(same(i,j) && !f.get(i).contains(j) && !b.get(i).contains(j)) {
					cnt++;
				}
			}
			if(i>1)System.out.print(" ");
			System.out.print(cnt);
		}
		System.out.println();
		sc.close();
	}


	private void init(int n) {
		rank = new int[n+1];
		p = new int[n+1];
		for(int i=0; i<=n; i++) {
			rank[i]=0;
			p[i]=i;
		}
	}
	private void unite(int x, int y) {
		link(find(x), find(y));
	}

	private void link(int x, int y) {
		if(rank[x] > rank[y]) {
			p[y]=x;
		}else {
			p[x]=y;
			if(rank[x]==rank[y]) {
				rank[y]++;
			}
		}
	}

	private boolean same(int x, int y) {
		return find(x) == find(y);
	}

	private int find(int x) {
		if(x != p[x]) {
			p[x] = find(p[x]);
		}
		return p[x];
	}
}
