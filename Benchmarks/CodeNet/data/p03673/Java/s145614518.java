import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>(n);

			if (n % 2 == 0) {
				for (int i = 0; i < n; i++) {
					if (i % 2 == 0) {
						a.add(sc.nextInt());
					} else {
						a.add(0, sc.nextInt());
					}
				}
			} else {
				for (int i = 0; i < n; i++) {
					if (i % 2 == 0) {
						a.add(0, sc.nextInt());
					} else {
						a.add(sc.nextInt());
					}
				}
			}
			boolean first = true;
			for (int i : a) {
				if (!first) {
					System.out.print(" ");
				}
				System.out.print(i);
				first = false;
			}
			System.out.println();
		}
	}
}