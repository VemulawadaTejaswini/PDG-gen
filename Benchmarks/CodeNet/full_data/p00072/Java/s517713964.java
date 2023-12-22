import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		sc.useDelimiter(Pattern.compile("(\\s|,)+"));
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int m = sc.nextInt();
			Edge[] es = new Edge[m];
			for(int i=0; i<m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int d = sc.nextInt() / 100 - 1;
				es[i] = new Edge(a, b, d);
			}
			Arrays.sort(es);
			UnionFind uf = new UnionFind(n);
			int cost = 0;
			for(Edge e : es) {
				if(!uf.same(e.a, e.b)) {
					uf.unite(e.a, e.b);
					cost += e.d;
				}
			}
			System.out.println(cost);
		}
	}
}
class Edge implements Comparable<Edge> {
	int a;
	int b;
	int d;
	Edge(int _a, int _b, int _d) {
		a = _a;
		b = _b;
		d = _d;
	}

	@Override
	public int compareTo(Edge o)
	{
		return Integer.compare(this.d, o.d);
	}
}
class UnionFind {
	int size;
	int[] pars;

	UnionFind(int n) {
		size = n;
		pars = new int[n];
		Arrays.fill(pars, -1);
	}

	int root(int x) {
		return pars[x]<0 ? x : (pars[x] = root(pars[x]));
	}

	boolean same(int x, int y) {
		return root(x) == root(y);
	}

	void unite(int x, int y) {
		pars[root(x)] = root(y);
	}
}
