import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static final int N = 100;
	public static final int WHITE = 0;
	public static final int GRAY = 1;
	public static final int BLACK = 2;

	static int n;
	static int tt;

	// グラフを示す二次元行列
	static int[][] M = new int[N][N];
	static int[] color = new int[N], d = new int[N], f = new int[N], nt = new int[N];

	public static void main(String[] args) throws IOException {

		int u,k,v;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			u = sc.nextInt();
			k = sc.nextInt();
			u--;
			for (int j = 0; j < k; j++) {
				v = sc.nextInt();
				v--;
				M[u][v] = 1;
			}
		}
		dfs();
	}

	// uに隣接するvを番号順に取得
	private static int next (int u) {
		for (int v = nt[u]; v < n; v++) {
			nt[u] = v + 1;
			if (M[u][v] == 1) {
				return v;
			}
		}
		return -1;
	}

	// スタックを用いた深さ優先探索
	private static void dfsVisit(int r) {

		Stack<Integer> S = new Stack<Integer>();
		S.push(r);
		color[r] = GRAY;
		d[r] = ++tt;

		while (!S.empty()) {
			int u = S.peek();
			int v = next(u);
			if (v != -1) {
				if (color[v] == WHITE) {
					color[v] = GRAY;
					d[v] = ++tt;
					S.push(v);
				}
			} else {
				S.pop();
				color[u] = BLACK;
				f[u] = ++tt;
			}
		}
	}

	private static void dfs() {
		Arrays.fill(color, WHITE);

		// 未訪問のuを始点として深さ優先探索
		for (int u = 0; u < n; u++) {
			if (color[u] == WHITE) dfsVisit(u);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(i+1 +" "+ d[i] + " " + f[i]);
		}
	}


}
