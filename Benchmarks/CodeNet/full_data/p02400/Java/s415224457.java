import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    double r = Double.parseDouble(line);

	    double area = Math.PI * r * r;
	    double length = 2 * Math.PI * r;

	    System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", length));

	}
}