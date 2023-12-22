

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int N_bookCount, M_bookCount, K_sumTime;

	static long ansCount = 0;

	static long[] A;
	static long[] B;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		N_bookCount = scan.nextInt();
		M_bookCount = scan.nextInt();
		K_sumTime = scan.nextInt();

		A = new long[N_bookCount + 1];
		B = new long[M_bookCount + 1];

		for (int i = 1; i <= N_bookCount; i++) {
			A[i] = scan.nextInt();
		}

		for (int i = 1; i <= M_bookCount; i++) {
			B[i] = scan.nextInt();
		}

		//累積和を求めておく。
		Map<Integer, Long> aDeskSum = new HashMap<Integer, Long>();
		aDeskSum.put(1, (long) A[1]);
		for (int i = 2; i <= N_bookCount; i++) {
			aDeskSum.put(i, aDeskSum.get(i - 1) + A[i]);
		}
		Map<Integer, Long> bDeskSum = new HashMap<Integer, Long>();
		bDeskSum.put(1, (long) B[1]);
		for (int i = 2; i <= M_bookCount; i++) {
			bDeskSum.put(i, bDeskSum.get(i - 1) + B[i]);
		}

		//AをしたからBを上から見ていく
		int j = M_bookCount;
		for (int i = 1; i <= N_bookCount; i++) {
			while (j >= 0) {
				if (K_sumTime >= aDeskSum.get(i) + bDeskSum.get(j)) {
					ansCount = Math.max(ansCount, i + j);
					break;
				}

				j--;
			}
		}

		System.out.println(ansCount);

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
