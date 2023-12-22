import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int week = Integer.parseInt(br.readLine());

			BigDecimal interest = new BigDecimal("0.05");
			BigDecimal debt = new BigDecimal("100000");

			for (int i = 0; i < week; i++) {

				debt = debt.add(debt.multiply(interest))
						.setScale(-3, BigDecimal.ROUND_UP);

			}

			System.out.println(debt.toPlainString());

		} finally {
			br.close();

		}
	}
}