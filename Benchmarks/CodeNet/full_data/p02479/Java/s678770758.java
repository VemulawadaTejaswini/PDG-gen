import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String A = reader.readLine();
		double r = Integer.parseInt(A);
		double pi = Math.PI;
		double S = r * r * pi;
		double l = 2 * r * pi;
		System.out.printf("%f %f", S,l);

	}
}