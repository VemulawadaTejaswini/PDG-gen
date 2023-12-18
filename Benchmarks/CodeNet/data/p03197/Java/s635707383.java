import java.util.*;

public class Main {
	int N;
	List<Long> a;
	long gcd;

	Main() {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		a = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			a.add(in.nextLong());
		}
		in.close();
		gcd = a.get(0);
	}

	void calc() {
		for (int i = 1; i < a.size(); ++i) {
			gcd = gcd(a.get(i), gcd);
		}
	}

	long gcd(long x, long y) {
		if (y == 0) {
			return 0L;
		}
		if (x < y) {
			return gcd(y, x);
		}
		if (x == y) {
			return x;
		}
		long c = x % y;
		if (c == 0) {
			return y;
		}
		return gcd(y, c);
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		if (ins.gcd % 2 == 1L) {
			System.out.println("first");
		} else {
			System.out.println("second");
		}
	}
}