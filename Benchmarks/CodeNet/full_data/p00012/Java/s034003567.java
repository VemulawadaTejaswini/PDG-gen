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
		double l1, l2, l3, la, l1p, l2p, l3p;

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
			x1 -= xp;
			y1 -= yp;
			x2 -= xp;
			y2 -= yp;
			x3 -= xp;
			y3 -= yp;
			xp = 0;
			yp = 0;

			l1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			l2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
			l3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
			la = l1 + l2 + l3;
			l1p = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
			l2p = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
			l3p = Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2));

			if (la > l1 + l1p + l2p) {
				if (la > l2 + l2p + l3p)
					if (la > l3 + l3p + l1p)
						System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}