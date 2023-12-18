import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] text = br.readLine().split(" ");
		int[] range_numbers = { Integer.valueOf(text[0]), Integer.valueOf(text[1]) };
		int result = 0;
		for (int i = range_numbers[0] + 1; i <= range_numbers[1]; i++) {
			String number = String.valueOf(i);
			if (number.substring(0, 1).equalsIgnoreCase(number.substring(3, 4))) {
				result++;
			}
		}
		System.out.println(result);
	}
}