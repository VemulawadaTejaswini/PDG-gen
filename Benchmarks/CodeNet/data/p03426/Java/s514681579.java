import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int H = sc.nextInt();
		int W = sc.nextInt();
		int D = sc.nextInt();
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

		int memo[] = new int[H * W + 1];
		for (int i = 1; i < H * W + 1; i++) {
			if (i + D <= H * W) {
				memo[i] = Math.abs(masu[i][0] - masu[i + D][0]) + Math.abs(masu[i][1] - masu[i + D][1]);
			}
		}

		// 出力
		for (int i = 0; i < Q; i++) {
			ans = 0;
			for (int j = 0; j < (R[i] - L[i]) / D; j++) {
				ans += memo[L[i] + D * j];
			}
			System.out.println(ans);
		}

	}
}
