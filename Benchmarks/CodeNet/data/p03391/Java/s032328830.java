// practice with kaiboy, coached by rainboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int INF = 0x3f3f3f3f;
	void main() {
		int n = sc.nextInt();
		long sum = 0;
		int b_ = INF;
		while (n-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a;
			if (a > b)
				b_ = Math.min(b_, b);
		}
		println(b_ == INF ? 0 : sum - b_);
	}
}
