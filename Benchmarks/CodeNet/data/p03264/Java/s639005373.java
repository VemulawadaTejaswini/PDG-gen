import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		// 範囲内の偶数、奇数の総数を求める
		int maxEven = k / 2;
		int maxOdd = k / 2;
		if (k % 2 != 0) {
			// kが奇数の場合は、奇数の最大値に1加算
			maxOdd++;
		}

		// 組み合わせを求める
		// 全体の組み合わせ
		long totalCombi = calcCombination(k, 2);
		// 偶数のみの組み合わせ(偶数の個数が1以下の場合は組み合わせ不可のため0)
		long evenCombi = 0;
		if (maxEven > 1) {
			evenCombi = calcCombination(maxEven, 2);
		}
		// 奇数のみの組み合わせ(奇数の個数が1以下の場合は組み合わせ不可のため0)
		long oddCombi = 0;
		if (maxOdd > 1) {
			oddCombi = calcCombination(maxOdd, 2);
		}

		System.out.println(totalCombi - evenCombi - oddCombi);

		sc.close();
	}

	static long calcCombination(int n, int r) {
		long sum = 1;
		for (int i = 1; i <= r; i++) {
			sum = sum * (n - i + 1) / i;
		}
		return sum;
	}
}