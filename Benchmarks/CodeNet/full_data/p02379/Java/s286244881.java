import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

		String[] arrPos = buffReader.readLine().split(" ");

		double x1 = Double.parseDouble(arrPos[0]);
		double y1 = Double.parseDouble(arrPos[1]);
		double x2 = Double.parseDouble(arrPos[2]);
		double y2 = Double.parseDouble(arrPos[3]);

		double d1 = x1 - x2;
		double d2 = y1 - y2;

		double d3 = Math.hypot(d1, d2);

		System.out.println(d3);
	}
}