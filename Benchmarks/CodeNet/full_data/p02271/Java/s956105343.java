import java.util.Scanner;

public class Main {
	int[] aArr;
	int aSize;
	int cnt;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		aArr = new int[n];
		for (int i = 0; i < n; i++) {
			aArr[i] = sc.nextInt();
		}
		aSize = n;
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			boolean ans = rec(0, sc.nextInt());
			if (ans) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}

	boolean rec(int n, int m) {
		if (n >= aSize) {
			return false;
		}
		if (m < 0) {
			return false;
		}
		if (m == 0) {
			return true;
		}
		return (rec(n + 1, m) || rec(n + 1, m - aArr[n]));
	}
}