import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		Cell[][] cells = new Cell[H][W];
		for (int y = 0; y < H; y++) {
			char[] w = sc.next().toCharArray();
			for (int x = 0; x < W; x++) {
				cells[y][x] = new Cell();
				if (w[x] == '#') {
					cells[y][x].obs = true;
				}
			}
		}
		sc.close();

		// x方向に操作
		for (int y = 0; y < H; y++) {
			int s = 0;
			for (int x = 0; x < W; x++) {
				if (cells[y][x].obs) {
					s = 0;
					continue;
				}
				s++;
				cells[y][x].xs = s;
			}
			for (int x = W - 2; x >= 0; x--) {
				if (cells[y][x + 1].xs > cells[y][x].xs) {
					cells[y][x].xs = cells[y][x + 1].xs;
				}
			}
		}

		// y方向に操作
		for (int x = 0; x < W; x++) {
			int s = 0;
			for (int y = 0; y < H; y++) {
				if (cells[y][x].obs) {
					s = 0;
					continue;
				}
				s++;
				cells[y][x].ys = s;
			}
			for (int y = H - 2; y >= 0; y--) {
				if (cells[y + 1][x].ys > cells[y][x].ys) {
					cells[y][x].ys = cells[y + 1][x].ys;
				}
			}
		}

		int ans = 0;
		for (int x = 0; x < W; x++) {
			for (int y = 0; y < H; y++) {
				ans = Math.max(ans, cells[y][x].xs + cells[y][x].ys - 1);
			}
		}
		System.out.println(ans);
	}

	public static class Cell {
		int xs = 0;
		int ys = 0;
		boolean obs = false;
	}

}