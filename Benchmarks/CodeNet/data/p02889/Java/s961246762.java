// practice with kaiboy, coached by rainboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		int[][] aa = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				aa[i][j] = l + 1;
		while (m-- > 0) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int c = sc.nextInt();
			if (c <= l)
				aa[i][j] = aa[j][i] = c;
		}
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					aa[i][j] = Math.min(aa[i][j], aa[i][k] + aa[k][j]);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				aa[i][j] = aa[i][j] <= l ? 1 : n;
		for (int k = 0; k < n; k++)
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					aa[i][j] = Math.min(aa[i][j], aa[i][k] + aa[k][j]);
		int q = sc.nextInt();
		while (q-- > 0) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int k = aa[i][j];
			if (k == n)
				k = 0;
			println(k - 1);
		}
	}
}
