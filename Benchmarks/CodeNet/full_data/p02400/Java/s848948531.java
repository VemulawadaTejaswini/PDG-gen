import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			line = buf.readLine();
			double r = Double.parseDouble(line);
			System.out.printf("%.6f %.6f", Math.PI*r*r, 2*Math.PI*r);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}