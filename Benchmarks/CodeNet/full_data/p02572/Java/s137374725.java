import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];

		A[0] = sc.nextLong();

		long result = 0;
		long r = (long) Math.pow(10, 9) + 7;

		for (int j = 1; j < N; j++) {
			A[j] = sc.nextLong();
			result = result + (A[0] * A[j]) % r;
		}

		for (int i = 1; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				result = result + (A[i] * A[j]) % r;
			}
		}
		System.out.print(result % r);
	}

}
