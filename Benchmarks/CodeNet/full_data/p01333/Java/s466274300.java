import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int a, b, c, i, j, k;
			a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			b = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			if ((a | b) == 0) {
				break;
			}
			c = (b - a) / 100;

			i = j = k = 0;
			i = c / 10;
			if ((c %= 10) != 0) {
				j = c / 5;
			}
			if ((c %= 5) != 0) {
				k = c;
			}
			System.out.println(k + " " + j + " " + i);
		}
	}
}