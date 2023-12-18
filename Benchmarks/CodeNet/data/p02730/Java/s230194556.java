

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String s;
		s = scan.next();

		String strReverse;

		char[] moto = s.toCharArray();
		char[] reverse = new char[moto.length];
		int j = 0;

		for (int i = moto.length - 1; i >= 0; i--) {
			reverse[j] = moto[i];
			j++;

		}

		//①回文か確認
		strReverse = String.valueOf(reverse);

		if (!s.equals(strReverse)) {
			System.out.println("No");

			return;
		}

		//前半取得
		String zenhan = s.substring(0, (s.length() - 1) / 2);
		//前半の回文
		char[] zenhan_rev = new char[zenhan.length()];

		j = 0;
		for (int i = zenhan.length() - 1; i >= 0; i--) {
			zenhan_rev[j] = zenhan.charAt(i);
			j++;
		}
		String strZenhanRev = String.valueOf(zenhan_rev);
		if (!zenhan.equals(strZenhanRev)) {
			System.out.println("No");

			return;
		}

		//後半取得
		//前半取得
		zenhan = s.substring((s.length() + 3) / 2 - 1, s.length());
		//前半の回文
		zenhan_rev = new char[zenhan.length()];

		j = 0;
		for (int i = zenhan.length() - 1; i >= 0; i--) {
			zenhan_rev[j] = zenhan.charAt(i);
			j++;
		}
		strZenhanRev = String.valueOf(zenhan_rev);
		if (!zenhan.equals(strZenhanRev)) {
			System.out.println("No");

			return;
		}

		System.out.println("Yes");
		return;
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
