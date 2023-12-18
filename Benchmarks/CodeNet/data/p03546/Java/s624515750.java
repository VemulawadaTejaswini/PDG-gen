import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);

		int c[][] = new int[10][10];
		int a[][] = new int[h][w];

		for (int i = 0; i < 10; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < 10; j++) {
				c[i][j] = Integer.parseInt(str[j]);
			}
		}
		for (int i = 0; i < h; i++) {
			str = br.readLine().split(" ");
			for (int j = 0; j < w; j++) {
				a[i][j] = Integer.parseInt(str[j]);
			}
		}
		int b[][] = warshallFloyd(c);
		int ans = 0;

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] != -1) {
					ans += b[a[i][j]][1];
				}
			}
		}
		System.out.println(ans);
	}

	static int[][] warshallFloyd(int dp[][]) {
		int b[][] = dp;

		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					b[i][j] = Math.min(b[i][j], b[i][k] + b[k][j]);
				}
			}
		}
		return b;
	}
}