import java.util.Scanner;

public class Main {
	int r;
	int c;
	int max = 0;
	boolean[] flg = new boolean[10];
	boolean[][] osenbei;
	void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			r = scan.nextInt();
			c = scan.nextInt();
			if (r == 0 && c == 0) break;
			osenbei = new boolean[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (scan.nextInt() == 1) {
						osenbei[i][j] = true;
					} else {
						osenbei[i][j] = false;
					}
				}
			}
			solve(0);
			System.out.println(max);
		}
	}

	void solve(int index) {
		if (index == r) {
			int ans = count(flg);
			if (max < ans) {
				max = ans;
			}
			return;
		}

		solve(index + 1);

		flg[index] = false;
		solve(index + 1);
		flg[index] = true;
	}

	int count(boolean[] flg) {
		boolean[][] tmp = new boolean[r][];
		for (int i = 0; i < r; i++)
			tmp[i] = osenbei[i].clone();
		
		int count = 0;
		for (int i = 0; i < r; i++) {
			if (flg[i]) {
				for (int j = 0; j < c; j++) {
					tmp[i][j] = !tmp[i][j];
				}
			}
		}
		for (int i = 0; i < c; i++) {
			int c = 0;
			for (int j = 0; j < r; j++) {
				if (tmp[j][i]) c++;
			}
			if (c < r - c)
				c = r - c;
			count += c;
		}
		
		return count;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}