import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long N = Long.parseLong(br.readLine());

		for (int h = 1; h <= 3500; h++) {
			for (int n = 1; n <= 3500; n++) {
				long up = N * h * n;
				long down = 4 * h * n - N * n - N * h;

				if (down == 0)
					continue;

				if (up % down != 0)
					continue;

				long w = up / down;

				if (0 < w && w <= 3500) {
					System.out.println(h + " " + n + " " + w);
					return;
				}
			}
		}
	}

	static boolean isInt(double d) {
		return d == (int) d;
	}
}