
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String data;
		while ((data = reader.readLine()) != null) {
			double a = Double.parseDouble(data);
			double y = Math.pow(a / 9.8, 2) * 4.9;
			System.out.println((int)(Math.ceil((y + 5) / 5)));
		}
	}
}