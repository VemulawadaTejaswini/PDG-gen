import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		int ans1 = 0;
		for(int i = 0; i < N / 2; i++) {
			if(i == 0) {
				ans1 += Math.abs(A[N - 1] - A[i]);
				ans1 += Math.abs(A[N - 2] - A[i]);
			} else {
				ans1 += Math.abs(A[N - i - 2] - A[i]);
				ans1 += Math.abs(A[N - i - 2 + 2] - A[i]);
			}
		}
		
		int ans2 = 0;
		for(int i = 0; i < N / 2 - 1; i++) {
			if(i == 0) {
				ans2 += Math.abs(A[N - 1] - A[i]);
				ans2 += Math.abs(A[N - 2] - A[i]);
			} else {
				ans2 += Math.abs(A[N - i - 2] - A[i]);
				ans2 += Math.abs(A[N - i - 2 + 2] - A[i]);
			}
		}
		ans2 += Math.abs(A[N / 2 - 1] - A[N / 2 + 2]);
		ans2 += Math.abs(A[N / 2] - A[N / 2 + 1]);
		
		System.out.println(Math.max(ans1, ans2));
	}
}
