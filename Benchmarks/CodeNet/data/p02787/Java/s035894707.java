import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int H = Integer.valueOf(s.next());
		int N = Integer.valueOf(s.next());
		int[] A = new int[N+1];
		int[] B = new int[N+1];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.valueOf(s.next());
			B[i] = Integer.valueOf(s.next());
		}
		
		long[] dp = new long[20000];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 10000; j++) {
				dp[j+A[i]] = Long.min(dp[j+A[i]], dp[j] + B[i]);
			}
		}
		for(int i = 10001; i >= 0; i--) {
			dp[i] = Long.min(dp[i], dp[i+1]);
		}
		
		System.out.println(dp[H]);
	}
}