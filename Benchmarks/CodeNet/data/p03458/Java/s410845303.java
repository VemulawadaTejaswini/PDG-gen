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
		int k = sc.nextInt(), k2 = k * 2, k4 = k * 4;
		int[][] bb = new int[k4][k4];
		int[][] ww = new int[k4][k4];
		while (n-- > 0) {
			int i = sc.nextInt() % k2;
			int j = sc.nextInt() % k2;
			char c = sc.next().charAt(0);
			if (c == 'B') {
				bb[i][j]++;
				bb[k2 + i][j]++;
				bb[i][k2 + j]++;
				bb[k2 + i][k2 + j]++;
			} else {
				ww[i][j]++;
				ww[k2 + i][j]++;
				ww[i][k2 + j]++;
				ww[k2 + i][k2 + j]++;
			}
		}
		for (int i = 0; i < k4; i++)
			for (int j = 1; j < k4; j++) {
				bb[i][j] += bb[i][j - 1];
				ww[i][j] += ww[i][j - 1];
			}
		for (int i = 1; i < k4; i++)
			for (int j = 0; j < k4; j++) {
				bb[i][j] += bb[i - 1][j];
				ww[i][j] += ww[i - 1][j];
			}
		int ans = 0;
		for (int i_ = 0; i_ < k2; i_++)
			for (int j_ = 0; j_ < k2; j_++) {
				int i, j, cnt = 0;
				i = i_; j = j_;
				cnt += bb[i + k][j + k] - bb[i][j + k] - bb[i + k][j] + bb[i][j];
				i = i_ + k; j = j_ + k;
				cnt += bb[i + k][j + k] - bb[i][j + k] - bb[i + k][j] + bb[i][j];
				i = i_ + k; j = j_;
				cnt += ww[i + k][j + k] - ww[i][j + k] - ww[i + k][j] + ww[i][j];
				i = i_; j = j_ + k;
				cnt += ww[i + k][j + k] - ww[i][j + k] - ww[i + k][j] + ww[i][j];
				ans = Math.max(ans, cnt);
			}
		println(ans);
	}
}
