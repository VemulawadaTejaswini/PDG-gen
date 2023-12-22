
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	boolean[] isPrime = new boolean[1000001];
	void run() {
		Scanner sc = new Scanner(System.in);
		for(int i=2;i<=1000000;i++) { 
			if(!isPrime[i])
				for(int j=i*2;j<=1000000;j+=i) isPrime[j] = true;
		}
		isPrime[0] = isPrime[1] = true;
		for(;;) {
			int n = sc.nextInt();
			int cost = sc.nextInt();
			if((n|cost) == 0) break;
			boolean[] dp = new boolean[cost+1];
			fill(dp, false);
			dp[0] = true;
			int[] dish = new int[n];
			for(int i=0;i<n;i++) dish[i] = sc.nextInt();
			
			for(int i=0;i<=cost;i++) for(int j=0;j<n;j++) {
				if(i + dish[j] <= cost && dp[i]) 
					dp[i+dish[j]] = true;
			}
			int ans;
			for(ans = cost;ans>=0;ans--) {
				if( dp[ans]&(!isPrime[ans]) ) break;
			}
			if(ans == -1) System.out.println("NA");
			else System.out.println(ans);
		}
		
	}

	public static void main(String[] args) {
		new Main().run();
	}
}