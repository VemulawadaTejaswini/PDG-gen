import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		//1～k個の連続が発生する個数を計算する。
		int countPattern = 0;
		int pattern = 1;
		//隣り合わせが k + 1 個ある時の色の組み合わせ
		if (k < n - 1) {
			for (int i = 0; i <= n - k - 2; i++) {
				if (i == 0) {
					pattern = m;
				} else {
					pattern = multi(pattern, (m - 1));
				}
			}
		}
		//ループ実行
		for (int i = k; i >= 0; i--) {
			//どこが隣り合わせになるかの組み合わせ。
			int nextPattern = combi(n - 1, i);
			//色の組み合わせ。
			if (i == n - 1) {
				System.out.println("a");
				pattern = m;
			} else {
				pattern = multi(pattern, (m - 1));
			}


			//総数計上
			int mult = multi(nextPattern, pattern);
			countPattern = limitOff((long) countPattern + (long) mult);

			//debug
			if (i >= k - 5 || i <= 5 || nextPattern < 0 || pattern < 0 || mult < 0 || countPattern < 0) {
				System.out.println("k " + i + " next " + nextPattern + " pattern " + pattern + " mult " + mult + " countPattern " + countPattern);
			}
		}

		// 出力
		System.out.println(countPattern);
		sc.close();
	}

	public static int combi(int n, int r) {
		if (n - r < r) {
			r = n - r;
		}

		int[] numerator = new int[r];
		int[] denominator = new int[r];

		for (int i = 0; i < r; i++) {
			numerator[i] = n - i;
			denominator[i] = r - i;
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				if (numerator[i] % denominator[i] == 0) {
					numerator[i] /= denominator[i];
					break;
				}
			}
		}

		int temp = 1;
		for (int i = 0; i < r; i++) {
			temp = limitOff((long)temp * (long)numerator[i]);
		}

//		System.out.println("combi " + n + " " + r + " " + temp);
		return temp;
	}

	public static int multi(int a, int b) {
		long limit = Long.MAX_VALUE - (long) 998244353;
		long la = (long) a;
		long lb = (long) b;
		int result = 0;

		long div = limit / la;
		while (lb > 0) {
			if (div < lb) {
				result = limitOff((long)result + la * div);
				lb -= div;
			} else {
				result = limitOff((long)result + la * lb);
				lb = 0;
			}
		}
		return result;
	}

	public static int limitOff(long base) {
		int limit = 998244353;
		int temp = (int) base;
		if (base > limit) {
			temp = (int) (base % limit);
		}
//		System.out.println("limitOff " + base + " -> " + limit + " * " + (int) (base / limit) + " + " + temp);
		return temp;
	}
}
