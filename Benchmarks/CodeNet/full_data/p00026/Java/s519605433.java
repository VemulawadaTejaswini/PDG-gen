
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class V00026 {

	private static BufferedReader br;
	private static int[][] squares;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		squares = new int[10][10];
	}

	public static void main(String[] args) throws IOException {

		String line;
		int x, y, size, blind = 100, max = 0;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line, ",");

			while (st.hasMoreTokens()) {
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				size = Integer.parseInt(st.nextToken());

				squares[x][y]++;
				switch (size) {
				case 1:
					set1(x, y);
					break;
				case 2:
					set1(x, y);
					set2(x, y);
					break;
				case 3:
					set1(x, y);
					set2(x, y);
					set3(x, y);
				default:
					break;
				}
			}
		}
		for (int[] square : squares) {
			for (int value : square) {
				if (value != 0) {
					blind--;
				}
				if (max < value) {
					max = value;
				}
			}
		}
		System.out.println(blind + "\n" + max);
	}

	private static void set1(int x, int y) {
		if (x > 0) {
			squares[x - 1][y]++;
		}
		if (x < 9) {
			squares[x + 1][y]++;
		}
		if (y > 0) {
			squares[x][y - 1]++;
		}
		if (y < 9) {
			squares[x][y + 1]++;
		}
	}

	private static void set2(int x, int y) {
		if (x > 0 && y > 0) {
			squares[x - 1][y - 1]++;
		}
		if (x > 0 && y < 9) {
			squares[x - 1][y + 1]++;
		}
		if (x < 9 && y > 0) {
			squares[x + 1][y - 1]++;
		}
		if (x < 9 && y < 10) {
			squares[x + 1][y + 1]++;
		}
	}

	private static void set3(int x, int y) {
		if (x - 1 > 0) {
			squares[x - 2][y]++;
		}
		if (x + 1 < 9) {
			squares[x + 2][y]++;
		}
		if (y - 1 > 0) {
			squares[x][y - 2]++;
		}
		if (y + 1 < 9) {
			squares[x][y + 2]++;
		}
	}
}