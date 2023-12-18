import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		long plus[] = new long[N];
		Arrays.fill(plus, 0);
		long sum = 0;
		long minus = 0;
		int cnt = 0;
		int ans2 = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			if(A[i] - B[i] >= 0) {
				plus[cnt] = A[i] - B[i];
				sum += A[i] - B[i];
				cnt++;
			} else {
				minus += B[i] - A[i];
				ans2++;
			}
		}
		Arrays.sort(plus);
		
		if(sum < minus) {
			System.out.println(-1);
		} else {
			if(ans2 == 0) {
				System.out.println(0);
				return;
			}
			int sum2 = 0;
			int ans = 0;
			while(sum2 < minus) {
				sum2 += plus[N - 1 - ans];
				ans++;
			}
			System.out.println(ans + ans2);
		}
	}
}