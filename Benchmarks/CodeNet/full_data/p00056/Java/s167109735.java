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
		
		int cnt = 0;
		boolean[] prime = sieve(n);
		ArrayList<Integer> p = new ArrayList<Integer>();
		
		for (int i = 2; i < prime.length; i++)
			if (prime[i]) p.add(i);
		
		for (int i = 0; i < p.size(); i++)
			if (p.contains(n - p.get(i))) cnt++;
		
		int ans = cnt / 2;
		if (n % 2 == 0 && p.contains(n / 2)) ans++;
		return ans;
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