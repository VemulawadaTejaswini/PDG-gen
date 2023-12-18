// practice with kaiboy
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
		int[] aa = new int[n * 2]; int m = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int x = a + i, y = i - a;
			aa[m++] = x << 1;
			if (y > 0)
				aa[m++] = y << 1 | 1;
		}
		Arrays.sort(aa, 0, m);
		long ans = 0;
		for (int i = 0, j, k; i < m; i = k) {
			int a = aa[i] >> 1;
			j = i;
			while (aa[j] == a << 1)
				j++;
			k = j;
			while (aa[k] == (a << 1 | 1))
				k++;
			ans += (long) (j - i) * (k - j);
		}
		println(ans);
	}
}
