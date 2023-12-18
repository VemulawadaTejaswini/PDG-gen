import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	static boolean ip(long x) {
		if(x == 1) return false;
		for(long i = 2; i * i <= x; i++) if(x % i == 0) return false;
		return true;
	}
	static long GCD(long x, long y) {
		if(Math.max(x, y) % Math.min(x, y) == 0) return Math.min(x, y);
		return GCD(Math.min(x, y), Math.max(x, y) % Math.min(x, y));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong();
		long gcd = GCD(A, B);
		int ans = 1;

		TreeSet<Long> divisor = new TreeSet<Long>();
		for(long i = 2; i * i <= gcd; i++) {
			if(gcd % i == 0) {
				if(i * i == gcd) divisor.add(i);
				else {
					divisor.add(i);
					divisor.add(gcd / i);
				}
			}
		}

		for(long a : divisor) {
			if(ip(a)) ans++;
		}

		System.out.println(ans);
	}
}