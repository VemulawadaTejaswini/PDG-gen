import java.util.*;
import java.util.stream.*;

public class Main {

	int mod = 1000000007;

	class P implements Comparable<P>{
		int d;
		int c;
		P(int d, int c){
			this.d=d;
			this.c=c;
		}
		@Override
		public int compareTo(P arg0) {
			return Integer.compare(this.d, arg0.d);
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		List<P> s = new ArrayList<>();
		for(int i=1; i*i<=n; i++) {
			s.add(new P(i, 0));
			s.add(new P(n/i, 0));
		}

		Collections.sort(s);

		s = s.stream().distinct().collect(Collectors.toList());

		for(int i=0; i<s.size()-1; i++) {
			int l = n/s.get(i+1).d;
			int r = n/s.get(i).d;
			s.get(i).c =  r-l;
		}
		s.get(s.size()-1).c = 1;
		int m = s.size();
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<m; i++) {
			mp.put(s.get(i).d, i);
		}
		long dp[][] = new long[k+1][m];
		dp[0][mp.get(n)] = 1;
		for(int i=0; i<k; i++) {
			for(int j = m-2; j>=0; j--) {
				dp[i][j] += dp[i][j+1];
				dp[i][j] %= mod;
			}
			for(int j=0; j<m; j++) {
				int nj = mp.get(n/s.get(j).d);
				long tmp = dp[i][nj] * s.get(j).c;
				tmp %= mod;
				dp[i+1][j] += tmp;
				dp[i+1][j] %= mod;
			}
		}
		int ans = 0;
		for(int i=0; i<m; i++) {
			ans += dp[k][i];
			ans %= mod;
		}
		System.out.println(ans);
		sc.close();
	}

}
