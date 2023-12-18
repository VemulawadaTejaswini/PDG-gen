import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[][] a = new String[H + 1][W + 1];

		for (int i = 0; i < H; i++) {
			int j = 0;
			String str = sc.next();
			str = str.replace(".", "0");
			String[] s = str.split("");
			for (String x : s) {
				a[i][j] = x;
				j++;
			}
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (a[i][j].equals("#")) {
					if (i != 0) {
						if (j != 0) {
							// 1
							if (!a[i - 1][j - 1].equals("#")) {
								a[i - 1][j - 1] = String.valueOf(Integer.valueOf(a[i - 1][j - 1]) + 1);
							}
						}
						// 2
						if (!a[i - 1][j].equals("#")) {
							a[i - 1][j] = String.valueOf(Integer.valueOf(a[i - 1][j]) + 1);
						}
						if (j != (W - 1)) {
							// 3
							if (!a[i - 1][j + 1].equals("#")) {
								a[i - 1][j + 1] = String.valueOf(Integer.valueOf(a[i - 1][j + 1]) + 1);
							}
						}
					}
					if (j != 0) {
						// 4
						if (!a[i][j - 1].equals("#")) {
							a[i][j - 1] = String.valueOf(Integer.valueOf(a[i][j - 1]) + 1);
						}
					}
					if (j != (W - 1)) {
						// 5
						if (!a[i][j + 1].equals("#")) {
							a[i][j + 1] = String.valueOf(Integer.valueOf(a[i][j + 1]) + 1);
						}
					}
					if (i != (H - 1)) {
						if (j != 0) {
							// 6
							if (!a[i + 1][j - 1].equals("#")) {
								a[i + 1][j - 1] = String.valueOf(Integer.valueOf(a[i + 1][j - 1]) + 1);
							}
						}
						// 7
						if (!a[i + 1][j].equals("#")) {
							a[i + 1][j] = String.valueOf(Integer.valueOf(a[i + 1][j]) + 1);
						}
						if (j != (W - 1)) {
							// 8
							if (!a[i + 1][j + 1].equals("#")) {
								a[i + 1][j + 1] = String.valueOf(Integer.valueOf(a[i + 1][j + 1]) + 1);
							}
						}
					}
				}
			}
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}

		sc.close();
	}
}