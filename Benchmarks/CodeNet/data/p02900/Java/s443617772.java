import java.util.Scanner;
import java.util.TreeSet;

public class Main{
	static boolean ip(long x) {
		if(x == 1) return false;
		for(long i = 2; i * i <= x; i++) if(x % i == 0) return false;
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong();
		long max = Math.max(A, B), min = Math.min(A, B);
		long ans = 0;

		TreeSet<Long> divisor = new TreeSet<Long>();
		for(long i = 1; i * i <= max; i++) {
			if(max % i == 0) {
				if(i * i == max) divisor.add(i);
				else {
					divisor.add(i);
					divisor.add(max / i);
				}
			}
		}

		for(long a : divisor) {
			if(a == 1 || (min % a == 0) && ip(a)) ans++;
		}

		System.out.println(ans);
	}
}