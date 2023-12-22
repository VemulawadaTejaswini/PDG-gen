import java.util.Scanner;

public class Main {
	private static int W,H;
	private static int[][] c;
	private static boolean[][] seen;

	private static int[] dh = {1, -1, 0, 0, 1, -1, 1, -1};
	private static int[] dw = {0, 0, 1, -1, 1, 1, -1, -1};

	private static void dfs(int[][] c, int h, int w) {
		// c(h,w)を探索済みとする
		seen[h][w] = true;
		int nextH, nextW;
		// 8方向を探索する
		for(int i = 0; i < 8; i++) {
			nextH = h + dh[i];
			nextW = w + dw[i];
			// 領域外である場合、探索しない
			if(nextH < 0 || nextW < 0 || nextH >= H || nextW >= W) {
				continue;
			}
			// 海である場合、探索しない
			if(c[nextH][nextW] == 0) {
				continue;
			}
			// 探索済みである場合、探索しない
			if(seen[nextH][nextW]) {
				continue;
			}
			dfs(c, nextH, nextW);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		W = scan.nextInt();
		H = scan.nextInt();

		while(!(W == 0 && H == 0)) {
			c = new int[H][W];
			seen = new boolean[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					c[i][j] = scan.nextInt();

					// 全ての領域を未探索状態にする
					seen[i][j] = false;
				}
			}

			int count = 0;
			// 全ての領域を探索する
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					// 探索済みであるまたは海である場合、探索は行わない
					if(!seen[i][j] && c[i][j] == 1) {
						dfs(c, i, j);
						count++;
					}
				}
			}
			System.out.println(count);
			W = scan.nextInt();
			H = scan.nextInt();
		}
		scan.close();

	}
}

