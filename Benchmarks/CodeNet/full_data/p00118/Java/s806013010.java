import java.util.Scanner;

public class Main {
	static char[][] mapC;
	static boolean[][] mapB;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w;
		while ((h = sc.nextInt()) != 0 && (w = sc.nextInt()) != 0) {
			mapC = new char[h + 2][w + 2];
			mapB = new boolean[h + 2][w + 2];
			for (int i = 0; i < h; i++) {
				String str = sc.next();
				for (int j = 0; j < w; j++) {
					mapC[i + 1][j + 1] = str.charAt(j);
				}
			}
			int ans = 0;
			for (int i = 1; i < h + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					if (!mapB[i][j]) {
						ans++;
						distribution(i, j);
					}
				}
			}
			System.out.println(ans);
		}
	}

	static void distribution(int i, int j) {
		mapB[i][j] = true;
		if (!mapB[i - 1][j] && mapC[i - 1][j] == mapC[i][j]) {
			distribution(i - 1, j);
		}
		if (!mapB[i + 1][j] && mapC[i + 1][j] == mapC[i][j]) {
			distribution(i + 1, j);
		}
		if (!mapB[i][j - 1] && mapC[i][j - 1] == mapC[i][j]) {
			distribution(i, j - 1);
		}
		if (!mapB[i][j + 1] && mapC[i][j + 1] == mapC[i][j]) {
			distribution(i, j + 1);
		}
	}
}