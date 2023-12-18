import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] A = new long[M];
		long sum = 0;
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		sc.close();

		if (sum > N) {
			System.out.println("-1");
		} else {
			System.out.println(N - sum);
		}
	}
}
