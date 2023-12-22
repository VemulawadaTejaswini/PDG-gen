import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String line = reader.readLine();
			int x = Integer.parseInt(line);
			System.out.printf("%f %f", x * x * Math.PI, x * 2 * Math.PI);

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}