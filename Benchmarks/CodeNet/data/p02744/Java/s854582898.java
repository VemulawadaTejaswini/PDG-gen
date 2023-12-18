

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();

		String a = "a";
		String b = "b";

		if (n == 1) {
			System.out.println(a);
			return;
		}

		byte output = 0b0000;

		while (true) {
			//bit値を文字列型に置換
			String ans = String.valueOf(output);
			ans = ans.replace("0", "a");
			ans = ans.replace("1", "b");
			if (ans.charAt(0) == 'b') {
				return;
			}
			System.out.println(ans);

			//bit値を1進める
			output = 0b1;
		}
	}

	public static long lessThanSqrt(long a) {
		return longSqrt(a - 1);
	}

	public static long longSqrt(long a) {
		long b = (long) Math.sqrt(a);
		// 得られた値を2乗して元の値を超える場合は
		// 誤差で1大きくなっているため
		// 誤差修正のため1引いた値を返す
		if (b * b > a) {
			b--;
		}
		return b;
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
