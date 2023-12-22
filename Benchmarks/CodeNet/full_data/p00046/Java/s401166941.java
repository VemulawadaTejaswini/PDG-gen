
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		double max=0;
		double min=Integer.MAX_VALUE;
		
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}
			double a = Double.parseDouble(line);
			max = Math.max(max, a);
			min = Math.min(min, a);
		}
		System.out.println(max-min);
	}
}