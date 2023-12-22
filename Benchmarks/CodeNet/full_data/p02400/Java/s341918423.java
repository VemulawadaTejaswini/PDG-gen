import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(br.readLine());

		System.out.printf("%05f %05f", Math.PI * r * r, 2 * Math.PI * r);
	}
}