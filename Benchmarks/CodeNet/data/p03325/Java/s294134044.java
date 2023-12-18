import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Long> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		sc.close();

		solve(list);

	}

	static void solve(List<Long> list) {

		int count = 0;

		while (list.size() > 0) {

			for (int i = 0; i < list.size(); i++) {
				long n = list.get(i);
				if (n % 2 != 0) {
					list.remove(i);
				} else {
					list.add(n / 2);
					list.remove(i);
					count++;
				}
			}
		}
		System.out.println(count);

	}
}