import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] c = new char[h][];
		for (int i = 0; i < h; i++) {
			c[i] = sc.next().toCharArray();
		}

		int[][] a = new int[h][w];
		int[][] b = new int[h][w];
		for (int i = 0; i < h; i++) {
			a[i][0] = b[i][w - 1] = 1;
		}

		for (int i = 0; i < h; i += 2) {
			for (int j = 0; j < w - 1; j++) {
				a[i][j] = 1;
			}
		}

		for (int i = 1; i < h; i += 2) {
			for (int j = 1; j < w; j++) {
				b[i][j] = 1;
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (c[i][j] == '#') {
					a[i][j] = b[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(a[i][j] == 1 ? "#" : ".");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(b[i][j] == 1 ? "#" : ".");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
