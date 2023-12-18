// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int A = 26;
	void update(int[] ft, int i, int n, int x) {
		while (i < n) {
			ft[i] += x;
			i |= i + 1;
		}
	}
	int query(int[] ft, int i) {
		int x = 0;
		while (i >= 0) {
			x += ft[i];
			i &= i + 1; i--;
		}
		return x;
	}
	void main() {
		int n = sc.nextInt();
		byte[] cc = sc.next().getBytes();
		int[][] ft = new int[A][n];
		for (int i = 0; i < n; i++) {
			int a = cc[i] -= 'a';
			update(ft[a], i, n, 1);
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int t = sc.nextInt();
			if (t == 1) {
				int i = sc.nextInt() - 1;
				int a = cc[i];
				byte b = (byte) (sc.next().charAt(0) - 'a');
				if (a != b) {
					cc[i] = b;
					update(ft[a], i, n, -1);
					update(ft[b], i, n, 1);
				}
			} else {
				int l = sc.nextInt() - 1;
				int r = sc.nextInt() - 1;
				int cnt = 0;
				for (int a = 0; a < A; a++)
					if (query(ft[a], r) - query(ft[a], l - 1) > 0)
						cnt++;
				println(cnt);
			}
		}
	}
}
