import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		// ax + by = c
		// dx + ey = f

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ins;
		String[] ina;
		double a, b, c, d, e, f, x, y;

		try {
			ins = br.readLine();
			ina = ins.split(" ");

			a = Double.parseDouble(ina[0]);
			b = Double.parseDouble(ina[1]);
			c = Double.parseDouble(ina[2]);
			d = Double.parseDouble(ina[3]);
			e = Double.parseDouble(ina[4]);
			f = Double.parseDouble(ina[5]);

			x = (c * e - f * b) / (a * e - d * b);
			y = (c * d - f * a) / (b * d - e * a);

			x = Math.round(x * 1000) / 1000;
			y = Math.round(y * 1000) / 1000;
			
			System.out.println(String.format("%.3f %.3f", x, y));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}