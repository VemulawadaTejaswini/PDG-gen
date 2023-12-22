import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader br;
	static String defSizeAry[];
	static int H;
	static int W;
	static char map[][];
	static boolean visited[][];
	static int x = 0;
	static int y = 0;

	public static void main(String[] args) throws Exception {

		br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			defSizeAry = br.readLine().split(" ");
			H = Integer.parseInt(defSizeAry[0]);
			W = Integer.parseInt(defSizeAry[1]);

			if (H == 0 && W == 0) {
				return;
			}

			map = new char[H][W];
			visited = new boolean[H][W];


			for (int i = 0; i < H; i++) {
				String line = br.readLine();
				for (int j = 0; j < W; j ++) {
					map[i][j] = line.charAt(j);
				}
			}

			solve();

			if (x == -1 && y == -1) {
				System.out.println("LOOP");
			} else {
				System.out.println(x + " " + y);
			}
		}
	}

	private static void solve() {

		// initialize
		x = 0;
		y = 0;
		for (int i = 0; i < H; i ++) {
			for (int j = 0; j < W; j ++) {
				visited[i][j] = false;
			}
		}

		while(true) {

			if (visited[y][x] == true) {
				x = -1;
				y = -1;
				return;
			}

			switch (map[y][x]) {
			case '>':
				visited[y][x] = true;
				x++;
				break;
			case '<':
				visited[y][x] = true;
				x--;
				break;
			case '^':
				visited[y][x] = true;
				y--;
				break;
			case 'v':
				visited[y][x] = true;
				y++;
				break;
			case '.':
				return;
			}
		}
	}
}