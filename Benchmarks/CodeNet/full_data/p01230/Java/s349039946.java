import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(solve());
	}
	@SuppressWarnings("unchecked")
	static boolean solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int z = sc.nextInt();
		if (n == 0) {
			return false;
		}
		ArrayList<Edge>[] g = new ArrayList[n];
		for(int i=0;i<n;i++) {
			g[i] = new ArrayList<Edge>();
		}
		int m2 = m * 2 + 1;
		Edge[] e = new Edge[m2];
		for(int i=0;i<m;i++) {
			int s = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			e[i*2] = new Edge(s,d,i*2);
			g[s].add(e[i*2]);
			e[i*2+1] = new Edge(d,s,i*2+1);
			g[d].add(e[i*2+1]);
		}
		e[m*2] = new Edge(-1, 0, m*2);
		int[][] a = new int[m2][m2];
		for(int i=0;i<m2;i++) {
			for(Edge ee:g[e[i].to]) {
				if (ee.to == e[i].from) {
					continue;
				}
				a[i][ee.id] = 1;
			}
		}
//		System.out.println(Arrays.deepToString(a));
		int[][] x = new int[m2][m2];
		for(int i=0;i<m2;i++) {
			x[i][i] = 1;
		}
		while(z > 0) {
			if (z % 2 == 1) {
				x = mul(x,a);
			}
			a = mul(a,a);
			z /= 2;
		}
		boolean ans = false;
		for(int i=0;i<m*2;i++) {
			if (x[m*2][i] == 1 && e[i].to == n-1) {
				ans = true;
			}
		}
//		System.out.println(Arrays.deepToString(x));
		System.out.println(ans ? "yes" : "no");
		return true;
	}
	static int[][] mul(int[][] a,int[][] b) {
		int n = a.length;
		int[][] c = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					c[i][j] |= a[i][k] & b[k][j];
				}
			}
		}
		return c;
	}
}
class Edge {
	int from,to,id;
	public Edge(int from,int to,int id) {
		this.from = from;
		this.to = to;
		this.id = id;
	}
}