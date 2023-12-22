import java.util.*;

import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] eratosthenes(int n) {
		boolean[] dp = new boolean[n+1];
		dp[0] = dp[1] = true;
		List<Integer> prime = new LinkedList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (dp[i]) continue;
			prime.add(i);
			for (int j = i + i; j <= n; j += i) 
				dp[j] = true;
		}
		
		int[] ret = new int[prime.size()];
		int count = 0;
		for (int num : prime)
			ret[count++] = num;
		
		return ret;
	}
	
	void run() {
		int m, a, b;
		int[] prime = eratosthenes(100000);
		while (true) {
			m = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt();
			if (m == 0 && a == 0 && b == 0) break;
			
			
			int p = 0, q = 0;
			I:for (int i = 0; i < prime.length; i++) {
				for (int j = i; j < prime.length; j++) {
					if (prime[i]*prime[j] <= m) {
						if (a*prime[j] <= b*prime[i]) {
							if (p*q < prime[i]*prime[j]) {
								p = prime[i];
								q = prime[j];
							}
						}
					} else {
						if (prime[i]*prime[i] > m) break I;
						continue I;
					}
				}
			}
			
			out.printf("%d %d\n", p, q);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}