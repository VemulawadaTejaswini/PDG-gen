import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		System.out.print("Input >> ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x;
		try {
			x = Integer.parseInt(reader.readLine());

			if (!(x >= 1 && x <= 100)) {
				throw new IllegalArgumentException("Please input between 1 and 100!");
			}
			System.out.println("Output >> " + (x * x * x));

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}