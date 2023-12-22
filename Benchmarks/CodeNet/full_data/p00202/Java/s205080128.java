import java.util.*;

public class Main {
	Scanner sc;
	boolean[] dp;
	boolean[] primes;
	int[] cost;
	int budget;
	int n;
	
	void isPrime() {
		primes = new boolean[1000001];
		primes[0] = primes[1] = false;
		for(int i=2;i<1000001;i++) primes[i] = true;
		for(int i=2;i<1000001;i++) {
			if(primes[i]) for(int j=2*i;j<1000001;j+=i)
				primes[j] = false;
		}
	}
	
	int solve() {
		int ans = -1;
		for(int i=0;i<budget+1;i++) {
			if(dp[i]) {
				ans = primes[i]? i:ans;
				for(int j=0;j<n;j++) 
					if(i+cost[j] <= budget) dp[i+cost[j]] = true;
			}
		}
		return ans;
	}
	
	void run() {
		sc = new Scanner(System.in);
		isPrime();
		while (true) {
			n = sc.nextInt();
			if(n == 0) break;
			budget = sc.nextInt();
			 cost = new int[n];
			for (int i=0;i<n;i++) cost[i] = sc.nextInt();
			dp = new boolean [budget+1];
			for (int i=0;i<budget+1;i++) dp[i] = false;
			dp[0] = true;
			int ans = solve();
			if(ans <= 0) System.out.println("NA");
			else System.out.println(ans);
			
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}