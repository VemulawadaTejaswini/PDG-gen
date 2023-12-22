import java.util.*;
import java.io.*;

public class Main {
	
	public static boolean[] sieve (int n) {
		
		boolean[] isPrime = new boolean[n];
		Arrays.fill(isPrime, true);
		
		int lim = (int)Math.sqrt(n);
		
		for (int i = 4; i < isPrime.length; i += 2)
			isPrime[i] = false;
		for (int i = 3; i <= lim; i += 2) {
			for (int j = 3; i * j < isPrime.length; j += 2)
				isPrime[i * j] = false;
		}
		
		return isPrime;
		
	}
	
	public static int solve (int n) {
		
		int sum = 0;
		boolean[] prime = sieve(1000000);
		
		for (int i = 2, cnt = 0; cnt < n; i++) {
			
			if (prime[i]) {
				sum += i;
				cnt++;
			}
			
		}
		
		return sum;
		
	}
	
	public static void main (String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			int num = Integer.parseInt(br.readLine());
			
			if (num == 0) break;
			
			System.out.println(solve(num));
			
		}
		
	}
}