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
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;
		int[] aa = new int[n];
		for (int i = 0; i < n; i++)
			aa[i] = sc.nextInt();
		int lower = 0, upper = 1000000000;
		while (upper - lower > 1) {
			int k = (lower + upper) / 2;
			long x = 0;
			for (int i = 0; i < n; i++) {
				long d = aa[i] - (long) b * k;
				if (d > 0)
					x += (d + c - 1) / c;
			}
			if (x <= k)
				upper = k;
			else
				lower = k;
		}
		println(upper);
	}
}
