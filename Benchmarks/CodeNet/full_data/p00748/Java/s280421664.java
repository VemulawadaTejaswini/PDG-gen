import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] porockNums = new int[200];
		int[] oddPorockNums = new int[200];
		int porockedNum[] = new int[1000000];
		int oddPorockedNum[] = new int[1000000];

		int tmp = 0;
		int arrayIdx = 0;
		int oddArrayIdx = 0;
		for (int i = 1; true; i++) {
			tmp = i * (i + 1) * (i + 2) / 6;
			porockNums[arrayIdx] = tmp;
			if (tmp >= 1000000) {
				break;
			}
			porockedNum[tmp] = 1;
			if (tmp % 2 == 1) {
				oddPorockNums[oddArrayIdx] = tmp;
				oddPorockedNum[tmp] = 1;
				oddArrayIdx++;
			}
			arrayIdx++;
		}

		while (true) {

			int n = sc.nextInt();
			ans = 0;

			if (n == 0) {
				break;
			}
			int addedTimes = 1;
			while (porockedNum[n] == 0) {

				for (int i = 1; i < 1000000; i++) {
					if (porockedNum[i] == addedTimes) {
						for (int p : porockNums) {
							if (i + p > n) {
								break;
							}
							if (porockedNum[i + p] != 0) {
								continue;
							}
							porockedNum[i + p] = addedTimes + 1;
						}
					}
				}
				addedTimes++;
			}
			addedTimes = 1;
			while (oddPorockedNum[n] == 0) {
				for (int i = 1; i < 1000000; i++) {
					if (oddPorockedNum[i] == addedTimes) {
						for (int p : oddPorockNums) {
							if (i + p > n) {
								break;
							}
							if (oddPorockedNum[i + p] != 0) {
								continue;
							}
							oddPorockedNum[i + p] = addedTimes + 1;
						}
					}
				}
				addedTimes++;
			}
			System.out.println(porockedNum[n] + " " + oddPorockedNum[n]);
		}
	}

	// BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	// //二分探索
	// k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(int num, int[] orderedArray) {
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedArray[mid] <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// //二分探索
	// k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray) {
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedArray[mid] <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// 二分探索
	// k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList) {
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedList.get(mid) <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	// aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}

