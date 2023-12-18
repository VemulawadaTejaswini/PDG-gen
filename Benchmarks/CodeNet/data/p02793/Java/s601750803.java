import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static long gcd(long a, long b) {
		if (a==0) return b;
		return gcd(b%a, a);
	}
	static long lcm(long a, long b) {
		int MOD = 1000000007;
		return (a*b)/gcd(a,b);
	}
	
	public static void main(String[] args) {
		final int MOD = 1000000007;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long lcm = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int a = in.nextInt();
			list.add(a);
			lcm = lcm(lcm,a);
			System.out.println(lcm);
		}
		long sum = 0;
		for(int i=0; i<n; i++) {
			sum += lcm / list.get(i);
			sum %= MOD;
		}
		System.out.println(sum);
	}
}