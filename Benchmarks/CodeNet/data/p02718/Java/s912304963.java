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
		int[] aa = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += aa[i] = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++)
			if (aa[i] * 4 * m >= sum)
				cnt++;
		println(cnt >= m ? "Yes" : "No");
	}
}
