import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long absx = Math.abs(x);
		if (absx / d >= k) {
			if (x > 0) {
				for (int i = 0; i < k; i++) {
					x -= d;
				}
			} else {
				for (int i = 0; i < k; i++) {
					x += d;
				}
			}
			
			System.out.println(x);
		} else {
			long r = k - absx / d;
			long start = x % d;
			if (r % 2 == 0) {
				System.out.println(start);
			} else {
				long ans = Math.min(Math.abs(start + d), Math.abs(start - d));
				System.out.println(ans);
			}
		}
	}
}
























