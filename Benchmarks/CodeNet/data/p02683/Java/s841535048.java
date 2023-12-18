import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int powN = (int)(Math.pow(2, N) + 0.5);
		int M = scan.nextInt();
		int X = scan.nextInt();
		int f = 0;
		int total[] = new int[M+1];
		int C[] = new int[N+1];
		int A[][] = new int[N+1][M+1];
		int ans = 0;
		for(int i = 1; i < N+1; i++) {
			C[i] = scan.nextInt();
			for(int j = 1; j < M+1; j++) {
				A[i][j] = scan.nextInt();
			}
		}


		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < M+1; j++) {
				total[j] += A[i][j];
			}
			total[0] += C[i];
		}

		for (int j = 1; j < M+1; j++) {
			if (total[j] > X) {
				continue;
			}
			f++;
		}

		if (f > 0) {
			ans = -1;
		} else {
			ans = total[0];

			for (int i = 1; i < powN; i++) {
				for (int j = 0; j < M+1; j++) {
					total[j] = 0;
				}
				f = 0;
				int powk = 1;
				for (int k = 1; k < N+1; k++) {
					if ((i & powk) == powk) {
						total[0] += C[k];
						for (int j = 1; j < M+1; j++) {
							total[j] += A[k][j];
						}
					}
					powk *= 2;
				}

				for (int j = 1; j < M+1; j++) {
					if (total[j] >= X) {
						continue;
					}
					f++;
				}

				if (f == 0 && ans > total[0]) {
					ans = total[0];
				}

			}
		}

		System.out.println(ans);

	}
}