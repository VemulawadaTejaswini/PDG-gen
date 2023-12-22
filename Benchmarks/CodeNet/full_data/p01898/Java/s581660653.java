import java.util.Scanner;

public class Main {

	final int[] a = { 0, 0, 1, 1, 1, -1, -1, -1 };
	final int[] b = { 1, -1, 1, 0, -1, 1, 0, -1 };

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int m = Integer.parseInt(sc.next());
			int n = Integer.parseInt(sc.next());
			char[][] map = new char[m][];
			for (int i = 0; i < m; i++) {
				map[i] = sc.next().toCharArray();
			}

			int cnt = 0;
			for (int i = 1; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] == '-') {
						boolean f = false;
						for (int k = 0; k < 8; k++) {
							int ny = i + a[k];
							int nx = j + b[k];
							if (ny >= 0 && ny < m && nx >= 0 && nx < n) {
								if (k < 2 && map[ny][nx] != '-' || map[ny][nx] == 'x') {
									f = true;
									break;
								}
							}
						}
						if (!f) {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}