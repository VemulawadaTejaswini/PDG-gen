// practice with kaiboy, coached by rainboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dd = new int[8];
		int[] d2c = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		while (m-- > 0) {
			int d = sc.nextInt();
			int c = d2c[d];
			dd[c] = Math.max(dd[c], d);
		}
		int c_ = 2;
		while (dd[c_] == 0)
			c_++;
		int n_ = 0;
		for (int c = c_ + 1; c <= 7; c++)
			n_ += c * (c_ - 1);
		int[] dp = new int[n_ + 1]; Arrays.fill(dp, -1); dp[0] = 0;
		for (int i = 0; i < n_; i++) {
			int k = dp[i];
			if (k != -1)
				for (int c = c_; c <= 7 && i + c <= n_; c++)
					if (dd[c] != 0)
						dp[i + c] = Math.max(dp[i + c], k + 1);
		}
		int[] kk = new int[10];
		int k = (n - n_ + c_ - 1) / c_;
		kk[dd[c_]] += k;
		n -= k * c_;
		while (n > 0) {
			c_ = 0;
			for (int c = 2; c <= 7 && n - c >= 0; c++)
				if (dd[c_] < dd[c] && dp[n] == dp[n - c] + 1)
					c_ = c;
			kk[dd[c_]]++;
			n -= c_;
		}
		for (int d = 9; d >= 1; d--)
			while (kk[d]-- > 0)
				print(d);
		println();
	}
}
