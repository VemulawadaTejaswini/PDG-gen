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

		while (true) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			if ((N | M) == 0) {
				break;
			}

			int[][] studentLogin = new int[M + 1][721];
			int[][] studentLogout = new int[M + 1][721];
			int r = sc.nextInt();
			int[] t = new int[r];
			int[] n = new int[r];
			int[] m = new int[r];
			// int[] s = new int[r];

			for (int j = 0; j < r; j++) {
				t[j] = sc.nextInt();
				n[j] = sc.nextInt();
				m[j] = sc.nextInt();

				if (sc.nextInt() == 1) {
					studentLogin[m[j]][t[j] - 540]++;
				} else {
					studentLogout[m[j]][t[j] - 540]++;
				}
			}

			int q = sc.nextInt();
			int[] fromTime = new int[q];
			int[] toTime = new int[q];
			int[] qStudent = new int[q];

			for (int i = 0; i < q; i++) {
				fromTime[i] = sc.nextInt();
				toTime[i] = sc.nextInt();
				qStudent[i] = sc.nextInt();
				int studentLoginPC = 0;
				int studentAns = 0;

				for (int j = 0; j <= toTime[i] - 540; j++) {
					if (j > fromTime[i] - 540 && studentLoginPC > 0) {
						studentAns++;
					}
					studentLoginPC += studentLogin[qStudent[i]][j];
					studentLoginPC -= studentLogout[qStudent[i]][j];
				}
				System.out.println(studentAns);
			}

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

