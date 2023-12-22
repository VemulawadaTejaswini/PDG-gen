import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	final static int tubo = 3305785;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int d = line.indexOf(' ');
			int a = Integer.parseInt(line.substring(0, d));
			int b = Integer.parseInt(line.substring(d + 1));
			int area = a * b * 1000000;
			int sumi;
			double sumd;

			sumi = area / tubo;
			sumd = (double) (area % tubo) / tubo;

			System.out.println(((double) sumi + sumd));

		}
	}
}