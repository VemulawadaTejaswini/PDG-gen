import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		long x = Math.abs(scan.nextLong());
		long k = scan.nextLong();
		long d = scan.nextLong();
		if(k < x / d) {
			System.out.println(x - d * k);
			return;
		} else {
			k -= x / d;
			x %= d;
			if(k % 2 == 0) {
				System.out.println(x);
			} else {
				System.out.println(d - x);
			}
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
