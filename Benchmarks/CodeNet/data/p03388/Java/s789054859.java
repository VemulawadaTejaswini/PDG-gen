import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		long[] A = new long[Q];
		long[] B = new long[Q];
		for (int i = 0; i < Q; i++) {
			A[i] = sc.nextLong();
			B[i] = sc.nextLong();
		}
		sc.close();

		for (int i = 0; i < Q; i++) {
			long min = Math.min(A[i], B[i]);
			long max = Math.max(A[i], B[i]);

			if (min == max || min + 1 == max) {
				System.out.println(min * 2 - 2);
				continue;
			}
			long sqrt = (long)Math.sqrt(min * max);
			while (sqrt * sqrt >= min * max)
				sqrt--;
			if (sqrt * (sqrt + 1) >= min * max) {
				System.out.println(sqrt * 2 - 2);
				continue;
			}
			System.out.println(sqrt * 2 - 1);
		}
	}
}