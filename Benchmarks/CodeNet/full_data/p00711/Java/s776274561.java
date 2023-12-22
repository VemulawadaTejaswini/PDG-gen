import java.util.Scanner;


public class Main {
	
	int w, h;
	char[][] map;
	
	int count;
	
	void dfs(int x, int y) {
		int[] dx = new int[]{0, 0, -1, 1};
		int[] dy = new int[]{1, -1, 0, 0};
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && nx < w && 0 <= ny && ny < h && map[ny][nx] == '.') {
				map[ny][nx] = '#';
				count++;
				dfs(nx, ny);
			}
		}
	}
	
	int solve() {
		count = 1;
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				if (map[y][x] == '@') {
					dfs(x, y);
				}
			}
		}
		return count;
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			w = sc.nextInt();
			h = sc.nextInt();
			if (w == 0 && h == 0) {
				break;
			} else {
				sc.skip("\n");
				map = new char[h][];
				for (int i = 0; i < h; i++) {
					String row = sc.nextLine();
					map[i] = row.toCharArray();
				}
				output += solve() + "\n";
			}
		}
		sc.close();
		System.out.print(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}