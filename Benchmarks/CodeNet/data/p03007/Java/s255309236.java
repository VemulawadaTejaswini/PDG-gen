import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			List<Integer> a = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				a.add(sc.nextInt());
			}

			Collections.sort(a);
			int size = a.size();
			int temp = 0;

			if (size % 2 == 0) {
				while (a.size() > 1) {
					System.out.println(a.get(a.size() - 1) + " " + a.get(0));
					temp = a.get(a.size() - 1) - a.get(0);
					a.remove(0);
					a.remove(a.size() - 1);
					a.add(temp);
					System.out.println(a.get(0) + " " + a.get(a.size() - 1));
					temp = a.get(0) - a.get(a.size() - 1);
					a.remove(0);
					a.remove(a.size() - 1);
					a.add(0, temp);
				}

			} else {
				while (a.size() > 1) {
					System.out.println(a.get(0) + " " + a.get(a.size() - 1));
					temp = a.get(0) - a.get(a.size() - 1);
					a.remove(0);
					a.remove(a.size() - 1);
					a.add(0, temp);
					System.out.println(a.get(a.size() - 1) + " " + a.get(0));
					temp = a.get(a.size() - 1) - a.get(0);
					a.remove(0);
					a.remove(a.size() - 1);
					a.add(temp);
				}
			}
		}
	}
}
