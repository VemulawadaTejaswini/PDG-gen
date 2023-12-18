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
		byte[] cc = (" " + sc.next()).getBytes();
		int n = cc.length - 1;
		if (cc[n] != '0' || cc[1] != '1' || cc[n - 1] != '1') {
			println(-1);
			return;
		}
		for (int i = 2, j = n - 2; i < j; i++, j--)
			if (cc[i] != cc[j]) {
				println(-1);
				return;
			}
		int i = 1;
		for (int j = 2; j <= n / 2; j++)
			if (cc[j] == '1' || j == n / 2)
				while (i < j) {
					println(i + " " + j);
					i++;
				}
		if (cc[i] == '1') {
			i++;
			println(i - 1 + " " + i);
		}
		for (int j = i + 1; j <= n; j++)
			println(i + " " + j);
	}
}
