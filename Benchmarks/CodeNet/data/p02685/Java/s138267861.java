import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] nextPattern = new int[k + 1];
		int[] colorPattern = new int[k + 1];

		//隣り合わせが k + 1 個ある時の色の組み合わせを算出
		int pattern = 1;
		if (k < n - 1) {
			for (int i = 0; i <= n - k - 2; i++) {
				if (i == 0) {
					pattern = m;
				} else {
					pattern = multi(pattern, (m - 1));
				}
			}
		}
		//1～k個の連続が発生する個数を計算する。
		for (int i = 0; i <= k; i++) {
			//どこが隣り合わせになるかの組み合わせ。
			if (i == 0) {
				nextPattern[i] = 1;
			} else if (i > (n - 1) / 2) {
				nextPattern[i] = nextPattern[n - 1 - i];
			} else {
				if ((n - i) % i == 0) {
					nextPattern[i] = limitOff((long) nextPattern[i - 1] * (long) ((n - i) / i));
				} else {
					nextPattern[i] = limitOff((long) (nextPattern[i - 1] / i) * (long) (n - i));
				}
			}

			//色の組み合わせ。
			if (i == 0) {
				if (k == n - 1) {
					colorPattern[k - i] = m;
				} else {
					colorPattern[k - i] = multi(pattern, m - 1);
				}
			} else {
				colorPattern[k - i] = multi(colorPattern[k - i + 1], m - 1);
			}
		}

		int countPattern = 0;
		for (int i = 0; i <= k; i++) {
			countPattern = limitOff((long) countPattern + (long) multi(nextPattern[i], colorPattern[i]));
		}

				//debug
//				if (i >= k - 5 || i <= 5 || nextPattern < 0 || pattern < 0 || mult < 0 || countPattern < 0) {
//					System.out.println("k " + i + " next " + nextPattern + " pattern " + pattern + " mult " + mult + " countPattern " + countPattern);
//				}

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

		if (a != 0 && b != 0) {
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
