import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int j = 0;
		int m[][] = new int[200][200];
		int X[] = new int[200];

		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			X[i] = a;
			X[i + 1] = b;
		}

		for (int k = 2; k <= n; k++) {
			for (int i = 1; i <= n - k + 1; i++) {
				j = i + k - 1;
				m[i][j] = 10000000;
				for (int l = i; l <= j - 1; l++) {
					if (m[i][j] > m[i][l] + m[l + 1][j] + X[i - 1] * X[l] * X[j]) {
						m[i][j] = m[i][l] + m[l + 1][j] + X[i - 1] * X[l] * X[j];
						//System.out.println(m[i][j]);
					}
				}
			}
		}
		System.out.println(m[1][n]);
	}
}
