import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int[][] count = new int[h][w];
		int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
		int[] dy = {1, -1, 0, 0, -1, 1, 1, -1};
		String S = "";
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			S = scan.next();
			for (int j = 0; j < w; j++) {
				a[i][j] = S.charAt(j);
			}
		}
		int ny = 0;
		int nx = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '.') {
					for (int k = 0; k < 8; k++) {
						ny = i + dy[k];
						nx = j + dx[k];
						if (ny < 0 || nx < 0 || ny >= h || nx >= w) continue;
						else {
							if (a[ny][nx] == '#') {
								count[i][j]++;
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '.') {
					a[i][j] = encode(count[i][j]);
				}
			}
		}
		String str[] = new String[h];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (j == 0) {
					str[i] = String.valueOf(a[i][j]);
				} else {
					str[i] = str[i] + String.valueOf(a[i][j]);					
				}
			}
		}
		for (int i = 0; i < h; i++) {
			System.out.println(str[i]);
		}
	}

	static private char encode(int num) {
		switch (num) {
		case 1:
			return '1';
		case 2:
			return '2';
		case 3:
			return '3';
		case 4:
			return '4';
		case 5:
			return '5';
		case 6:
			return '6';
		case 7:
			return '7';
		case 8:
			return '8';
		case 0:
		return '0';
		}
		return '0';
	}
}