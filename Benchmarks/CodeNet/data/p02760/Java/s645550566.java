

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int a[][] = new int[3][3];
		int n;
		final int select = 500;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = scan.nextInt();
			}
		}

		n = scan.nextInt();

		int inputN[] = new int[n];
		for (int n_count = 0; n_count < n; n_count++) {
			inputN[n_count] = scan.nextInt();

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					if (a[i][j] == inputN[n_count]) {
						a[i][j] = select;
					}

				}
			}
		}

		//最後に確認
		//行確認
		//1行目 =
		int first_row = a[0][0] + a[0][1] + a[0][2];
		int secont_row = a[1][0] + a[1][1] + a[1][2];
		int third_row = a[2][0] + a[2][1] + a[2][2];

		//列
		int first_col = a[0][0] + a[1][0] + a[2][0];
		int secont_col = a[0][1] + a[1][1] + a[2][1];
		int third_col = a[0][2] + a[1][2] + a[2][2];
		//斜め1
		int naname1 = a[0][0] + a[1][1] + a[2][2];
		int naname2 = a[0][2] + a[1][1] + a[2][0];

		if (first_row == 1500) {
			System.out.println("Yes");
			return;
		}

		if (secont_row == 1500) {
			System.out.println("Yes");
			return;
		}
		if (third_row == 1500) {
			System.out.println("Yes");
			return;
		}

		if (first_col == 1500) {
			System.out.println("Yes");
			return;
		}
		if (secont_col == 1500) {
			System.out.println("Yes");
			return;
		}
		if (third_col == 1500) {
			System.out.println("Yes");
			return;
		}

		if (naname1 == 1500) {
			System.out.println("Yes");
			return;
		}

		if (naname2 == 1500) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");

		//ビンゴカード作成
		//		int bingoCard[][] = new int[3][3];
		//		for (int i = 0; i < 3; i++) {
		//			for (int j = 0; j < 3; j++) {
		//				a[i][j] = 0;
		//			}
		//		}

	}

	/**
	 * 余りを求める。
	 * @param a
	 * @param b
	 * @return 余り。余りがマイナスの時はプラスで返す。ｓ
	 */
	public static long myMod(long a, long b) {
		long ret = 0;

		ret = a % b;

		if (ret < 0) {
			ret += b;
		}

		return ret;
	}

	/**
	 * 乗数を求める ※mod対応
	 * @param a 基数
	 * @param n 乗数
	 * @param primeNumMod 法 mod値 使わない場合は「0」
	 * @return
	 */
	public static long myModPow(long a, long n, long primeNumMod) {

		long ans = 1;

		//乗数が0の場合→1
		if (n == 0)
			return 1;

		if (primeNumMod == 0) {
			//modを使わないとき

			while (n > 0) {

				if (n % 2 == 0) {
					//累乗が偶数の時

					a *= a;
					n = n / 2;
				} else {
					//累乗が奇数の時
					ans *= a;
					n--;
				}
			}

			return ans;

		} else {
			//modを使うとき

			//初めに桁を落とす
			a = myMod(a, primeNumMod);

			while (n > 0) {

				if (n % 2 == 0) {
					//累乗が偶数の時

					a *= myMod(a, primeNumMod);
					n = n / 2;

				} else {
					//累乗が奇数の時
					ans *= myMod(a, primeNumMod);
					n--;

				}
			}

			return myMod(ans, primeNumMod);

		}

	}

}
