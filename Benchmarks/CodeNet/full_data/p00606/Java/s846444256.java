import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int start, goal, close;
		double a[][];
		int k;
		n = sc.nextInt();
		while (n != 0) {
			start = (int)(sc.next().charAt(0) - 'A' + 1);
			goal  = (int)(sc.next().charAt(0) - 'A' + 1);
			close = (int)(sc.next().charAt(0) - 'A' + 1);

			a = new double[n + 1][10];
			for (int i = 0; i <= n; i++) {
				for (int j = 1; j <= 9; j++) {
					k = 0;
					if (i == 0) {
						if (j == goal) {
							a[i][j] = 1.0;
						} else {
							a[i][j] = 0.0;
						}
					} else {
						if (j % 3 == 1 && j + 1 != close) {
							a[i][j] += a[i - 1][j + 1] / 4;
							k++;
						}
						if (j % 3 == 2) {
							if (j + 1 != close) {
								a[i][j] += a[i - 1][j + 1] / 4;
								k++;
							}
							if (j - 1 != close) {
								a[i][j] += a[i - 1][j - 1] / 4;
								k++;
							}
						}
						if (j % 3 == 0 && j - 1 != close) {
							a[i][j] += a[i - 1][j - 1] / 4;
							k++;
						}
						if (1 <= j && j <= 3 && j + 3 != close) {
							a[i][j] += a[i - 1][j + 3] / 4;
							k++;
						}
						if (4 <= j && j <= 6) {
							if (j - 3 != close) {
								a[i][j] += a[i - 1][j - 3] / 4;
								k++;
							}
							if (j + 3 != close) {
								a[i][j] += a[i - 1][j + 3] / 4;
								k++;
							}
						}
						if (7 <= j && j <= 9 && j - 3 != close) {
							a[i][j] += a[i - 1][j - 3] / 4;
							k++;
						}
						a[i][j] += a[i - 1][j] * (4 - k) / 4;
					}
				}
			}
			System.out.println(a[n][start]);
			n = sc.nextInt();
		}
	}
}