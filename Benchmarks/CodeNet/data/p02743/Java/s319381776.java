

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		long a, b, c;

		a = scan.nextLong();
		b = scan.nextLong();
		c = scan.nextLong();

		double a2, b2, c2;

		//(long)Math.sqrt(a-1)
		a2 = lessThanSqrt(a);
		b2 = lessThanSqrt(b);
		c2 = lessThanSqrt(c);

		double sahen = a2 + b2;
		double uhen = c2;

		if (sahen < uhen) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
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
