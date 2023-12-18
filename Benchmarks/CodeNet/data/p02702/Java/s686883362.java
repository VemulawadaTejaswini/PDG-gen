import java.util.*;

public class Main {

	static final int r = 2019;
	static final int digit = 100000;

	public static boolean judge(String t) {
		// System.out.println(t + " //");
		int n = t.length();
		long cur = 0, num = 0;
		for (int i = 0; i < n; i += 5) {
			if (n - i < 5) {
				num = (long) Long.parseLong(t.substring(i));
				// System.out.println(num + " " + i + " spe");
				num += cur * (long) (Math.pow(10, n - i + 1));
				// System.out.println(num + " " + cur + " spe");
				cur = (num % (long) r);
				break;
			}
			num = Long.parseLong(t.substring(i, i + 5));
			// System.out.println(num + " " + i);
			num += cur * (long) digit;
			// System.out.println(num + " " + cur);
			cur = (num % r);
		}
		// System.out.println("//");
		return cur == 0;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		long ans = 0;
		int n = s.length();
		for (int i = 0; i < n; ++i) {
			for (int j = i + 5; j <= n; ++j) {
				String tmp = s.substring(i, j);
				if (judge(tmp))
					ans++;
				// System.out.println(tmp + " " + j + " " + i);
			}
		}
		System.out.println(ans);
	}
}
