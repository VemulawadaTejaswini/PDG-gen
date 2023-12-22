import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int w = 1;
			int h = 1;
			int moveCan = 0;

			w = scan.nextInt();
			h = scan.nextInt();

			if (w == 0 && h == 0)
				break;

			char[][] table = new char[h][w];
			// int[][] num = new int[h][w];

			for (int i = 0; i < h; i++) {
				// for (int j = 0; j < w; j++) {
				table[i]/* [j] */= scan.next().toCharArray();
				// }
			}

			moveCan = AtCheck(table, w, h);
			System.out.println(moveCan);
		}

		scan.close();
	}

	public static int AtCheck(char table[][], int w, int h) {
		int befAtNum = 0;
		int aftAtNum = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (table[i][j] == '@')
					befAtNum++;
			}
		}

		int[][] atPlace = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (table[i][j] == '@') {
					atPlace[i][j] = 1;
					// if (i != (h - 1) && j != (w - 1) && i != 0 && j != 0
					// && table[i - 1][j - 1]=='.')
					// atPlace[i - 1][j - 1] = 1;
					if (j != 0 && table[i][j - 1] == '.')
						atPlace[i][j - 1] = 1;
					// if (i != (h - 1) && j != (w - 1) && i != 0 && j != 0
					// && table[i + 1][j - 1]=='.')
					// atPlace[i + 1][j - 1] = 1;
					if (i != 0 && table[i - 1][j] == '.')
						atPlace[i - 1][j] = 1;
					if (i != (h - 1) && table[i + 1][j] == '.')
						atPlace[i + 1][j] = 1;
					// if (i != (h - 1) && j != (w - 1) && i != 0 && j != 0
					// && table[i - 1][j + 1]=='.')
					// atPlace[i - 1][j + 1] = 1;
					if (j != (w - 1) && table[i][j + 1] == '.')
						atPlace[i][j + 1] = 1;
					// if (i != (h - 1) && j != (w - 1) && i != 0 && j != 0
					// && table[i + 1][j + 1]=='.')
					// atPlace[i + 1][j + 1] = 1;
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (atPlace[i][j] == 1)
					table[i][j] = '@';
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (table[i][j] == '@')
					aftAtNum++;
			}
		}
		if (befAtNum != aftAtNum) {
			return AtCheck(table, w, h);
		} else {
			return aftAtNum;
		}
	}

}