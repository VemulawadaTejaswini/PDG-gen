// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] ft;
	void update(int i, int n, int x) {
		while (i < n) {
			ft[i] = Math.max(ft[i], x);
			i |= i + 1;
		}
	}
	int query(int i) {
		int x = 0;
		while (i >= 0) {
			x = Math.max(x, ft[i]);
			i &= i + 1; i--;
		}
		return x;
	}
	void main() {
		int n = sc.nextInt();
		int[] aa = new int[n];
		Integer[] ii = new Integer[n];
		for (int i = 0; i < n; i++) {
			aa[i] = sc.nextInt();
			ii[i] = i;
		}
		Arrays.sort(ii, (i, j) -> aa[i] != aa[j] ? aa[j] - aa[i] : i - j);
		ft = new int[n];
		int ans = 0;
		for (int h = 0; h < n; h++) {
			int i = ii[h];
			int k = query(i) + 1;
			ans = Math.max(ans, k);
			update(i, n, k);
		}
		println(ans);
	}
}
