import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		while (x + y != 0) {
			int n = scanner.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				b[i] = scanner.nextInt();
			}
			System.out.println(f(x, y, 1, 1, a, b));
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
	}

	public static int f(int x, int y, int a, int b, int n[], int m[]) {
		if ((a == x - 1 && b == y) || (a == x && b == y - 1)) {
			return 1;
		}
		int flag = 1;
		int k1 = 0, k2 = 0;

		if (a < x) {
			for (int i = 0; i < n.length; i++) {
				if (a + 1 == n[i] && b == m[i]) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				k1 = f(x, y, a + 1, b, n, m);
			}
		}

		flag = 1;

		if (b < y) {
			for (int i = 0; i < n.length; i++) {
				if (a == n[i] && b + 1 == m[i]) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				k2 = f(x, y, a, b + 1, n, m);
			}
		}

		return k1 + k2;
	}
}