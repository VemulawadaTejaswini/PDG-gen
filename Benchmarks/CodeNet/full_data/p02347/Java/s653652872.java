
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int n = Integer.parseInt(reader.readLine());
		Point2D.Double[] point = new Point2D.Double[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(tokenizer.nextToken());
			int y = Integer.parseInt(tokenizer.nextToken());
			point[i] = new Point2D.Double(x, y);
		}
		int m =Integer.parseInt(reader.readLine());
		for (int i = 0; i < m; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			double sx = Double.parseDouble(tokenizer.nextToken()) - 0.1;
			double tx = Double.parseDouble(tokenizer.nextToken())  + 0.1;
			double sy = Double.parseDouble(tokenizer.nextToken())  - 0.1;
			double ty = Double.parseDouble(tokenizer.nextToken())  + 0.1;
			Path2D.Double path = new Path2D.Double();
			path.moveTo(sx, sy);
			path.lineTo(tx, sy);
			path.lineTo(tx, ty);
			path.lineTo(sx, ty);
			for (int j = 0; j < n; j++) {
				if (path.contains(point[j]))
					System.out.println(j);
			}
			System.out.println();
		}

	}
}