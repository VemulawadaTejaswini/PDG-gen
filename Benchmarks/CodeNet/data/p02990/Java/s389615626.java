import java.util.*;
public class Main {
	public static long calc(int a) {
		if(a == 0) {
			return 1;
		}
		else {
			long ans = 1;
			for(int i = 1; i <= a; i++) {
				ans *= i;
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		long[] ans = new long[K];
		
		if(K >= N-K) {
			if(N-K+1 < K) {
				for(int i = N-K+1; i < K; i++) {
					ans[i] = 0;
				}
			}
			
			for(int i = 0; i < N-K+1; i++) {
				long a = 1;
				a *= (calc(K-1)*calc(N-K+1)/(calc(K-i-1)*calc(i)*calc(N-K-i)*calc(i+1)));
				a = a%1000000009;
				ans[i] = a;
			}
		}
		
		else {
			for(int i = 0; i < K; i++) {
				long a = 1;
				a *= (calc(K-1)*calc(N-K+1)/(calc(K-i-1)*calc(i)*calc(N-K-i)*calc(i+1)));
				a = a%1000000009;
				ans[i] = a;
			}
		}
		
		for(int i = 0; i < K; i++) {
			System.out.println(ans[i]);
		}

	}

}