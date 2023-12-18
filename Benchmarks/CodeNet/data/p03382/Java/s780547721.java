import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		long max = 0;
		int in1 = 0;
		int in2 = 0;
		int digit = n;
		for (int i = 0; i < (1<<digit); i++) {
			int c = 0;
			int[] comb = new int[n];
			for (int j = digit-1, k = 0; j >= 0; j--, k++) {
				if (((i>>j) & 1) == 1) {
					comb[c] = a[k];
					c++;
				}
			}
			if (c != 2)
				continue;
			long n_r = comb[1] - comb[0];
			long x = 1, y = 1;
			int mod = 1000000007;
			for (int j = 1; j <= n_r; j++) {
				x = x * (comb[0] + j) % mod;
				y = y * j % mod;
			}
			long ans = x * func(y, mod - 2, mod) % mod;
			if (ans > max) {
				in1 = comb[0];
				in2 = comb[1];
				max = ans;
			}
		}
		System.out.println(in1 + " " + in2);
	}
	static long func(long a, long b, int mod) {
		if (b == 0) {
			return 1;
		}
		if (b % 2 == 0) {
			return func(a * a % mod, b / 2, mod);
		} else {
			return a * func(a, b-1, mod) % mod;
		}
	}
}