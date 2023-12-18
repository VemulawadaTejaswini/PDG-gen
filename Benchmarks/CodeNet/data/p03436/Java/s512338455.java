import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inH = stdin.nextInt();
		int inW = stdin.nextInt();

		char[][] grid = new char[inH][];
		int white = 0;
		for (int h = 0; h < inH; h++) {
			grid[h] = stdin.next().toCharArray();
			for (int w = 0; w < inW; w++) {
				if (grid[h][w] == '.') {
					white++;
				}
			}
		}

		int[][] act = new int[inH][inW];
		int updateCount = 0;
		while ((act[0][0] == 0) && (updateCount < (inH * inW))) {
			act = getNextAct(act, grid, inH, inW);
			updateCount++;
		}

		if (updateCount == (inH * inW)) {
			System.out.println(-1);
			return;
		}

		int moveCount = 1;
		int h = 0;
		int w = 0;

		while ((h != (inH - 1)) || (w != (inW - 1))) {
			int nextH = h;
			int nextW = w;
			int max = act[h][w];

			if (((h - 1) >= 0) && (act[h - 1][w] > max)) {
				max = act[h - 1][w];
				nextH = h - 1;
				nextW = w;
			}
			if (((h + 1) < act.length) && (act[h + 1][w] > max)) {
				max = act[h + 1][w];
				nextH = h + 1;
				nextW = w;
			}
			if (((w - 1) >= 0) && (act[h][w - 1] > max)) {
				max = act[h][w - 1];
				nextH = h;
				nextW = w - 1;
			}
			if (((w + 1) < act[h].length) && (act[h][w + 1] > max)) {
				max = act[h][w + 1];
				nextH = h;
				nextW = w + 1;
			}

			h = nextH;
			w = nextW;
			moveCount++;
		}

		System.out.println(white - moveCount);
	}

	private static int[][] getNextAct(int[][] act, char[][] grid, int sizeH, int sizeW) {
		int[][] next = new int[sizeH][sizeW];
		for (int h = 0; h < sizeH; h++) {
			for (int w = 0; w < sizeW; w++) {
				next[h][w] = getUpdateAct(act, grid, sizeH, sizeW, h, w);
			}
		}

		return next;
	}

	private static int getUpdateAct(int[][] act, char[][] grid, int sizeH, int sizeW, int h, int w) {
		if ((h == (sizeH - 1)) && (w == (sizeW - 1))) {
			return act[h][w] + 1;
		}
		else if (grid[h][w] == '#') {
			return -1;
		}

		int max = act[h][w];
		if ((h - 1) >= 0) {
			max = Math.max(max, act[h - 1][w]);
		}
		if ((h + 1) < sizeH) {
			max = Math.max(max, act[h + 1][w]);
		}
		if ((w - 1) >= 0) {
			max = Math.max(max, act[h][w - 1]);
		}
		if ((w + 1) < sizeW) {
			max = Math.max(max, act[h][w + 1]);
		}

		return max;
	}
}
