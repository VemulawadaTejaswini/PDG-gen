

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static long maxScore = 0;
	static int N, M, Q;
	static int a[], b[], c[], d[];

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		Q = scan.nextInt();

		a = new int[Q + 1];
		b = new int[Q + 1];
		c = new int[Q + 1];
		d = new int[Q + 1];

		List<Integer> A = new ArrayList<Integer>();

		for (int i = 1; i <= Q; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
			d[i] = scan.nextInt();
		}

		//dfsでAを作成しながら得点を求める
		dfs(A, N, M);
		System.out.println(maxScore);

	}

	public static void dfs(List<Integer> A, int maxLength, int MaxValue) {
		if (A.size() == maxLength) {
			//Todo スコア計算
			calcScore(A);
			return;
		}

		A.add(A.size(), 1);

		while (A.get(A.size() - 1) <= MaxValue) {
			dfs(A, maxLength, MaxValue);

			int tmp = A.get(A.size() - 1) + 1;
			A.add(A.size(), tmp);

		}
	}

	public static void calcScore(List<Integer> A) {
		//スコアを計算
		long score = 0;
		for (int i = 1; i <= Q; i++) {
			if (b[i] - a[i] == c[i]) {
				score += d[i];
			}

		}

		if (score > maxScore) {
			maxScore = score;
		}
	}

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
