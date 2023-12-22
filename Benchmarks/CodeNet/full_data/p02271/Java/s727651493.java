import java.util.Scanner;

public class Main {

	public static int n;
	public static int[] A;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] m = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = sc.nextInt();
		}

		for (int i = 0; i < q; i++) {
			if (solve(0, m[i])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}

	public static boolean solve(int i, int m) {
		if (m == 0) {
			return true;
		}
		if (i >= n) {
			return false;
		}
		boolean res = solve(i + 1, m) || solve(i + 1, m - A[i]);
		return res;
	}

}
