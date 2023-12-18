import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		ArrayList<Long> plus = new ArrayList<Long>();
		long sum = 0;
		long minus = 0;
		int ans2 = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextLong();
		}
		for(int i = 0; i < N; i++) {
			if(A[i] - B[i] >= 0) {
				plus.add(A[i] - B[i]);
				sum += A[i] - B[i];
			} else {
				minus += B[i] - A[i];
				ans2++;
			}
		}
		Collections.reverse(plus);
		
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
				sum2 += plus.get(ans);
				ans++;
			}
			System.out.println(ans + ans2);
		}
	}
}