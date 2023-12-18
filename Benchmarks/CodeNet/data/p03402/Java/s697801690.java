import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int h = 50;
		final int w = 100;

		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();

		char[][] grid = new char[h][];
		for (int i = 0; i < (h / 2); i++) {
			grid[i] = new char[w];
			Arrays.fill(grid[i], '.');
		}
		for (int i = (h / 2); i < h; i++) {
			grid[i] = new char[w];
			Arrays.fill(grid[i], '#');
		}

		int count = 1;
		int y = (h / 2) + 1;
		int x = (y % 3) + 1;
		while (count < a) {
			grid[y][x] = '.';
			count++;

			x += 3;
			if (x >= (w - 1)) {
				y++;
				x = (y % 3) + 1;
			}
		}

		count = 1;
		y = 1;
		x = (y % 3) + 1;
		while (count < b) {
			grid[y][x] = '#';
			count++;

			x += 3;
			if (x >= (w - 1)) {
				y++;
				x = (y % 3) + 1;
			}
		}

		System.out.println(h + " " + w);
		for (int i = 0; i < h; i++) {
			System.out.println(new String(grid[i]));
		}
	}

}
