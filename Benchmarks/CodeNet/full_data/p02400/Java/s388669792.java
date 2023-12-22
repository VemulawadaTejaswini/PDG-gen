import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double a = Integer.parseInt(br.readLine());

		double radi = a * a * 3.141592653589;
		double circ = 2 * a * 3.141592653589;

		String radi2 = String.format("%.6f", radi);
		String circ2 = String.format("%.6f", circ);

		System.out.println(radi2 + " " + circ2);
	}
}

