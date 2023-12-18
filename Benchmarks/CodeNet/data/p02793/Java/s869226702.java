import java.util.*;
import java.io.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) throws Exception {
	    boolean[] primes = new boolean[1000001];
	    primes[0] = true;
	    primes[1] = true;
	    int count = 0;
	    for (int i = 2; i < primes.length; i++) {
	        if (primes[i]) {
	            continue;
	        }
	        count++;
	        for (int j = 2; i * j < primes.length; j++) {
	            primes[i * j] = true;
	        }
	    }
	    int[] primeList = new int[count];
	    int idx = 0;
	    for (int i = 2; i < primes.length; i++) {
	        if (!primes[i]) {
	            primeList[idx] = i;
	            idx++;
	        }
	    }
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ", n);
		int[] arr = new int[n];
		int[][] counts = new int[n][count];
		int[] maxes = new int[count];
		for (int i = 0; i < n; i++) {
		    int x = Integer.parseInt(line[i]);
		    arr[i] = x;
		    for (int j = 0; j < count; j++) {
		       while (x % primeList[j] == 0) {
		           counts[i][j]++;
		           x /= primeList[j];
		       }
		       maxes[j] = Math.max(maxes[j], counts[i][j]);
		    }
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
		    long value = 1;
		    for (int j = 0; j < count; j++) {
		        int c = maxes[j] - counts[i][j];
		        for (int k = 0; k < c; k++) {
		            value *= primeList[j];
		            value %= MOD;
		        }
		    }
		    ans += value;
		    ans %= MOD;
		}
	    System.out.println(ans);
    }
}
