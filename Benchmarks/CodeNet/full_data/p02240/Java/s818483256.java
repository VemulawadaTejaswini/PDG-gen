import java.util.Scanner;


class UnionFind {

	private int n;
	private int par[] = new int[114514];
	// private int sz[] = new int[114514];
	
	public UnionFind(int _n) {
		n = _n;
		for (int i = 0; i < n; i++) {
			par[i] = i;
		//	sz[i] = 1;
		}
		
	}
	
	public int find(int x) {
		if (x == par[x]) return x;
		return par[x] = find(par[x]);
	}

	public boolean same(int x, int y) {
		return (find(x) == find(y));
	}
	
	
	public void unite(int x, int y) {
		// System.out.println("x = "+x+", y = "+y);
		if (same(x, y)) return;
		par[find(x)] = y;
	}
}


public class Main implements Runnable {

	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();	
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		UnionFind uf = new UnionFind(n+100);
		
		for (int i = 0; i < m; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			uf.unite(u,v);
		}
		
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			
			if (uf.same(u,v)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}

}





