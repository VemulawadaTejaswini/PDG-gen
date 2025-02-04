import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer n = sc.nextInt();

		if (n < 3) {
			System.out.println(0);
			return;
		}

		List<Long> l = new ArrayList<Long>();

		for (Integer i = 0; i < n; i++) {
			Long a = sc.nextLong();
			l.add(a);
		}

		Collections.sort(l);

		Integer count = 0;

		for (Integer i = 0; i < n - 2; i++) {
			for (Integer j = i + 1; j < n - 1; j++) {
				for (Integer k = j + 1; k < n; k++) {
					if (l.get(i) == l.get(j) || l.get(j) == l.get(k) || l.get(k) == l.get(i)) {
						continue;
					}
					if (l.get(k) < l.get(i) + l.get(j)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}