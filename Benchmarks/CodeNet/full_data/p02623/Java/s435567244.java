import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int M = Integer.valueOf(s.next());
		long K = Long.valueOf(s.next());
		long[] A = new long[N+1];
		long[] B = new long[M+1];
		long[] dp = new long[M+2];
		int ret = 0;
		A[0] = Long.valueOf(s.next());
		for(int i = 1; i < N; i++) {
			A[i] = A[i-1] + Long.valueOf(s.next());
		}
		for(int i = 0; i < M; i++) {
			B[i] = Long.valueOf(s.next());
		}
		A[N] = B[M] = K;
		
		for(int i = 1; i <= N; i++) {
			dp[0] = A[i-1];
			if(dp[0] > K) {
				ret = Integer.max(ret, i-1);
				break;
			}
			for(int j = 0; j <= M; j++) {
				dp[j + 1] = dp[j] + B[j];
				if(dp[j + 1] > K) {
					ret = Integer.max(ret, i + j);
					break;
				}
			}
		}
		System.out.println(ret);
	}
}