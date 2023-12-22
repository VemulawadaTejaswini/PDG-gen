import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X[][] = new int[N + 1][N + 1];
		int Prev[][] = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				Prev[i][j] = i;
				if (i != j)
					X[i][j] = 1000000000;

			}
		}

		for (int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			X[a][b] = 1;
			X[b][a] = 1;
		}

		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (X[i][j] > X[i][k] + X[k][j]) {
						X[i][j] = X[i][k] + X[k][j];
						Prev[i][j] = k;
					}
				}
			}
		}

//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N; j++) {
//				System.out.print(X[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N; j++) {
//				System.out.print(Prev[i][j] + " ");
//			}
//			System.out.println();
//		}
		System.out.println("YES");

		for (int j = 2; j <= N; j++) {
			System.out.println(Prev[1][j]);
		}
	}
}