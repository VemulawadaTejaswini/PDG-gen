import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			int m = n / 2 - 1;
			int sum = 0;
			for (int i = 1; i <= m; i++) {
				double c = i / m;
				sum += (int) Math.sin(Math.acos(c));
			}
			// System.out.println((n * n * 2) + (n * 2 * 4) - (sum * 2));
			System.out.println(2 * (n * (n + 4) - sum));
		}
	}
}