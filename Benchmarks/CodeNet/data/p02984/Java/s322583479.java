import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextDouble();
		}
		long[][] b = new long[N][N + 1];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j == i || j == i + 1 || (i == N - 1 && j == 0)) {
					b[i][j] = 0.5;
				} else {
					b[i][j] = 0;
				}
			}
			b[i][N] = a[i];
		}

		for (int k = 0; k < N - 1; k++) {
			for (int i = k + 1; i < N; i++) {
				double d = b[i][k] / b[k][k];
				for (int j = k + 1; j <= N; j++) {
					b[i][j] -= b[k][j] * d;
				}
			}
		}
		for (int i = N - 1; i >= 0; i--) {
			double d = b[i][N];
			for (int j = i + 1; j < N; j++) {
				d -= b[i][j] * b[j][N];
			}
			b[i][N] = d / b[i][i];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			if (i > 0) {
				sb.append(" ");
			}
			sb.append((int)b[i][N]);
		}
		System.out.println(sb.toString());
	}
}