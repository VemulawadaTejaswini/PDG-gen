import java.util.*;

// ABC 80-D
// https://beta.atcoder.jp/contests/abc080/tasks/abc080_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		
		int[] numOpens = new int[N];
		for (int i = 0; i < N; i++) {
			int n = 0;
			for (int j = 0; j < 10; j++) {
				n += in.nextInt();
			}
			numOpens[i] = n;
		}
		
		int[][] points = new int[N][11];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 11; j++) {
				points[i][j] = in.nextInt();
			}
		}
		
		// Stores the max of points at each store.
		// max[i][0] = max element from 0 to numOpens[i] at store i
		// max[i][1] = max element from 1 to numOpens[i] at store i
		int[][] max = new int[N][2];
		for (int i = 0; i < N; i++) {
			int n = Integer.MIN_VALUE;
			for (int j = 1; j <= numOpens[i]; j++) {
				n = Math.max(n, points[i][j]);
			}
			max[i][1] = n;
			max[i][0] = Math.max(n, points[i][0]);
		}
		
		long answer = Long.MIN_VALUE;
		
		for (int i = 0; i < N; i++) {
			int n = 0;
			for (int j = 0; j < N; j++) {
				if (i == j) {
					n += max[j][1];
				} else {
					n += max[j][0];
				}
			}
			answer = Math.max(answer, n);
		}
		System.out.println(answer);
	}
}