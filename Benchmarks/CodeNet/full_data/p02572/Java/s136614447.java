import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}

		sc.close();

		long result = 0;
		long r = (long) Math.pow(10, 9) + 7;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				result = result + (A[i] * A[j]) % r;
			}
		}
		System.out.print(result % r);
	}

}
