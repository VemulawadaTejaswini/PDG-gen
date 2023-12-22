import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader sr = null;
		Scanner sc = null;
		BigDecimal value = null;


		try {
			sc = new Scanner(sr = new InputStreamReader(System.in));
			int datasets = sc.nextInt();

			while (true) {

				value = (sc.nextBigDecimal());

				for (int i = 1; i < datasets; i++) {

					value = value.add(sc.nextBigDecimal());

				}

				if (value.precision() > 80) {
					System.out.println("overflow");
				} else {
					System.out.println(value.toPlainString());
				}
				value = null;
			}

		} catch (NoSuchElementException e) {

		}

		finally {
			sr.close();
			sc.close();
		}

	}

}