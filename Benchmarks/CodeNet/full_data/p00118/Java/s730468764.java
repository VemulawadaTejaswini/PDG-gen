import java.util.Scanner;

public class Main {
	int h = 0;
	int w = 0;
	
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if (w == 0 && h == 0) break;
			char[][]map = new char[h][];
			int section = 0;
			scan.nextLine();
			for (int i = 0; i < h; i++)
				map[i] = new char[w];
			for (int y = 0; y < h; y++) {
				String str = scan.nextLine();
				for (int x = 0; x < w; x++) {
					map[y][x] = str.charAt(x);
				}
			}
			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) {
					if (map[y][x] != 'x') {
						solve(y, x, map[y][x], map);
						section++;
					}
				}
			}
			System.out.println(section);
		}
	}
	
	void solve(int y, int x, char c, char[][] map) {
		if (y < 0 || x < 0 || y >= h || x >= w || map[y][x] != c) return;
		map[y][x] = 'x';
		solve(y + 1, x, c, map);
		solve(y - 1, x, c, map);
		solve(y, x + 1, c, map);
		solve(y, x - 1, c, map);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}