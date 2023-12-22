import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long r = 1000000007;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong() % r;
		}

		sc.close();

		long result = 0;


		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				result = result + (A[i] * A[j]);
			}
		}
		System.out.print(result % r);
	}

}