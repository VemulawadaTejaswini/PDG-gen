import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		long n = sc.nextLong();
		long m = sc.nextLong();
		long ans = (1900 * m + 100 * (n - m)) * power(2, m);
		System.out.println(ans);
	}
	
	static long power(long a, long x) {
		long res = 1;
		for(; x > 0; --x) res *= a;
		return res;
	}
}