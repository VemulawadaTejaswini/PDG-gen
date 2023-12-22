import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		while ((line = br.readLine()) != null) {

			String[] input = line.split(" ");
			BigDecimal a = new BigDecimal(input[0]);
			BigDecimal b = new BigDecimal(input[1]);
			BigDecimal c = new BigDecimal(input[2]);
			BigDecimal d = new BigDecimal(input[3]);
			BigDecimal e = new BigDecimal(input[4]);
			BigDecimal f = new BigDecimal(input[5]);

			BigDecimal y = (a.multiply(f).subtract(d.multiply(c))).divide(a
					.multiply(e).subtract(d.multiply(b)));
			BigDecimal x = (c.subtract(b.multiply(y))).divide(a);

			String answer = x.setScale(3, RoundingMode.HALF_UP).toPlainString()
					+ " " + y.setScale(3, RoundingMode.HALF_UP).toPlainString();
			System.out.println(answer);
		}
	}
}