import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no2();
	}

	static void no2() {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			String tmp = sc.nextLine();
			int[][] arr = new int[h][w];

			for (int i = 0; i < h; i++) {
				String str = sc.nextLine();
				char[] c = str.toCharArray();
				int j = 0;
				for (char c1 : c) {
					if (c1 == '#') {
						arr[i][j] = 1;
					} else {
						arr[i][j] = 0;
					}
					j++;
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int t = 0;
					if (arr[i][j] == 1) {
						if (i != 0) {
							t += arr[i - 1][j];
						}
						if (j != 0) {
							t += arr[i][j - 1];
						}
						if (i != h - 1) {
							t += arr[i + 1][j];
						}
						if (j != w - 1) {
							t += arr[i][j + 1];
						}

						if (t == 0) {
							System.out.println("No");
							return;
						}
					}
				}
			}

			System.out.println("Yes");
		}
	}
}
