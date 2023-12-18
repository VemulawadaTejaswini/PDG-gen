import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			if (judge(a, b, c, d))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	//永遠にりんごジュースを買い続けられる場合 true，そうでない場合 false
	private boolean judge(long a, long b, long c, long d) {
		Set<Long> set = new HashSet<>();
		set.add(a);
		long n = Math.max(b, c);
		while (a >= b) {
			if (a >= n)
				a = (a - n) % b + n;
			a -= b;
			if (a <= c) {
				a += d;
				if (!set.add(a))
					return true;
			}
		}
		return false;
	}
}
