import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int h = sc.nextInt();
			int w = sc.nextInt();

			int count_w = 0;
			int count_h = 0;

			boolean flg = false;

			for (int i = 0; i < h; i++) {

				String str = sc.next();

				for (int j = 0; j < w; j++) {

					char ch = str.charAt(j);
					if (ch == '#') {
						count_w++;
						flg = true;
					}
				}

				if (flg) {
					count_h++;
				}
				flg = false;
			}

			if (count_h > h || count_w > 2 * (w - 1)) {
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
