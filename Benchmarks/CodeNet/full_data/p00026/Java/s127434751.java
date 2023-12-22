
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static Scanner sc;
	private static int[][] squares;

	static {
		sc = new Scanner(System.in);
		squares = new int[14][14];
	}

	public static void main(String[] args) throws IOException {

		String line;
		int x, y, size, blind = 0, max = 0;

		while ((line = sc.nextLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line, ",");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			size = Integer.parseInt(st.nextToken());
			set(x, y, size);
		}
		for (x = 2; x < 12; x++) {
			for (y = 2; y < 12; y++) {
				if (squares[x][y] == 0) {
					blind++;
				}
				if (max < squares[x][y]) {
					max = squares[x][y];
				}
			}
		}
		System.out.println(blind + "\n" + max);
	}

	private static void set(int x, int y, int size) {
		squares[x][y]++;
		squares[x - 1][y]++;
		squares[x + 1][y]++;
		squares[x][y - 1]++;
		squares[x][y + 1]++;
		if (size >= 2) {
			squares[x - 1][y - 1]++;
			squares[x - 1][y + 1]++;
			squares[x + 1][y - 1]++;
			squares[x + 1][y + 1]++;
		}
		if (size >= 3) {
			squares[x - 2][y]++;
			squares[x + 2][y]++;
			squares[x][y - 2]++;
			squares[x][y + 2]++;
		}
	}
}