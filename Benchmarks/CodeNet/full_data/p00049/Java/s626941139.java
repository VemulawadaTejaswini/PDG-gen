import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = null;

		try {

			sc = new Scanner(System.in);

			String[] str = new String[2];

			int countA = 0;
			int countB  = 0;
			int countAb  = 0;
			int countO = 0;

			while (sc.hasNext()) {

				str = sc.nextLine().split(",");

				switch (str[1]) {
				case "A":
					countA++;
					break;

				case "B":
					countB++;
					break;

				case "AB":
					countAb++;
					break;

				case "O":
					countO++;
					break;

				default:
					break;
				}

			}
			System.out.println(countA);
			System.out.println(countB);
			System.out.println(countAb);
			System.out.println(countO);

		} finally {
			sc.close();
		}

	}

}