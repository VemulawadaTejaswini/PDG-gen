import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			final String size = br.readLine();
			final String inputNumbers = br.readLine();

			final String[] numbers = inputNumbers.split(" ");

			StringBuilder result = new StringBuilder();

			for (int i = numbers.length - 1; 0 <= i; i--) {
				if (i != 0) {
					result.append(numbers[i] + " ");
				} else {
					result.append(numbers[i]);
				}
			}

			System.out.println(result);
		}
	}
}
