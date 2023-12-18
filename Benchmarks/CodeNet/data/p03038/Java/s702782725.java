import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		long[] A = new long[N];
		int[] B = new int[M];
		long[] C = new long[M];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}

		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
			C[i] = sc.nextLong();
		}

		Arrays.sort(A);

		int count = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (count < B[i] && A[j] < C[i]) {
					A[j] = C[i];
					count++;
				} else if (count >= B[i] || A[j] >= C[i]) {
					break;
				}
			}
			Arrays.sort(A);
			count = 0;
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += A[i];
		}
		System.out.println(ans);
	}
}
