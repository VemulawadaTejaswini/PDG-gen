import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int px = 0; int py = 0; int pt = 0;

		for (int i = 0; i < N; i++) {
			int t = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int dt = t - pt;
			int dist = Math.abs(px - x) + Math.abs(py - y);

			if (dt >= dist && dt % 2 == dist % 2) {
				px = x;
				py = y;
				pt = t;
				continue;
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}