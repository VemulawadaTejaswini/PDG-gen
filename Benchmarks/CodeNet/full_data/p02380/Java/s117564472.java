import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String[] line = br.readLine().split(" ");
	    double a = Double.parseDouble(line[0]);
	    double b = Double.parseDouble(line[1]);
	    double C = Double.parseDouble(line[2]);

	    double S = (a * b * Math.sin(Math.toRadians(C))) / 2d;
	    double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(C))));
	    double h = b * Math.sin(Math.toRadians(C));

	    StringBuilder sb = new StringBuilder();
	    sb.append(S).append("\n");
	    sb.append(L).append("\n");
	    sb.append(h).append("\n");

	    System.out.print(sb.toString());
	}
}