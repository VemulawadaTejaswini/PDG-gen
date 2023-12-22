import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[][];
		int b[];
		int c[];
		int d;

		while (true) {
			n = sc.nextInt();
			d = 0;
			if (n == 0) {
				break;
			}
			a = new int[n][n];
			b = new int[n];
			c = new int[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = sc.nextInt();
					b[i] += a[i][j];
					c[j] += a[i][j];
					d += a[i][j];
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%5d", a[i][j]);
				}
				System.out.printf("%5d", b[i]);
				System.out.println();
			}
			for (int i = 0; i < n; i++) {
				System.out.printf("%5d", c[i]);
			}
			System.out.printf("%5d\n", d);
		}
	}
}