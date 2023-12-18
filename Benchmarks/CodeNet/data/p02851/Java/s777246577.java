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
		int k = sc.nextInt();
		int[] aa = new int[n + 1];
		for (int i = 1; i <= n; i++)
			aa[i] = (aa[i - 1] + sc.nextInt() - 1) % k;
		Integer[] ii = new Integer[++n];
		for (int i = 0; i < n; i++)
			ii[i] = i;
		Arrays.sort(ii, (i, j) -> aa[i] != aa[j] ? aa[i] - aa[j] : i - j);
		long ans = 0;
		for (int i = 0, j = 0; i < n; i++) {
			while (j < n && aa[ii[j]] == aa[ii[i]] && ii[j] - ii[i] < k)
				j++;
			ans += j - i - 1;
		}
		println(ans);
	}
}
