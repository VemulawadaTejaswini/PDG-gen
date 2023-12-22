import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		// 処理
		long mae = 1;
		for (int i = 0; i < K; i++) {
			mae = mae * A[i];
		}

		long ima = 1;

		for (int i = K; i < N; i++) {
			int j = i;
			for (int iter = 0; iter < K; iter++) {
				ima = ima * A[j];
				j--;
			}
			if (mae < ima) {
				System.out.println("Yes");
			} else if (mae >= ima) {
				System.out.println("No");
			}
			mae = ima;
			ima = 1;
		}

	}

}
