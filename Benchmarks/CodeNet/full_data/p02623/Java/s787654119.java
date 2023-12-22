import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = (int)1e9 + 7;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e7;
	
	
	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N + 1];
		long B[] = new long[M + 1];
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextLong();
			A[i] += A[i - 1];
		}
		for(int i = 1; i <= M; i++) {
			B[i] = sc.nextLong();
			B[i] += B[i - 1];
		}
		int max = 0;
		for(int i = 0; i <= N; i++) {
			long cur = K - A[i];
			if(cur < 0) continue;
			int l = 0, r = M, m = (l + r + 1) / 2;
			while(cur < B[r]) {
				if(cur < B[m]) {
					r = m - 1;
					m = (l + r + 1) / 2;
				}
				else {
					l = m;
					m = (l + r + 1) / 2;
				}
			}
			max = Math.max(max, i + r);
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
 
}