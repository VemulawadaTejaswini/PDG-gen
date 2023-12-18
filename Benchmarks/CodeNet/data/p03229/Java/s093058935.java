import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		Arrays.sort(A);

		int small = 0, big = N - 1;
		long ans1 = 0, ans2 = 0;
		// a1 > a2 < a3 > a4 ...
		for(int i = 1; i < N - 1; i++) {
			if(i % 2 == 1) {
				ans1 -= 2 * A[small];
				small++;
			}else {
				ans1 += 2 * A[big];
				big--;
			}
		}
		ans1 += A[big] + ((N % 2 == 0) ? -A[small] : A[small]);

		// a1 < a2 > a3 < a4 ...
		small = 0; big = N - 1;
		for(int i = 1; i < N - 1; i++) {
			if(i % 2 == 0) {
				ans2 -= 2 * A[small];
				small++;
			}else {
				ans2 += 2 * A[big];
				big--;
			}
		}
		ans2 += -A[small] + ((N % 2 == 0) ? A[big] : -A[big]);

		System.out.println(Math.max(ans1, ans2));
	}
}