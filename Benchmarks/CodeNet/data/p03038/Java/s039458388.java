import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextLong();
		}
		Arrays.sort(A);
		long[][] BC = new long[M][2];
		for (int i = 0; i < M; i++) {
			BC[i][0] = in.nextLong();
			BC[i][1] = in.nextLong();
		}
		Arrays.sort(BC, (a, b) -> Long.compare(b[1], a[1]));

		long sum = 0;
		int index = 0;
		for (int i = 0; i < M; i++) {
			for (long j = 0; index < A.length && j < BC[i][0]; j++) {
				sum += Math.max(A[index], BC[i][1]);
				index++;
			}
		}

		for (int i = index; i < A.length; i++) {
			sum += A[i];
		}
		System.out.println(sum);
		in.close();
	}
}