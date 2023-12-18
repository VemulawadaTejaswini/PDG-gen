
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();

			int count = 0;
			for (char c : s.toCharArray()) {
				if (count % 2 == 0) {
					if (c == 'L') {
						System.out.println("No");
						return;
					}
				} else {
					if (c == 'R') {
						System.out.println("No");
						return;
					}

				}

				count++;
			}
			System.out.println("Yes");
		}
	}
}
