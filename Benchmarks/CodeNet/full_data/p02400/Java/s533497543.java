import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		try {
			str = br.readLine();

			double r = Double.valueOf(str);

			double round = r*2*Math.PI;
			double area = r*r*Math.PI;

			DecimalFormat df = new DecimalFormat("0.000000");
			System.out.println(df.format(round) + " " + df.format(area));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}