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

			if (a[0] == 0) {
				for (int i = 1; i <= n; i++) {
					if (a[i] == 1) {
						sum++;
					} else {
						sum = 0;
					}
					if (max < sum) {
						max = sum;
					}
				}
			} else {
				for (int i = 1; i <= n; i++) {
					if (a[i] == 0) {
						if ((i == 1) || (1 < i && i < n && (a[i - 1] != 0 || a[i + 1] != 0)) || (i == n)) {
							a[i]++;
							for (int j = 1; j <= n; j++) {
								if (a[j] == 1) {
									sum++;
								} else {
									sum = 0;
								}
								if (max < sum) {
									max = sum;
								}
							}
							a[i]--;
						}
					}
				}
			}

			System.out.println(max);
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}