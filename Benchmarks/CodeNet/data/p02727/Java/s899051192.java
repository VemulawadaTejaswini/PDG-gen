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
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		c += b += a;
		int[] aa = new int[c];
		for (int i = 0; i < c; i++)
			aa[i] = sc.nextInt();
		Arrays.sort(aa, 0, a);
		Arrays.sort(aa, a, b);
		for (int i = a - 1, j = b - y - 1; i >= a - x; i--, j--)
			aa[j] = aa[i];
		Arrays.sort(aa, b - x - y, c);
		long ans = 0;
		for (int i = c - 1; i >= c - x - y; i--)
			ans += aa[i];
		println(ans);
	}
}
