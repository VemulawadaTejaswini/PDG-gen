import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		int num = 0;

		Scanner sc = null;
		try {

			sc = new Scanner(System.in);

			do {
				line = sc.nextLine();

					//????????????1?????????????´?
					char[] work = line.toCharArray();

					//??°????????????
					for (int i = 0; i < work.length; i++) {
						num += Character.getNumericValue(work[i]);
					}
					if (num != 0) {

						System.out.println(num);
					}

					//?????????
					num = 0;

			} while (!line.equals("0"));
		} finally {
			sc.close();
		}
	}
}