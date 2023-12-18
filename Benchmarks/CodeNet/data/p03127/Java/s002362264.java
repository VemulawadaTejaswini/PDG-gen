import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];

		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);

		long min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] % min == 0) {
				continue;
			} else {
				min = Math.min(A[i] % min, min);
			}
		}

		System.out.println(min);
	}

}
