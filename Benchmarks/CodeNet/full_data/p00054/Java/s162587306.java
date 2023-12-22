
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty())
				break;
			StringTokenizer tokenizer = new StringTokenizer(line);
			double a = Double.parseDouble(tokenizer.nextToken());
			double b = Double.parseDouble(tokenizer.nextToken());
			int c = Integer.parseInt(tokenizer.nextToken());

			char[] result = String.valueOf(a / b).split("\\.")[1].toCharArray();
			int sum = 0;
			for (int i = 0; i < c && i < result.length; i++) {
				sum += result[i] - '0';
			}
			System.out.println(sum);
		}
	}
}