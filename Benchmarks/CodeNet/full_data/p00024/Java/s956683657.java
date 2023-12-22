import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		double v;
		try {
			while ((line = br.readLine()) != null) {
				line.trim();
				v = Double.parseDouble(line);
				double t = v / 9.8;
				double y = 4.9 * Math.pow(t, 2);
				
				int N = (int)Math.ceil(y / 5) + 1;
				
				System.out.println(N);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}