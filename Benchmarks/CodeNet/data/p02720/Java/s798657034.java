

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Long> getNewList(List<Long> list) {
		List<Long> retList = new ArrayList<>();

		//引数の全要素に対して追加の要素を作成する
		for (Long item : list) {

			//追加するのは±1
			for (int i = -1; i < 2; i++) {

				if (item % 10 == 0) {
					if (i == -1) {
						continue;
					}
				} else if (item % 10 == 9) {
					if (i == 1) {
						continue;
					}
				}

				long d = item % 10 + i;

				retList.add(item * 10 + d);
			}
		}

		return retList;
	}

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int k = scan.nextInt();
		int count = 1;
		int pointer = 1;

		List<Long> list = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L);

		while (true) {

			//要素取得
			long ret = list.get(pointer - 1);

			if (ret == list.get(list.size() - 1)) {

				//debug用
				System.out.println(list);

				//listの最後だったら、新しいリストの更新しておく
				list = getNewList(list);
				//ポインタクリア
				pointer = 0;
			}

			if (count == k) {
				//答え出力
				System.out.println(list);
				System.out.println(ret);
				return;
			}

			count++;
			pointer++;
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
