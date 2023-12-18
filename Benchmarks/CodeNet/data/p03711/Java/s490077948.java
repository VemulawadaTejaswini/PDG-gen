import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (x == 2 || y == 2) {
				System.out.println("No");
				return;
			}

			List<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 6, 9, 11));
			if (list.contains(x)) {
				if (list.contains(y)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if (list.contains(y)) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		} finally {
			sc.close();
		}
	}
}