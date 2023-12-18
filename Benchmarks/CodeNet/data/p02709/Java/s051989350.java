import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class P implements Comparable<P>{
		int idx;
		long val;
		public P(int i , long v) {
			idx = i;
			val = v;
		}
		@Override
		public int compareTo(P o) {
			return Long.compare(o.val, val);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		P A[] = new P[N];
		for(int i = 0 ; i < N ; ++i){
			long a = sc.nextLong();
			A[i] = new P(i , a);
		}
		Arrays.sort(A);
		long dp[] = new long[N + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		for(int i = 0 ; i < N ; ++i){
			P p = A[i];
			long next[] = new long[N + 1];
			Arrays.fill(next, -1);
			for(int l = 0 ; l <= i ; ++l){
				if(dp[l] < 0){
					continue;
				}
				int r = i - l;
				long lv = p.val * Math.abs(p.idx - l);
				long rv = p.val * Math.abs(N - 1 - r - p.idx);
				next[l] = Math.max(dp[l] + rv, next[l]);
				next[l + 1] = Math.max(next[l + 1] , dp[l] + lv);
			}
			dp = next;
//			System.out.println(Arrays.toString(dp));
		}
		long ret = 0;
		for(long d : dp){
			ret = Math.max(d, ret);
		}
		System.out.println(ret);
	}
}
