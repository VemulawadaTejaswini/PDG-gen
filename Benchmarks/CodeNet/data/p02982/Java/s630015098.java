import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				cnt += solve(x[i], x[j]);
			}
		}
		System.out.println(cnt);
	}

	private static int solve(int[] x1, int[] x2) {
		double sum = 0;
		int size = x1.length;
		for (int i = 0; i < size; i++) {
			sum += Math.pow(x1[i] - x2[i], 2);
		}
		sum = Math.pow(sum, 0.5);
		if (sum - Math.round(sum) == 0) {
			return 1;
		} else {
			return 0;
		}

	}
}
