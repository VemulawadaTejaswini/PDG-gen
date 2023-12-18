// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] ii = new int[60];
	int[] jj = new int[60];
	int[] ww = new int[60];
	int m;
	void add(int i, int j, int w) {
		ii[m] = i; jj[m] = j; ww[m] = w; m++;
	}
	void main() {
		int l = sc.nextInt();
		int k = 0;
		while (1 << k + 1 <= l)
			k++;
		for (int i = 0; i < k; i++) {
			int j = i + 1;
			add(i, j, 0);
			add(i, j, 1 << i);
		}
		for (int i = 0; i < k; i++)
			if ((l & 1 << i) != 0)
				add(i, k, l ^= 1 << i);
		println(k + 1 + " " + m);
		while (m-- > 0)
			println((ii[m] + 1) + " " + (jj[m] + 1) + " " + ww[m]);
	}
}
