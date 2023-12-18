// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int A = 26;
	void main() {
		byte[] aa = sc.next().getBytes();
		byte[] bb = sc.next().getBytes();
		int n = aa.length;
		int m = bb.length;
		int inf = n * 2;
		int[][] dd = new int[n + 1][A];
		Arrays.fill(dd[n], inf);
		for (int i = n - 1; i >= 0; i--) {
			int a = aa[i] - 'a';
			dd[n][a] = i;
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int a = 0; a < A; a++)
				dd[i][a] = 1 + dd[i + 1][a];
			int a = aa[i] - 'a';
			dd[i][a] = 0;
		}
		long i = 0;
		for (int j = 0; j < m; j++) {
			int a = bb[j] - 'a';
			int d = dd[(int) (i % n)][a];
			if (d >= inf) {
				println(-1);
				return;
			}
			i += d + 1;
		}
		println(i);
	}
}
