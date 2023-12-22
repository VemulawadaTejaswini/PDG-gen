import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	private static final long MOD = 1_000_000_007L;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			long[] a = new long[n];
			// 正の数の配列
			long[] positives = IntStream.range(0, n).mapToLong(i -> a[i] = scanner.nextLong()).filter(l -> l > 0)
					.sorted().toArray();
			// 負の数の配列
			long[] negatives = Arrays.stream(a).filter(l -> l < 0).sorted().toArray();
			// 0の数
			int zeroCount = n - positives.length - negatives.length;
			if (k > (positives.length + negatives.length)) {
				System.out.println(0L);
				return;
			}
			long answer = 1L;
			if (n == k) {
				// ずべての数を使う場合
				for (int i = 0; i < n; i++) {
					answer = answer * a[i] % MOD;
				}
			} else if ((positives.length == 0) && (1 == (k & 1))) {
				// 正の数が存在しない、かつ、掛け算の数が奇数場合
				if (zeroCount > 0) {
					// 0が存在するなら、0
					answer = 0L;
				} else {
					// 0が存在しないなら、絶対値の小さい負の数をk個かける
					for (int i = negatives.length - k; i < negatives.length; i++) {
						answer = answer * negatives[i] % MOD;
					}
				}
			} else {
				int positiveIndex = positives.length - 1, negativeIndex = 0;
				while (k > 0) {
					if (1 == (k & 1)) {
						// kが奇数の場合、正の数の掛け算をする
						answer = answer * positives[positiveIndex--] % MOD;
						k--;
					} else {
						// kが偶数の場合、正の数か負の数を2つ掛け算する
						if ((positiveIndex > 0) && (negativeIndex < negatives.length - 1)) {
							if (positives[positiveIndex] * positives[positiveIndex - 1] >= negatives[negativeIndex]
									* negatives[negativeIndex + 1]) {
								answer = answer * positives[positiveIndex--] % MOD;
								answer = answer * positives[positiveIndex--] % MOD;
							} else {
								answer = answer * negatives[negativeIndex++] % MOD;
								answer = answer * negatives[negativeIndex++] % MOD;
							}
						} else if (positiveIndex > 0) {
							answer = answer * positives[positiveIndex--] % MOD;
							answer = answer * positives[positiveIndex--] % MOD;
						} else {
							answer = answer * negatives[negativeIndex++] % MOD;
							answer = answer * negatives[negativeIndex++] % MOD;
						}
						k -= 2;
					}
				}
			}
			answer = (answer + MOD) % MOD;
			System.out.println(answer);
		}
	}
}
