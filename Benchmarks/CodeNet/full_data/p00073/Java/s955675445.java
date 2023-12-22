import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			double x, h, xh;
			x = Double.parseDouble(line);
			h = Double.parseDouble(br.readLine());

			if (x == 0 && h == 0)
				break;
			xh = Math.sqrt(Math.pow(x / 2, 2) + Math.pow(h, 2));
			System.out.println(x * xh * 2);
		}
	}
}