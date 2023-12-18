import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		HashMap<Integer, Integer> d = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int dd = sc.nextInt();
			d.putIfAbsent(dd, 0);
			d.compute(dd, (k, v) -> v + 1);
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int tt = sc.nextInt();
			d.compute(tt, (k, v) -> v - 1);
			if (d.get(tt) < 0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}