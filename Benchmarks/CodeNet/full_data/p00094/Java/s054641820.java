import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final double tubo = 3.305785;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();
		int a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
		int b = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
		double area = a * b;

		System.out.println(area / tubo);
	}
}