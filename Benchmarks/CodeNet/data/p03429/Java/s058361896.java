import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, M, A, B;
		N = scan.nextInt();
		M = scan.nextInt();
		A = scan.nextInt();
		B = scan.nextInt();
		if ((A + B) * 2 > N * M) {
			System.out.println("NO");
		} else {

			char[][] s = new char[N][M];
			for (int q = 0; q < N; q++) {
				for (int w = 0; w < M; w++) {
					s[q][w] = 0;
				}
			}
			int k = 0;
			int j = 0;
			for (int cnt = 0; cnt < B; cnt++) {
				s[j][k] = '^';
				s[j + 1][k] = 'v';
				k++;
				if (k >= M) {
					k = 0;
					j += 2;
				}
			}
			for (int cnt = 0; cnt < A;) {
				if (s[j][k] == 0) {
					s[j][k] = '<';
					s[j][k+1] = '>';
					cnt++;
					if (k + 2 >= M) {
						k = 0;
						j++;
					} else {
						k ++;
					}
				} else {
					if (k + 2 >= M) {
						k = 0;
						j++;
					} else {
						k ++;
					}
				}

			}
			for (int q = 0; q < N; q++) {
				for (int w = 0; w < M; w++) {
					if (s[q][w] == 0) {
						System.out.print('.');
					} else {
						System.out.print(s[q][w]);
					}
				}
				System.out.println("");
			}

		}
	}
}