import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();

	}

	static class E {
		long a, b, c;

		E() {
			System.out.println("E");
			a = getLong();
			b = getLong();
			c = getLong();
			System.out.println(a);
		}

	}

	static void solve() {
		long n = getLong();
		long m = getLong();
		System.out.println(n);

		ArrayList<E> l = new ArrayList<>();

		for (Long i : rep(n)) {
			System.out.println(i);
			l.add(new E());
		}

		long r = 0;

		r = Math.max(r, f(+1, +1, +1, n, m, l));
		r = Math.max(r, f(-1, +1, +1, n, m, l));
		r = Math.max(r, f(+1, -1, +1, n, m, l));
		r = Math.max(r, f(-1, -1, +1, n, m, l));
		r = Math.max(r, f(+1, +1, -1, n, m, l));
		r = Math.max(r, f(-1, +1, -1, n, m, l));
		r = Math.max(r, f(+1, -1, -1, n, m, l));
		r = Math.max(r, f(-1, -1, -1, n, m, l));

		System.out.println(r);

	}

	private static long f(int i, int j, int k, long n, long m, ArrayList<E> l) {
		return l.stream().mapToLong(o -> o.a * i + o.b * j + o.c * k).sorted().skip(n - m).sum();
	}

	private static List<Long> rep(long n) {
		List<Long> list = new ArrayList<>();
		for (long i = 0; i < n; i++) {
			list.add(i);
			System.out.println(list);
		}
		return list;
	}

	private static long getLong() {
		Scanner sc = new Scanner(System.in);

		return sc.nextLong();
	}

}
