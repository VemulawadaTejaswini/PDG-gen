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
		ff = new int[n + 1];
		gg = new int[n + 1];
		for (int f = 1, i = 0; i <= n; i++) {
			gg[i] = power(ff[i] = f, MD - 2);
			f = (int) ((long) f * (i + 1) % MD);
		}
	}
	long ch(int n, int k) {
		return (long) ff[n] * gg[k] % MD * gg[n - k] % MD;
	}
	void main() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		k = Math.min(k, n - 1);
		init(n);
		long ans = 0;
		for (int i = 0; i <= k; i++)
			ans = (ans + ch(n, i) * ch(n - 1, i)) % MD;
		println(ans);
	}
}
