import java.util.*;

public class Main {

	public static long gcd(long a, long b) {
		if (a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if (b == 1)
			return b;
		long r = a % b;
		if (r == 0)
			return b;
		return gcd(b, r);
	}

	static public boolean judge(long num) {
		if (num <= 1)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		long n = (long) Math.sqrt((double) num);
		for (long i = 3; i <= n; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(), b = sc.nextLong();
		sc.close();
		long ans = 1;
		long g = gcd(a, b);
		for (long i = 2; i <= g; ++i) {
			if (g % i == 0) {
				if (judge(i))
					++ans;
			}
		}
		System.out.println(ans);
	}
}
