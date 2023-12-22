import java.util.*;

import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int[] eratosthenes(int n) {
		boolean[] dp = new boolean[n+1];
		List<Integer> prime = new LinkedList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (i % 7 == 1 || i % 7 == 6) {
				if (dp[i]) continue;
				prime.add(i);
				for (int j = i+i; j <= n; j += i) 
					dp[j] = true;
			}
		}
		
		int[] ret = new int[prime.size()];
		int count = 0;
		for (int num : prime)
			ret[count++] = num;
		
		return ret;
	}
	
	void run() {
		int n;
		int[] prime = eratosthenes(400000);
		while (true) {
			n = sc.nextInt();
			if (n == 1) break;
			out.printf("%d:", n);
			int index = 0;
			while (prime[index] <= n) {
				if (n % prime[index] == 0 && ((n/prime[index])%7 == 1 || (n/prime[index])%7 == 6)) {
					out.printf(" %d", prime[index]);
				}
				index++;
			}
			out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}