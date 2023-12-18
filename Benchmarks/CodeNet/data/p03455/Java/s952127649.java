import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {

	public boolean isEven(Integer number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product product = new Product();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			String inputLine = reader.readLine();
			String numbers[] = inputLine.split(" ");
			System.out.println(product.isEven(Integer.valueOf(numbers[0])
					* Integer.valueOf(numbers[1])) ? "Even" : "Odd");
		} catch (IOException ignore) {
		}
	}
}
