import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		List<Integer> c = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(scanner.nextInt());
		}
		Collections.sort(a);

		for (int i = 0; i < n; i++) {
			b.add(scanner.nextInt());
		}
		Collections.sort(b);

		for (int i = 0; i < n; i++) {
			c.add(scanner.nextInt());
		}
		Collections.sort(c);

		int count = 0;
		int aCount = 0;
		int cCount = 0;
		for (int i = 0; i < n; i++) {
			int tar = b.get(i);
			for (int j = 0; j < n; j++) {
				if (tar > a.get(j)) {
					aCount++;
				} else {
					break;
				}
			}
			for (int j = n - 1; j >= 0; j--) {
				if (tar < c.get(j)) {
					cCount++;
				} else {
					break;
				}
			}
			count += aCount * cCount;
			aCount = 0;
			cCount = 0;
		}

		System.out.println(count);
	}
}
