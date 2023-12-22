

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	int SIZE = 81;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int k = 0; k < n; k++) {
			char[] a = new char[SIZE];
			char[] b = new char[SIZE];

			int[] x = new int[SIZE];
			int[] y = new int[SIZE];
			int[] ans = new int[SIZE];

			Arrays.fill(ans, 0);

			a = sc.next().toCharArray();
			b = sc.next().toCharArray();

			for (int i = 0; i < a.length; i++) {
				x[i] = a[i] - '0';
			}

			for (int i = 0; i < b.length; i++) {
				y[i] = b[i] - '0';
			}

			int i = a.length - 1;
			int j = b.length - 1;
			int l = 0;

			boolean flag = true;

			while (i >= 0 || j >= 0) {
				if (j < 0) {
					while (i >= 0) {
						ans[l] += x[i];
						if (ans[l] >= 10) {
							ans[l] -= 10;
							if (l + 1 >= 80) {
								flag = false;
								break;
							}
							ans[l + 1] = 1;
						}
						l++;
						i--;
					}
					break;
				}

				if (i < 0) {
					while (j >= 0) {
						ans[l] += y[j];
						if (ans[l] >= 10) {
							ans[l] -= 10;
							if (l + 1 >= 80) {
								flag = false;
								break;
							}
							ans[l + 1] = 1;
						}
						l++;
						j--;
					}
					break;
				}

				ans[l] += (x[i] + y[j]);
				if (ans[l] >= 10) {
					ans[l] -= 10;
					if (l + 1 >= 80) {
						flag = false;
						break;
					}
					ans[l + 1] = 1;
				}
				l++;
				i--;
				j--;
			}

			if (!flag) {
				System.out.println("overflow");
			}
			else {
				if (ans[l] != 0) {
					l++;
				}
				for (int m = l - 1; m >= 0; m--) {
					System.out.print(ans[m]);
				}
				System.out.println();
			}

		}

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}