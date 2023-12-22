import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int a[];
		int sum, max;

		n = sc.nextInt();
		m = sc.nextInt();
		while (n + m != 0) {
			sum = 0;
			max = 0;
			a = new int[n + 1];
			for (int i = 0; i <= n; i++) {
				a[i] = 0;
			}
			for (int i = 0; i < m; i++) {
				a[sc.nextInt()] = 1;
			}

			for (int i = 1; i <= n; i++) {
				a[i] += a[0];
				for (int j = 1; j <= n; j++) {
					if (a[j] != 0) {
						sum++;
					} else {
						if (max < sum) {
							max = sum;
						}
						sum = 0;
					}
				}
				a[i] -= a[0];
				sum = 0;
			}

			System.out.println(max);
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}