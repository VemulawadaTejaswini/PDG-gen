import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] A;
	static boolean[] x;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			A = new int[N + 1];
			x = new boolean[N + 1];
			System.out.println(solve());
		}
	}

	static String solve() {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < N; ++i) {
			String elem = sc.next();
			if (elem.equals("x")) {
				x[i] = true;
			} else {
				A[i] = Integer.parseInt(elem);
				set.add(A[i] - 2);
				set.add(A[i] - 1);
				set.add(A[i]);
				set.add(A[i] + 1);
				set.add(A[i] + 2);
			}
		}
		A[N] = N % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
		if (set.isEmpty()) return ok() ? "ambiguous" : "none";
		int ans = Integer.MIN_VALUE;
		for (int cand : set) {
			for (int i = 0; i < N; ++i) {
				if (x[i]) A[i] = cand;
			}
			if (ok()) {
				if (ans == Integer.MIN_VALUE) {
					ans = cand;
				} else {
					return "ambiguous";
				}
			}
		}
		return ans == Integer.MIN_VALUE ? "none" : ans + "";
	}

	static boolean ok() {
		for (int i = 1; i < N; ++i) {
			if (i % 2 != 0) {
				if (A[i] <= A[i - 1] || A[i] <= A[i + 1]) return false;
			} else {
				if (A[i] >= A[i - 1] || A[i] >= A[i + 1]) return false;
			}
		}
		return true;
	}
}