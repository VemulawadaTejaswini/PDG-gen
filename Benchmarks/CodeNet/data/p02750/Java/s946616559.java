import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class Store implements Comparable<Store>{
		long a;
		long b;
		public Store(int a , int b) {
			this.a = a;
			this.b = b;
		}
		double value(){
			return a * 1.0 /(double) (b + 1);
		}
		@Override
		public int compareTo(Store o) {
			if(a == 0 && o.a == 0){
				return Long.compare(b, o.b);
			}
			return Double.compare(o.value(), value());
		}
	}
	static int solve(Store[] stores, long T){
		List<Store> nonzeroAStores = new ArrayList<Store>();
		List<Store> zeroAStores = new ArrayList<Store>();
		for(Store s : stores){
			if(s.a == 0){
				zeroAStores.add(s);
			}else{
				nonzeroAStores.add(s);
			}
		}
		int N = nonzeroAStores.size();
		long dp[] = new long[Math.min(30, N + 1)];
		Arrays.fill(dp , -1);
		dp[0] = 0;
		for(Store s : nonzeroAStores){
			long next[] = new long[dp.length];
			for(int k = 0 ; k < dp.length ; ++k){
				long ret = -1;
				if(dp[k] >= 0){
					ret = dp[k];
				}
				if(k > 0 && dp[k - 1] >= 0){
					long r2 = (dp[k - 1] + 1) * s.a + s.b + dp[k - 1] + 1;
//					long r2 = (s.a + 1) * dp[k - 1] + s.b + 1 + s.a;
					if(ret < 0){
						ret = r2;
					}else{
						ret = Math.min(ret, r2);
					}
				}
				if(ret >= T + 1){
					ret = -1;
				}
				next[k] = ret;
			}
			dp = next;
		}
		int ret = 0;
		for(int k = 0 ; k < dp.length ; ++k){
			long t = dp[k];
			if(t < 0){
				continue;
			}
			ret = Math.max(ret, k);
			for(int i = 0 ; i < zeroAStores.size(); ++i){
				Store s = zeroAStores.get(i);
				long nt = t + 1 + s.b;
				if(nt < T + 1){
					ret = Math.max(ret, k + i + 1);
				}
				t = nt;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		Store stores[] = new Store[N];
		for(int i = 0 ; i < N ; ++i){
			stores[i] = new Store(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(stores);
		System.out.println(solve(stores , T));
	}
}
