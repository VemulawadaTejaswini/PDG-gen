import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader is = null;
		Scanner sc = null;
		Set<String> integers = new HashSet<String>();

		try {
			sc = new Scanner(is = new InputStreamReader(System.in));
			int value = sc.nextInt();

			for (int a = 0; a <= 9; a++) {
				for (int b = 0; b <= 9; b++) {
					for (int c = 0; c <= 9; c++) {
						for (int d = 0; d <= 9; d++) {

							if (value == a + b + c + d) {

								integers.add(String.valueOf(a)
										+ String.valueOf(b) + String.valueOf(c)
										+ String.valueOf(d));

							}

						}

					}
				}

			}

			System.out.println(integers.size());

		}

		finally {
			is.close();
			sc.close();

		}

	}

}