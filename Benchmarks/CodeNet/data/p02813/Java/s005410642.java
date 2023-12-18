import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int[] fac;
	boolean[] used;
	int rank(int[] aa, int n) {
		Arrays.fill(used, false);
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int k = 0;
			for (int a = 0; a < aa[i]; a++)
				if (!used[a])
					k++;
			sum += fac[n - 1 - i] * k;
			used[aa[i]] = true;
		}
		return sum;
	}
	void main() {
		int n = sc.nextInt();
		int[] pp = new int[n];
		for (int i = 0; i < n; i++)
			pp[i] = sc.nextInt() - 1;
		int[] qq = new int[n];
		for (int i = 0; i < n; i++)
			qq[i] = sc.nextInt() - 1;
		fac = new int[n];
		for (int i = 0, f = 1; i < n; i++) {
			fac[i] = f;
			f *= (i + 1);
		}
		used = new boolean[n];
		println(Math.abs(rank(pp, n) - rank(qq, n)));
	}
}
