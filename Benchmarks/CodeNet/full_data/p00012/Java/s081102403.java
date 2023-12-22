import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		double x1, y1, x2, y2, x3, y3, xp, yp, t1, t2, t3;
		StringTokenizer st;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			st = new StringTokenizer(line);
			x1 = Double.parseDouble(st.nextToken());
			y1 = Double.parseDouble(st.nextToken());
			x2 = Double.parseDouble(st.nextToken());
			y2 = Double.parseDouble(st.nextToken());
			x3 = Double.parseDouble(st.nextToken());
			y3 = Double.parseDouble(st.nextToken());
			xp = Double.parseDouble(st.nextToken());
			yp = Double.parseDouble(st.nextToken());

			// 点Pを原点に移動
			x1 -= xp;
			x2 -= xp;
			x3 -= xp;
			x1 -= xp;
			y2 -= yp;
			y3 -= yp;
			yp -= yp;
			xp = yp = 0;

			//
			t1 = theta(x1, y1, x2, y2);
			t2 = theta(x2, y2, x3, y3);
			t3 = theta(x3, y3, x1, y1);

			if (t1 + t2 + t3 == Math.PI * 2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	static double theta(double x1, double y1, double x2, double y2) {
		return Math.acos(x1 * x2 + y1 * y2)
				/ (Math.sqrt(x1 * x1 + y1 * y1) * Math.sqrt(x2 * x2 + y2 * y2));
	}
}