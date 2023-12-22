import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static char[][] a;
	static char[][] wMap;
	static char[][] bMap;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;
	static int countW;
	static int countB;
	static int w;
	static int h;
	static boolean[][] wSquare;
	static boolean[][] bSquare;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			w = sc.nextInt();
			h = sc.nextInt();

			if ((w | h) == 0) {
				break;
			}
			a = new char[h][w];
			wMap = new char[h][w];
			bMap = new char[h][w];
			wSquare = new boolean[h][w];
			bSquare = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				String s = sc.next();
				for (int j = 0; j < w; j++) {
					// a[タテ][ヨコ]
					a[i][j] = s.charAt(j);
					wMap[i][j] = a[i][j];
					bMap[i][j] = a[i][j];
				}
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (a[i][j] == 'B') {
						for (int k = 0; k < 4; k++) {
							countB(i + directions4[k][0], j + directions4[k][1]);
						}
						countB(i, j);
					} else if (a[i][j] == 'W') {
						for (int k = 0; k < 4; k++) {
							countW(i + directions4[k][0], j + directions4[k][1]);
						}
					}
				}
			}
			countB = 0;
			countW = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (bSquare[i][j] && !wSquare[i][j]) {
						countB++;
					} else if (!bSquare[i][j] && wSquare[i][j]) {
						countW++;
					}
				}
			}
			System.out.println(countB + " " + countW);
		}

	}

	static void countW(int thisH, int thisW) {
		if (thisH >= h || thisH < 0 || thisW >= w || thisW < 0 || wSquare[thisH][thisW] || wMap[thisH][thisW] != '.') {
			return;
		}
		// wMap[thisH][thisW] = 'W';
		wSquare[thisH][thisW] = true;

		for (int i = 0; i < 4; i++) {
			countW(thisH + directions4[i][0], thisW + directions4[i][1]);
		}
	}

	static void countB(int thisH, int thisW) {
		if (thisH >= h || thisH < 0 || thisW >= w || thisW < 0 || bSquare[thisH][thisW] || bMap[thisH][thisW] != '.') {
			return;
		}
		bSquare[thisH][thisW] = true;

		for (int i = 0; i < 4; i++) {
			countB(thisH + directions4[i][0], thisW + directions4[i][1]);
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

