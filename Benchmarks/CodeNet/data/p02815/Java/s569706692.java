// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	static final int MD = 1000000007;
	void main() {
		int n = sc.nextInt();
		int[] aa = new int[n];
		for (int i = 0; i < n; i++)
			aa[i] = sc.nextInt();
		aa = Arrays.stream(aa).boxed().sorted().mapToInt($->$).toArray();
		long ans = 0;
		for (int i = 0; i < n; i++)
			ans = (ans + (long) (i + 2) * aa[n - 1 - i]) % MD;
		while (--n > 0)
			ans = ans * 4 % MD;
		println(ans);
	}
}
