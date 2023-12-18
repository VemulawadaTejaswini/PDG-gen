import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1L;
		for(int i = 0; i < n; i++) {
			ans = lcm(ans, sc.nextLong());//答えと入力の最小公倍数
		}
		System.out.println(ans);
	}
	static long lcm(long a, long b) {//最小公倍数
		long g = gcd(a, b);
		return a / g * b;//ユークリッドの互除法により
		// a*b = (aとbの最小公倍数) * (aとbの最大公約数)
		//式変形して	a / (aとbの最大公約数) * b = (aとbの最小公倍数)
		//これで最小公倍数が求まる
	}
	static long gcd(long a, long b) {//最大公約数
		if(b == 0) return a;
		return gcd(b, a%b);
	}
}