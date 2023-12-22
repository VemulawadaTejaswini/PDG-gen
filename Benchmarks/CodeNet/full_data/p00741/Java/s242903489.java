import java.util.Scanner;

public class Main {
	int w, h;
	int[][] f;

	void dfs(int x, int y) {
		if (x < 0 || w <= x || y < 0 || h <= y) {
			return ;
		}
		if (f[y][x] == 0) {
			return;
		}
		f[y][x] = 0;
		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				int nx = x + i;
				int ny = y + j;
				dfs(nx, ny);
			}
		}
	}

	public void mapDebug(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
	}


	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			f = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					f[i][j] = sc.nextInt();
				}
			}

			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (f[i][j] == 1) {
						//					System.out.println("(" + j + ", " + i + ")");
						dfs(j, i);
						ans++;
						//					mapDebug(f);
					}
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}