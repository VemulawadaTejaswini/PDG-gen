// practice with kaiboy
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
		int k = sc.nextInt();
		if (k > (n - 1) * (n - 2) / 2) {
			println(-1);
			return;
		}
		int m = n - 1 + (n - 1) * (n - 2) / 2 - k;
		println(m);
		for (int i = 1; i < n; i++)
			println(i + " " + n);
		m -= n - 1;
		for (int i = 1; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				if (m-- == 0)
					return;
				println(i + " " + j);
			}
	}
}
