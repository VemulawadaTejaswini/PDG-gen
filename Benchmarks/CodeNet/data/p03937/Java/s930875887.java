import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int h = sc.nextInt();
			int w = sc.nextInt();

			int count_w = 0;

			for (int i = 0; i < h; i++) {

				String str = sc.next();

				for (int j = 0; j < w; j++) {

					char ch = str.charAt(j);
					if (ch == '#') {
						count_w++;
					}
				}
			}

			if (count_w > 2 * (w - 1)) {
				System.out.println("Impossible");
			}
			else {
				System.out.println("Possible");
			}
		}
		finally {
			sc.close();
		}

	}
}
