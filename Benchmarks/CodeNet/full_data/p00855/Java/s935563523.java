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
	
	boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0) return false;
			
		return true;
	}
	
	void run() {
		int n;
		int[] prime = eratosthenes(1299709);
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			
			if (isPrime(n)) {
				out.println(0);
				continue;
			}
			
			int index = 0;
			while (n > prime[index]) index++;
			out.println(prime[index] - prime[index-1]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}