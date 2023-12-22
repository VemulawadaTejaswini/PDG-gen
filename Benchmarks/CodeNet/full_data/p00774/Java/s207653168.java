import java.util.Scanner;

public class Main {
	int[][] cell;
	int w, h;

	int remove(int k) {
		int res = 0;
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			int a = Math.abs(cell[k][i]);
			int b = Math.abs(cell[k][i + 1]);
			int c = Math.abs(cell[k][i + 2]);
			if (a != 0 && a == b && b == c) {
				res = a;
				cell[k][i] = -a;
				cell[k][i + 1] = -b;
				cell[k][i + 2] = -c;
			}
		}
		for (int i = 0; i < w; i++) {
			if (cell[k][i] < 0) {
				cnt++;
				cell[k][i] = 0;
			}
		}
		return Math.max(0, res * cnt);
	}

	void refresh(int k) {
		int id = h - 1;
		for (int i = h - 1; 0 <= i; i--) {
			if (cell[i][k] != 0) {
				cell[id--][k] = cell[i][k];
			}
		}
		for (int i = id; 0 <= i; i--) {
			cell[i][k] = 0;
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			w = 5;
			h = sc.nextInt();
			if (h == 0) {
				break;
			}
			cell = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					cell[i][j] = sc.nextInt();
				}
			}

			boolean flg = true;
			int score = 0;
			while (flg) {
				flg = false;
				for (int i = 0; i < h; i++) {
					int tmp = remove(i);
					if (0 < tmp) {
						score += tmp;
						flg = true;
					}
				}
				for (int i = 0; i < w; i++) {
					refresh(i);
				}
			}

			System.out.println(score);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}
}