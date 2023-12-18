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
		int m = sc.nextInt();
		int[] wa = new int[n + 1];
		int correct = 0, penalty = 0;
		while (m-- > 0) {
			int p = sc.nextInt();
			String s = sc.next();
			if (wa[p] == -1)
				continue;
			if (s.equals("WA"))
				wa[p]++;
			else {
				correct++;
				penalty += wa[p];
				wa[p] = -1;
			}
		}
		println(correct + " " + penalty);
	}
}
