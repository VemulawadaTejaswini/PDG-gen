import java.util.*;
public class Main {
	static long mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		System.out.println(solve());
//		for(int i = 0; i < 3; i++){
//			for(int j = 1; j <= 6; j++){
//				System.out.println(i+" "+j+": "+calc(i, j));
//			}
//		}
//		for(int i = 0; i < k; i++){
//			System.out.println(dp[i].size());
//		}
//		System.out.println("bla");
	}
	static HashMap<Integer, Long>[] dp;
	static long solve(){
		m = (int) Math.sqrt(n);
		dp = new HashMap[k];
		for(int i = 0; i < k; i++) {
			dp[i] = new HashMap<>();
		}
		for(int i = k-1; i >= 0; i--){
			for(int t = 1; t <= m; t++){
				calc(i, t);
			}
			for(int t = m; t >= 1; t--){
				calc(i, n / t);
			}
		}
		return calc(0, n);
	}
	static int n, k, m;
	static long calc(int r, int t){
		if(r == k-1) {
			return t;
		}
		if(dp[r].containsKey(t)) {
			return dp[r].get(t);
		}
		if(t <= m){
			if(t == 1){
				long res = calc(r+1, n);
				dp[r].put(t, res);
				return res;
			}
			else{
				long res = (calc(r, t-1) + calc(r+1, n / t)) % mod;
				dp[r].put(t, res);
				return res;
			}
		}
		else{
			long res = 0;
//			for(int i = 1; i <= m; i++){
//				res = (res + calc(r+1, n / i)) % mod;
//			}
//			res += calc(r, m);
			
//			for(int i = n / m - 1; i >= 1; i--){
//				int a = n / (i+1);
//				int b = Integer.min(n / i, t);
//				if(a > t) break;
//				res = (res + ((b-a) * calc(r+1, i)) % mod) % mod;
//			}
			
			int c = n / t;
			int a = n / (c + 1);
			res = (calc(r, a) + ((t - a) * calc(r+1, c)) % mod) % mod;
			
			dp[r].put(t, res);
			return res;
		}
	}
//	static class Pair{
//		int r, t;
//		public Pair(int r, int t){
//			this.r = r; this.t = t;
//		}
//		@Override
//		public int hashCode(){
//			return r+t;
//		}
//		@Override
//		public boolean equals(Object o){
//			Pair p = (Pair)o;
//			return r == p.r && t == p.t;
//		}
//		public String toString(){
//			return r+" "+t;
//		}
//	}
}
//100 10
//554261130

