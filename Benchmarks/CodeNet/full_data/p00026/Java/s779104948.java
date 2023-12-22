import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int ink[][] = new int[10][10];
	private static String line[] = new String[3];
	private static int clearCells = 0;
	private static int mostDeepCell = 0;

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String str = br.readLine();
		while (str != null || !str.equals("")) {

			line = str.split(",", 3);

			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			int size = Integer.parseInt(line[2]);

			if (size == 1) {
				small(x, y);
			}

			if (size == 2) {
				medium(x, y);
			}

			if (size == 3) {
				large(x, y);
			}
			for (int i = 0; i < 10; ++i) {
				for (int j = 0; j < 10; ++j) {

					if (ink[i][j] == 0) {
						clearCells++;
					}

					if (mostDeepCell < ink[i][j]) {
						mostDeepCell = ink[i][j];
					}
				}
			}

			System.out.println(clearCells);
			System.out.println(mostDeepCell);

		}
	}

	private static void small(int x, int y) {

		ink[x][y]++;

		if (0 <= x - 1) {
			ink[x - 1][y]++;
		}

		if (x + 1 < 10) {
			ink[x + 1][y]++;
		}

		if (0 <= y - 1) {
			ink[x][y - 1]++;
		}

		if (y + 1 < 10) {
			ink[x][y + 1]++;
		}
	}

	private static void medium(int x, int y) {

		small(x, y);

		if (0 <= x - 1 && 0 <= y - 1) {
			ink[x - 1][y - 1]++;
		}

		if (0 <= x - 1 && y + 1 < 10) {
			ink[x - 1][y + 1]++;
		}

		if (x + 1 < 10 && 0 <= y - 1) {
			ink[x + 1][y - 1]++;
		}

		if (x + 1 < 10 && y + 1 < 10) {
			ink[x + 1][y + 1]++;
		}
	}

	private static void large(int x, int y) {

		medium(x, y);

		if (x + 2 < 10) {
			ink[x + 2][y]++;
		}

		if (0 <= x - 2) {
			ink[x - 2][y]++;
		}

		if (y + 2 < 10) {
			ink[x][y + 2]++;
		}

		if (0 <= y - 2) {
			ink[x][y - 2]++;
		}
	}
}