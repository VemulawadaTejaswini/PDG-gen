import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long x = in.nextLong();
		long ans = Math.abs(x - in.nextLong());
		for (int i = 1; i < n; i++) {
			ans = gcd(ans, Math.abs(x - in.nextLong()));
		}
		System.out.println(ans);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}