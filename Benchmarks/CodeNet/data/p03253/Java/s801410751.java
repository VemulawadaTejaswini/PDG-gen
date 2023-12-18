// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int MD = 1000000007;
	int power(long a, int k) {
		long p = 1;
		while (k > 0) {
			if ((k & 1) == 1)
				p = p * a % MD;
			a = a * a % MD;
			k >>= 1;
		}
		return (int) p;
	}
	int[] ff, gg;
	void init(int n) {
		ff = new int[n];
		gg = new int[n];
		for (int f = 1, i = 0; i < n; i++) {
			gg[i] = power(ff[i] = f, MD - 2);
			f = (int) ((long) f * (i + 1) % MD);
		}
	}
	long choose(int n, int k) {
		return (long) ff[n] * gg[k] % MD * gg[n - k] % MD;
	}
	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = 0;
		while (1 << k + 1 <= m)
			k++;
		init(n + k);
		long ans = 1;
		for (int p = 2; p <= m / p; p++)
			if (m % p == 0) {
				k = 0;
				while (m % p == 0) {
					k++;
					m /= p;
				}
				ans = ans * choose(n - 1 + k, k) % MD;
			}
		if (m > 1)
			ans = ans * n % MD;
		println(ans);
	}
}
