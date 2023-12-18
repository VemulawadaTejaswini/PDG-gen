import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int[] A = new int[N + 1];
		int[] B = new int[N];
		String[] values = sc.nextLine().split(" ");
		for (int i = 0; i < values.length; i++) {
			A[i] = Integer.parseInt(values[i]);
		}
		values = sc.nextLine().split(" ");
		for (int i = 0; i < values.length; i++) {
			B[i] = Integer.parseInt(values[i]);
		}

		int[][] chart = new int[N][N + 1];
		for (int i = 0; i < N; i++) {
			if (B[i] > A[i]) {
				chart[i][i] = A[i];
				B[i] -= A[i];

				if (B[i] > A[i + 1]) {
					chart[i][i + 1] = A[i + 1];
					A[i + 1] = 0;
				} else {
					chart[i][i + 1] = B[i];
					A[i + 1] -= B[i];
					B[i] = 0;
				}
			} else {
				chart[i][i] = B[i];
				A[i] -= B[i];
				B[i] -= 0;
			}
		}
		int cnt = 0;
		for (int[] row : chart) {
			for (int val : row) {
				cnt += val;
			}
		}
		System.out.println(cnt);
	}
}