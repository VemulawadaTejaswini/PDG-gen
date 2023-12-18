import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0; i<N; i++ ) {
			A[i] = sc.nextInt();
		}

		Arrays.sort(A);
		int result = 0;

		if (N == 3) {
			if (A[N/2] > A[0]) {
				result = (A[N-1]-A[0]) + (A[N-2]-A[0]);
			} else {
				result = (A[N/2]-A[0]) + (A[N/2]-A[1]);
			}
		} else {
			for (int j=1; j <= N/2; j++) {
				if (j!=1) {
					result += A[N-j] - A[j-1];
					result += A[N-j] - A[j-2];
				} else {
					result += A[N-j] - A[j-1];
					result += A[N-j] - A[N/2];
				}
			}
		}

		System.out.println(result);
	}
}