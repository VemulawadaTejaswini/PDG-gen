import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int ma = Integer.MIN_VALUE, mi = Integer.MAX_VALUE, n = sc.nextInt();
		while (n-->0) {
			int a = sc.nextInt();
			ma = Math.max(ma, a);
			mi = Math.min(mi, a);
		}
		System.out.println(ma-mi);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}