import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}
		sc.close();

		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			int cnt = 0;
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '.') {
					cnt++;
					a[i][j] = cnt;
				} else {
					cnt = 0;
				}
			}
			for (int j = w - 2; j >= 0; j--) {
				a[i][j] = Math.max(a[i][j], a[i][j + 1]);
			}
		}

		int[][] b = new int[h][w];
		for (int j = 0; j < w; j++) {
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				if (s[i][j] == '.') {
					cnt++;
					b[i][j] = cnt;
				} else {
					cnt = 0;
				}
			}
			for (int i = h - 2; i >= 0; i--) {
				b[i][j] = Math.max(b[i][j], b[i + 1][j]);
			}
		}

		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int val = a[i][j] + b[i][j] - 1;
				ans = Math.max(ans, val);
			}
		}
		System.out.println(ans);
	}
}
