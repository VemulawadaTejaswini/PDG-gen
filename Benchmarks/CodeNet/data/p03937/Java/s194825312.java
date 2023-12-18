import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			int height = sc.nextInt();
			int width = sc.nextInt();

			char[][] list = new char[height][width];

			for (int i = 0; i < height; i++) {

				String str = sc.next();

				for (int j = 0; j < width; j++) {
					list[i][j] = str.charAt(j);
				}
			}

			int count = 0;
			boolean result = false;

			for (int i = 0; i < height; i++) {

				boolean flg = false;

				for (int j = 0; j < width; j++) {
					if (list[i][j] == '#') {
						if (flg) {
							count++;
						}
						flg = true;
					}
					else {
						flg = false;
					}
				}
			}

			if (count == width - 1) {
				result = true;
			}
			else {
				System.out.println("Impossible");
			}

			if (result) {

				count = 0;
				for (int i = 0; i < width; i++) {

					boolean flg = false;

					for (int j = 0; j < height; j++) {
						if (list[j][i] == '#') {
							if (flg) {
								count++;
							}
							flg = true;
						}
						else {
							flg = false;
						}
					}
				}

				if (count == height - 1) {
					System.out.println("Possible");
				}
			}
		}
		finally {
			sc.close();
		}
	}

}
