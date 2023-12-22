import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		final int m = sc.nextInt();

		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int a = sc.nextInt();
				matrix[i][j] = a;
			}
		}

		int[] vector = new int[m];
		for (int i = 0; i < m; i++) {
			vector[i] = sc.nextInt();
		}

		sc.close();

		int[] calcdVector = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				calcdVector[i] += matrix[i][j] * vector[j];
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(calcdVector[i]);
		}
	}
}