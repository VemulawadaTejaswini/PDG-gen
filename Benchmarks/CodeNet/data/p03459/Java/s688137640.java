import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int px = 0;
		int py = 0;
		int pt = 0;
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int d = Math.abs(x - px) + Math.abs(y - py);
			if (d > t - pt || (t - pt - d) % 2 != 0) {
				System.out.println("No");
				return;
			}
			px = x;
			py = y;
			pt = t;
		}
		System.out.println("Yes");
	}
}
