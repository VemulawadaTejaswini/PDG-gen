import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			String[] s = line.split(" ");
			double[] x = new double[4];
			double[] y = new double[4];
			for (int i = 0; i < 3; i++) {
				x[i] = Double.parseDouble(s[2 * i]);
				y[i] = Double.parseDouble(s[2 * i + 1]);
			}
			double c = 0.0;
			for (int i = 0; i < 3; i++) {
				c = ((x[0] - x[1]) * (y[2] - y[0]) + (y[0] - y[0]) * (x[0] - x[2])) * ((x[0] - x[1]) * (y[3] - y[0]) + (y[0] - y[0]) * (x[0] - x[3]));
				if (c < 0)
					break;
				double t = x[0];
				x[0] = x[1];
				x[1] = x[2];
				x[2] = t;
				t = y[0];
				y[0] = y[1];
				y[1] = y[2];
				y[2] = t;
			}
			System.out.println(c < 0.0 ? "NO" : "YES");

		}
	}
}