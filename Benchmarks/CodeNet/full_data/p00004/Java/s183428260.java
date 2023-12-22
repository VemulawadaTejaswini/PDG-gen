import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {

		// ax + by = c
		// dx + ey = f

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		BigDecimal a, b, c, d, e, f, x, y;

		while ((line = br.readLine()) != null) {
			a = new BigDecimal(line.split(" ")[0]);
			b = new BigDecimal(line.split(" ")[1]);
			c = new BigDecimal(line.split(" ")[2]);
			d = new BigDecimal(line.split(" ")[3]);
			e = new BigDecimal(line.split(" ")[4]);
			f = new BigDecimal(line.split(" ")[5]);

			x = (c.multiply(e).subtract(f.multiply(b))).divide((a.multiply(e)
					.subtract(d.multiply(b))));
			y = (c.multiply(d).subtract(f.multiply(a))).divide((d.multiply(b)
					.subtract(e.multiply(a))));

			x.setScale(3, BigDecimal.ROUND_HALF_UP);
			y.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.println(String.format("%.3f %.3f", x.doubleValue(),
					y.doubleValue()));
		}
	}
}