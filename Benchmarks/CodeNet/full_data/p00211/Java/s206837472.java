import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			long ds[] = new long[n];
			long vs[] = new long[n];
			for (int i = 0; i < n; i++) {
				ds[i] = sc.nextLong();
				vs[i] = sc.nextLong();
			}
			long dl = ds[0];
			for (int i = 0; i < n; i++)
				dl = lcm(dl, ds[i]);
			long rs[] = new long[n];
			for (int i = 0; i < n; i++)
				rs[i] = dl / ds[i] * vs[i];
			long rg = rs[0];
			for (int i = 0; i < n; i++)
				rg = gcd(rg, rs[i]);
			for (int i = 0; i < n; i++) {
				rs[i] = rs[i] / rg;
				System.out.println(rs[i]);
			}
		}
	}

	long gcd(long x, long y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}

	long lcm(long x, long y) {
		return x * y / gcd(x, y);
	}
}