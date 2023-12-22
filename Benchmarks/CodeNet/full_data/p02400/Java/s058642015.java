import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			double r = Double.parseDouble(line);
			System.out.printf("%.6f %.6f\n", (Math.PI * r * r), (2 * Math.PI * r));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}