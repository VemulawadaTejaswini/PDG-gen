
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int a = Integer.parseInt(reader.readLine());
		int b = 100000;
		for (int i = 0; i < a; i++) {
			b += (int) (Math.ceil(b * 0.05 / 1000) * 1000);
		}
		System.out.println(b);

	}

}