import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String str = reader.readLine();
			double r = Double.parseDouble(str);
			String S = String.format("%.5f", r * r * Math.PI);
			String C = String.format("%.5f", 2 * r * Math.PI);
			System.out.println(S + " " + C);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}