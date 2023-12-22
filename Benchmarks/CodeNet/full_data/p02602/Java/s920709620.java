import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		// 処理
		int mae = 1;
		for (int i = 1; i <= K; i++) {
			mae = mae * A[i];
		}

		int ima = 1;

		for (int i = K + 1; i <= N; i++) {
			int j = i;
			for (int iter = 1; iter <= K; iter++) {
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
