import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    int r = Integer.parseInt(line);

	    double circle = 2 * Math.PI * r;
	    double area = Math.PI * r * r;

	    System.out.println(String.format("%.6f", circle) + " " + String.format("%.6f", area));

	}
}