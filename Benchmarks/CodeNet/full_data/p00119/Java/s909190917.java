import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TooManyListenersException;

public class Main {

	static int[][] map;
	static int[][] directions8 = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 },
			{ 1, 1 } };
	static int[][] directions4 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int ans;
	static int m;
	static int n;
	static Shougen[] shougen;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		m = sc.nextInt();
		n = sc.nextInt();

		shougen = new Shougen[n];

		for (int i = 0; i < n; i++) {
			shougen[i] = new Shougen(sc.nextInt(), sc.nextInt());
		}

		List<Integer> ansArray = solve(new ArrayList<Integer>(), 0);

		for (int i = 0; i < ansArray.size(); i++) {
			System.out.println(ansArray.get(i));
		}
	}

	static ArrayList<Integer> solve(ArrayList<Integer> tmpList, int idx) {
		if (m == idx) {
			return tmpList;
		}

		Set<Integer> nextCandidates = new HashSet<Integer>();
		for (int i = 1; i <= m; i++) {
			nextCandidates.add(i);
		}
		for (int i = 0; i < n; i++) {
			if (!tmpList.contains(shougen[i].num) && !tmpList.contains(shougen[i].after)
					&& nextCandidates.contains(shougen[i].after)) {
				nextCandidates.remove(shougen[i].after);
			}
		}
		for (int i = 1; i <= m; i++) {
			if (!nextCandidates.contains(i) || tmpList.contains(i)) {
				continue;
			}
			tmpList.add(i);
			ArrayList<Integer> tmp = solve(tmpList, idx + 1);
			if (tmp != null) {
				return tmp;
			}
		}
		return null;
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

class Shougen {
	int num;
	int after;

	Shougen(int num, int after) {
		this.num = num;
		this.after = after;
	}
}

