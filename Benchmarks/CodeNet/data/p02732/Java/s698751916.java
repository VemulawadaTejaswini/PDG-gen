import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] A = new int[N];
		int i, j;
		for (i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		// ArrayList<Integer> B = new ArrayList<Integer>();
		for (i = 0; i < N; i++) {
			int[] B = new int[N];
			int count = 0;
			for (j = 0; j < N; j++) {
				if (i == j) {

				} else {
					B[A[j] - 1]++;
				}
			}
			for (j = 0; j < N; j++) {
				if (B[j] != 0) {
					count += B[j] * (B[j] - 1) / 2;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
