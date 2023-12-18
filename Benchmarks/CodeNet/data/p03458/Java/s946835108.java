import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int k2 = k * 2;
		int[][] count = new int[4 * k + 1][4 * k + 1];

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (sc.next().equals("W")) {
				y += k;//全てblackに
			}
			x %= k2;
			y %= k2;
			//二次元imos 重みの加算
			count[x][y]++;
			count[x][y + k]--;
			count[x + k][y]--;
			count[x + k][y + k]++;
			count[x + k][y + k]++;
			count[x + k][y + k + k]--;
			count[x + k + k][y + k]--;
			count[x + k + k][y + k + k]++;
		}
		//横方向への累積和
		final int H = count.length;
		final int W = count[0].length;
		for (int y = 0; y < H; y++) {
			for (int x = 1; x < W; x++) {
				count[y][x] += count[y][x - 1];
			}
		}
		//縦方向への累積和
		for (int y = 1; y < H; y++) {
			for (int x = 0; x < W; x++) {
				count[y][x] += count[y - 1][x];
			}
		}
		for(int y = 0; y < H; y++) {
			for(int x = 0; x < W; x++) {
				if(y < k2 && x < k2) continue;
				count[y % k2][x % k2] += count[y][x];
			}
		}
		long ans = 0L;
		for (int y = 0; y < k2; y++) {
			for (int x = 0; x < k2; x++) {
				ans = Math.max(ans, count[y][x]);
			}
		}
		System.out.println(ans);
	}
}