// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] aa, rr;
	int count(int n, int md) {
		int rsum = 0;
		for (int i = 0; i < n; i++)
			rsum += rr[i] = aa[i] % md;
		if (rsum == 0)
			return 0;
		Arrays.sort(rr);
		int p = 0, q = n * md - rsum;
		for (int i = 0; i < n && p != q; i++) {
			p += rr[i];
			q -= md - rr[i];
		}
		return p;
	}
	void main() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		aa = new int[n]; rr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += aa[i] = sc.nextInt();
		int ans = 0;
		for (int a = 1, b; a <= (b = sum / a); a++) {
			if (sum % a != 0)
				continue;
			if (count(n, b) <= k) {
				ans = b;
				break;
			}
			if (count(n, a) <= k)
				ans = a;
		}
		println(ans);
	}
}
