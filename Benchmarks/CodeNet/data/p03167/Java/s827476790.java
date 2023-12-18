import java.util.*;

public class Main {
	static final long MOD = 1000000007L;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] arr = new char[h][];
		for (int i = 0; i < h; i++) {
			arr[i] = sc.next().toCharArray();
		}
		long[][] ans = new long[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i == 0 && j == 0) {
					ans[i][j] = 1;
					continue;
				}
				if (arr[i][j] == '#') {
					continue;
				}
				if (i != 0) {
					ans[i][j] += ans[i - 1][j];
				}
				if (j != 0) {
					ans[i][j] += ans[i][j - 1];
				}
				ans[i][j] %= MOD;
			}
		}
		System.out.println(ans[h - 1][w - 1]);
	}
}
