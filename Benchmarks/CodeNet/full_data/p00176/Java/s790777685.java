import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * What Color?
 */
public class Main {

	static final String[] names = {
			"black",
			"blue",
			"lime",
			"aqua",
			"red",
			"fuchsia",
			"yellow",
			"white",
	};

	static final int[][] colors = {
			{0, 0, 0},
			{0, 0, 255},
			{0, 255, 0},
			{0, 255, 255},
			{255, 0, 0},
			{255, 0, 255},
			{255, 255, 0},
			{255, 255, 255},
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;

			int r, g, b;
			r = parseInt(line.substring(1, 3), 16);
			g = parseInt(line.substring(3, 5), 16);
			b = parseInt(line.substring(5, 7), 16);

			int min = 1 << 29, name = -1;
			for (int i = 0; i < colors.length; i++) {
				int color = (int) Math.pow(r - colors[i][0], 2)
						+ (int) Math.pow(g - colors[i][1], 2)
						+ (int) Math.pow(b - colors[i][2], 2);
				if (color < min) {
					min = color;
					name = i;
				}
			}
			System.out.println(names[name]);
		}
	}
}