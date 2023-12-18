import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solve(sc.nextLong(),sc.nextLong()));
	}
	
	public static long solve(long n,long s) {
		long sqrtN = sqrtFloor(n);
		for(long b=2;b<=sqrtN;b++) {
			if (f(b,n) == s) {
				return b;
			}
		}
		for(long ndb=sqrtN-1;ndb>=1;ndb--) {
			long mod = s - ndb;
			if (mod < 0) continue;
			long minB = (n - 1) / (ndb + 1) + 1;
			long maxB = n / ndb;
			
			long mb = n - mod;
			
			long ans = Long.MAX_VALUE;
			for(long i=1;i*i<=mb;i++) {
				if (mb % i == 0) {
					if (minB <= i && i <= maxB) {
						ans = Math.min(ans, i);
					}
					long i2 = mb / i;
					if (minB <= i2 && i2 <= maxB) {
						ans = Math.min(ans, i2);
					}
				}
			}
			if (ans < Long.MAX_VALUE) {
				return ans;
			}
		}
		
		if (s == n) {
			return n + 1;
		}
		
		return -1;
	}
	
	public static long f(long b,long n) {
		long sum = 0;
		while(n > 0) {
			sum += n % b;
			n /= b;
		}
		return sum;
	}
	
	public static long sqrtFloor(long x) {
		long y = (long) Math.sqrt(x);
		return x >= y * y ? y : y - 1;
	}
	
}
