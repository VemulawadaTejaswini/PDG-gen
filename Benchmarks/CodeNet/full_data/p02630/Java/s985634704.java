import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		Long[] A = new Long[(int) N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextLong();
		}
		long Q = sc.nextLong();
		Long[] B = new Long[(int) Q + 1];
		Long[] C = new Long[(int) Q + 1];
		for (int i = 1; i <= Q; i++) {
			B[i] = sc.nextLong();
			C[i] = sc.nextLong();
		}
		Long[] sortedB = B.clone();
		sortedB[0] = (long) 0;
		Arrays.sort(sortedB);
		long[] contain = new long[2 * (int) Math.pow(10, 5)];
		long sum = 0;
		for (int i = 1; i <= N; i++) {
			if (Arrays.binarySearch(sortedB, A[i]) != -1) {
				contain[(int) (long) A[i]]++;
			}
			sum += A[i];
		}
		for (int i = 1; i <= Q; i++) {
			if (contain[(int) (long) B[i]] == 0) {
				System.out.println(sum);
			} else {
				sum += contain[(int) (long) B[i]] * (C[i] - B[i]);
				System.out.println(sum);
				if (Arrays.binarySearch(sortedB, C[i]) != -1) {
					contain[(int) (long) C[i]] += contain[(int) (long) B[i]];
				}
				B[i] = (long) 0;
			}
		}
	}
}