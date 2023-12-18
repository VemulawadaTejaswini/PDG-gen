import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		List<TreeSet<Integer>> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new TreeSet<>());
		}
		for (int i = 0; i < n; i++) {
			int a = s.charAt(i) - '0';
			list.get(a).add(i);
		}

		int ans = 0;
		for (int i = 0; i < 1000; i++) {
			int x = i;
			int y = x % 10;
			Integer idx = list.get(y).ceiling(0);
			if (idx == null) {
				continue;
			}

			x /= 10;
			y = x % 10;
			idx = list.get(y).higher(idx);
			if (idx == null) {
				continue;
			}

			x /= 10;
			y = x % 10;
			idx = list.get(y).higher(idx);
			if (idx != null) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
