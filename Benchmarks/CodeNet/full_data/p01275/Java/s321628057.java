import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int K = sc.nextInt();
			if (K == 0) break;
			String s = sc.next();
			String t = sc.next();
			int[] d = new int[K];
			for (int i = 0; i < K; ++i) {
				d[i] = (10 + t.charAt(i) - s.charAt(i)) % 10;
			}
			System.out.println(solve(d, 0));
		}
	}

	static int solve(int[] d, int pos) {
		if (pos == d.length) return 0;
		if (d[pos] == 0) return solve(d, pos + 1);
		int prev = d[pos];
		int ret = 99;
		for (int i = pos; i < d.length; ++i) {
			d[i] = (d[i] + 10 - prev) % 10;
			ret = Math.min(ret, solve(d, pos + 1) + 1);
		}
		for (int i = pos; i < d.length; ++i) {
			d[i] = (d[i] + prev) % 10;
		}
		return ret;
	}
}