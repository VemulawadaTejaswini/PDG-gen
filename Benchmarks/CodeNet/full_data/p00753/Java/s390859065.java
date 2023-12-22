import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static void initSieve(int n, byte[] sieve) {
		for (int i = 2; i < n; i++) {
	    	if (sieve[i] == 0) {
	    		sieve[i] = 1;
	    		for (int j = 2 * i; j < sieve.length; j += i) {
	    			sieve[j] = -1;
	    		}
	    	}
		}
	}
	
	public static boolean isPrime(int n, byte[] sieve) {
		if (n < 2) return false;
	    return sieve[n] == 1;
	}
	
	public static int solve(int n) {
		if (n < 1) return 0;
		
		byte[] sieve = new byte[2 * n + 1];
		initSieve(2 * n, sieve);
		int count = 0;
		for (int i = n + 1; i <= 2 * n; i++) {
	        if (isPrime(i, sieve)) {
	        	count++;
	        }
		}
		return count;
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String output = "";
		String line;
		while ((line = r.readLine()) != null) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			} else {
				output += solve(n) + "\n";
			}
		}
		System.out.println(output);
	}
	
}