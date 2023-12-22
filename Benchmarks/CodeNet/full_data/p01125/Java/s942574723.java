import java.util.Scanner;

public class Main {
	void print(int[][] a, int x, int y) {
		for (int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
				if (i == y && j == x) {
					System.out.print("@");
				} else {
					System.out.print(a[i][j] == 0 ? "^" : "*");
				}
			}
			System.out.println();
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		int[] dx = new int['Z'];
		int[] dy = new int['Z'];
		dx['E'] = 1;
		dx['W'] = -1;
		dy['N'] = 1;
		dy['S'] = -1;
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[][] a = new int[21][21];
			for (int i = 0; i < n; i++) {
				int kx = sc.nextInt();
				int ky = sc.nextInt();
				a[ky][kx] = 1;
			}
			int m = sc.nextInt();
			int x = 10, y = 10, sum = 0;
			for (int i = 0; i < m; i++) {
				char d = sc.next().toCharArray()[0];
				int l = sc.nextInt();
				for (int j = 0; j < l; j++) {
					sum += a[y][x];
					a[y][x]  = 0;
					x += dx[d];
					y += dy[d];
				}
				sum += a[y][x];
				a[y][x]  = 0;
			}

			System.out.println(sum == n ? "Yes" : "No");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}