import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static long gcd(long a, long b) {
		if (a < b) {
			a ^= b;
			b ^= a;
			a ^= b;
		}
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long b[];
		long ini;
		long even[];
		int eid;
		long a[];
		int aid;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			even = new long[n];
			eid = 0;
			a = new long[n];
			aid = 0;
			b = new long[n*(n+1)/2];
			for (int i = 0; i < b.length; i++) {
				b[i] = sc.nextInt();
				if (b[i] % 2 == 0) {
					even[eid++] = b[i];
				}
			}

			ini = gcd(even[0], even[1]);
			for (int i = 2; i < n; i++) {
				ini = gcd(ini, even[i]);
			}
			for (int i = 0; i < n; i++) {
				if (ini != 0) {
					a[i] = even[i] / ini;
				} else {
					a[i] = even[i];
				}
			}
			Arrays.sort(a);
			System.out.println(ini);
			String s = "";
			for (int i = 0; i < n; i++) {
				System.out.print(s + a[i]);
				s = " ";
			}
			System.out.println();
		}
	}
}