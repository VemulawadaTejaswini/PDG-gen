import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();

		int[][] gA = new int[n][m];
		int[][] gB = new int[m][l];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				gA[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < l; j++) {
				gB[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int[][] gC = new int[n][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {

				int val = 0;
				for (int k = 0; k < m; k++) {
					val += gA[i][k] * gB[k][j];
				}
				gC[i][j] = val;
			}
		}

		for(int[] c : gC) {
			StringJoiner sj = new StringJoiner(" ");
			for(int val : c) {
				sj.add(String.valueOf(val));
			}
			System.out.println(sj);
		}
	}
}