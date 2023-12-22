import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int H = scan.nextInt();
		int W = scan.nextInt();
		int K = scan.nextInt();

		char[][] C = new char[H][W];

		for (int i = 0; i < H; i++) {
			C[i] = scan.next().toCharArray();
		}

		//WK変数
		int result = 0;

		//演算
		for (int i = 0; i < (int) Math.pow(2, H); i++) {
			for (int j = 0; j < (int) Math.pow(2, W); j++) {
				int black = 0;
				for (int k = 0; k < H; k++) {
					for (int l = 0; l < W; l++) {
						if ((i % (int) Math.pow(2, k + 1)) / (int) Math.pow(2, k) == 0 &&
								(j % (int) Math.pow(2, l + 1)) / (int) Math.pow(2, l) == 0) {
							if (C[k][l] == '#') {
								black++;
							}
							;
						}
					}
				}
				if (black == K) {
					result++;
				}

			}
		}

		//結果出力
		System.out.println(result);
	}
}