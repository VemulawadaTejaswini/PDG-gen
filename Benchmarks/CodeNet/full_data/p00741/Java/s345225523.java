import java.util.Scanner;

public class Main {

	static int[][] table;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int w = 0;
			int h = 0;
			int count = 0;

			w = scan.nextInt();
			h = scan.nextInt();

			if (w == 0 && h == 0)
				break;

			table = new int[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					table[i][j] = scan.nextInt();
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (table[i][j] == 1)
						count += check(table, w, h, i, j);
				}
			}
			System.out.println(count);
		}

		scan.close();
	}

	public static int check(int table[][], int w, int h, int a, int b) {
		table[a][b] = 0;

		if (a != 0 && b != 0) {
			if (table[a - 1][b - 1] != 0) {
				check(table, w, h, a - 1, b - 1);
			}
		}
		if (a != 0) {
			if (table[a - 1][b] != 0) {
				check(table, w, h, a - 1, b);
			}
		}
		if (b != 0) {
			if (table[a][b - 1] != 0) {
				check(table, w, h, a, b - 1);
			}
		}
		if (a != 0 && b != (w - 1)) {
			if (table[a - 1][b + 1] != 0) {
				check(table, w, h, a - 1, b + 1);
			}
		}
		if (a != (h - 1) && b != 0) {
			if (table[a + 1][b - 1] != 0) {
				check(table, w, h, a + 1, b - 1);
			}
		}
		if (a != (h - 1) && b != (w - 1)) {
			if (table[a + 1][b + 1] != 0) {
				check(table, w, h, a + 1, b + 1);
			}
		}
		if (a != (h - 1)) {
			if (table[a + 1][b] != 0) {
				check(table, w, h, a + 1, b);
			}
		}
		if (b != (w - 1)) {
			if (table[a][b + 1] != 0) {
				check(table, w, h, a, b + 1);
			}
		}
		return 1;
	}

}