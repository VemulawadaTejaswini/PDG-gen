import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, C;
		N = sc.nextInt();
		M = sc.nextInt();
		C = sc.nextInt();
		int B[] = new int[M];
		int A[][] = new int[N][M];

		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
				sum += B[j] * A[i][j];
			}
			if (sum + C > 0) {
				ans++;
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
