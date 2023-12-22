import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split(" ");
		double a = Double.parseDouble(arr[0]);
		double b = Double.parseDouble(arr[1]);
		double C = Double.parseDouble(arr[2]);

		double h = b * Math.sin(Math.toRadians(C));
		double S = a * h / 2;
		double c2 = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b
				* Math.cos(Math.toRadians(C));
		double c = Math.sqrt(c2);

		System.out.printf("%.5f %.5f %.5f%n", S, a + b + c, h);

		if (br != null) {
			br.close();
			br = null;
		}
	}
}