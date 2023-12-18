import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] P = new int[M];
		int[] Y = new int[M];
		String[] Num = new String[M];
		int[][] table = new int[N][M];
		int[] count = new int[N];
		for (int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			table[P[i] - 1][count[P[i] - 1]] = Y[i];
			count[P[i] - 1]++;
		}
		for (int i = 0; i < M; i++) {
			Arrays.sort(table[P[i] - 1]);
		}

		for (int i = 0; i < M; i++) {
			int count2 = 0;
			for (int j = 0; j < M; j++) {
				if (table[P[i] - 1][j] != 0) {
					count2++;
					if (table[P[i] - 1][j] == Y[i]) {
						System.out.println(String.format("%06d", P[i]) + String.format("%06d", count2));
					}
				}

			}
		}

	}

}
