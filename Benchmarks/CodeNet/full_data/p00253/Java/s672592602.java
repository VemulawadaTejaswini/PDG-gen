import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];
		int b[];
		int d1, d2, d3, d;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			a = new int[n + 1];
			b = new int[n];
			for (int i = 0; i < n + 1; i++) {
				a[i] = sc.nextInt();
			}
			d1 = a[1] - a[0];
			d2 = a[2] - a[1];
			d3 = a[3] - a[2];
			if (d1 == d2) {
				d = d1;
			} else if (d1 == d3) {
				d = d1;
			} else {
				d = d2;
			}
			for (int i = 0; i < n; i++) {
				if (Math.abs(a [i + 1] - a[i]) == d) {
					b[i] = 1;
				} else {
					b[i] = 0;
				}
			}
			if (b[0] == 0 && b[1] == 1) {
				System.out.println(a[0]);
			} else if (b[n - 2] == 1 && b[n - 1] == 0) {
				System.out.println(a[n]);
			} else {
				for (int i = 0; i < n - 1; i++) {
					if (b[i] == 0 && b[i + 1] == 0) {
						System.out.println(a[i + 1]);
					}
				}
			}
		}
	}
}