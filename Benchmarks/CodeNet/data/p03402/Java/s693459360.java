import java.util.*;

public class Main {
	int A, B; // A: whiteNum, B: blackNum
	int aCount = 0, bCount = 0;
	boolean[][] grid; // white = true, black = false
	final int W = 100, H = 100;

	private Main() {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		A = Integer.parseInt(tokens[0]);
		B = Integer.parseInt(tokens[1]);
		in.close();
		grid = new boolean[H][W];
		for (int i = 0; i < H / 2; ++i) {
			Arrays.fill(grid[i], true);
		}
		for (int i = H / 2; i < H; ++i) {
			Arrays.fill(grid[i], false);
		}
	}

	private void calc() {
		for (int i = 0; i < A - 1; ++i) {
			drawWhite(i);
		}
		for (int i = 0; i < B - 1; ++i) {
			drawBlack(i);
		}
	}

	private void drawBlack(int blackIndex) {
		int step = W / 2;
		int w = (blackIndex % step) * 2;
		int h = Math.floorDiv(blackIndex, step) * 2;
		grid[h][w] = false;
	}

	private void drawWhite(int whiteIndex) {
		int step = W / 2;
		int w = whiteIndex % step * 2;
		int h = (H - 1) - (Math.floorDiv(whiteIndex, step) * 2);
		grid[h][w] = true;
	}

	private void show() {
		System.out.println("100 100");
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				if (grid[h][w]) {
					System.out.print(".");
				} else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}
}