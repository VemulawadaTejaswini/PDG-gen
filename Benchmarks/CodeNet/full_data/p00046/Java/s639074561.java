import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;

		while ((line = br.readLine()) != null) {

			if (max < Double.parseDouble(line)) {

				max = Double.parseDouble(line);

			}

			if (min > Double.parseDouble(line)) {

				min = Double.parseDouble(line);

			}

		}

		System.out.println(max - min);

	}

}