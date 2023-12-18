
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(calc(x, y, 0));

	}

	static long calc(int x, int y, int count) {
		if (x == y)
			return 0;
		if (count == 10) {
			return Long.MAX_VALUE / 10;
		}
		long ans = Long.MAX_VALUE;
		ans = Math.min(ans, 1 + calc(-x, y, count + 1));
		if (y >= x) {
			ans = Math.min(ans, y - x);
		}
		if (x >= 0 && y <= 0 && Math.abs(y) >= Math.abs(x)) {
			ans = Math.min(ans, 1 + Math.abs(y) - Math.abs(x));
		}
		if (x <= 0 && y >= 0 && Math.abs(y) <= Math.abs(x)) {
			ans = Math.min(ans, 1 + Math.abs(x) - Math.abs(y));
		}
		return ans;
	}
}
