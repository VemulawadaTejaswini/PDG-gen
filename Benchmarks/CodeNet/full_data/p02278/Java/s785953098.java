import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}
	private void solv() {
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);
		long cnt = 0; 
		for (int i = 0; i < n; i++) {
			int v = a[i];
			if (a[i] == b[i]) continue;

			int l = 0, r = n - 1;
			while (l < r) {
				int m = (l + r) / 2;
				if (b[m] < v) {
					l = m + 1;
				} else {
					r = m;
				}
			}
			int tmp = a[l];
			cnt += v + tmp;
			a[l] = a[i];
			a[i] = tmp;
		}
		out.println(cnt);
	}
}