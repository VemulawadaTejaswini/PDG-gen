

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int X;
		int N;

		X = scan.nextInt();
		N = scan.nextInt();

		int p[] = new int[N];

		Set<Integer> inputSet = new HashSet<Integer>();

		for (int i = 0; i < N; i++) {
			inputSet.add(scan.nextInt());
		}

		//Xから見てループしていく
		//大きいのと、小さいの交互にみていく
		int ans;
		int radius = 0;

		while (true) {
			if (inputSet.contains(X + radius)) {
				//リストに含んでいるとき
			} else {
				//リストにいないとき
				//答えに入れる
				ans = X + radius;

				break;
			}

			if (radius > 0) {
				//差が正数の時はマイナス側を確認
				radius *= -1;
			} else {
				//マイナスの時は次の正数を確認
				radius *= -1;
				radius++;
			}

		}

		if (radius > 0) {
			//最後に見たのが正数側の時は負数側も確認する
			radius *= -1;

			if (!inputSet.contains(X + radius)) {
				//いなければ答えを書き換える
				ans = X + radius;
			}
		}

		System.out.println(ans);

	}

	//***********************以下共通関数************************************************
	/**
	 * 文字列を反転して返す
	 * @param pStr 文字列
	 * @return 反転した文字列
	 */
	public static String myReverse(String pStr) {
		if (pStr.length() < 1) {
			return "";
		}

		StringBuffer sb = new StringBuffer(pStr);
		return sb.reverse().toString();
	}

	/**
	 * 余りを求める。
	 * @param a
	 * @param b
	 * @return 余り。余りがマイナスの時はプラスで返す。
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
	 * @param kisu 基数
	 * @param josu 乗数
	 * @param primeNumMod_0 法 mod値 使わない場合は「0」
	 * @return
	 */
	public static long myPowWithMod(long kisu, long josu, long primeNumMod_0) {

		long ans = 1;

		//乗数が0の場合→1
		if (josu == 0)
			return 1;

		if (primeNumMod_0 == 0) {
			//modを使わないとき

			while (josu > 0) {

				if (josu % 2 == 0) {
					//累乗が偶数の時

					kisu *= kisu;
					josu = josu / 2;
				} else {
					//累乗が奇数の時
					ans *= kisu;
					josu--;
				}
			}

			return ans;

		} else {
			//modを使うとき

			//初めに桁を落とす
			kisu = myMod(kisu, primeNumMod_0);

			while (josu > 0) {

				if (josu % 2 == 0) {
					//累乗が偶数の時

					kisu *= myMod(kisu, primeNumMod_0);
					josu = josu / 2;

				} else {
					//累乗が奇数の時
					ans *= myMod(kisu, primeNumMod_0);
					josu--;

				}
			}

			return myMod(ans, primeNumMod_0);

		}

	}

}
