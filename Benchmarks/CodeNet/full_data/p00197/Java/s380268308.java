import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int _x, _y, x, y;
			_x = parseInt(line.substring(0, line.indexOf(' ')));
			_y = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((_x | _y) == 0) break;

			if (_x >= _y) {
				x = _x;
				y = _y;
			} else {
				x = _y;
				y = _x;
			}

			int mod, step = 0;
			while (y != 0) {
				mod = x % y;
				x = y;
				y = mod;
				step++;
			}
			System.out.println(x + " " + step);
		}
	}
}