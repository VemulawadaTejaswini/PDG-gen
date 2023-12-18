

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long A[] = new long[(int) N + 1];

		for (int i = 1; i <= N; i++) {
			A[i] = scan.nextLong();
		}

		Map<Long, Long> pair = new HashMap<Long, Long>();

		for (int j = 1; j <= N; j++) {

			if (pair.containsKey(A[j])) {
				long count;
				count = pair.get(A[j]);
				count++;
				pair.put(A[j], count);

			} else {
				//新しく追加
				pair.put(A[j], Long.valueOf(1));
			}

		}

		//Aiとその選び方の値
		long sum = 0;
		Map<Long, Long> pair2 = new HashMap<Long, Long>();
		for (Long key : pair.keySet()) {
			Long itemCount = pair.get(key);

			if (itemCount <= 1) {
				//				pair2.put(key, (long) 1);
				sum += 0;
			} else {
				//				pair2.put(key, itemCount * (itemCount - 1) / 2);
				sum += itemCount * (itemCount - 1) / 2;
			}
		}

		for (int k = 1; k <= N; k++) {

			//kの値をコレクションから引く
			//今のkの影響数
			long k_value = A[k];
			//kの値の数
			long k_count = pair.get(k_value);

			//sumに加算しているkの選び方
			long inputSum = 0;
			if (k_count <= 1) {
				inputSum = 0;
			} else {
				inputSum += k_count * (k_count - 1) / 2;
			}

			//kを除外した場合(個数が1減った場合)のsumへの影響
			long kasoSum = 0;
			if (k_count - 1 <= 0) {
				kasoSum = 0;
			} else {
				kasoSum += (k_count - 1) * (k_count - 2) / 2;
			}

			System.out.println(sum - (inputSum - kasoSum));

		}

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
