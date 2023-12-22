import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				String x = reader.readLine();
				if (x.equals("0")) {
					break;
				}

				int sum = 0;
				for (int i = 0; i < x.length(); i++) {
					sum += x.charAt(i) - '0';
				}

				System.out.println(sum);

			} catch (IOException e) {
				System.out.println(e);
			} catch (NumberFormatException e) {
				System.out.println("");
			}
		}
	}
}
