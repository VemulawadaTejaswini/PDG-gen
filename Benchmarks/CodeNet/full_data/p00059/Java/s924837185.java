
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
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
			Point2D.Double point = new Point2D.Double();
			Path2D.Double path = new Path2D.Double();
			path.moveTo(x[0], y[0]);
			path.lineTo(x[0], y[1]);
			path.lineTo(x[1], y[1]);
			path.lineTo(x[1], y[0]);
			if (path.contains(x[2], y[2]) || path.contains(x[2], y[3])
					|| path.contains(x[3], y[3]) || path.contains(x[3], y[2])) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}