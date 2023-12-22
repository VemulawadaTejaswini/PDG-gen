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
			int m = 0;
			while (m < b.length && b[m] == a[m])m++;
			if (m >= b.length) break;
			int j, k;
			for (j = 0; j < n && b[m] != a[j]; j++);
			for (k = 0; k < n && b[j] != a[k]; k++);
			if (j==k)continue;
			cnt += a[j] + a[k];
			int tmp = a[j];
			a[j] = a[k];
			a[k] = tmp;
			//out.println(Arrays.toString(a));
		}
		out.println(cnt);
	}
}