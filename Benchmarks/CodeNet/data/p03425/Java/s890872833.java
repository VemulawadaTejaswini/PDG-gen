import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		String[] s = new String[n];
		int m = 0, a = 0, r = 0, c = 0, h = 0, each = 0;
		long ans = 0;
		
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();

			if (s[i].startsWith("M")) {
				each += m == 0 ? 1 : 0;
				m++;
			} else if (s[i].startsWith("A")) {
				each += a == 0 ? 1 : 0;
				a++;
			} else if (s[i].startsWith("R")) {
				each += r == 0 ? 1 : 0;
				r++;
			} else if (s[i].startsWith("C")) {
				each += c == 0 ? 1 : 0;
				c++;
			} else if (s[i].startsWith("H")) {
				each += h == 0 ? 1 : 0;
				h++;
			}
		}
		
		if (each == 3) {
			ans = 1;
			if (m != 0) {
				ans *= m;
			}
			if (a != 0) {
				ans *= a;
			}
			if (r != 0) {
				ans *= r;
			}
			if (c != 0) {
				ans *= c;
			}
			if (h != 0) {
				ans *= h;
			}
		} else if (each > 3) {
			ans = each;
			ans += m > 1 ? (each - 1) * (m - 1) : 0;
			ans += a > 1 ? (each - 1) * (a - 1) : 0;
			ans += r > 1 ? (each - 1) * (r - 1) : 0;
			ans += c > 1 ? (each - 1) * (c - 1) : 0;
			ans += h > 1 ? (each - 1) * (h - 1) : 0;
		}
		
		System.out.println(ans);

		sc.close();
	}
}
