import java.math.BigInteger;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0053
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		sieve(1000000);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			long sum = 0;
			for (int i = 0; i < n; i++)
				sum += prime[i];
			System.out.println(sum);
		}
	}
	
	static int[] prime = new int[1000000];
	static boolean[] is_prime = new boolean[1000000 + 1];
	static int sieve(int n) {
		int p = 0;
		for (int i = 0; i <= n; i++) is_prime[i] = true;
		is_prime[0] = is_prime[1] = false;
		for (int i = 2; i <= n; i++) {
			if (is_prime[i]) {
				prime[p++] = i;
				for (int j = 2 * i; j <= n; j+= i) is_prime[j] = false;
			}
		}
		return p;
	}
		
	// f»è
	static boolean is_prime(int  n) {
		for (int i = 2; i * i <= n; i++) 
			if (n % i == 0) return false;
		
		return n != 1;
	}
	
	// ñÌñ
	static ArrayList<Integer> divisor(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				ret.add(i);
				if (i != (n / i)) ret.add(n / i);
			}
		}
		
		return ret;
	}
	
	// föªð
	static HashMap<Integer, Integer> prime_factor(int n) {
		HashMap<Integer, Integer> ret = new HashMap<Integer, Integer>();
		for (int i = 2; i * i <= n; i++) {
			ret.put(i, 0);
			while (n % i == 0) {
				ret.put(i, ret.get(i) + 1);
				n /= i;
			}
		}
		
		if (n != 1) ret.put(n, 1);
		
		return ret;
	}
}