import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		double r = Double.parseDouble(line);

		double ensyu = 2 * r * Math.PI;
		double menseki = r * r * Math.PI;
		// TODO ?????????????????????????????????????????????
		System.out.println(String.format("%.6f", menseki) + " "
				+ (String.format("%.6f", ensyu)));
	}
}