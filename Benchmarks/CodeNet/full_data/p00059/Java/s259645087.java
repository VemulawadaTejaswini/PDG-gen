import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {

			double xa1, ya1, xa2, ya2, xb1, yb1, xb2, yb2;

			String points[] = line.split(" ");
			xa1 = Double.parseDouble(points[0]);
			ya1 = Double.parseDouble(points[1]);
			xa2 = Double.parseDouble(points[2]);
			ya2 = Double.parseDouble(points[3]);
			xb1 = Double.parseDouble(points[4]);
			yb1 = Double.parseDouble(points[5]);
			xb2 = Double.parseDouble(points[6]);
			yb2 = Double.parseDouble(points[7]);

			if ((xb1 >= xa1 && xb1 <= xa2) || (xb2 >= xa1 && xb2 <= xa2)) {
				if ((yb1 >= ya1 && yb1 <= ya2) || (yb2 >= ya1 && yb2 <= ya2)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
		}
	}
}