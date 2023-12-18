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
		long k = sc.nextLong();
		int[] aa = new int[n];
		int[] ff = new int[n];
		for (int i = 0; i < n; i++)
			aa[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			ff[i] = sc.nextInt();
		aa = Arrays.stream(aa).boxed().sorted().mapToInt($->$).toArray();
		ff = Arrays.stream(ff).boxed().sorted().mapToInt($->$).toArray();
		long lower = -1, upper = (long) aa[n - 1] * ff[n - 1];
		while (upper - lower > 1) {
			long x = (lower + upper) / 2;
			long sum = 0;
			for (int i = 0; i < n; i++) {
				int a = aa[i], f = ff[n - 1 - i];
				sum += Math.max(a - x / f, 0);
			}
			if (sum <= k)
				upper = x;
			else
				lower = x;
		}
		println(upper);
	}
}
