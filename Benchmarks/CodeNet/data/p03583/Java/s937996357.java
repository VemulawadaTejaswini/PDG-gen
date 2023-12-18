import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long N = Long.parseLong(br.readLine());

		for (int h = 1; h <= 3500; h++) {
			for (int n = 1; n <= 3500; n++) {
				double a = 4 / N - 1 / h - 1 / n;

				if (a <= 0)
					continue;

				if (isInt(1 / a)) {
					System.out.println(h + " " + n + " " + (int) (1 / a));
					return;
				}
			}
		}
	}

	static boolean isInt(double d) {
		return d == (int) d;
	}
}