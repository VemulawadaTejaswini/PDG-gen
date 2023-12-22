import java.util.*;
import java.math.*;

class Main {
	static Scanner sc = new Scanner(System.in);

	void solve() {
		try {
			long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
			long r1 = Math.max(a * c, a * d);
			long r2 = Math.max(b * c, b * d);
			System.out.println(Math.max(r1, r2));
		} catch (Exception e) {
			return;
		}
	}

	public static void main(String[] args) {
		Main ob = new Main();
		ob.solve();
	}
}