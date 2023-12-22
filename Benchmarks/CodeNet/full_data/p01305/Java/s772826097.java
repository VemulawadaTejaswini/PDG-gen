import java.util.Scanner;

//Card Game
public class Main {

	int[] g, j;
	boolean[] u;
	int res;

	void dfs(int k, int pa, int pb) {
		int p, q;
		if (k == 9) {
			if (pb < pa) {
				res++;
			}
			return;
		}
		for (int i = 0; i < 9; i++) {
			if (!u[i]) {
				u[i] = true;
				if (j[k] < g[i]) {
					p = g[i] + j[k];
				} else {
					p = 0;
				}
				if (j[k] < g[i]) {
					q = 0;
				} else {
					q = g[i] + j[k];
				}
				dfs(k + 1, pa + p, pb + q);
				u[i] = false;
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- != 0) {
			g = new int[9];
			j = new int[9];
			u = new boolean[9];
			for (int i = 0; i < 9; i++)
				g[i] = sc.nextInt();
			for (int i = 0; i < 9; i++)
				j[i] = sc.nextInt();
			res = 0;
			dfs(0, 0, 0);
			double x = res * 1.0 / 362880;
			System.out.printf("%.5f %.5f\n", x, 1 - x);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}