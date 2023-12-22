import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static long K;
	static long[] A;
	static long[] B;
	static int[][] MAX;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		A = new long[N + 1];
		A[0] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt() + A[i - 1];
		}
		B = new long[M + 1];
		B[0] = 0;
		for (int i = 1; i <= M; i++) {
			B[i] = sc.nextInt() + B[i - 1];
		}

		int result = 0;
		for (int i = 0; i <= N && A[i] <= K; i++) {
			long K2 = K - A[i];
			for (int j = 0; j <= M && B[j] <= K2; j++) {
				if (result < i + j) {
					result = i + j;
				}
			}
		}

		System.out.println(result);
	}
}
