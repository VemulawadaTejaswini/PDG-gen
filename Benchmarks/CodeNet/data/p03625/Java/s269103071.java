import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		Set<Integer> tars = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			if (list.contains(tmp)) {
				tars.add(tmp);
			}
			list.add(tmp);
		}

		long ans = 0;
		int count = 0;
		if (tars.size() >= 2) {
			ans = 1;
		} else if (tars.size() == 1) {
			for (int i : tars) {
				int cnt = 0;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(i) == i) {
						cnt++;
					}
				}
				if (cnt >= 4) {
					System.out.println(i * i);
					return;
				}
			}

		}
		for (int i : tars) {
			if (count >= tars.size() - 2) {
				ans *= i;
			}
			count++;
		}

		System.out.println(ans);
	}
}