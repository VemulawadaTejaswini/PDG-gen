import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int H = sc.nextInt();
		int W = sc.nextInt();
		int S[][] = new int[H][W];
		int count = 0;
		int max = 0;

		for (int i = 0; i < H; i++) {
			String str = sc.next();
			for (int j = 0; j < W; j++) {
				if (str.substring(j, j + 1).equals("#")) {
					S[i][j] = 1;
				} else {
					S[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (S[i][j] == 0) {
					int l = j;
					int r = W - j - 1;
					int t = i;
					int b = H - i - 1;
					while (l > 0) {
						if (S[i][j] == 1) {
							break;
						}
						count += 1;
						l -= 1;
					}
					while (r > 0) {
						if (S[i][j] == 1) {
							break;
						}
						count += 1;
						r -= 1;
					}
					while (t > 0) {
						if (S[i][j] == 1) {
							break;
						}
						count += 1;
						t -= 1;
					}
					while (b > 0) {
						if (S[i][j] == 1) {
							break;
						}
						count += 1;
						b -= 1;
					}
					max = Math.max(max, count);
				}
			}
		}
		sc.close();
		System.out.println(max);
	}
};