import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	static int n;
	static int[][]M;	// 隣接行列
	static int[]color;	// 頂点の訪問状況
	static int[]d;		// d[v]: vを最初に訪問した発見時刻
	static int[]f;		// f[v]: vの隣接リストを調べ終えた完了時刻
	static int tt = 0;		// 時刻
	static int nt[];	// nt[u]: uに隣接する頂点
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		M = new int[n][n];
		color = new int[n];
		d = new int[n];
		f = new int[n];
		nt = new int[n];
		for(int i = 0; i < n; i++) {
			int u = scan.nextInt() - 1;
			int k = scan.nextInt();
			for(int j = 0; j < k; j++) {
				M[u][scan.nextInt() - 1] = 1;
			}
		}
		scan.close();

		dfs();
	}
	// uに隣接するvを番号順に取得
	static int next(int u) {
		for(int v = nt[u]; v < n; v++) {
			nt[u] = v + 1;
			if(M[u][v] == 1) return v;
		}
		return -1;
	}
	// スタックを用いた深さ優先探索
	static void dfsVisit(int r) {
		Arrays.fill(nt, 0);
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(r);
		color[r] = 1;
		d[r] = ++tt;

		while(!stack.isEmpty()) {
			int u = stack.peek();
			int v = next(u);
			if(v != -1) {
				if(color[v] == 0) {
					color[v] = 1;
					d[v] = ++tt;
					stack.push(v);
				}
			}else {
				stack.pop();
				color[u] = 2;
				f[u] = ++tt;
			}
		}
	}
	static void dfs() {
		// 未訪問のuを始点として深さ優先探索
		for(int u = 0; u < n; u++) {
			if(color[u] == 0) {
				dfsVisit(u);
			}
		}
		for(int i = 0; i < n; i++) {
			int u = i + 1;
			System.out.println(u + " " + d[i] + " " + f[i]);
		}
	}
}
