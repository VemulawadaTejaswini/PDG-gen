import java.util.*;
public class Main {
	
	private static long sol = Long.MAX_VALUE;
	private static void check(long base, long n, long s) {
		long sum = 0;
		for (long x = n; x > 0; x /= base) 
			sum += x % base;
		if (sum == s) 
			sol = Math.min(sol, base);
	}
	
	private static long solve(long n, long s) {
		if (n < s) 
			return -1;
		if (n == s)
			return n + 1;
		long diff = n - s;
		for (long i = 1; i * i <= diff; ++i) {
			if (diff % i != 0) 
				continue;
			check(i + 1, n, s);
			check(diff / i + 1, n, s);
		}
		return (sol == Long.MAX_VALUE) ? -1 : sol;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		long n = sc.nextLong();
		long s = sc.nextLong();
		
		System.out.println(solve(n, s));
	}
}