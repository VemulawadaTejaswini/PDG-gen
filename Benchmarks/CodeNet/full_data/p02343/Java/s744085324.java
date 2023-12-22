import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int q = sc.nextInt();
		UnionFind uf = new UnionFind(n);
		for (int i = 0;i < q;i++) {
			int c = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (c==0) {
				uf.unite(a, b);
			} else {
				if (uf.same(a, b)) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}
		}
	}
}

class UnionFind {
	int[] p;
	int[] r;
	public UnionFind(int n) {
		p = new int[n];
		r = new int[n];
		for (int i = 0;i < n;i++) p[i] = i;
		for (int i = 0;i < n;i++) r[i] = 1;
	}

	public int find(int n) {
		if (p[n]!=n) {
			p[n] = find(p[n]);
		}
		return p[n];
	}

	public void unite(int a, int b) {
		a = find(a);
		b = find(b);
		if (a==b) return;
		if (r[a]>r[b]) {
			p[a] = b;
			r[a] = r[b];
		} else if (r[a]<r[b]){
			p[b] = a;
			r[b] = r[a];
		} else {
			p[a] = b;
			r[a]++;
		}
	}

	public boolean same(int a, int b) {
		return p[a]==p[b];
	}
}