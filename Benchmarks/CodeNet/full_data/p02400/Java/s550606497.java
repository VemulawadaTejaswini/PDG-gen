import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputationCircle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
	    double r = Double.parseDouble(str);;

		double a = r * 2 * 3.14;
		double b = r * r * 3.14;

		System.out.println(a + " " + b);
	}

}