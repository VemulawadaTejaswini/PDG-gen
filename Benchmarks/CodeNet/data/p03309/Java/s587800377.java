import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (Math.abs(A[i]) > max) {
				max = Math.abs(A[i]);
			}
		}

		int min = Integer.MAX_VALUE;

		int plus = 0, minus = 0;
		for (int b = 1; b < max; b++) {
			plus = 0;
			minus = 0;
			for (int i = 0; i < N; i++) {
				plus += Math.abs(A[i] - (b + i));
				minus += Math.abs(A[i] - (-b + i));
			}

			if (min > plus) {
				min = plus;
			}
			if (min > minus) {
				min = minus;
			}

		}

		System.out.println(min);

		sc.close();
	}

}
