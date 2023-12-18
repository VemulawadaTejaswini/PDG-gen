import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
		// int masu[][] = new int[H][W];
		// for (int i = 0; i < H; i++) {
		// for (int j = 0; j < W; j++) {
		// masu[i][j] = sc.nextInt();
		// }
		// }
		int masu[][] = new int[H * W + 1][2];
		int tmp = 0;
		for (int i = 1; i < H + 1; i++) {
			for (int j = 1; j < W + 1; j++) {
				tmp = sc.nextInt();
				masu[tmp][0] = i;
				masu[tmp][1] = j;
			}
		}
		int Q = sc.nextInt();
		int L[] = new int[Q];
		int R[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		int ans = 0;

		int spendx = 0;
		int spendy = 0;
		// 出力
		for (int i = 0; i < Q; i++) {
			ans = 0;
			for (int j = 0; j < (R[i] - L[i]) / D; j++) {
				spendx = Math.abs(masu[L[i] + D * j][0] - masu[L[i] + D * (j + 1)][0]);
				spendy = Math.abs(masu[L[i] + D * j][1] - masu[L[i] + D * (j + 1)][1]);
				ans += spendx + spendy;
			}
			System.out.println(ans);
		}

	}
}
