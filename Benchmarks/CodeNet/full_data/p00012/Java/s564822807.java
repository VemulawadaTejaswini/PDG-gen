import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringTokenizer st;
		double x1, y1, x2, y2, x3, y3, xp, yp;

		while ((line = br.readLine()) != null) {
			st = new StringTokenizer(line);
			x1 = Double.parseDouble(st.nextToken());
			y1 = Double.parseDouble(st.nextToken());
			x2 = Double.parseDouble(st.nextToken());
			y2 = Double.parseDouble(st.nextToken());
			x3 = Double.parseDouble(st.nextToken());
			y3 = Double.parseDouble(st.nextToken());
			xp = Double.parseDouble(st.nextToken());
			yp = Double.parseDouble(st.nextToken());

			// 原点に移動
			x2 -= x1;
			y2 -= y1;
			x3 -= x1;
			y3 -= y1;
			xp -= x1;
			yp -= y1;
			x1 = 0;
			y1 = 0;

			//
			if (Math.pow(x3, 2) + Math.pow(y3, 2) > Math.pow(x2 + xp, 2)
					+ Math.pow(y2 + yp, 2))
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}