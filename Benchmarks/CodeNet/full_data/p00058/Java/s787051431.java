
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;

		while ((line = reader.readLine()) != null) {
			if (line.isEmpty())
				break;
			StringTokenizer tokenizer = new StringTokenizer(line);
			double[] x = new double[4];
			double[] y = new double[4];
			for (int i = 0; i < 4; i++) {
				x[i] = Double.parseDouble(tokenizer.nextToken());
				y[i] = Double.parseDouble(tokenizer.nextToken());
			}
			double abx = x[0] - x[1];
			double aby = y[0] - y[1];
			double bbx = x[2] - x[3];
			double bby = y[2] - y[3];

			System.out.println(Math.abs(abx * bbx + aby * bby) < 1e-9 ? "YES"
					: "NO");
		}
	}
}