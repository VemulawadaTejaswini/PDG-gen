import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static boolean[][] obstacleMap;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions6 = { { -1, -1 }, { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;
	static int t;
	static ArrayDeque<int[]> q;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			t = sc.nextInt();
			int n = sc.nextInt();

			if ((t | n) == 0) {
				break;
			}

			// [30][30]が(0,0)。
			obstacleMap = new boolean[1000][1000];
			for (int i = 0; i < n; i++) {
				obstacleMap[sc.nextInt() + 300][sc.nextInt() + 300] = true;
			}
			ans = 0;
			int[] start = { sc.nextInt() + 300, sc.nextInt() + 300, 0 };
			q = new ArrayDeque<>();
			q.add(start);
			while (!q.isEmpty()) {
				int[] next = q.poll();
				walk(next[0], next[1], next[2]);
			}

			System.out.println(ans);
		}

	}

	static void walk(int nowX, int nowY, int idx) {
		if (idx > t || obstacleMap[nowX][nowY]) {
			return;
		}
		ans++;
		obstacleMap[nowX][nowY] = true;
		for (int i = 0; i < 6; i++) {
			int[] next = { nowX + directions6[i][0], nowY + directions6[i][1], idx + 1 };
			q.add(next);
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

