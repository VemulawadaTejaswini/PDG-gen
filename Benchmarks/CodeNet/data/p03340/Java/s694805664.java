import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}

		long res = 0;
		int right = 0;
		int sum = 0;
		for (int left = 0; left < N; left++) {
			while (right < N && (sum ^ A[right]) == (sum + A[right])) {
				sum += A[right];
				right++;
			}

			res += right - left;
			if (left == right) {
				right++;
			} else {
				sum -= A[left];
			}
		}

		System.out.println(res);
	}
}