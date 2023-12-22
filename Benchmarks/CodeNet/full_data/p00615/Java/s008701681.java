import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int a[], b[], c[];
		int max;

		n = sc.nextInt();
		m = sc.nextInt();
		while (n + m != 0) {
			a = new int[n];
			b = new int[m];
			c = new int[n + m];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				b[i] = sc.nextInt();
			}
			for (int i = 0, j = 0; ; ) {
				if (n <= i && m <= j) {
					break;
				} else if (m <= j || (i < n && a[i] < b[j])) {
					c[i + j] = a[i];
					i++;
				} else if (n <= i || b[i] <= a[i]) {
					c[i + j] = b[j];
					j++;
				}
			}
			max = c[0];
			for (int i = 0; i < n + m - 1; i++) {
				if (max < c[i + 1] - c[i]) {
					max = c[i + 1] - c[i];
				}
			}
			System.out.println(max);

			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}