import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong() - 1;
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long LCM = C * D / gcd(C, D);
		long ans = B - A;
		ans -= B / C + B / D;
		ans += B / LCM;
		ans += A / C + A / D;
		ans -= A / LCM;
		System.out.println(ans);
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}