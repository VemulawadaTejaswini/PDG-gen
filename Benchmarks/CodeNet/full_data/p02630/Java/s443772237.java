import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		int Q = sc.nextInt();
		Integer[] B = new Integer[Q + 1];
		Integer[] C = new Integer[Q + 1];
		for (int i = 1; i <= Q; i++) {
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
		}
		Integer[] sortedB = B.clone();
		sortedB[0] = 0;
		Arrays.sort(sortedB);
		Integer[] contain = new Integer[2 * (int) Math.pow(10, 5) + 1];
		long sum = 0;
		for (int i = 1; i <= N; i++) {
			if (Arrays.binarySearch(sortedB, A[i]) != -1) {
				contain[A[i]]++;
			}
			sum += A[i];
		}
		for (int i = 1; i <= Q; i++) {
			if (contain[B[i]] == 0) {
				System.out.println(sum);
			} else {
				sum += contain[B[i]] * (C[i] - B[i]);
				System.out.println(sum);
				if (Arrays.binarySearch(sortedB, C[i]) != -1) {
					contain[C[i]] += contain[B[i]];
				}
				B[i] = 0;
			}
		}
	}
}