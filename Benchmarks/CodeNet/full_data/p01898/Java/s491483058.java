import java.util.Arrays;
import java.util.Scanner;

/**
 * Taking a Seat
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		int M, N;
		M = sc.nextInt();
		N = sc.nextInt();

		boolean[][] seats = new boolean[M + 2][N + 2];

		for (int i = 0; i < M + 2; i++) {
			Arrays.fill(seats[i], true);
		}

		//
		for (int i = 0; i < M; i++) {
			String s = sc.next();
			if (i == 0) {
				Arrays.fill(seats[1], false);
				continue;
			}
			for (int j = 0; j < N; j++) {
				char c = s.charAt(j);
				if (c == 'o') {
					for (int k = 0; k <= 2; k++) {
						seats[i + 1][j + k] = false;
					}
				} else if (c == 'x') {
					for (int k = 0; k <= 2; k++) {
						for (int l = 0; l <= 2; l++) {
							seats[i + k][j + l] = false;
						}
					}
				}
			}
		}

		int ans = 0;

		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				if (seats[i][j]) ans++;
			}
		}

		System.out.println(ans);
	}
}