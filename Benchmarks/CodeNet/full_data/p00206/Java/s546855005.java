import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int cost = Integer.parseInt(br.readLine());
		int month = 0;
		boolean more = true;

		while (!(line = br.readLine()).equals("0")) {

			if (line.contains(" ") && more) {
				int in = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				int out = Integer
						.parseInt(line.substring(line.indexOf(' ') + 1));
				cost -= in - out;
				month++;
				if (cost <= 0) {
					System.out.println(month);
					more = false;
					continue;
				}
			} else {
				if (cost <= 0) {
					System.out.println(month);
				} else {
					System.out.println("NA");
				}
				cost = Integer.parseInt(line);
				month = 0;
				more = true;
			}
		}
	}
}