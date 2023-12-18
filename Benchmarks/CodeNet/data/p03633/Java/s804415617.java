import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    int n = sc.nextInt();
		long[] t = new long[n];

		for (int i = 0; i < n; i++) {
			t[i] = sc.nextLong();
		}

		long ans = t[0];
		for (int i = 1; i < n; i++) {
			ans = lcm(ans, t[i]);
		}

		out.println(ans);
	}

	private static long lcm(long x, long y) {
		return x * (y / gcd(x, y));
	}

	private static long gcd(long x, long y) {
		if (x < y) {
			long tmp = x;
			x = y;
			y = tmp;
		}

		while (x % y > 0) {
			long r = x % y;
			x = y;
			y = r;
		}

		return y;
	}
}
