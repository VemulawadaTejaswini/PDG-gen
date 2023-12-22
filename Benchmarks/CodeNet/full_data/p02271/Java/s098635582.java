import java.util.Scanner;

public class Main {
	int[] A;
	int[] m;
	int n;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		int q = sc.nextInt();
		m = new int[q];
		for (int i = 0; i < q; i++) {
			m[i] = sc.nextInt();
		}

		for (int i = 0; i < q; i++) {
			if (rec(0, m[i])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

		sc.close();
	}

	boolean rec(int i, int num) {
		if (i == n) {
			if (num == 0) {
				return true;
			} else {
				return false;
			}
		}

		boolean res = false;
		res = rec(i + 1, num) || rec(i + 1, num - A[i]);

		return res;
	}
}