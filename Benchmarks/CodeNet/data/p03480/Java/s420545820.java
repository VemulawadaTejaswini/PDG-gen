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
		byte[] cc = sc.next().getBytes();
		int n = cc.length, k = n;
		for (int i = 1; i < n; i++)
			if (cc[i - 1] != cc[i])
				k = Math.min(k, Math.max(i, n - i));
		println(k);
	}
}
