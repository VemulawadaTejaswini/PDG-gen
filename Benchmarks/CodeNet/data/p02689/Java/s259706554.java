
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		Set<Integer> deta = new HashSet<>();
		Set<Integer> yoi = new HashSet<>();
		Set<Integer> warui = new HashSet<>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			deta.add(a);
			deta.add(b);
			if (list.get(a - 1) > list.get(b - 1)) {
				if (!warui.contains(a)) {
					yoi.add(a);
				}

				warui.add(b);
			} else if (list.get(a - 1) < list.get(b - 1)) {
				if (!warui.contains(b)) {
					yoi.add(b);
				}

				warui.add(a);
			} else {
				warui.add(a);
				warui.add(b);
			}
		}
		int count = n - deta.size();
		System.out.println(count + yoi.size());

		sc.close();
	}

}